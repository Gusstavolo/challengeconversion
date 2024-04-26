import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class GeradorArq {

        public void salvaJson(ConsultaCoin consultaCoin) throws IOException {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter escrita = new FileWriter(consultaCoin.base_code() + ".json");
            escrita.write(gson.toJson(consultaCoin));
            escrita.close();


    }
}
