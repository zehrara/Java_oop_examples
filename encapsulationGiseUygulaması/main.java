import java.net.Socket;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HOŞGELDİNİZZZ!");
        System.out.println("Lütfen TCKN giriniz:");

        String tckn = scanner.nextLine();
        
        tckn tcknNesne =new tckn();
        tcknNesne.setTckn(tckn);
    }
    
}
