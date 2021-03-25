import java.util.*;
public class Proje {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int n = sc.nextInt();
        int toplam = 0;
        int aort = 0;
        int deger;
        int fark[] = new int[n];
        double kareleri[] = new double[n];
        double karetop = 0;
        double bol = 0;
        double sonuc = 0;
        int dizi[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print((i+1)+".'ci Değeri Giriniz : ");
            deger = sc.nextInt();
            toplam += deger;
            dizi[i] = deger;
        }
        for (int i = 0; i < n; i++) {
            aort = toplam / n;
            fark[i] = aort - dizi[i];
            kareleri[i] = Math.pow(fark[i], 2);
            karetop += kareleri[i];
        }
        bol = karetop / (n-1);
        sonuc = Math.sqrt(bol);
        System.out.println("Standart Sapma : "+sonuc);
    }
}
