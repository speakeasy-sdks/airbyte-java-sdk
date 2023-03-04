package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePokeapi {
    @JsonProperty("airbyte-source-name")
    public SourcePokeapiPokeapiEnum airbyteSourceName;
    public SourcePokeapi withAirbyteSourceName(SourcePokeapiPokeapiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("pokemon_name")
    public String pokemonName;
    public SourcePokeapi withPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
        return this;
    }
    
}
