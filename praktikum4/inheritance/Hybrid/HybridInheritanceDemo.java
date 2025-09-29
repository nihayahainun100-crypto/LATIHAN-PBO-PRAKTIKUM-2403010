package Hybrid;

// Superclass
class Manusia {
    protected String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }
}

// Interface 1
interface Pekerja {
    void bekerja();
}

// Interface 2
interface Pelajar {
    void belajar();
}

// Subclass (Hybrid: extends class + implements interfaces)
class MahasiswaKerja extends Manusia implements Pekerja, Pelajar {
    public MahasiswaKerja(String nama) {
        super(nama);
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja paruh waktu");
    }

    @Override
    public void belajar() {
        System.out.println(nama + " sedang belajar di kampus");
    }

    public void jadwal() {
        System.out.println(nama + " membagi waktu antara kuliah dan kerja");
    }
}

// Demo
public class HybridInheritanceDemo {
    public static void main(String[] args) {
        MahasiswaKerja mhs = new MahasiswaKerja("Ani");

        mhs.makan();     // method dari superclass
        mhs.bekerja();   // method dari interface Pekerja
        mhs.belajar();   // method dari interface Pelajar
        mhs.jadwal();    // method khusus subclass
    }
}
