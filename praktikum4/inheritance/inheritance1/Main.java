public class Main {
    
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.melaju();

        Sedan sedan = new Sedan("Honda");
        sedan.melaju();

        Trail trail = new Trail("Mitsubishi");
        trail.melaju();
    }
}