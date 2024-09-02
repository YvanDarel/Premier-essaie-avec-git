package colonel;
abstract public class Personnes {
    protected String mNom;
     public  void parler(){
         System.out.println(this.mNom+" est un individu qui parle");
     }
    abstract public void composition();
}
