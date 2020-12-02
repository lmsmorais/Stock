package br.uniso.stock;

public class Produtos {
    private int id;
    private String produto;
    private int quantidade;


    public static final Produtos[] estoque= {
            new Produtos(1, "Ferro", 055),
            new Produtos(2, "Madeira", 6234),
            new Produtos(3, "Aço", 762),
            new Produtos(4, "Diamante", 94),
            new Produtos(5, "couro", 321),
            new Produtos(6, "papelão", 36),
            new Produtos(7, "chapas", 477),
            new Produtos(8, "tecidos", 24),
            new Produtos(9, "areia", 227),
            new Produtos(10, "pedra britada", 170),
            new Produtos(11, "cimento", 317),
            new Produtos(12, "poliéster", 47),
            new Produtos(13, "fios de algodão", 757)
    };

    private Produtos(int id, String produto, int quantidade){
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public int getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "  ID: "  + id + "\n  Produto:" + produto + "\n  QTD:" + quantidade+ "\n" ;
    }
}





