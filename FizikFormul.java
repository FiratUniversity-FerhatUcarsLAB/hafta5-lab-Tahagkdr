/*
 * Ad Soyad:MUHAMMED TAHA GÖKDERE
 * Ogrenci No: 250541092
 * Tarih: 13/11/2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

// Görev 2'de istenen Scanner sınıfını içeri aktarıyoruz.
import java.util.Scanner;

public class FizikHesaplamalari {

    /**
     * Yerçekimi ivmesi sabiti (m/s^2).
     */
    public final static double GRAVITY = 9.8;

    // -----------------------------------------------------------------
    // GÖREV 1: 8 ADET METOT
    // -----------------------------------------------------------------

    /**
     * Hız hesaplar (v = s / t).
     */
    public static double hizHesapla(double s, double t) {
        return s / t;
    }

    /**
     * İvme hesaplar (a = Δv / t).
     */
    public static double ivmeHesapla(double deltaV, double t) {
        return deltaV / t;
    }

    /**
     * Kuvvet hesaplar (F = m * a).
     */
    public static double kuvvetHesapla(double m, double a) {
        return m * a;
    }

    /**
     * İş hesaplar (W = F * d).
     */
    public static double isHesapla(double F, double d) {
        return F * d;
    }

    /**
     * Güç hesaplar (P = W / t).
     */
    public static double gucHesapla(double W, double t) {
        return W / t;
    }

    /**
     * Kinetik Enerji hesaplar (KE = 0.5 * m * v^2).
     */
    public static double kinetikEnerjiHesapla(double m, double v) {
        // Görev 2'de belirtildiği gibi Math.pow(v, 2) kullanılıyor.
        return 0.5 * m * Math.pow(v, 2);
    }

    /**
     * Potansiyel Enerji hesaplar (PE = m * g * h).
     */
    public static double potansiyelEnerjiHesapla(double m, double h) {
        // Sınıfın başındaki GRAVITY sabitini kullanır.
        return m * GRAVITY * h;
    }

    /**
     * Momentum hesaplar (p = m * v).
     */
    public static double momentumHesapla(double m, double v) {
        return m * v;
    }

    // -----------------------------------------------------------------
    // SCANNER KULLANIMI İÇİN ÖRNEK ANA METOT (main)
    // -----------------------------------------------------------------

    /**
     * Metotları test etmek için kullanıcıdan veri alan ana metot.
     */
    public static void main(String[] args) {
        // Scanner nesnesini oluştur
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Fizik Hesaplama Test Aracı ---");

        // Örnek olarak KUVVET HESAPLAMA (F = m * a) yapalım
        System.out.println("\nKuvvet Hesaplaması (F = m * a)");
        System.out.print("Lütfen kütleyi (m) girin (kg): ");
        double kutle = scanner.nextDouble();

        System.out.print("Lütfen ivmeyi (a) girin (m/s^2): ");
        double ivme = scanner.nextDouble();

        // Kendi yazdığımız static metodu çağırıyoruz
        double hesaplananKuvvet = kuvvetHesapla(kutle, ivme);

        System.out.println("---------------------------------");
        System.out.println("Sonuç: Hesaplanan Kuvvet = " + hesaplananKuvvet + " Newton (N)");
        System.out.println("---------------------------------");

        
        // Örnek olarak POTANSİYEL ENERJİ (PE = m * g * h) yapalım
        System.out.println("\nPotansiyel Enerji Hesaplaması (PE = m * g * h)");
        System.out.print("Lütfen kütleyi (m) girin (kg): ");
        double peKutle = scanner.nextDouble();
        
        System.out.print("Lütfen yüksekliği (h) girin (metre): ");
        double yukseklik = scanner.nextDouble();

        // Kendi yazdığımız static metodu çağırıyoruz
        // Bu metot, sınıfımızdaki GRAVITY (9.8) sabitini kullanacak
        double hesaplananPE = potansiyelEnerjiHesapla(peKutle, yukseklik);

        System.out.println("---------------------------------");
        System.out.println("Sonuç: Hesaplanan Potansiyel Enerji = " + hesaplananPE + " Joule (J)");
        System.out.println("---------------------------------");

        // Scanner'ı kapat
        scanner.close();
    }
}
