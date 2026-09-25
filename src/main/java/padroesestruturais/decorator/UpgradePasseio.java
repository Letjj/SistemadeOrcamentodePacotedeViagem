package padroesestruturais.decorator;

public class UpgradePasseio extends PacoteDecorator {
    public UpgradePasseio(PacoteViagem pacote) {
        super(pacote);
    }

    @Override
    protected float getPercentualAumento() {
        return 15.0f;
    }

    @Override
    protected String getNomeUpgrade() {
        return "Passeios Guiados";
    }
}
