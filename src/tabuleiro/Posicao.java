package tabuleiro;

public class Posicao
{
    //ATRIBUTOS
    private int linha;
    private int coluna;
    private Peca[][] pecas;

    //CONSTRUTOR
    public Posicao(int linha, int coluna)
    {
        this.linha = linha;
        this.coluna = coluna;
    }

    //GETTERS E SETTER
    public int getLinha()
    {
        return linha;
    }
    public void setLinha(int linha)
    {
        this.linha = linha;
    }
    public int getColuna()
    {
        return coluna;
    }
    public void setColuna(int coluna)
    {
        this.coluna = coluna;
    }

    //METODOS
    public void setValores(int linha, int coluna)
    {
        this.linha = linha;
        this.coluna = coluna;
    }
    private boolean existePosicao(int linha, int coluna)
    {
        return linha >= 0 && linha < linha && coluna >= 0 && coluna < coluna;
    }
    public boolean existePosicao(Posicao posicao)
    {
        return existePosicao(posicao.getLinha(), posicao.getColuna());
    }
    public Peca peca(Posicao posicao)
    {
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    //SOBRESCRITA TOSTRING
    @Override
    public String toString()
    {
        return linha + ", " + coluna;
    }
}