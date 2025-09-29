package single;

// Superclass
class Karyawan {
    protected String nama;
    protected double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void kerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    public void infoGaji() {
        System.out.println("Gaji " + nama + " adalah $" + gaji);
    }
}

// Subclass
class Manajer extends Karyawan {
    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        super(nama, gaji); // memanggil konstruktor superclass
        this.departemen = departemen;
    }

    public void pimpinTim() {
        System.out.println(nama + " memimpin tim di departemen " + departemen);
    }
}

// Main program
public class InheritanceTest {
    public static void main(String[] args) {
        Manajer manajer1 = new Manajer("Budi", 7000, "IT");
        manajer1.kerja();         // method dari superclass
        manajer1.infoGaji();      // method dari superclass
        manajer1.pimpinTim();     // method dari subclass
    }
}
