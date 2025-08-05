public class calisan {

    private Long id;
    private String isim;
    private String soyisim;
    private int maas;

    public calisan ()
    {}

    public calisan (Long id_, String isim_, String soyisim_, int maas_)
    {
        id=id_;
        isim=isim_;
        soyisim=soyisim_;
        maas=maas_;
    }
    public Long getId()
    {
        return id;
    }
    public void setId(Long Id_)
    {
        id=Id_;
    }
    public String getIsim()
    {
        return isim;
    }
    public void setIsim(String Isim_)
    {
        isim=Isim_;
    }
       
    public String getSoyIsim()
    {
        return soyisim;
    }
    public void setSoyIsim(String SoyIsim_)
    {
        isim=SoyIsim_;
    }
    public int getMaas()
    {
        return maas;
    }
    public void setMaas(int Maas_)
    {
        if(Maas_>=1000 && Maas_<=5000)
            {
                 maas=Maas_;
            }
    }

}
/* değişkeni private ile saklıyoruz
 * set metodu ile erişip değer atıyoruz
 * get  metodunu kullanarak değerine erişiyoruz
 */