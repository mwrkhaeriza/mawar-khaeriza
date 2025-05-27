class namasuperclass{
    //body kelas
}
class namasuperclass extends namasuperclass{
    // body clas
}


public class persegipanjang{
    private in panjang;
    private in lebar;
    public void setpanjang(int p);
    panjang=p;
}
public void setlebar(int 1){
    lebar=1;
}
publicint getpanjang(){
    return panjang;
}
publicint getlebar(){
    return lebar;
}
public in luas(){
    int luas=panjang*lebar;
    return luas;
}

public class balok extends persegipanjang{
    privateint tinggi;
    punlic void setTinggi(int t){tinggi=t;
    }
    public int getTinggi({return tinggi;
    })
    public int volume(){int v=getpanjang()*getLebar()*tinggi;
    }
}

public class DemoPewarisan {
    public static void main(String args[]) {
        PersegiPanjang a = new PersegiPanjang();
        a.setPanjang(5);
        a.setLebar(5);

        System.out.println("");
        System.out.println("Contoh program pewarisan");
        System.out.println("");
        System.out.println("Superclass PersegiPanjang");
        System.out.println("Panjang : " + a.getPanjang());
        System.out.println("Lebar   : " + a.getLebar());
        System.out.println("Luas    : " + a.Luas());
        System.out.println("");

        Balok b = new Balok();
        /* kelas balok tinggal memanggil method yang ada di dalam kelas persegi */
        b.setPanjang(4);
        b.setLebar(3);
        b.setTinggi(5);

        System.out.println("Subclass Balok");
        System.out.println("Panjang : " + b.getPanjang());
        System.out.println("Lebar   : " + b.getLebar());
        System.out.println("Tinggi  : " + b.getTinggi());
        System.out.println("Volume  : " + b.Volume());
    }
}