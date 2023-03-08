package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credit {
    private Long id;
    private Double capitalEmprunter;
    private Integer nombreMois;
    private Double tauxMensuel;
    private String demandeur;
    private Double mensualiter;

    @Override
    public String toString() {
        var creditStr = "===============================================                     \n";
            creditStr+= "=> Credit n"+getId()+"                                              \n";
            creditStr+= "_______________________________________________                     \n";
            creditStr+= "=> Capitale Emprunte            : "+getCapitalEmprunter()+"DH       \n";
            creditStr+= "=> Nombre de mois               : "+getNombreMois()+"mois           \n";
            creditStr+= "=> Taux mensuel                 : "+getMensualiter()+"%             \n";
            creditStr+= "_______________________________________________                     \n";
            creditStr+= "=> Mensualite                :"
                    +(getMensualiter() == 0.0 ? "non-calcule" : getMensualiter()+"DH/mois")+"\n";
            creditStr+= "===============================================                     \n";
            return creditStr;

    }
}
