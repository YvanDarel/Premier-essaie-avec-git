
package colonel;
public class Femme extends Personnes implements Sexeble{
    public Femme(String nom){
        this.mNom = nom;
    }

    public void composition(){
        System.out.println(this.mNom + " est une femme puisque qu'elle a des seins et une voix douce");
    }

    public void DetSexe(String sexe){
        System.out.println(this.mNom + " est bien une femme de sexe Feminin");
    }

}
