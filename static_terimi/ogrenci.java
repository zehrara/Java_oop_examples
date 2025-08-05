public class ogrenci {
    private long id;
    private String ad;
    private String soyad;
   
    public static String numara;

    public static void numaraYazdir(String numara_)
    {
        //static bir metot içinde  static olmayan hiçbir şeye erişemeyiz.(değişken,metot)
        System.out.println("numara:"+ numara_);
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
