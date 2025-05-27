public class lagu {
    private string band;
    private string judul;
    public void isiParam (string judul,string band){
        this.judul=judul;
        this.band=band;
    }
    public void cetakKelayar(){
        if(judul==null&&band==null)return;
sysytem.out.println("judul:"+judul+"\nBand:"+pencipta);
    }
}
public calss DemoLagu{
    public static void main(String[] args){
        lagu song=new lagu ();
        song.isiParam("Dance Beside","All American Reject");
        song.CetakKelayar();
    }
}