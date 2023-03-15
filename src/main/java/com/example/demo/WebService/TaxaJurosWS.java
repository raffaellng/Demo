package com.example.demo.WebService;

import com.example.demo.Response.TaxaJurosResponse;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TaxaJurosWS {
    public static double TaxaJurosWebService(){
        try {

            String url = "http://localhost:8082/taxa-juros";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String responseBody = response.body();

                TaxaJurosResponse values = new Gson().fromJson(responseBody, TaxaJurosResponse.class);

                System.out.println("Taxa juros é: " + values.getTaxaJuros());

                return values.getTaxaJuros();

            } else {
                System.out.println("Not successful");
            }
        } catch (Exception e) {
            System.out.println("Erro na consulta de cep: " + e);
        }
        return 0;
    }
}
