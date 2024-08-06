public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Dimas";
        manager.sayHello("Rama");

        VicePresident vp = new VicePresident();
        vp.name = "Setyawan";
        vp.sayHello("Ramadhansyah");
    }
}
