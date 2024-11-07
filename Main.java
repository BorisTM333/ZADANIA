interface Animal {
    void sound();
    default void sleep() {
        System.out.println("Zwirzok idzie spać.");
    }
    static void endOfDay() {
        System.out.println("Koniec dnia, zwirzoki idą spać");
    }
    default void eat() {
        System.out.println("Zwirzok konsumuję żarło");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("HAŁ HAŁ");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Miał MIAŁ");
    }
}

class Bird implements Animal {
    public void sound(){
        System.out.println("Ćwirk ćwirk");
    }
}

class Cow implements Animal {
    public void sound(){
        System.out.println("PIŁEŚ MÓJ MULLERMILCH? MUUUUUUUU");
    }
}

public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal cow = new Cow();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();

        bird.sound();
        bird.sleep();
        bird.eat();

        cow.sound();
        cow.sleep();
        cow.eat();

        Animal.endOfDay();
    }
}