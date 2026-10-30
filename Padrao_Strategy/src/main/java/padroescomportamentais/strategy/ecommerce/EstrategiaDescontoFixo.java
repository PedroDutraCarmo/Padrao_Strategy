package padroescomportamentais.strategy.ecommerce;

public class EstrategiaDescontoFixo implements EstrategiaPreco {
    public float calcular(float valor1, float valor2) {
        return valor1 - valor2;
    }
}