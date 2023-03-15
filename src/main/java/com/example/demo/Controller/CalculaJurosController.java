package com.example.demo.Controller;

import com.example.demo.Service.Interface.ICalculaJuros;
import com.example.demo.Dto.CalculaJurosDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/calculate-interest")
public class CalculaJurosController {

    private final ICalculaJuros _calculaJuros;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<CalculaJurosDto> getCalculateInterest(@RequestParam(name = "Valor Inicial") double valorInicial, @RequestParam(name = "Mes") int mes){
        double taxaJurosWebService = 0.01;
        CalculaJurosDto result = _calculaJuros.CalculaJuros(valorInicial,mes,taxaJurosWebService);
        return ResponseEntity.ok(result);
    }
}
