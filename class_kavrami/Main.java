public class Main
{
   public static void main(String[] args)
   {
    
  
    myClass ogrenci1 = new myClass("Kadın");

    ogrenci1.id =2; 
    ogrenci1.isim="ZeRa";
    ogrenci1.soyisim="Ra";

    System.out.println("Ogrenci Bilgileri");
    System.out.println("ID:" + ogrenci1.id);
    System.out.println("İsim:" + ogrenci1.isim);
    System.out.println("Soyisim:" + ogrenci1.soyisim);
    ogrenci1.cinsiyetYazdir();
   } 
}