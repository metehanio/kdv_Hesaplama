import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price;

        double kdvOran = 0.18;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyat giriniz : ");       // Market etiketlerinin KDV dahil fiyatı yansıttığı varsayılmıştır
        price = inp.nextDouble();

        System.out.println("KDV Oranı : " + kdvOran);

        double kdvsiz = (price-(price*kdvOran) ) * 1.0;
        System.out.println("KDV'siz Fiyat : " + kdvsiz);

        double kdvDahil = price;
        System.out.println("KDV Dahil Fiyat : " + kdvDahil);

        double kdvMiktar = price*kdvOran;
        System.out.println("KDV Tutarı : " + kdvMiktar);

    }
}