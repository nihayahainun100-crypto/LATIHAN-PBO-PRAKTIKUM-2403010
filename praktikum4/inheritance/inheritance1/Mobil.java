public class Mobil {
    private String merk;

    public Mobil(String merk) {
        this.merk = merk;
    }

    public void melaju() {
        System.out.println("Mobil melaju");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

}
