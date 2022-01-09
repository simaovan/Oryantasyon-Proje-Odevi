/*
    Kullanıcı tarafından girilen sayının faktöriyelini hesaplayıp ekrana gösteren program
 */
package proje;
import java.util.Scanner;
public class Proje8 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=klavye.nextInt();
        
        int a=1;
        for (int i = 1; i < sayi+1; i++) {
            a=a*i;
        }
        System.out.println("Faktöriyeli: "+a);
    }
}
