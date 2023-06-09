package com.example.demo.Controller;

import com.example.demo.Service.Interface.ICalculaJuros;
import com.example.demo.Dto.CalculaJurosDto;
import com.example.demo.WebService.TaxaJurosWS;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/calcula-juros")
public class CalculaJurosController {

    private final ICalculaJuros _calculaJuros;
    private TaxaJurosWS _taxaJurosWS;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<CalculaJurosDto> getCalculaJuros(@RequestParam(name = "Valor Inicial") double valorInicial, @RequestParam(name = "Mes") int mes){
        double taxaJurosWebService = _taxaJurosWS.TaxaJurosWebService();
        CalculaJurosDto result = _calculaJuros.calculaJuros(valorInicial,mes,taxaJurosWebService);
        return ResponseEntity.ok(result);
    }
}
