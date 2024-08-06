class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + " My name is " + name);
    }

    // Constructor
    //Person(String paramName, String paramAddress) {
    //    name = paramName;
    //    address = paramAddress;
    //}

    // Constructor overloading
    Person(String paramName) {
        name = paramName;
    }

    // Constructor memanggil constructor lain
    Person() {
        this(null);
    }

    // Variable shadowing
    // Person(String name){
    // name = name; Akan akses name bukan yang di field, karena tertutupi
    // }

    // This (Solusi variable shadowing)
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello2(String name) {
        System.out.println("Hello " + name + "My name is " + this.name);
    }

}
/**
 * This digunakan untuk akses object saat ini

 */