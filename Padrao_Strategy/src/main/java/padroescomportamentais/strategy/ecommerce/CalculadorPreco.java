package padroescomportamentais.strategy.ecommerce;

public class CalculadorPreco {

    private float valor1;
    private float valor2;

    public CalculadorPreco(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(EstrategiaPreco estrategia) {
        return estrategia.calcular(valor1, valor2);
    }
}