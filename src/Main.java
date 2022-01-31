import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını giriniz :");
        int n=scanner.nextInt();

        System.out.print("Farklı grup sayısını giriniz :");
        int r=scanner.nextInt();
        int a=1;
        for (int i = 1; i <=n; i++) {
            a*=i;
        }
        //System.out.println(a);

        int b=1;
        for (int i = 1; i <=r; i++) {
            b*=i;
        }
        //System.out.println(b);
        int c=1;
        for (int i = 1; i <=n-r ; i++) {
            c*=i;
        }
        //System.out.println(c);
        int result=a/(b*c);
        System.out.println("Kombinasyon hesabı : "+result);


    }
}
