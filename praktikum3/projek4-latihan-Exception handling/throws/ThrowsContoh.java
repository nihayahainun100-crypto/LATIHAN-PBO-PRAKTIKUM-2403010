public class ThrowsContoh {
    // method ini bisa melempar error
    public static int bagi(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int hasil = bagi(10, 0); // akan error
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
