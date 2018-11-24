package pecas;

public class Posicao
{
	// atributos
	private int linha;
	private int coluna;

	// construtor
	public Posicao(int linha, int coluna)
	{
		this.linha = linha;
		this.coluna = coluna;
	}

	// getters e setters
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
}