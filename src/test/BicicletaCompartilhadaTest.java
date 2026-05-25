import model.BicicletaCompartilhada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BicicletaCompartilhadaTest {

    @Test
    public void deveCriarBicicletaCompartilhada() {

        BicicletaCompartilhada bicicleta =
                new BicicletaCompartilhada(
                        "Urbana",
                        "Azul",
                        "EcoBike"
                );

        Assertions.assertEquals(
                "Urbana",
                bicicleta.getModelo()
        );
    }

    @Test
    public void deveRetornarFabricanteCorreto() {

        BicicletaCompartilhada bicicleta =
                new BicicletaCompartilhada(
                        "Mountain",
                        "Preta",
                        "EcoBike"
                );

        Assertions.assertEquals(
                "EcoBike",
                bicicleta.getFabricante()
        );
    }
}