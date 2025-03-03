package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest extends TestCase {

    IPokedex pokedex;
    IPokemonTrainerFactory pokemonTrainerFactory;

    PokemonTrainer pTrainer;
    IPokedexFactory factory;

    @Before
    public void init() {
        pokedex = Mockito.mock(IPokedex.class);
        pokemonTrainerFactory = Mockito.mock(IPokemonTrainerFactory.class);
        factory = Mockito.mock(IPokedexFactory.class);
        pTrainer = new PokemonTrainer("monTeam", Team.INSTINCT, pokedex);

    }

    @Test
    public void testCreateTrainer() {
        /**
        Mockito.doReturn(pTrainer).when(pokemonTrainerFactory).createTrainer("monTeam", Team.INSTINCT, factory);
        assertEquals(pTrainer.getClass(),
                pokemonTrainerFactory.createTrainer("monTeam", Team.INSTINCT, factory).getClass());
        assertEquals(pTrainer, pokemonTrainerFactory.createTrainer("monTeam", Team.INSTINCT, factory));
        assertEquals("monTeam",
                pokemonTrainerFactory.createTrainer("monTeam", Team.INSTINCT, factory).getName());
        assertEquals(Team.INSTINCT,
                pokemonTrainerFactory.createTrainer("monTeam", Team.INSTINCT, factory).getTeam());
        assertEquals(pokedex,
                pokemonTrainerFactory.createTrainer("monTeam", Team.INSTINCT, factory).getPokedex());
        assertEquals(pokedex.size(),
                pokemonTrainerFactory.createTrainer("monTeam", Team.INSTINCT, factory).getPokedex().size());
         **/
    }
}