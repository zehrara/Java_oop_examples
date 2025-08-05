import java.util.Random;

public class tckn {
    private String dogumYeri;
    private String tckn;

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri_) {
        dogumYeri = dogumYeri_;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn_) {
        boolean kontrol = true;

        if (tckn_.length() == 11) {
            for (int i = 0; i < 11; i++) {
                char karakter = tckn_.charAt(i);
                if (!Character.isDigit(karakter)) {
                    kontrol = false;
                    break;
                }
            }

            if (kontrol) {
                tckn = tckn_;
                Random rnd = new Random();
                int giseNo = rnd.nextInt(100);
                System.out.println("Numaranız: " + giseNo);
            } else {
                System.out.println("Lütfen bütün karakterleri rakam olacak şekilde giriniz.");
            }
        } else {
            System.out.println("TC 11 karakterli olmak zorunda.");
        }
    }
}
