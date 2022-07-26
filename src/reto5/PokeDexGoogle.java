
package reto5;

/**
 *
 * @author Johan.henao1
 */
public class PokeDexGoogle implements PokeDex {
    
    @Override
    public int getSalud(Pokemon j) {
        return j.salud;
    }
    @Override
    public byte getNivel(Pokemon j) {
        return j.nivel;
    }
    
    
    @Override
    public String consultar(Pokemon j) {
        return null;
        
    }
    @Override
    public String getDescripcion(Pokemon j) {
        return null;
        
    }
    @Override
    public String getOrigen(Pokemon j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getAnios(Pokemon j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColor(Pokemon j) {
        String pokeColor = j.getClass().getSimpleName();
        System.out.println(pokeColor);
        BaseDeDatos d = new BaseDeDatos();
        return d.getColor(pokeColor);
    }
    @Override
    public String getTipo(Pokemon j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
