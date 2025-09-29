public class AkunBank {
    
    private int saldo;

    public AkunBank(int saldo){
        this.saldo = saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    //method menabung
    public int menabung(int saldo){
        if(saldo > 0){
            this.saldo += saldo;
            // return this.saldo;
        }else{
            System.out.println("Berhasil menabung $" + saldo + ". Saldo sekarang: $" + this.saldo);
        }
        return this.saldo;
    }

    //method tarikTunai
    public void tarikTunai(int jumlah){
        if(jumlah <= 0){
            System.out.println("Jumlah penarikan harus lebih dari 0");
        } else if(this.saldo - jumlah < 10){
            System.out.println("Penarikan gagal! Saldo minimal $10 harus tersisa.");
        } else {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik tunai $" + jumlah + ". Saldo sekarang: $" + this.saldo);
        }
    }
}
