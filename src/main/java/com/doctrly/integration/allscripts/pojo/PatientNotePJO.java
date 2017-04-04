package com.doctrly.integration.allscripts.pojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "savepatientnoteinfo"
})
public class PatientNotePJO {

    @JsonProperty("savepatientnoteinfo")
    private List<Savepatientnoteinfo> savepatientnoteinfo = null;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
