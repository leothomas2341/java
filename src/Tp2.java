import java.util.Scanner;

public class Tp2 {

    private static Scanner scanner;
    public static void main (String[] args){
//        scanner = new Scanner(System.in);
//
//        exercice1();
//
//        scanner.close();

        int[] tab = { 4, 6, 4, 2, 10, 2, 4, 8, 10, 1, 4, 9, 8, 9, 4, 1, 8, 2, 9 };
        int[] tab1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        int[] tab2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] tab3 = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        int[] tab4 = { 2023, 2016, 2014, 2032, 2011, 2022, 2014, 1992, 2014, 1998, 2020, 2028, 2011, 2009, 2017, 2001,
                2028, 2014, 2025 };

        triComptage(tab);
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
    public static void triComptage(int[] tab){
        printTab(tab);

        //Valeurs min max
        int min = tab[0];
        int max = tab[0];

        for(int i=1; i<tab.length; i++){
            if (tab[i]<min){
                min = tab[i];
            }
            if (tab[i]>max){
                max=tab[i];
            }
        }

        //Tableau de comptage
        int plage = max-min+1;
        int[] tabComptage=new int[plage];

        //Compter les occurences
        for (int i = 0; i<tab.length; i++){
            tabComptage[tab[i] - min]++;
        }

        //Tableau trié
        int index=0;
        for(int i=0; i<tabComptage.length; i++){
            while(tabComptage[i]>0){
                tab[index]=i+min;
                index++;
                tabComptage[i]--;
            }
        }

        System.out.println("Tableau trié :");
        printTab(tab);
    }

    private static void printTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
