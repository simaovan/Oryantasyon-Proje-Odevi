/*
    Bir öğrencinin dönem sonu not ortalamasını hesaplayan program
 */
package proje;
import java.util.Scanner;
public class Proje6 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Vize notunu giriniz: ");
        int not1=klavye.nextInt();
        System.out.println("Final notunu giriniz: ");
        int not2=klavye.nextInt();
        double ort=(not1*0.4+not2*0.6);
        System.out.println("Ortalamanız: "+ ort);
    }
}
