interface VendingMachine {
    void insertMoney();
    void selectItem();

    default void connectToServer() {
        System.out.println("Automat jest połączony z serwerem w celu sprawdzenia stanu produktów");
    }

    static void shutdown() {
        System.out.println("Automat został wyłączony");
    }
}

class VendingMachineImpl implements VendingMachine {
    public void insertMoney() {
        System.out.println("Wpłata pieniędzy do automatu");
    }

    public void selectItem() {
        System.out.println("Wybierz produkt z automatu");
    }
}

class Application implements VendingMachine {
    public void insertMoney() {
        System.out.println("Wpłata pieniędzy do aplikacji");
    }

    public void selectItem() {
        System.out.println("Wybierz produkt w aplikacji");
    }
}

public class VendingMain {
    public static void main(String[] args) {
        VendingMachine vendingMachineImpl = new VendingMachineImpl();
        VendingMachine application = new Application();

        vendingMachineImpl.insertMoney();
        vendingMachineImpl.selectItem();
        vendingMachineImpl.connectToServer();
        VendingMachine.shutdown();

        System.out.println();

        application.insertMoney();
        application.selectItem();
        application.connectToServer();
        VendingMachine.shutdown();
    }
}
