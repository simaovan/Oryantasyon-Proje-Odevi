/*
    Kullanıcıdan alınan iki kardeşin yaşları ortalamasısını veren program
 */
package proje;
import java.util.Scanner;
public class Proje2 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Yaş giriniz: ");
        int yas1=klavye.nextInt();
        System.out.println("Yaş giriniz: ");
        int yas2=klavye.nextInt();
        
        double ort=(yas1+yas2)/2;
        
        System.out.println("Yaş ortalaması :"+ ort);
    }
}
