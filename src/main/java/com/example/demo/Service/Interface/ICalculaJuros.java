package com.example.demo.Service.Interface;

import com.example.demo.Dto.CalculaJurosDto;

public interface ICalculaJuros {
    CalculaJurosDto calculaJuros(double ValorInicial, double mes, Double taxas);
}
