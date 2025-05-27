public class DemoManusia{
    public static void main(string[]args) { //program utama
    manusia arrMns[]=new manusia(3);//buat array of object
            manusia objMns1=new manusia();//constructor pertama
            objMns1.setNama ("Markonah");
            objMns1.setUmur ("76");
            manusia objMns2=new manusia("MatConan");
            //constructor kedua
    manusia objMns3=new manusia ("Bajuri",45);//constructor ketiga
            arrayMns[0]=objMns1;
            arrayMns[1]=objMns2;
            arrayMns[2]=objMns3;
            for(int i=0; 1<3;i++){
                system.out.println("Nama:"+arrMns[i].getNama());
                system.out.println("Umur:"+arrMns[i].getUmur());
                system.out.println();
            }             
    }
}
