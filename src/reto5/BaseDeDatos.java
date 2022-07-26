
package reto5;

/**
 *
 * @author Johan.henao1
 */
public class BaseDeDatos {
    
    
    
    public String getOrigen(String j){
        return "origen";
    }
    public int getAnios(String j){
        return 45;
    }
    public String getColor(String j){
        String color = "";
        switch (j){
            case "Charmander":
                color = "Naranja";
                break;
            case "Charmeleon":
                color = "Rojo";
                break;
        } 
        return color;
    }
    public String getTipo(String j){
        return "tipo";
        
    }
    public String getDescripcion(String j){
        return null;  
    }
}    