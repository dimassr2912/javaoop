public class PolymorphismApp {
    public static void main(String[] args) {
        // Polymorphism
        Employee employee = new Employee("RamaEmployee");
        employee.sayHello("RamaEmployee");

        employee = new Manager("RamaManager");
        employee.sayHello("RamaManage");

        employee = new VicePresident("RamaVP");
        employee.sayHello("RamaVP");

        sayHello(new Employee("RamaEmployee"));
        sayHello(new Manager("RamaManager"));
        sayHello(new VicePresident("RamaVP"));
    }
    // Berguna jika
     static void sayHello(Employee employee) {
            System.out.println("Hello " + employee.name);
        }
}
/**
 * Polymorphism: Kemampuan object berubah ke bentuk lain
 */