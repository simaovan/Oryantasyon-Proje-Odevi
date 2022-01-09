/*
    Kullanıcın girdiği sayının 3'ün katı olup olmadığını bulan program
 */
package proje;
import java.util.Scanner;
public class Proje7 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=klavye.nextInt();
        if(sayi%3==0){
            System.out.println("Sayınız 3'ün katıdır.");
        }
        else{
            System.out.println("Sayınız 3'ün katı değildir.");
        }
    }
}
