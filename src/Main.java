import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        moneyRest moneyR = new moneyRest();
        Gson gson = new Gson();
        System.out.println(moneyR.restconsulta("USD", "BRL", 1));

    }
}