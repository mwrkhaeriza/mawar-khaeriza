public void setHarga (int harga){}
public void setHarga (double harga){}
public void setHarga (float harga){}
public void setHarga (float harga,string jumlah){}
public class Phone{
    private string merk;
    private int harga;
    public Phone();
}
public phone (string merk){
    this.merk=merk;
}
public phone (string merk,int harga){
    this.merk=merk;
    this.harga=harga;
}
publicvoid lihatPhone(){
    system.out.println("merk : "+merk);
    system.out.println("harga : "+harga);
    system.out.println("");
}
publicclass DemoOverLoading{
    public static void main(string args[]){
        system.out.println("");
        phone p1=new phone ();
        phone p2=new phone ("Nokia");
        phone p3=new phone ("sony ericsoon",500);
system.out.println("perbedaan output dari masing-masing konstruktor");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();

        phone p4,p5;
        p4=new phone();
        p5=new phone();
        p4.isiPhone("samsung");
        p4.isiPhone("samsung",5000);
system.out.println("perbedaan output dari masing-masing Method");
        p4=new phone();
        p5=new phone();
    }
}