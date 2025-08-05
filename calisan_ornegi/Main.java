import java.util.Scanner;

public class Main 
{
    public static void main (String[] args )
    {
        System.out.println("********** HOS GELDİNİZ **************");
        Scanner scanner = new Scanner(System.in);

        System.out.println("no değerini giriniz");
        int no= scanner.nextInt();
        scanner.nextLine();

        System.out.println("isim değerini giriniz");
        String isim= scanner.nextLine();

        System.out.println("soyisim değerini giriniz");
        String soyisim= scanner.nextLine();

        System.out.println("tecrübe değerini giriniz");
        int tecrube= scanner.nextInt();
        scanner.nextLine();

        System.out.println("maas değerini giriniz");
        double maas= scanner.nextDouble();
        scanner.nextLine();

        Calisan calisan = new Calisan(no, isim, soyisim, maas, tecrube);
        String islemler = "1-Çalışan bilgilerini göster \n"+"2-Zam Yap \n";
        
        System.out.println("------------------------------------------");
        System.out.println(islemler);
        System.out.println("secim yapiniz:");
        String secim=scanner.nextLine();

        switch(secim)
        {
          case "1" :
               calisan.calisanBilgiGoster();
            break;
          case "2" :
                System.out.println("Zam değerini giriniz:");
                int zamD =scanner.nextInt();
                calisan.zamYap(zamD);
            break;
          default:
          System.out.println("lutfen belirtilen aralıkta değer seçiniz");
            break;
        }


    }
    

}
