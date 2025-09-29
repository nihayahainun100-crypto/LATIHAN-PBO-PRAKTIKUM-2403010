package Hierarchical;

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
        System.out.println("Gaji " + nama + " adalah Rp" + gaji);
    }
}

// Subclass 1
class Manager extends Karyawan {
    private int jumlahTim;

    public Manager(String nama, double gaji, int jumlahTim) {
        super(nama, gaji);
        this.jumlahTim = jumlahTim;
    }

    public void kelolaTim() {
        System.out.println(nama + " mengelola " + jumlahTim + " anggota tim.");
    }
}

// Subclass 2
class Programmer extends Karyawan {
    private String bahasaPemrograman;

    public Programmer(String nama, double gaji, String bahasaPemrograman) {
        super(nama, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public void coding() {
        System.out.println(nama + " sedang coding dengan bahasa " + bahasaPemrograman);
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Manager man = new Manager("Budi", 8000000, 5);
        Programmer prog = new Programmer("Ani", 6000000, "Java");

        // Manager
        man.kerja();
        man.infoGaji();
        man.kelolaTim();

        System.out.println();

        // Programmer
        prog.kerja();
        prog.infoGaji();
        prog.coding();
    }
}
