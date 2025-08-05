public class Calisan 
{
    public int no;
    public String isim;
    public String soyisim;
    public double maas;
    public int tecrube;
   
    public Calisan()
    {

    }
    
    public Calisan(int no_, String isim_, String soyisim_, double maas_, int tecrube_)
    {
        no=no_;
        isim= isim_;
        soyisim=soyisim_;
        maas=maas_;
        tecrube= tecrube_;
    }
     
    public void calisanBilgiGoster()
    {
        System.out.println("*************Calisan Bilgileri****************");
        System.out.println("no:"+no);
        System.out.println("isim:"+isim);
        System.out.println("soyisim:"+soyisim);
        System.out.println("maas:"+maas);
        System.out.println("tecrube:"+tecrube);
    }
    public void zamYap(int zam)
    {
        System.out.println("Maasşınıza"+ zam +"TL zam yapıldı");
        System.out.println("Şu anki güncel maasınız:"+(zam+maas));
    }
    
}