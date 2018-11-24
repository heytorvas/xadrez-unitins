package tabuleiro;

import pecas.Peca;
import pecas.Posicao;

public class Tabuleiro
{
	// atributo
	private static Peca matrizPeca[][] = new Peca[8][8];

	// getters e setters
	public static Peca getPosicao(Posicao posicao)
	{
		return matrizPeca[posicao.getLinha()][posicao.getColuna()];
	}
	public static Peca[][] getMatrizPeca()
	{
		return matrizPeca;
	}
	public static void setMatrizPeca(Peca[][] matrizPeca)
	{
		Tabuleiro.matrizPeca = matrizPeca;
	}
}