package com.observators;

import com.interfaces.Observator;
import java.util.Objects;

/**
 *
 *
 * @since Mar 2, 2018, 4:53:11 PM
 * @author Grzegorz Brodowski
 */
public class Czytelnik implements Observator {
    private String name;
    private int gazetaToRead = 0;
    private String wiadomosc;

    public String getName() {
        return name;
    }

    public Czytelnik(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        gazetaToRead++;
        System.out.println("Hey "
                           + name + " ! there is a new newspaper! You have "
                           + gazetaToRead + " videos to watch");

        wiadomosc = "Hey "
                    + name + " ! there is a new newspaper! You have "
                    + gazetaToRead + " videos to watch";
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Czytelnik other = (Czytelnik) obj;
        if (!Objects.equals(this.name, other.name))
            return false;
        return true;
    }

    
    
    

}
