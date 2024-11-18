public class Produto {

    private String name;
    private int preco;
    private int quantia;


    public Produto(String name,int preco, int quantia) {
        this.name = name;
        this.preco = preco;
        this.quantia = quantia;


    }

    public String getName()
    {
        return name;
    }
    public int getPreco()
    {
        return preco;
    }
    public int getQuantia()
    {
        return quantia;
    }


}
