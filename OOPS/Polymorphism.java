
public class Polymorphism {

    public static class Dog {

        void speak() {
            System.out.println("Bow Bow");
        }
    }

    public static class Cat {

        void speak() {
            System.out.println("Mew Mew");
        }
    }

    public static class Lion {

        void speak() {
            System.out.println("Dahar");
        }
    }

    public static class Human {

        void speak() {
            System.out.println("Hello everyone");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion L = new Lion();
        Human h = new Human();
        d.speak();
        c.speak();
        L.speak();
        h.speak();
    }
}
