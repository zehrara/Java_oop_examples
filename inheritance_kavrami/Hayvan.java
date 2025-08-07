class Hayvan {
    String isim;
    int yas;
    String tur;

    public Hayvan(String isim, int yas, String tur) {
        this.isim = isim;
        this.yas = yas;
        this.tur = tur;
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Tür: " + tur);
    }

    public void sesCikar() {
        System.out.println(isim + " bir ses çıkarıyor.");
    }
}