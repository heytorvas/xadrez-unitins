package pecas;

import tabuleiro.Tabuleiro;

public class Cavalo extends Peca
{
	// metodo sobrescrito
	@Override
	public boolean mover(Posicao posicao)
	{
		Peca restricoesCavalo[][] = new Peca[8][8];
		Cavalo cavalo = new Cavalo();
		restricoesCavalo = Tabuleiro.getMatrizPeca();
		Posicao posicaoAtual = new Posicao(0,0);

		// determinar posicao atual da peca
		//-------------------------------------------------------------
		for (int linha = 0; linha < restricoesCavalo.length; linha++)
		{
			for (int coluna = 0; coluna < restricoesCavalo.length; coluna++)
			{
				if ((posicao.getColuna() == coluna + 1 || posicao.getColuna() == coluna - 1)
						&& (posicao.getLinha() == linha + 2 ||posicao.getLinha() == linha - 2))
				{
					if (restricoesCavalo[linha][coluna] instanceof Cavalo)
					{
						posicaoAtual.setLinha(linha);
						posicaoAtual.setColuna(coluna);
						
						// encerra o loop quando acha posicao inicial
						linha = 8;
						coluna = 8;
					}
				}
			}
			if(linha == 7)
			{
				return false;
			}
		}
		//-------------------------------------------------------------

		// verificacao da cor da peca
		if (restricoesCavalo[posicao.getLinha()][posicao.getColuna()] instanceof Peca)
		{
			if (cavalo.isCorPreta() != restricoesCavalo[posicao.getLinha()][posicao.getColuna()].isCorPreta())
			{
				// se houver uma peca de cor diferente do cavalo o codigo continua na execucao com as proximas verificacoes
			} 
			else
			{
				return false;
				// se a peca na nova posicao for da mesma cor que o cavalo a jogada sera invalida impedindo a movimentacao da peca
			}
		}

		// movimentacao superior e inferior
		if (posicaoAtual.getLinha() < posicao.getLinha() || posicaoAtual.getLinha() > posicao.getLinha())
		{
			if (posicao.getLinha() - posicaoAtual.getLinha() == 2 || posicaoAtual.getLinha() - posicao.getLinha() == 2)
			{
				if (posicao.getColuna() == posicaoAtual.getColuna() - 1 || posicao.getColuna() == posicaoAtual.getColuna() + 1 )
				{
					restricoesCavalo[posicao.getLinha()][posicao.getColuna()] = cavalo;
					posicaoAtual = posicao;
					Tabuleiro.setMatrizPeca(restricoesCavalo);
					restricoesCavalo[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
					return true;
				}
			}
		}

		// movimentacao para os lados
		if (posicaoAtual.getColuna() < posicao.getColuna() || posicaoAtual.getColuna() > posicao.getColuna())
		{
			if (posicao.getColuna() - posicaoAtual.getColuna() == 2 || posicaoAtual.getColuna() - posicao.getColuna() == 2)
			{
				if (posicao.getLinha() == posicaoAtual.getLinha() - 1 || posicao.getLinha() == posicaoAtual.getLinha() + 1 )
				{
					restricoesCavalo[posicao.getLinha()][posicao.getColuna()] = cavalo;
					posicaoAtual = posicao;
					Tabuleiro.setMatrizPeca(restricoesCavalo);
					restricoesCavalo[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
					return true;
				}
			}
		}
		return false;
	}
}