package padroesestruturais.decorator;

public class UpgradeSeguro extends PacoteDecorator {
    public UpgradeSeguro(PacoteViagem pacote) {
        super(pacote);
    }

    @Override
    protected float getPercentualAumento() {
        return 10.0f;
    }

    @Override
    protected String getNomeUpgrade() {
        return "Seguro Premium";
    }
}