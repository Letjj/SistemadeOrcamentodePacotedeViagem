package padroesestruturais.decorator;

public class PacoteBasico implements PacoteViagem {
    private float custoBase;

    public PacoteBasico() {
        this.custoBase = 1000.0f;
    }

    public PacoteBasico(float custoBase) {
        this.custoBase = custoBase;
    }

    @Override
    public float getCusto() {
        return this.custoBase;
    }

    @Override
    public String getDescricao() {
        return "Pacote Basico";
    }
}
