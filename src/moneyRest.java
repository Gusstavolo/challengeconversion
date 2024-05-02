import com.google.gson.Gson;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.lang.String.format;

public class moneyRest {

    public ConsultaCoin restconsulta(String base_code, String target_code, double amount) {

        String keyApi = "4e5dce38c49912bd11e41e18";
        String url_amount = "https://v6.exchangerate-api.com/v6/0d07ad4f276c49eea42b2591/pair/" + base_code + "/" + target_code + "/" + amount;

        URI api = URI.create(url_amount);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(api)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConsultaCoin.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse url.");
        }

    }


}

