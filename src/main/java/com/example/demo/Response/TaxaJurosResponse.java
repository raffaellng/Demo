package com.example.demo.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TaxaJurosResponse {
    @JsonProperty("TaxaJuros")
    private double TaxaJuros;
}
