package padroesestruturais.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Simulador de Orçamento de Viagem ---\n");

        PacoteViagem pacoteSimples = new PacoteBasico(1000.0f);
        System.out.println("Descrição: " + pacoteSimples.getDescricao());
        System.out.println("Custo: R$ " + pacoteSimples.getCusto());
        System.out.println("----------------------------------------");

        PacoteViagem pacoteCompleto = new UpgradeExecutivo(
                new UpgradePasseio(
                        new UpgradeSeguro(
                                new PacoteBasico(1000.0f)
                        )
                )
        );

        System.out.println("Descrição: " + pacoteCompleto.getDescricao());
        System.out.println("Custo: R$ " + pacoteCompleto.getCusto());
    }
}
