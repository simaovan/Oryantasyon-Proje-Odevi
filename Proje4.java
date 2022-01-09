/*
    Kullanıcıdan alınan yarıçap değerine göre alan ve çevreyi hesaplayıp ekrana yazdıran program
 */
package proje;
import java.util.Scanner;
public class Proje4 {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);
        System.out.println("Yarıçap değeri giriniz: ");
        int yaricap=klavye.nextInt();
        final double PI=3.14;
        System.out.println("Çevre= "+ (2*PI*yaricap)+" olur.");
        System.out.println("Alan= "+ (PI*yaricap*yaricap)+" olur.");
        
    }
}
