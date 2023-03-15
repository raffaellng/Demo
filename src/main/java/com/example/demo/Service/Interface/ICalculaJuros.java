package com.example.demo.Service.Interface;

import com.example.demo.Dto.CalculaJurosDto;

public interface ICalculaJuros {
    CalculaJurosDto CalculaJuros(double ValorInicial, double mes, Double taxas);
}
