package classes;

public class Vehicule {
    // Attributs
    private String couleur;
    private int nombrePassagers;
    private Integer nombreRoues;
    private Boolean presenceMoteur = null;

    /**
     *
     * @param couleur
     * @param nombrePassagers
     * @param nombreRoues
     * @param presenceMoteur
     */
    public Vehicule(String couleur, int nombrePassagers, int nombreRoues, boolean presenceMoteur) {
        this.couleur = couleur;
        this.nombrePassagers = nombrePassagers;
        this.nombreRoues = nombreRoues;
        this.presenceMoteur = presenceMoteur;
    }

    // Méthodes
    public void demarrer() {
        System.out.println("Le véhicule démarre.");
    }

    public void arreter() {
        System.out.println("Le véhicule s'arrête.");
    }

    /**
     *
     * @return
     */
    public boolean peutFlotter() {
        // Ajoutez ici la logique pour déterminer si le véhicule peut flotter
        return false; // Placeholder, à remplacer avec la logique réelle
    }

    public boolean peutVoler() {
        // Ajoutez ici la logique pour déterminer si le véhicule peut voler
        return false; // Placeholder, à remplacer avec la logique réelle
    }

    public boolean peutRouler() {
        // Ajoutez ici la logique pour déterminer si le véhicule peut rouler
        return true; // Placeholder, à remplacer avec la logique réelle
    }


}
