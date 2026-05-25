package service;

import flyweight.BicicletaFactory;
import model.Bicicleta;

import java.util.ArrayList;
import java.util.List;

public class BicicletaService {

    private List<Bicicleta> bicicletas;

    public BicicletaService() {

        bicicletas = new ArrayList<>();
    }

    public void cadastrarBicicleta(
            String identificador,
            String modelo,
            String cor,
            String fabricante
    ) {

        Bicicleta bicicleta =
                new Bicicleta(
                        identificador,
                        BicicletaFactory.obterBicicleta(
                                modelo,
                                cor,
                                fabricante
                        )
                );

        bicicletas.add(bicicleta);
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void exibirBicicletas() {

        for (Bicicleta bicicleta : bicicletas) {

            bicicleta.exibir();
        }
    }
}