import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double cevre, alanKare, alan, u;
        String d = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Merhabalar! Üç kenar uzunluğu bilinen üçgenin kenar uzunluğunu hesaplayan program yapacağız. Sizlerden 3 adet sayı alacağız.");
        System.out.print("Hazırsanız ekrana 'ok' yazınız : ");
        d = input.nextLine();

        if (Objects.equals(d, "ok")){
            System.out.print("Birinci kenar uzunluğunu giriniz: ");
            a = input.nextInt();

            System.out.print("İkinci kenar uzunluğunu giriniz: ");
            b = input.nextInt();

            System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
            c = input.nextInt();

            if(a<0 || b<0 || c<0){
                System.out.println("Negatif değer girdiğiniz için program sonlandırılmıştır.");
            }else{
                u = (a+b+c)/2;
                cevre = 2 * u;
                alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
                System.out.println("Üçgenin Çevresi: " + cevre);
                System.out.println("Üçgenin Alanı: " + alan);
            }

        }else{
            System.out.println("Malesef 'ok' demediğiniz için program sonlandırıldı.");
        }

    }
}