package com.observators;

import com.interfaces.Observator;
import com.interfaces.Subject;
import java.util.ArrayList;

/**
 *
 *
 * @since Mar 2, 2018, 4:45:04 PM
 * @author Grzegorz Brodowski
 */
public class Redakcja implements Subject {
    ArrayList<Observator> czytelnicy = new ArrayList<>();

    public Redakcja() {
        this.czytelnicy = czytelnicy;
    }

    public ArrayList<Observator> getCzytelnicy() {
        return czytelnicy;
    }

    @Override
    public void register(Observator o) {
        czytelnicy.add(o);
    }

    @Override
    public void unregister(Observator o) {
        czytelnicy.remove(o);
    }

    @Override
    public void notifies() {
        for(Observator o:czytelnicy){
            o.update();
        }
    }
    
   
}
