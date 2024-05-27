import classes.Compte;
import classes.Vehicule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        Compte compte = new Compte(1,2000.00);
        System.out.println(compte.getCode());

        System.out.println(compte.getSolde());
        compte.retirer(50.00);
        System.out.println(compte.getSolde());
        System.out.println(compte.getSoldeEnEuro());


        ///
        Compte compte2 = new Compte(1, (Double) null);
        compte2.retirer(200.00);
        System.out.println(compte.toString());
        compte2.activeCompte();
        if(compte2.getSolde() > 0){
            System.out.println("solde positif");
        }else if(compte2.getSolde() ==0){
            System.out.println("compte vide");
        } else {
            System.out.println("solde negatif");
        }

        switch(compte2.getCode()){
            case 1:
                System.out.println("Compte 1");
                break;
            case 3:  System.out.println("Compte 3");
                break;
            default: System.out.println("Compte autre");
        }


        switch(compte2.getCode()){
            case 1:
                System.out.println("Compte 1");
                break;
            case 3:  System.out.println("Compte 3");
                break;
            default: System.out.println("Compte autre");
        }*/

        List <Compte> compteList = new ArrayList<>();
        for(int i=0;i<10;i++){
            Compte cmpt = new Compte(i, "name"+i);
            //i++ => i=i+1;
            compteList.add(cmpt);
        }


    }

    List<Vehicule> createVehicule(){
        // Créer un objet Random
        Random random = new Random();
        List<Vehicule> vehiculeList = new ArrayList<>();
        // Générer 20 véhicules aléatoires
        for (int i = 1; i <= 20; i++) {
            // Générer des attributs aléatoires pour chaque véhicule
            String couleur = genererCouleurAleatoire();
            int nombrePassagers = random.nextInt(10) + 1; // Entre 1 et 10 passagers
            int nombreRoues = random.nextInt(4) + 2; // Entre 2 et 6 roues
            boolean presenceMoteur = random.nextBoolean();

            // Créer le véhicule avec les attributs aléatoires
            Vehicule vehicule = new Vehicule(couleur, nombrePassagers, nombreRoues, presenceMoteur);

            // Afficher les détails du véhicule
            System.out.println("Véhicule " + i + ":");
            System.out.println("Couleur: " + couleur);
            System.out.println("Nombre de passagers: " + nombrePassagers);
            System.out.println("Nombre de roues: " + nombreRoues);
            System.out.println("Présence d'un moteur: " + (presenceMoteur ? "Oui" : "Non"));
            vehiculeList.add(vehicule);
            System.out.println();
        }
        return vehiculeList;
    }
    private static String genererCouleurAleatoire() {
        String[] couleurs = {"Rouge", "Bleu", "Vert", "Jaune", "Noir", "Blanc"};
        Random random = new Random();
        return couleurs[random.nextInt(couleurs.length)];
    }
}