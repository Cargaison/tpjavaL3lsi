public class Personne {
    private String nom;
    private String prenom;
    private int anNaissance;
    private static int nbPersonnes = 0; // Variable statique pour compter les objets créés

    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        nbPersonnes++;
    }
    public Personne(String prenom, int anNaissance) {
        nbPersonnes++;
        this.nom = "Inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
    }

    public Personne() {
        nbPersonnes++;
        this.nom = "Potter";
        this.prenom = "Harry";
        this.anNaissance = 1980;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }

    public int calculerAge(){
        int age = 2024 - this.anNaissance;
        return age;
    }

    public void afficherInfos(){
        System.out.println("Nom:"+this.nom+"\n"+"Prenom:"+this.prenom+"\n"+"age:"+calculerAge());

    }

    public void mange(String meal){
        System.out.println(this.nom+" "+this.prenom+" mange "+ meal);
    }
    public static void afficherNbPers() {
        System.out.println("Nombre de personnes créées: " + nbPersonnes);
    }
    public boolean isBissextile(int annee) {
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            return true; // L'année est bissextile
        } else {
            return false; // L'année n'est pas bissextile
        }
    }
    public void afficherNombresPremiers(int annee) {
        for (int i = 2; i <= annee; i++) {
            if (estPremier(i)) {
                System.out.println(i); // Afficher les nombres premiers
            }
        }
    }

    private boolean estPremier(int nombre) {
        if (nombre <= 1) return false;
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) return false;
        }
        return true;
    }
    public static boolean isPalindrome(String chaine) {
        String reverse = new StringBuilder(chaine).reverse().toString();
        return chaine.equalsIgnoreCase(reverse);
    }
}