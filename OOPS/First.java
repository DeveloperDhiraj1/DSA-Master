
public class First {

    public static class Student {

        String name;
        int Roll;
        double cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dhiraj";
        s1.Roll = 12;
        s1.cgpa = 7.6;
        System.out.print(s1.name + " " + s1.Roll + " " + s1.cgpa);

    }
}
