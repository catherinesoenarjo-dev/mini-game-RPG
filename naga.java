public class naga extends musuh {
    public naga(){
        super("Naga Bonar", 500);
    }
    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh + " menyemburkan nafas api di udara! Player -50 HP");
    }
    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + ": ROARRR!!");
    }
}
