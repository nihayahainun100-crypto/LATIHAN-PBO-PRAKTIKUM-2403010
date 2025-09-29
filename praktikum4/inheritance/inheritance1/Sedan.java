
public class Sedan extends Mobil {
    public Sedan(String merk) {
        super(merk);
    }

    @Override
    public void melaju() {
        System.out.println("Sedan melaju dengan smooth");
    }

}
