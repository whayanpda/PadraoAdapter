public class LivroAdapter implements LivroService {
    private LivroServiceLegado livroServiceLegado;

    public LivroAdapter(LivroServiceLegado livroServiceLegado) {
        this.livroServiceLegado = livroServiceLegado;
    }

    @Override
    public String getLivrosJSON() {

        String xmlData = livroServiceLegado.getLivrosXML();


        String jsonData = convertXMLtoJSON(xmlData);

        return jsonData;
    }

    private String convertXMLtoJSON(String xmlData) {
        return "{\"livros\": [{\"titulo\": \"Java Programming\", \"autor\": \"John Doe\"}]}";
    }
}
