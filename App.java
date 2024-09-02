import colonel.*;

public class App {
    public static void main(String[]args){

        Homme h = new Homme("Yvan");
        Femme f =  new Femme("Denise");

        h.parler();
        f.parler();
        h.composition();
        f.composition();

        h.DetSexe(" maculin");
        f.DetSexe(" Feminin");

    }
}