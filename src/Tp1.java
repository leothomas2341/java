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
        exercice2_1();

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
        int x2;
        int y2;

        System.out.print("Saisir valeur de x : ");
        x = scanner.nextInt();
        System.out.print("Saisir valeur de y : ");
        y = scanner.nextInt();
        x2 = y;
        y2 = x;

        x= y;
        y=x;

        System.out.println("Les valeurs sont permutées, x vaut " + x2 + " et y vaut " + y2);
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

}