package tryCatchFinally;

public class TryCatchFinallyHuruf {
    public static void main(String[] args) {
        try {
            String[] huruf = {"A", "B", "C"};
            // mencoba akses huruf ke-4 (padahal hanya ada 3 elemen)
            System.out.println("Huruf ke-4: " + huruf[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }
    }
}
