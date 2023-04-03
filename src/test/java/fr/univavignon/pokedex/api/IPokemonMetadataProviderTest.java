package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class IPokemonMetadataProviderTest extends TestCase {

    IPokemonMetadataProvider pokemonMetadataProvider;

    PokemonMetadata pok1;
    PokemonMetadata pok2;

    @Before
    public void init() {
        pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
        pok1 = new PokemonMetadata(1, "Bulbizarre", 126, 126, 90);
        pok2 = new PokemonMetadata(2, "Aquali", 186, 186, 260);
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {

        Mockito.doReturn(pok2).when(pokemonMetadataProvider).getPokemonMetadata(2);
        Mockito.doReturn(pok1).when(pokemonMetadataProvider).getPokemonMetadata(1);
        assertEquals(pok1, pokemonMetadataProvider.getPokemonMetadata(1));
        assertEquals(pok2, pokemonMetadataProvider.getPokemonMetadata(2));

        Mockito.doThrow(new PokedexException("L'index fourni n'existe pas ")).when(pokemonMetadataProvider)
                .getPokemonMetadata(Mockito.intThat(i -> i < 0 || i > 150));
        assertThrows(PokedexException.class, () -> pokemonMetadataProvider.getPokemonMetadata(-189));
        assertThrows(PokedexException.class, () -> pokemonMetadataProvider.getPokemonMetadata(313));
    }
}