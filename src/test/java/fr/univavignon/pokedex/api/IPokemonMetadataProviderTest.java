package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class IPokemonMetadataProviderTest extends TestCase {

    public void testGetPokemonMetadata() throws PokedexException {

        // Créer un mock de IPokemonMetadataProvider
        IPokemonMetadataProvider provider = Mockito.mock(IPokemonMetadataProvider.class);

        // Créer une instance de la classe PokemonMetadata avec des valeurs appropriées
        PokemonMetadata metadata = new PokemonMetadata(25, "Pikachu", 112, 96, 111);

        // Définir le comportement du mock pour qu'il retourne l'instance de PokemonMetadata créée ci-dessus
        when(provider.getPokemonMetadata(25)).thenReturn(metadata);

        // Appeler la méthode getPokemonMetadata du mock de IPokemonMetadataProvider
        PokemonMetadata result = provider.getPokemonMetadata(25);

        // Vérifier que la méthode a bien été appelée avec la valeur de l'index correspondant
        verify(provider).getPokemonMetadata(25);

        // Vérifier que l'instance de PokemonMetadata retournée a les valeurs appropriées
        assertEquals(25, result.getIndex());
        assertEquals("Pikachu", result.getName());
        assertEquals(112, result.getAttack());
        assertEquals(96, result.getDefense());
        assertEquals(111, result.getStamina());
    }
}