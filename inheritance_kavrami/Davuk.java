class Davuk extends Hayvan {
    int yumurtaVerimi; // günde kaç yumurta veriyor

    public Davuk(String isim, int yas, int yumurtaVerimi) {
        super(isim, yas, "Davuk");
        this.yumurtaVerimi = yumurtaVerimi;
    }

    @Override
    public void sesCikar() {
        System.out.println(isim + " gıdaklıyor.");
    }

    public void yumurtaDurumu() {
        System.out.println("Günlük yumurta verimi: " + yumurtaVerimi + " adet.");
    }
}