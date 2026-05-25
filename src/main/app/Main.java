package app;

import flyweight.BicicletaFactory;
import model.Bicicleta;

public class Main {

    public static void main(String[] args) {

        Bicicleta bicicleta1 =
                new Bicicleta(
                        "001",
                        BicicletaFactory.obterBicicleta(
                                "Urbana",
                                "Azul",
                                "EcoBike"
                        )
                );

        Bicicleta bicicleta2 =
                new Bicicleta(
                        "002",
                        BicicletaFactory.obterBicicleta(
                                "Urbana",
                                "Azul",
                                "EcoBike"
                        )
                );

        Bicicleta bicicleta3 =
                new Bicicleta(
                        "003",
                        BicicletaFactory.obterBicicleta(
                                "Mountain",
                                "Preta",
                                "EcoBike"
                        )
                );

        bicicleta1.exibir();

        bicicleta2.exibir();

        bicicleta3.exibir();

        System.out.println(
                "Flyweights criados: " +
                        BicicletaFactory.quantidadeFlyweights()
        );
    }
}