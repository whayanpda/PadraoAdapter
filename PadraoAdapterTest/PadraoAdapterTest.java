import org.junit.Test;

public class PadraoAdapterTest {

    @Test
    public void testConversaoXMLParaJSON() {

        LivroServiceLegado livroServiceLegado = new LivroServiceImpl();

        LivroService livroService = new LivroAdapter(livroServiceLegado);

        String livrosJSON = livroService.getLivrosJSON();

        System.out.println("Livros em JSON:");
        System.out.println(livrosJSON);
    }
}
