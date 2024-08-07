class Manager extends Employee{
    String company;

   void sayHello(String name) {
        System.out.println("Hello " + name + " My name is manager " + this.name);
    }

//     Manager() { default construct (Tidak memiliki parameter
//
//     } Tidak wajib memanggil constructor

    Manager(String name) {
       super(name);
    }
    Manager(String name, String company) {
       super(name);
       this.company= company;
    }
}

/**
 * Inheritance: Kemampuan menurunkan class ke class lain
 *  Field dan method pada class parent akan diturunkan ke class child
 */