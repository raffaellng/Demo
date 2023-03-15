package com.example.demo.Controller;

import com.example.demo.Service.Interface.ICalculateInterest;
import com.example.demo.Dto.CalculateInterestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/calculate-interest")
public class CalculateInterestController {

    private final ICalculateInterest calculateInterestServices;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CalculateInterestDto> getCalculateInterest(@RequestParam(name = "Valor Inicial") double initialValue, @RequestParam(name = "Mes") int month){
        double interestRateService = 0.01;
        CalculateInterestDto result = calculateInterestServices.calculateInterest(initialValue,month,interestRateService);
        return ResponseEntity.ok(result);
    }
}
