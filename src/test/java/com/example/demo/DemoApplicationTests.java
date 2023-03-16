package com.example.demo;

import com.example.demo.Service.CalculaJurosService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	private final CalculaJurosService calculaJurosService = new CalculaJurosService();

	@Test
	@DisplayName("Testando valor correto")
	public void testGettingCorrectValue() {
		var result = calculaJurosService.calculaJuros(100, 5, 0.01);
		assertEquals(105.1, result.getJurosCalculado());
	}

	@Test
	@DisplayName("Testando valor incorreto")
	public void testGettingIncorrectOrZeroValue() {
		var result = calculaJurosService.calculaJuros(100, 5, 0.01);
		assertNotEquals(10, result.getJurosCalculado());
	}

	@Test
	@DisplayName("Testando Exceções")
	public void testGettingExceptions() {
		assertThrows(Exception.class, () -> calculaJurosService.calculaJuros(100, -10, 0.01));
	}

	@Test
	@DisplayName("Verificando se a API de taxas não está funcionando")
	public void testGettingOffAPI() {
		assertThrows(Exception.class, () -> calculaJurosService.calculaJuros(100, 5, null));
	}

}
