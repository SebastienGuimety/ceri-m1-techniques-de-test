package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class IPokemonFactoryTest extends TestCase {

    IPokemonFactory pokemonFactory;
    Pokemon pok1;
    Pokemon pok2;

    @Before
    public void init() {
        pokemonFactory = Mockito.mock(IPokemonFactory.class);
        pok1 = new Pokemon(1, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56.0);
        pok2 = new Pokemon(2, "Aquali", 186, 186, 260, 2729, 202, 5000, 4, 100.0);
    }

    @Test
    public void testCreatePokemon() {
        /**
        Mockito.when(pokemonFactory.createPokemon(0, 613, 64, 4000, 4)).thenReturn(pok1);
        Mockito.when(pokemonFactory.createPokemon(133, 2729, 202, 5000, 4)).thenReturn(pok2);
        assertEquals(pok1, pokemonFactory.createPokemon(0, 613, 64, 4000, 4));
        assertEquals(pok2, pokemonFactory.createPokemon(133, 2729, 202, 5000, 4));
         **/
    }
}