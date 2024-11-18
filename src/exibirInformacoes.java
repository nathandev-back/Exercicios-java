public class exibirInformacoes {


    public static void Informacoes(Produto produto) {


        System.out.print("""
                ========================
                Informações do produto
                
                Produto = %s
                Preço = %d
                Quantidade = %d
                
                ========================
                
                
                """.formatted(produto.getName(),produto.getPreco(), produto.getQuantia()));

    }

}
