package tabuleiro;

public class Tabuleiro
{
	//ATRIBUTO
	private Peca matrizPeca[][] = new Peca[8][8];

	//METODOS
	public Peca[][] getMatrizPeca()
	{
		return matrizPeca;
	}
	public void setMatrizPeca(Peca[][] matrizPeca)
	{
		this.matrizPeca = matrizPeca;
	}
	public Peca getPosicao(Posicao posicao)
	{
		return null;
	}
}