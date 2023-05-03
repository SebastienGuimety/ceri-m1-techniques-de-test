package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class IPokedexTest extends TestCase {

    Pokemon pok1;
    Pokemon pok2;
    ArrayList<Pokemon> pokemons;

    @Mock
    IPokemonMetadataProvider metadataProvider;
    @Mock
    IPokemonFactory pokemonFactory;
    @InjectMocks
    IPokedex pokedex;

    @BeforeEach
    public void setUp() {

        pokedex = Mockito.mock(IPokedex.class);
        // Initialisation des Pokymons
        pok1 = new Pokemon(1, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56.0);
        pok2 = new Pokemon(2, "Aquali", 186, 186, 260, 2729, 202, 5000, 4, 100.0);
        pokemons = new ArrayList<>();
        // Ajout des pokymons à la liste
        pokemons.add(pok1);
        pokemons.add(pok2);

    }

    @Test
    public void testSize() {
        /**
        Pokemon pokemon = new Pokemon(3, "Pikachu", 50, 50, 50, 100, 100, 1000, 10, 0.8);
        when(pokemonFactory.createPokemon(3, 100, 100, 1000, 10)).thenReturn(pokemon);


        int size = pokedex.size() + 1;

        assertEquals(1, size);
         **/

    }

    @Test
    public void testAddPokemon() {
        /**

        Pokemon pokemon = new Pokemon(1, "Pikachu", 50, 50, 50, 100, 100, 1000, 10, 0.8);

        when(pokedex.addPokemon(pokemon)).thenReturn(pokemons.size() + 1);

        //Mockito.doReturn(pokemons.size() + 1).when(pokedex).addPokemon(pokemon);
        // Verfication de l'ajout d'un pokymone, alors la taille de la liste est 3
        assertEquals(3, pokedex.addPokemon(new Pokemon(2, "Pikasu", 200, 200, 4000, 200, 10000, 0, 0, 100.0)));
         **/
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        /**

        Mockito.doReturn(pok1).when(pokedex).getPokemon(1);
        Mockito.doReturn(pok1).when(pokedex).getPokemon(2);

        assertEquals(pok1, pokedex.getPokemon(0));
        assertEquals(pok2, pokedex.getPokemon(133));

        Mockito.doThrow(new PokedexException("Le Pokymone avec cet index n'existe pas")).when(pokedex)
                .getPokemon(Mockito.intThat(i -> i < 0 || i > 150));

        assertThrows(PokedexException.class, () -> pokedex.getPokemon(300));
        assertThrows(PokedexException.class, () -> pokedex.getPokemon(-2));
         **/
    }

    @Test
    public void testGetPokemons() {
        /**

        List<Pokemon> unmodifiableList = Collections.unmodifiableList(pokemons);

        Mockito.doReturn(unmodifiableList).when(pokedex).getPokemons();
        assertEquals(pokemons.size(), pokedex.getPokemons().size());
        assertEquals(pok1, pokedex.getPokemons().get(1));
        assertEquals(pokemons.get(0), pokedex.getPokemons().get(0));
        assertEquals(unmodifiableList.getClass(), pokedex.getPokemons().getClass());
         **/
    }

    @Test
    public void testTestGetPokemons() {
    }

    @Test
    public void testAdd() {

    }
}