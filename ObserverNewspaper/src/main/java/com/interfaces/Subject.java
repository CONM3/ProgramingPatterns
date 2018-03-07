
package com.interfaces;

/**
 * 
 *
 * @since Mar 2, 2018, 4:43:09 PM
 * @author Grzegorz Brodowski
 */
public interface Subject {
    public void register(Observator o);
    public void unregister(Observator o);
    public void notifies();

}