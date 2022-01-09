/*
    12 öğrencinin notlarını okuyup sınav ortalamasını yazdıran program
 */
package proje;
import java.util.Scanner;
public class Proje3 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < 12; i++) {
            System.out.print("Not giriniz: ");
            int not=klavye.nextInt();
            toplam=toplam+not;
        }
        System.out.println("Ortalama: "+ (toplam/12));
    }
}
