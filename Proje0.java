/*
    Kullanıcıdan en ve boy isimli iki tam sayı değerini giriş olarak alan ve "*" sembolünden dikdörtgeni ekrana çizdiren program
    örnek   ****
            ****
            ****
 */
package proje;
import java.util.Scanner;
public class Proje0 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("En giriniz: ");
        int en=klavye.nextInt();
        System.out.println("Boy giriniz:");
        int boy=klavye.nextInt();
        
        for (int i = 0; i < boy; i++) {
            for (int j = 0; j < en; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
