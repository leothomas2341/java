import java.util.Scanner;

public class Tp2 {
    private static Scanner scanner;
    public static void main (String[] args){
        scanner = new Scanner(System.in);

        exercice1();

        scanner.close();
    }
    public static void exercice1(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        int n = scanner.nextInt();
        // méthode 1
//        int f0 = 0;
//        int f1 = 1;
//
//        for (int i = 2; i<=n; i++){
//            int next = f0 + f1;
//            System.out.println(next);
//            f0 = f1;
//            f1 = next;
//        }
//
//        System.out.println("fibo à F" + n + " = " + f1);

        // méthode 2

        int [] fibo = new int[n + 1];
        fibo[0] = 0;

        if (n>=1){
            fibo[1] = 1;
        }

        for(int i = 2; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i=0; i<=n; i++){
            System.out.println(fibo[i]);
        }

        System.out.println("fibo à f" + n + " = " + fibo[n]);
    }
}
