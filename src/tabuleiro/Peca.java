package tabuleiro;

public abstract class Peca
{
	//ATRIBUTOS
	private Posicao posicao;
	private boolean corPreta;
	private boolean nuncaMovimentado;
	private String urlImagem;

	//CONSTRUTOR DEFAULT
	public Peca()
	{
	}

	//CONSTRUTOR
	public Peca(Posicao posicao, boolean corPreta)
	{
		super();
		this.posicao = posicao;
		this.corPreta = corPreta;
		this.nuncaMovimentado = true;
		this.urlImagem = null;
	}

	//GETTERS E SETTERS
	public boolean isCorPreta()
	{
		return true;
	}
	public Posicao getPosicao()
	{
		return posicao;
	}
	public void setPosicao(Posicao posicao)
	{
		this.posicao = posicao;
	}
	public void setCorPreta(boolean valor)
	{
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
	public void setUrlImagem(String urlImagem)
	{
		this.urlImagem = urlImagem;
	}

	//METODO
	public abstract boolean mover(Posicao posicao);
}