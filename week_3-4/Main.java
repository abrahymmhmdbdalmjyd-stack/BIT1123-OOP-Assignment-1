public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ahmed", "001");
        Person p2 = new Student("Ali", "002");
        Person p3 = new Lecturer("Omar", "003");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}