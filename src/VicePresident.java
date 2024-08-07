class VicePresident extends Manager{
    // Method overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + " My name is VP " + this.name);
    }

    // Super constructor
    VicePresident(String name) {
//        super(null); boleh
        super(name);
    }
}

/**
 * Method overriding: Deklarasi method ulang yang sudah ada di parent ke child
 *  Method di class parent tidak bisa diakses
 * Jika dua yang bisa dipanggil pada constructor, minimal satu saja
 */


