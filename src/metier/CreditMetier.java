package metier;

import dao.dsVolatile.CreditDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Credit;
import metier.CreditExeption;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditMetier implements ICreditMetier{
    /**
     * @param idCredit
     * @return (capitale * taux) /(1-(taux)^^nbrMois)avec taux => tauxMensuel/1200
     * @throws CreditExeption
     */
    CreditDao creditDao;

    @Override
    public Credit calcukerMensualite(long idCredit) throws CreditExeption {
        // TODO Auto-generated method stub
        var credit = creditDao.trouverParId(idCredit);
        if(credit == null){
            throw new CreditExeption("credit non trouver !!! ");
        }else {

            double cp = credit.getCapitalEmprunter();
            int nbrMois = credit.getNombreMois();
            double t = credit.getTauxMensuel()/1200;// ca va etre avec presision car elle est double
            double m = (cp*t)/(1-Math.pow(1+t,-1* nbrMois));
            m = Math.round(m*100)/100; // Pour avoir deux nombre apres la virgule

            credit.setMensualiter(m);
            return credit;
        }
    }
}

