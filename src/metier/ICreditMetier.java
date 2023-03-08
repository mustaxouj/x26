package metier;

import model.Credit;


public interface ICreditMetier {
    Credit calcukerMensualite(long idCredit) throws Exception;
}
