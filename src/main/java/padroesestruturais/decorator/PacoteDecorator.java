package padroesestruturais.decorator;

public abstract class PacoteDecorator implements PacoteViagem {
    protected PacoteViagem pacote;

    public PacoteDecorator(PacoteViagem pacote) {
        this.pacote = pacote;
    }

    @Override
    public float getCusto() {
        return this.pacote.getCusto() * (1 + (this.getPercentualAumento() / 100));
    }

    @Override
    public String getDescricao() {
        return this.pacote.getDescricao() + " + " + this.getNomeUpgrade();
    }

    protected abstract float getPercentualAumento();
    protected abstract String getNomeUpgrade();
}
