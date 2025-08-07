class Kopek extends Hayvan {
    String egitimSeviyesi;

    public Kopek(String isim, int yas, String egitimSeviyesi) {
        super(isim, yas, "Köpek");
        this.egitimSeviyesi = egitimSeviyesi;
    }

    @Override
    public void sesCikar() {
        System.out.println(isim + " havlıyor.");
    }

    public void kopekOzellikleri() {
        System.out.println("Eğitim Seviyesi: " + egitimSeviyesi);
    }
}