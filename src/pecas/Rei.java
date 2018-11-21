package pecas;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Rei extends Peca {

	public Rei() {
	}

	@Override
	public boolean mover(Posicao posicao) {

		Posicao pos = new Posicao(0, 0);
		Peca[][] mat = new Peca[8][8];
		Tabuleiro tabuleiro = new Tabuleiro();
		mat = tabuleiro.getMatrizPeca();

		// acima
		pos.setValores(pos.getLinha() - 1, pos.getColuna());
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// abaixo
		pos.setValores(pos.getLinha() + 1, pos.getColuna());
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// esquerda
		pos.setValores(pos.getLinha(), pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// direita
		pos.setValores(pos.getLinha(), pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// nordeste
		pos.setValores(pos.getLinha() - 1, pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// noroeste
		pos.setValores(pos.getLinha() - 1, pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// sudeste
		pos.setValores(pos.getLinha() + 1, pos.getColuna() - 1);
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}
		// sudoeste
		pos.setValores(pos.getLinha() + 1, pos.getColuna() + 1);
		if (pos.existePosicao(pos) && mover(pos)) {
			mat[pos.getLinha()][pos.getColuna()] = tabuleiro.getPosicao(pos);
		}

		return false;
	}
}