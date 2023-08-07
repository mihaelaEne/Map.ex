package app.comparators;

import app.models.Persoana;

import java.util.Comparator;

public class ComparePersoanaByNume implements Comparator <Persoana>{

    @Override
    public int compare(Persoana o1, Persoana o2) {
        if (o1.getNume().compareTo(o2.getNume())>0){
            return 1;
        }else if(o1.getNume().compareTo(o2.getNume())<0){
            return -1;
        }else return 0;
    }
}
