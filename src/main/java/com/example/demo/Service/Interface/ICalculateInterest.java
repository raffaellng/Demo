package com.example.demo.Service.Interface;

import com.example.demo.Dto.CalculateInterestDto;

public interface ICalculateInterest {
    CalculateInterestDto calculateInterest(double initialValue, double month, Double interestRate);
}
