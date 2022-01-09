/*
    Kullanıcının klavyeden girdiği 3 adet sayıdan en küçüğünü bulan program
 */
package proje;
import java.util.Scanner;
public class Proje1 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1=klavye.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2=klavye.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3=klavye.nextInt();
        
        int enkucuk=sayi1;
        
        if(sayi2 < enkucuk){
            enkucuk=sayi2;
        }
        if(sayi3 < enkucuk){
            enkucuk=sayi3;
        }
        System.out.println("En küçük sayı: "+ enkucuk);
    }
}
