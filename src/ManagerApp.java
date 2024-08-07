public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Budi");
//        manager.name = "Dimas";
        manager.sayHello("Rama");

        VicePresident vp = new VicePresident("Budi");
//        vp.name = "Setyawan";
        vp.sayHello("Ramadhansyah");
    }
}
