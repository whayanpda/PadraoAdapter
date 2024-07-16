public class LivroServiceImpl implements LivroServiceLegado {
    @Override
    public String getLivrosXML() {

        return "<livros><livro><titulo>Java Programming</titulo><autor>John Doe</autor></livro></livros>";
    }
}
