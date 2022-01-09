/*
    5 öğretmenin maaşları toplamını veren program
 */
package proje;
import java.util.Scanner;
public class Proje5 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Maaş giriniz: ");
            int maas=klavye.nextInt();
            toplam=toplam+maas;
        }
        System.out.println("Toplam maaş= "+ toplam);
    }
}
