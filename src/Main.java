import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        moneyRest moneyR = new moneyRest();
        Gson gson = new Gson();


        System.out.println("""
                    ╔══╗╔══╗╔╗ ╔╗╔╗╔╗╔═══╗╔═══╗╔════╗   ╔══╗╔══╗╔══╗╔╗ ╔╗
                    ║╔═╝║╔╗║║╚═╝║║║║║║╔══╝║╔═╗║╚═╗╔═╝   ║╔═╝║╔╗║╚╗╔╝║╚═╝║
                    ║║  ║║║║║╔╗ ║║║║║║╚══╗║╚═╝║  ║║     ║║  ║║║║ ║║ ║╔╗ ║
                    ║║  ║║║║║║╚╗║║╚╝║║╔══╝║╔╗╔╝  ║║     ║║  ║║║║ ║║ ║║╚╗║
                    ║╚═╗║╚╝║║║ ║║╚╗╔╝║╚══╗║║║║   ║║     ║╚═╗║╚╝║╔╝╚╗║║ ║║
                    ╚══╝╚══╝╚╝ ╚╝ ╚╝ ╚═══╝╚╝╚╝   ╚╝     ╚══╝╚══╝╚══╝╚╝ ╚╝
                """);
        String menu = """
               ┌――――――――― ₿   ┌――――――――― ₿   ┌――――――――― ₿  
               │ 1 ➟ USD ➔ BRL │   │ 2 ➟ BRL ➔ USD │   │ 3 ➟ BRL ➔ EUR │  
                ――――――――― ┘    ――――――――― ┘    ――――――――― ┘
               ┌――――――――― ₿   ┌――――――――― ₿   ┌――――――――― ₿  
               │ 4 ➟ EUR ➔ BRL │   │ 5 ➟ EUR ➔ USD │   │ 6 ➟ USD ➔ EUR │  
                ――――――――― ┘    ――――――――― ┘    ――――――――― ┘
                                        7 ➟ EXIT
                """;
        System.out.println(menu);
        System.out.println(moneyR.restconsulta("USD", "BRL", 1));
    }
}