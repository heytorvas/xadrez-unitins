package pecas;

//IMPORTACOES
import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Rei extends Peca
{
	//CONSTRUTOR DEFAULT
	public Rei()
	{
	}

	//METODOS
	@Override
	public boolean mover(Posicao posicao)
	{
		Posicao pos = new Posicao(0, 0);
		Peca[][] mat = new Peca[8][8];
		Tabuleiro tabuleiro = new Tabuleiro();
		mat = tabuleiro.getMatrizPeca();

		// ACIMA
		pos.setValores(pos.getLinha() - 1, pos.getColuna());
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// ABAIXO
		pos.setValores(pos.getLinha() + 1, pos.getColuna());
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// ESQUERDA LIXO
		pos.setValores(pos.getLinha(), pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// DIREITA TALQUEI
		pos.setValores(pos.getLinha(), pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// NORDESTE LULA
		pos.setValores(pos.getLinha() - 1, pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// NOROESTE
		pos.setValores(pos.getLinha() - 1, pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// SUDESTE
		pos.setValores(pos.getLinha() + 1, pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		// SUDOESTE
		pos.setValores(pos.getLinha() + 1, pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		return false;
	}
}