public class AkunBankTest {
    public static void main(String[] args){

        AkunBank akunBank1 = new AkunBank(100);
        System.out.println("Saldo awal: $" + akunBank1.getSaldo());

        //method nabung (menambahkan saldo)
        akunBank1.menabung(10);
        System.out.println("Saldo setelah menabung: $" + akunBank1.getSaldo());

        //method tarikTunai (ketentuannya tidak boleh minus dan saldo harus tersisa 10)
        akunBank1.tarikTunai(90);
    }
}