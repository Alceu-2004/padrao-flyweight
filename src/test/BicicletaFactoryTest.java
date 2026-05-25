import flyweight.BicicletaFactory;
import model.BicicletaFlyweight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BicicletaFactoryTest {

    @Test
    public void deveCompartilharFlyweight() {

        BicicletaFlyweight bicicleta1 =
                BicicletaFactory.obterBicicleta(
                        "Urbana",
                        "Azul",
                        "EcoBike"
                );

        BicicletaFlyweight bicicleta2 =
                BicicletaFactory.obterBicicleta(
                        "Urbana",
                        "Azul",
                        "EcoBike"
                );

        Assertions.assertSame(
                bicicleta1,
                bicicleta2
        );
    }

    @Test
    public void deveCriarNovoFlyweight() {

        BicicletaFactory.obterBicicleta(
                "Mountain",
                "Preta",
                "EcoBike"
        );

        Assertions.assertTrue(
                BicicletaFactory.quantidadeFlyweights()
                        > 0
        );
    }
}