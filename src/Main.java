import dao.Idao;
import dao.dsVolatile.CreditDao;
import metier.CreditMetier;
import metier.ICreditMetier;
import model.Credit;
import presentation.CreditControleur;
import presentation.ICreditControleur;

public class Main {
    static ICreditControleur controleur;

    /**
     * tester l'application avec une interface de dependance statique
     */
    public static void test1() throws Exception {
        //fabrique
        controleur = new CreditControleur();
        ICreditMetier metier = new CreditMetier();
        Idao<Credit,Long> dao = new CreditDao();
        //injection de dependaces

        (  (CreditControleur)controleur).setService(metier);
        controleur.afficherMensualite(1l);

    }
    public static void test2(){}
    public static void test3(){}
    public static void test4(){}
    public static void main(String[] args) {

    }
}