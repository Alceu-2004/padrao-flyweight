import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.BicicletaService;

public class BicicletaServiceTest {

    private BicicletaService service;

    @BeforeEach
    public void configurar() {

        service = new BicicletaService();
    }

    @Test
    public void deveCadastrarBicicleta() {

        service.cadastrarBicicleta(
                "001",
                "Urbana",
                "Azul",
                "EcoBike"
        );

        Assertions.assertEquals(
                1,
                service.getBicicletas().size()
        );
    }

    @Test
    public void deveCadastrarVariasBicicletas() {

        service.cadastrarBicicleta(
                "001",
                "Urbana",
                "Azul",
                "EcoBike"
        );

        service.cadastrarBicicleta(
                "002",
                "Mountain",
                "Preta",
                "EcoBike"
        );

        Assertions.assertEquals(
                2,
                service.getBicicletas().size()
        );
    }

    @Test
    public void deveInicializarListaVazia() {

        Assertions.assertTrue(
                service.getBicicletas().isEmpty()
        );
    }
}