package com.mycompany.reto5;

/**
 *
 * @author Escuiquirin
 */
public abstract class Pokemon {
    protected String nombre;
    protected byte nivel;
    protected int salud;
    
    abstract Pokemon evolucionar();
    abstract String gritar();

}
