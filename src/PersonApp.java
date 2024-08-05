public class PersonApp {
    public static void main(String[] args) {
        // Instance object
        Person person1 = new Person("Kris", "Kalasan");
        var person2 = new Person("Anang");

        // Manipulasi field
        // person1.name = "Dimas"; // Tidak digunakan lagi karena sudah menggunakan constructor
        // person2.address = "Kalasan";

        System.out.println(person1.name);
        System.out.println(person2.address);

        person1.sayHello("Rama1");
        person2.sayHello("Rama2");
    }
}
/**
 * Constructor: Method yang dipanggil pertama kali ketika object dibuat
 * Tidak membutuhkan void / return value
 */