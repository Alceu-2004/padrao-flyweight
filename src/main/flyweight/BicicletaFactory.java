package flyweight;

import model.BicicletaCompartilhada;
import model.BicicletaFlyweight;

import java.util.HashMap;
import java.util.Map;

public class BicicletaFactory {

    private static final Map<String,
            BicicletaFlyweight> bicicletas =
            new HashMap<>();

    public static BicicletaFlyweight obterBicicleta(
            String modelo,
            String cor,
            String fabricante
    ) {

        String chave =
                modelo + cor + fabricante;

        if (!bicicletas.containsKey(chave)) {

            bicicletas.put(
                    chave,
                    new BicicletaCompartilhada(
                            modelo,
                            cor,
                            fabricante
                    )
            );
        }

        return bicicletas.get(chave);
    }

    public static int quantidadeFlyweights() {

        return bicicletas.size();
    }
}