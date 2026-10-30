package padroescomportamentais.strategy.ecommerce;

public class EstrategiaAcrescimo implements EstrategiaPreco {
    public float calcular(float valor1, float valor2) {
        return valor1 + valor2;
    }
}