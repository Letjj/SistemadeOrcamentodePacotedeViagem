package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacoteViagemTest {

    @Test
    void deveRetornarCustoPacoteComPasseioESeguro() {
        // Base: 1000.0
        // + Seguro (10%): 1100.0
        // + Passeio (15%): 1100.0 * 1.15 = 1265.0
        PacoteViagem pacote = new UpgradePasseio(new UpgradeSeguro(new PacoteBasico(1000.0f)));
        assertEquals(1265.0f, pacote.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPacoteComPasseioESeguro() {
        PacoteViagem pacote = new UpgradePasseio(new UpgradeSeguro(new PacoteBasico()));
        assertEquals("Pacote Basico + Seguro Premium + Passeios Guiados", pacote.getDescricao());
    }

    @Test
    void deveRetornarCustoPacoteCompleto() {
        // Base: 1000.0
        // + Seguro (10%): 1100.0
        // + Passeio (15%): 1265.0
        // + Executivo (30%): 1265.0 * 1.30 = 1644.5
        PacoteViagem pacote = new UpgradeExecutivo(new UpgradePasseio(new UpgradeSeguro(new PacoteBasico(1000.0f))));
        assertEquals(1644.5f, pacote.getCusto(), 0.01f);
    }
}