package multilevel;

class Kakek {
    public void sifatKakek() {
        System.out.println("Kakek bijaksana.");
    }
}

class Ayah extends Kakek {
    public void sifatAyah() {
        System.out.println("Ayah disiplin.");
    }
}

class Anak extends Ayah {
    public void sifatAnak() {
        System.out.println("Anak rajin belajar.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Anak a = new Anak();
        a.sifatKakek();  // dari Kakek
        a.sifatAyah();   // dari Ayah
        a.sifatAnak();   // dari Anak
    }
}
