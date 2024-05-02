import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        moneyRest moneyR = new moneyRest();
        Gson gson = new Gson();
        Scanner opcao = new Scanner(System.in);
        Scanner totalcoin = new Scanner(System.in);
        double amount = 0;
        int escolher = 0;

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
        String coinE = "Digite o valor a ser convertido ► ";
        while(escolher != 7 ) {
            System.out.println(menu);
            System.out.println("Escolha ► ");
            escolher = opcao.nextInt();
            switch (escolher){



                    case 1:
                        System.out.println(coinE);
                        amount = totalcoin.nextDouble();

                        System.out.println(moneyR.restconsulta("USD", "BRL", amount));
                        break;
                    case 2:
                        System.out.println(coinE);
                        amount = totalcoin.nextDouble();

                        System.out.println(moneyR.restconsulta("BRL", "USD", amount));
                        break;
                    case 3:
                        System.out.println(coinE);
                        amount = totalcoin.nextDouble();

                        System.out.println(moneyR.restconsulta("BRL", "EUR", amount));
                        break;
                    case 4:
                        System.out.println(coinE);
                        amount = totalcoin.nextDouble();

                        System.out.println(moneyR.restconsulta("EUR", "BRL", amount));
                        break;
                    case 5:
                        System.out.println(coinE);
                        amount = totalcoin.nextDouble();

                        System.out.println(moneyR.restconsulta("EUR", "USD", amount));
                        break;
                    case 6:
                        System.out.println(coinE);
                        amount = totalcoin.nextDouble();

                        System.out.println(moneyR.restconsulta("USD", "EUR", amount));
                        break;
                    case 7:
                        break;


            }
        }

        System.out.println();
    }
}