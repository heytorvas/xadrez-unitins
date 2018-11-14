package tabuleiro;

public abstract class Peca
{
    //ATRIBUTOS
    private boolean corPreta;
    private boolean nuncaMovimentado;
    private String urlImagem;
    private Posicao posicao;

    //GETTERS E SETTERS
    public boolean isCorPreta()
    {
        return true;
    }
    public void setCorPreta(boolean valor) {
        this.corPreta = valor;
    }
    public boolean isNuncaMovimentada()
    {
        return true;
    }
    public void setNuncaMovimentado(boolean valor)
    {
        this.nuncaMovimentado = valor;
    }
    public String getUrlImagem()
    {
        return urlImagem;
    }

    //METODOS
    protected Posicao getPosicao()
    {
        return posicao;
    }
    public boolean mover(Posicao posicao)
    {
        return true;
    }
}
