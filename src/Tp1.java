import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tp1 {

    // Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
    private static Scanner scanner;

    // Méthode principale
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // Appel de la méthode de l'exercice 1.1
        //exercice1_1();
        //exercice1_2();
        //exercice2_1();
        //exercice2_2();
        //exercice3_1();
        exercice4_1();

        scanner.close();
    }

    // Méthode de l'exercice n°1.1
    public static void exercice1_1() {

        // 1° - Déclaration
        String prenom;
        String nom;
        String age;

        // 2° - Initialisation
        System.out.print("Prénom : ");
        prenom = scanner.next();
        System.out.print("Nom : ");
        nom = scanner.next();
        System.out.print("Age : ");
        age = scanner.next();


        // 3° - Utilisation
        System.out.println("Bonjour " + prenom + " " + nom + " (" + age + " ans) .");
    }

    // Méthode de l'exercice n°1.2
    public static void exercice1_2() {
        int x;
        int y;

        System.out.print("Saisir valeur de x : ");
        x = scanner.nextInt();
        System.out.print("Saisir valeur de y : ");
        y = scanner.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y);
    }

    // Méthode de l'exercice n2.1
    public static void exercice2_1(){
        String mot1;
        String mot2;

        System.out.print("Saisir un premier mot : ");
        mot1 = scanner.next();
        System.out.print("Saisir un second mot : ");
        mot2 = scanner.next();

        if (mot1.length()> mot2.length()){
            System.out.println(mot1 + " est le mot avec le plus de caractères.");
        } else if (mot2.length()>mot1.length()){
            System.out.println(mot2 + " est le mot avec le plus de caractères");
        }
        if (mot1.length()==mot2.length()){
            System.out.println("Les deux mots ont le même nombre de caractères.");
        }
    }

    // Méthode de l'exercice n2.2
    public static void exercice2_2(){
        int annee;

        System.out.print("Saisir une année : ");
        annee = scanner.nextInt();

        if (annee % 4 ==0){
            if (annee % 100!=0){
                System.out.println("L'année " + annee + " est bissextile");
            }
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile");
        }
    }

    // Méthode de l'exercice n3.1
    public static void exercice3_1(){
        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        for(int i = 0; i<10; i++){
            int aleatoire = (int) (Math.random() * 101);

            System.out.println(aleatoire);

            //aleatoire est un nouveau max ?
            if (aleatoire > max){
                max = aleatoire;
            }

            // aleatoire est un nouveau min
            if (aleatoire < min){
                min =aleatoire;
            }
        }

        System.out.println("Le max est : " + max);
        System.out.println("Le min est : " + min);
    }

    // Méthode de l'exercice 4.1
    public static void exercice4_1(){
        int rand = (int) (Math.random() * 101);
        int nombre = 0;
        System.out.println("Entrer un nombre");
        nombre = scanner.nextInt();



        for (int i=0; i<i+1; i++){
            if(rand-nombre>20){
                System.out.println("froid");
                System.out.println("Entrer un nombre");
                nombre = scanner.nextInt();
            } else if (rand-nombre>=1){
                if (rand-nombre<=5){
                    System.out.println("chaud");
                    System.out.println("Entrer un nombre");
                    nombre = scanner.nextInt();
                }
            } else if (rand-nombre>=20){
                if (rand-nombre<=6){
                    System.out.println("tiède");
                    System.out.println("Entrer un nombre");
                    nombre = scanner.nextInt();
                }
            } else if (rand==nombre){
                System.out.println("Gagné (" + i + "tentatives)");
            }
        }
    }
}