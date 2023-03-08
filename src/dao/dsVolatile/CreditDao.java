package dao.dsVolatile;

import dao.Idao;
import model.Credit;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class CreditDao implements Idao<Credit,Long> {




    static Set<Credit> BD_Credit(){
        return new HashSet<Credit>(
            Arrays.asList(
                    new Credit(1L,30000.0,120,2.5, "Mustapha", 0.0),
                    new Credit(2L,350000.0,100,2.5, "Mohammed", 0.0),
                    new Credit(3L,660000.0,110,2.5, "Mourad", 0.0),
                    new Credit(4L,70000.0,90,2.5, "Mariam", 0.0)
                    ));
    }




    @Override
    public Credit trouverParId(Long idCredit) {
        return (Credit) BD_Credit().stream();
    }
}
