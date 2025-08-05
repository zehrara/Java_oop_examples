public class main1 {
    public static void main(String[] args) {
        /*
         * Statik değişken nedir?
         * Bir classın içerisindeki değişken veya metotlara classtan nesne oluşturmadan direkt class
         * ismi üzerinden erişmemize olanak sağlayan anahtar kelimedir. 
         */
       
         // Ogrenci ogrenci=new Ogrenci();
         // ogrenci.numara = "2351545651";  gerek yok aynı math kütüphanesindeki gibi nesne 
         //                                 oluşturmadan kütüphane içindekileri kullanmamızı sağlar.

         /*static olanlar nesneye bağlı değil sınıf seviyesinde oluyor 
          * yani static bir fielde bir şey atadığında bu tüm nesneler için geçerli oluyor */


         ogrenci ogr1 =new ogrenci();
         ogrenci ogr2 =new ogrenci();
         ogrenci.numara="5744554584";
         System.out.println("Numara:"+ogrenci.numara);
         System.out.println(ogr1.numara+"ve"+ogr2.numara);
         ogrenci.numaraYazdir(ogrenci.numara);
         ogrenci.numaraYazdir("1");
        
         
         ogr1.numara="15";

         System.out.println(ogr1.numara+"ve"+ogr2.numara);
         
         ogr2.numara="10";

         System.out.println(ogr1.numara+"ve"+ogr2.numara);
         
    }

}