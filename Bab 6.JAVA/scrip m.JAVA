class luar{
    private int a;
    public void setA(int nilai){
        a=nilai;
    }
    public int getA(){
        return a;
    }
    // mendefinisikan inner class
    class dalam{
        private int x = 10; //hanya dikenali oleh kelas dalam
        punlic void showData(){
            system.out.println("Nilai a dari kelas luar:"+a);
            system.out.println("Nilai x dari kelas dalam:"+x);
        }
    }
    public void showData(){
    //baris di bawah ini SALAH,karena x tidak dikenal disini
    system.out.println("Nilai x dari kelas dalam:"+x);

    dalam obj=new dalam();
    obj.showData();
}
