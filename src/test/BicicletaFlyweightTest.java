import flyweight.BicicletaFactory;
import model.BicicletaFlyweight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BicicletaFlyweightTest {

    @Test
    public void deveImplementarFlyweight() {

        BicicletaFlyweight bicicleta =
                BicicletaFactory.obterBicicleta(
                        "Speed",
                        "Vermelha",
                        "EcoBike"
                );

        Assertions.assertNotNull(
                bicicleta
        );
    }

    @Test
    public void deveCompartilharObjetos() {

        BicicletaFlyweight bicicleta1 =
                BicicletaFactory.obterBicicleta(
                        "Speed",
                        "Vermelha",
                        "EcoBike"
                );

        BicicletaFlyweight bicicleta2 =
                BicicletaFactory.obterBicicleta(
                        "Speed",
                        "Vermelha",
                        "EcoBike"
                );

        Assertions.assertSame(
                bicicleta1,
                bicicleta2
        );
    }
}