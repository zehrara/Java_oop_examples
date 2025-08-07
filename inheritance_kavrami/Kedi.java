class Kedi extends Hayvan {
    boolean tirmalamaBecerisi;

    public Kedi(String isim, int yas, boolean tirmalamaBecerisi) {
        super(isim, yas, "Kedi");
        this.tirmalamaBecerisi = tirmalamaBecerisi;
    }

    @Override
    public void sesCikar() {
        System.out.println(isim + " miyavlıyor.");
    }

    public void kediOzellikleri() {
        System.out.println("Tırmalama Becerisi: " + (tirmalamaBecerisi ? "Var" : "Yok"));
    }
}