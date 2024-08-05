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
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    // Constructor overloading
    Person(String paramName) {
        name = paramName;
    }

    // Constructor memanggil constructor lain
    Person() {
        this(null);
    }
}
