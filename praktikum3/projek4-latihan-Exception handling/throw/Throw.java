public class Throw {
    public static void cekUmur(int umur) {
        if (umur < 17) {
            throw new RuntimeException("Umur harus 17 tahun ke atas!");
        }
        System.out.println("Umur valid: " + umur);
    }

    public static void main(String[] args) {
        cekUmur(15); // akan lempar error
        cekUmur(17); // akan lempar error
        cekUmur(20); // akan lempar error

    }
}
