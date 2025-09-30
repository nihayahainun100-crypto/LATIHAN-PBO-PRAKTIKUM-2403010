package single;
   
public class mainInheritaceTesh {
    public static void main(String[] args) {
        Manajer manajer1 = new Manajer("Budi", 7000, "IT");
        manajer1.kerja();         // method dari superclass
        manajer1.infoGaji();      // method dari superclass
        manajer1.pimpinTim();     // method dari subclass
    }
}

