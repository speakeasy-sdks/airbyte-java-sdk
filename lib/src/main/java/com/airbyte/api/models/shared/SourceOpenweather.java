package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceOpenweather {
    @JsonProperty("airbyte-source-name")
    public SourceOpenweatherOpenweatherEnum airbyteSourceName;
    public SourceOpenweather withAirbyteSourceName(SourceOpenweatherOpenweatherEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("appid")
    public String appid;
    public SourceOpenweather withAppid(String appid) {
        this.appid = appid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lang")
    public SourceOpenweatherLanguageEnum lang;
    public SourceOpenweather withLang(SourceOpenweatherLanguageEnum lang) {
        this.lang = lang;
        return this;
    }
    
    @JsonProperty("lat")
    public String lat;
    public SourceOpenweather withLat(String lat) {
        this.lat = lat;
        return this;
    }
    
    @JsonProperty("lon")
    public String lon;
    public SourceOpenweather withLon(String lon) {
        this.lon = lon;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("units")
    public SourceOpenweatherUnitsEnum units;
    public SourceOpenweather withUnits(SourceOpenweatherUnitsEnum units) {
        this.units = units;
        return this;
    }
    
}
