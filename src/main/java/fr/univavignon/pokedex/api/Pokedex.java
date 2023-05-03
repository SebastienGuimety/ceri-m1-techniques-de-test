package fr.univavignon.pokedex.api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex{

    /*
     * List of pokemons.
     */
    private final List<Pokemon> pokemons= new ArrayList<>();;
    /*
     * Factory used to create pokemons.
     */
    private final IPokemonFactory pokemonFactory;
    /*
     * Provider used to get pokemon metadata.
     */
    private final IPokemonMetadataProvider pokemonMetadataProvider;

    public Pokedex(IPokemonFactory pokemonFactory, IPokemonMetadataProvider pokemonMetadataProvider) {
        this.pokemonFactory = pokemonFactory;
        this.pokemonMetadataProvider = pokemonMetadataProvider;
    }




    @Override
    public int size() {
        return pokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
        return pokemons.size();

    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        return pokemons.get(id);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(pokemons);
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        List<Pokemon> pokemonstrie = new ArrayList<>(this.pokemons);
        pokemonstrie.sort(order);
        return Collections.unmodifiableList(pokemonstrie);
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return pokemonMetadataProvider.getPokemonMetadata(index);
    }
}
