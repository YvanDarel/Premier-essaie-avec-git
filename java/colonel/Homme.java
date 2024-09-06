package colonel;

public class Homme extends Personnes implements Sexeble {
    public Homme(String nom){
        this.mNom = nom;
    }

    public void composition(){
        System.out.println(this.mNom + " est un homme puisque qu'il a une basse et les peptoros");
    }
    public void DetSexe(String sexe){
        System.out.println(this.mNom + " est bien un homme de sexe Masculin");
    }
}
