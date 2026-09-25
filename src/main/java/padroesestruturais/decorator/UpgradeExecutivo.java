package padroesestruturais.decorator;

public class UpgradeExecutivo extends PacoteDecorator {
    public UpgradeExecutivo(PacoteViagem pacote) {
        super(pacote);
    }

    @Override
    protected float getPercentualAumento() {
        return 30.0f;
    }

    @Override
    protected String getNomeUpgrade() {
        return "Voo Executivo";
    }
}
