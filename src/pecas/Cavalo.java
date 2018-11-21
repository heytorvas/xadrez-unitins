package pecas;

//IMPORTACOES
import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Cavalo extends Peca
{
    //CONSTRUTOR DEFAULT
	public Cavalo()
    {
	}

	//METODO
	@Override
	public boolean mover(Posicao posicao)
    {
		Posicao pos = new Posicao(0, 0);
		Peca[][] mat = new Peca[8][8];
		Tabuleiro tabuleiro = new Tabuleiro();
		mat = tabuleiro.getMatrizPeca();

		pos.setValores(pos.getLinha() - 1, pos.getColuna() - 2);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() - 2, pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() - 2, pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() - 1, pos.getColuna() + 2);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() + 1, pos.getColuna() + 2);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() + 2, pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() + 2, pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		pos.setValores(pos.getLinha() + 1, pos.getColuna() - 2);
		if (pos.existePosicao(pos) && mover(pos))
		{
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		return false;
	}
}