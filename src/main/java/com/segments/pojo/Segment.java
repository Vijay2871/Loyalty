
package com.segments.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Segment {

    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("segment")
    private String segment;
    @JsonProperty("selectedStores")
    private List<String> selectedStores = null;

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("segment")
    public String getSegment() {
        return segment;
    }

    @JsonProperty("segment")
    public void setSegment(String segment) {
        this.segment = segment;
    }

    @JsonProperty("selectedStores")
    public List<String> getSelectedStores() {
        return selectedStores;
    }

    @JsonProperty("selectedStores")
    public void setSelectedStores(List<String> selectedStores) {
        this.selectedStores = selectedStores;
    }

}
