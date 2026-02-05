
public class Constructor {

    public static class Car {

        int seat;
        int price;

        Car(int s, int p) {
            seat = s;
            price = p;
        }

        void print() {
            System.err.println(seat + " " + price);

        }

    }

    public static void main(String[] args) {
        Car c = new Car(5, 254000);
        c.print();

    }

}
