package reto5;

/**
 *
 * @author Escuiquirin
 */
public class Reto5 {
    public static void main(String[] args) {
        /*creando pokebolas
        Pokebola pokeBolita1= new Pokebola("pequeña");
        Pokebola pokeBolita2= new Pokebola("mediana");
        Pokebola pokeBolita3= new Pokebola("grande");
        //creando pokemones
        Pokemon fuego = new Charmander("Juanito", (byte) 9, 230); 
        Pokemon rayo = new Pikachu("Ibai", (byte) 10, 250); 
        Pokemon agua = new Squirtle("Auron", (byte) 7, 310); 
        //encerrando pokemones
        pokeBolita1.setMiPokemon(fuego);
        pokeBolita2.setMiPokemon(rayo);
        pokeBolita3.setMiPokemon(agua);
        //evoluciones
        fuego = fuego.evolucionar();
        fuego = fuego.evolucionar();
        agua = agua.evolucionar();
        // gritos
        System.out.println(fuego.gritar());
        System.out.println(rayo.gritar());
        System.out.println(agua.gritar());
        */
        
        Pokemon charmander = new Charmander("ramon", (byte) 9, 400);
        PokeDex r = new PokeDexGoogle();
        System.out.println(r.getColor(charmander));
        
        
    }
}
