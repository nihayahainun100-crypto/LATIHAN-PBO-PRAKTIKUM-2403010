package multiple;

// Interface pertama
interface Pegawai {
    void bekerja();
}

// Interface kedua
interface Pelajar {
    void belajar();
}

// Kelas yang mengimplementasikan dua interface
class MahasiswaKerja implements Pegawai, Pelajar {
    private String nama;

    public MahasiswaKerja(String nama) {
        this.nama = nama;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    @Override
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    public void jadwalHarian() {
        bekerja();
        belajar();
    }
}

// Demo
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MahasiswaKerja john = new MahasiswaKerja("John");
        john.jadwalHarian();
    }
}
