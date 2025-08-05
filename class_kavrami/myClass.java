public class myClass {
    public int id; 
    public String isim;
    public String soyisim;
    private String cinsiyet; 
    public myClass()//Constructor geri dönüş tipi olmaz parametre alabilir
    {
        System.out.println("Yapici metod calisti");
    }
    public myClass(int id_ , String isim_, String soyisim_)
    //method overloading(paramtere sayısı veya türü farklı olacak)
    {
        id = id_;
        isim= isim_;
        soyisim= soyisim_;
    }
    public myClass(String cinsiyet_)
    {
        cinsiyet=cinsiyet_;
    }
    public void cinsiyetYazdir()
    {
        System.out.println("cinsiyet:"+ cinsiyet);
    }
}

