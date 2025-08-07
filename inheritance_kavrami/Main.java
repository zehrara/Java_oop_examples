public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi("Pamuk", 3, true);
        Kopek kopek = new Kopek("Karabas", 5, "İleri Düzey");
        Davuk tavuk = new Davuk("Cicikuş", 2, 3);

        System.out.println("=== Kedi Bilgileri ===");
        kedi.bilgileriGoster();
        kedi.sesCikar();
        kedi.kediOzellikleri();

        System.out.println("\n=== Köpek Bilgileri ===");
        kopek.bilgileriGoster();
        kopek.sesCikar();
        kopek.kopekOzellikleri();

        System.out.println("\n=== Tavuk Bilgileri ===");
        tavuk.bilgileriGoster();
        tavuk.sesCikar();
        tavuk.yumurtaDurumu();
    }
}
