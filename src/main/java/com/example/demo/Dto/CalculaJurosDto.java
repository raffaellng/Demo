package com.example.demo.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculaJurosDto {
    @JsonProperty("Juros calculado")
    private double jurosCalculado;
}
