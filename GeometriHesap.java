/*
 * Ad Soyad: MUHAMMED TAHA GÖKDERE
 * Ogrenci No: 250541092
 * Tarih: 13/11/2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 *


    import java.util.Scanner;

// Bütün kod bu 'public class ... {' bloğunun içinde olmalıdır.
public class GeometryCalculator {

    /**
     * HATA 2 ve 3 ÇÖZÜMÜ:
     * 'main' metodu 'static' olduğu için, çağıracağı diğer 8 metodun da
     * 'static' olması ve 'main'in dışında, 'class'ın içinde tanımlanması gerekir.
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Geometrik Hesaplayıcı ---");

        // --- 1. Kare Hesaplamaları ---
        System.out.println("\n== KARE ==");
        System.out.print("Karenin bir kenarını girin: ");
        double kareKenar = scanner.nextDouble();
        
        // HATA 1 ÇÖZÜMÜ: Metotları burada 'ÇAĞIRIYORUZ' (Using/Calling).
        // Eğer bu metotlar aşağıda 'TANIMLANMAMIŞ' olsaydı, burası "Cannot Find Symbol" hatası verirdi.
        double kareAlan = calculateSquareArea(kareKenar);
        double kareCevre = calculateSquarePerimeter(kareKenar);
        System.out.println("-> Kare Alanı: " + kareAlan);
        System.out.println("-> Kare Çevresi: " + kareCevre);

        // --- 2. Dikdörtgen Hesaplamaları ---
        System.out.println("\n== DİKDÖRTGEN ==");
        System.out.print("Genişlik: ");
        double genislik = scanner.nextDouble();
        System.out.print("Yükseklik: ");
        double yukseklik = scanner.nextDouble();
        
        // Metotlar çağrılıyor
        double dikdortgenAlan = calculateRectangleArea(genislik, yukseklik);
        double dikdortgenCevre = calculateRectanglePerimeter(genislik, yukseklik);
        System.out.println("-> Dikdörtgen Alanı: " + dikdortgenAlan);
        System.out.println("-> Dikdörtgen Çevresi: " + dikdortgenCevre);

        // --- 3. Daire Hesaplamaları ---
        System.out.println("\n== DAİRE ==");
        System.out.print("Yarıçap (r): ");
        double yaricap = scanner.nextDouble();

        // Metotlar çağrılıyor
        double daireAlan = calculateCircleArea(yaricap);
        double daireCevre = calculateCircleCircumference(yaricap);
        System.out.println("-> Daire Alanı: " + daireAlan);
        System.out.println("-> Daire Çevresi: " + daireCevre);

        // --- 4. Üçgen Hesaplamaları ---
        System.out.println("\n== ÜÇGEN ALAN ==");
        System.out.print("Taban: ");
        double taban = scanner.nextDouble();
        System.out.print("Yükseklik: ");
        double ucgenYukseklik = scanner.nextDouble();
        
        // Metot çağrılıyor
        double ucgenAlan = calculateTriangleArea(taban, ucgenYukseklik);
        System.out.println("-> Üçgen Alanı: " + ucgenAlan);
        
        System.out.println("\n== ÜÇGEN ÇEVRE ==");
        System.out.print("Kenar a: ");
        double kenarA = scanner.nextDouble();
        System.out.print("Kenar b: ");
        double kenarB = scanner.nextDouble();
        System.out.print("Kenar c: ");
        double kenarC = scanner.nextDouble();
        
        // Metot çağrılıyor
        double ucgenCevre = calculateTrianglePerimeter(kenarA, kenarB, kenarC);
        System.out.println("-> Üçgen Çevresi: " + ucgenCevre);


        scanner.close();
    } // <-- 'main' metodu burada BİTER.

    // ===========================================
    // ======= 8 ZORUNLU METOT (TANIMLAMALAR) ========
    // ===========================================
    // HATA 1, 2 ve 3'ün ÇÖZÜMÜ: 
    // Metotlar burada, 'main'in dışında, 'class'ın içinde 'static' olarak TANIMLANIR.
    // 'TANIMLAMA' (Definition), metodun ne iş yaptığını yazdığınız yerdir.

    // --- 1. Kare: Alan ---
    public static double calculateSquareArea(double kenar) {
        return kenar * kenar; 
    }

    // --- 2. Kare: Çevre ---
    public static double calculateSquarePerimeter(double kenar) {
        return 4 * kenar;
    }

    // --- 3. Dikdörtgen: Alan ---
    public static double calculateRectangleArea(double genislik, double yukseklik) {
        return genislik * yukseklik;
    }

    // --- 4. Dikdörtgen: Çevre ---
    public static double calculateRectanglePerimeter(double genislik, double yukseklik) {
        return 2 * (genislik + yukseklik);
    }

    // --- 5. Daire: Alan ---
    public static double calculateCircleArea(double r) {
        return Math.PI * r * r; 
    }

    // --- 6. Daire: Çevre ---
    public static double calculateCircleCircumference(double r) {
        return 2 * Math.PI * r;
    }

    // --- 7. Üçgen: Alan ---
    public static double calculateTriangleArea(double taban, double yukseklik) {
        return (taban * yukseklik) / 2;
    }

    // --- 8. Üçgen: Çevre ---
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

} // <-- 'public class' burada BİTER.
