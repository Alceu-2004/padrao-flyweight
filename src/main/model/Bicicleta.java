package model;

public class Bicicleta {

    private String identificador;

    private BicicletaFlyweight flyweight;

    public Bicicleta(
            String identificador,
            BicicletaFlyweight flyweight
    ) {

        this.identificador = identificador;
        this.flyweight = flyweight;
    }

    public void exibir() {

        flyweight.exibir(
                identificador
        );
    }

    public String getIdentificador() {
        return identificador;
    }

    public BicicletaFlyweight getFlyweight() {
        return flyweight;
    }
}