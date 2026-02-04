
public class oops_02 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "bmw";
        c1.price = 200000;
        c1.print();
    }

    public static class Car {

        String name;
        int price;

        void print() {
            System.out.println(name + " " + price);
        }
    }
}
