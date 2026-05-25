package model;

public class BicicletaCompartilhada
        implements BicicletaFlyweight {

    private String modelo;

    private String cor;

    private String fabricante;

    public BicicletaCompartilhada(
            String modelo,
            String cor,
            String fabricante
    ) {

        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    @Override
    public void exibir(
            String identificador
    ) {

        System.out.println(
                "Bicicleta " +
                        identificador +
                        " | Modelo: " +
                        modelo +
                        " | Cor: " +
                        cor +
                        " | Fabricante: " +
                        fabricante
        );
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getFabricante() {
        return fabricante;
    }
}