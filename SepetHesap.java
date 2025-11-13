/*
 * Ad Soyad: MUHAMMED TAHA GÖKDERE
 * Ogrenci No: 250541092
 * Tarih: 13/11/2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesaplama {

    // Görev 3: Sabit Tanımlama
    // 2 Sabit (KDV ve Kargo)
    final static double VAT_RATE = 0.18; // KDV Oranı
    final static double SHIPPING_FEE = 29.99; // Kargo Ücreti

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ürün bilgilerini al
        System.out.print("1. Ürün Fiyatı: ");
        double fiyat1 = scanner.nextDouble();
        System.out.print("1. Ürün Adedi: ");
        int adet1 = scanner.nextInt();

        // 2. Ürün bilgilerini al
        System.out.print("2. Ürün Fiyatı: ");
        double fiyat2 = scanner.nextDouble();
        System.out.print("2. Ürün Adedi: ");
        int adet2 = scanner.nextInt();

        // 3. Ürün bilgilerini al
        System.out.print("3. Ürün Fiyatı: ");
        double fiyat3 = scanner.nextDouble();
        System.out.print("3. Ürün Adedi: ");
        int adet3 = scanner.nextInt();

        // İndirim yüzdesini al
        System.out.print("\nİndirim Yüzdesini Girin (Örn: 15): ");
        double indirimYuzdesi = scanner.nextDouble();

        scanner.close();

        // --- HESAPLAMALAR (Metotlar kullanılarak) ---

        // 1. Metot (3 kez kullanılır)
        double satisTop1 = satisToplamiHesapla(fiyat1, adet1);
        double satisTop2 = satisToplamiHesapla(fiyat2, adet2);
        double satisTop3 = satisToplamiHesapla(fiyat3, adet3);

        // 2. Metot
        double araToplam = araToplamHesapla(satisTop1, satisTop2, satisTop3);

        // 3. Metot
        double indirimTutari = indirimTutariHesapla(araToplam, indirimYuzdesi);

        // 4. Metot
        double indirimliToplam = indirimliToplamHesapla(araToplam, indirimTutari);

        // 5. Metot
        double kdvTutari = kdvTutariHesapla(indirimliToplam);

        // 6. Metot
        double genelToplam = genelToplamHesapla(indirimliToplam, kdvTutari);

        // --- SONUÇ EKRANI ---
        System.out.println("\n--- SEPET ÖZETİ ---");
        System.out.printf("Ürünlerin Tek Tek Satış Toplamları: %.2f TL, %.2f TL, %.2f TL%n", satisTop1, satisTop2, satisTop3);
        System.out.println("---------------------------------");
        System.out.printf("Ara Toplam: %.2f TL%n", araToplam);
        System.out.printf("İndirim Tutarı (%%%d): -%.2f TL%n", (int)indirimYuzdesi, indirimTutari);
        System.out.printf("İndirimli Toplam: %.2f TL%n", indirimliToplam);
        System.out.printf("KDV Tutarı (%%18): +%.2f TL%n", kdvTutari);
        System.out.printf("Kargo Ücreti: +%.2f TL%n", SHIPPING_FEE);
        System.out.println("=================================");
        System.out.printf("Genel Toplam: %.2f TL%n", genelToplam);
    }

    // --- 6 METOT (Formüllere göre) ---

    /**
     * 1. Metot: Ürünlerin Tek Tek Satış Toplamı (Fiyat × Adet)
     */
    public static double satisToplamiHesapla(double fiyat, int adet) {
        return fiyat * adet;
    }

    /**
     * 2. Metot: Ara Toplam (3 ürünün toplamı)
     */
    public static double araToplamHesapla(double satisTop1, double satisTop2, double satisTop3) {
        return satisTop1 + satisTop2 + satisTop3;
    }

    /**
     * 3. Metot: İndirim Tutarı (Ara toplama % indirim)
     */
    public static double indirimTutariHesapla(double araToplam, double indirimYuzdesi) {
        return araToplam * (indirimYuzdesi / 100.0);
    }

    /**
     * 4. Metot: İndirimli Toplam (Ara Toplam - İndirim Tutarı)
     */
    public static double indirimliToplamHesapla(double araToplam, double indirimTutari) {
        return araToplam - indirimTutari;
    }

    /**
     * 5. Metot: KDV Tutarı (İndirimli toplam üzerinden)
     */
    public static double kdvTutariHesapla(double indirimliToplam) {
        return indirimliToplam * VAT_RATE; // Sabit VAT_RATE kullanılır
    }

    /**
     * 6. Metot: Genel Toplam (İndirimli Toplam + KDV + Kargo)
     */
    public static double genelToplamHesapla(double indirimliToplam, double kdvTutari) {
        return indirimliToplam + kdvTutari + SHIPPING_FEE; // Sabit SHIPPING_FEE kullanılır
    }
}
