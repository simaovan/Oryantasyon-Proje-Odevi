/*
    Kullanıcının klavyeden girdiği sayının mükemmel sayı olup olmadığını kontrol eden program(Kendisi dışındaki pozitif tam bölenlerinin toplamı kendisi olan sayılardır örn 28=1+2+4+7+14 veya 6=1+2+3)
 */
package proje;
import java.util.Scanner;
public class Proje9 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=klavye.nextInt();
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0) {
                toplam=toplam+i;
            }
        }
        if (sayi==toplam) {
            System.out.println("Sayınız mükemmel bir sayıdır.");
        }
        else{
            System.out.println("Sayınız mükemmel bir sayı değildir.");
        }
    }
}
