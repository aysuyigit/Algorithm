import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int bas ;
        int toplam = 0 ;

        while(sayi>0){

            bas = sayi % 10; // Kalanın yazdırılması
            sayi = sayi / 10; // “sayi”in onlar basamağının birler basamağına dönüştürülmesi
            list.add(bas);
        }

        System.out.println(list);

        int fakt = 1;
        for(int i = 0 ; i < list.size() ; i++) {
            for(int j = 1 ; j<=list.get(i) ;j++) {
                fakt = fakt*j;
            }
            System.out.println(fakt);
            toplam = toplam + fakt;
            fakt=1;
        }

        System.out.println(toplam);

    }
}
