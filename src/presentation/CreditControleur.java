package presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import metier.CreditExeption;
import metier.ICreditMetier;
import model.Credit;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditControleur implements ICreditControleur{
    ICreditMetier service;
    @Override
    public void afficherMensualite(long idCredit) throws CreditExeption {
        Credit credit = null;
        try {
            credit = service.calcukerMensualite(idCredit);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(credit);
    }
}
