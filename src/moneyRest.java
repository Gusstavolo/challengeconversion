import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class moneyRest {

    public ConsultaCoin restconsulta(String base_code, String target_code) {
        String url_str = "https://v6.exchangerate-api.com/v6/4e5dce38c49912bd11e41e18/latest/USD";
        URI api = URI.create(url_str);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(api)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConsultaCoin.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }

    }


}

