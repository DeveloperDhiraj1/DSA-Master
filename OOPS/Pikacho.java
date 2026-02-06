
public class Pikacho {

    int price;
    String name;

    // Constructor
    Pikacho(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Pikacho p1 = new Pikacho("dorimon", 240000);
        System.out.println(p1.name + " " + p1.price);
    }
}
