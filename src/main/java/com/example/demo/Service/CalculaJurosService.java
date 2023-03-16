package com.example.demo.Service;

import com.example.demo.Dto.CalculaJurosDto;
import com.example.demo.Service.Interface.ICalculaJuros;
import org.springframework.stereotype.Service;

@Service
public class CalculaJurosService implements ICalculaJuros {
    @Override
    public CalculaJurosDto calculaJuros(double valorInicial, double mes, Double taxa) {
        CalculaJurosDto calculaJurosDto = new CalculaJurosDto();

        if (taxa == null)
            throw new RuntimeException("O sistema da taxa de Juros está fora. tente mais tarde");

        if (taxa <= 0)
            throw new RuntimeException("Taxa de Juros inválida");

        if (valorInicial <= 0)
            throw new RuntimeException("Valor inicial inválido");

        if (mes < 0)
            throw new RuntimeException("Quantidade de meses inválida");

        double calcularPotencia = Math.pow(1 + taxa, mes);
        calculaJurosDto.setJurosCalculado(Math.floor(valorInicial * calcularPotencia * 100) / 100);

        return calculaJurosDto;
    }
}
