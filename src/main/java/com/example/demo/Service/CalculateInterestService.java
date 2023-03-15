package com.example.demo.Service;

import com.example.demo.Dto.CalculateInterestDto;
import com.example.demo.Service.Interface.ICalculateInterest;
import org.springframework.stereotype.Service;

@Service
public class CalculateInterestService implements ICalculateInterest {
    @Override
    public CalculateInterestDto calculateInterest(double initialValue, double month, Double interestRate) {
        CalculateInterestDto calculateInterestDto = new CalculateInterestDto();

        if (interestRate == null)
            throw new RuntimeException("O sistema da taxa de Juros está fora. tente mais tarde");

        if (interestRate <= 0)
            throw new RuntimeException("Taxa de Juros inválida");

        if (initialValue <= 0)
            throw new RuntimeException("Valor inicial inválido");

        if (month < 0)
            throw new RuntimeException("Quantidade de meses inválida");

        double CalculatePow = Math.pow(1 + interestRate, month);
        calculateInterestDto.setCalculatedInterest(Math.floor(initialValue * CalculatePow * 100) / 100);

        return calculateInterestDto;
    }
}
