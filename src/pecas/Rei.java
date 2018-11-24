package pecas;

import tabuleiro.Tabuleiro;

public class Rei extends Peca
{
    // metodo sobrescrito
    @Override
    public boolean mover(Posicao posicao)
    {
        Peca restricoesRei[][] = new Peca[8][8];
        Rei rei = new Rei();
        restricoesRei = Tabuleiro.getMatrizPeca();
        Posicao posicaoAtual = new Posicao(0, 0);

        // determinar posicao atual da peca
        //-------------------------------------------------------------
        for (int linha = 0; linha < restricoesRei.length; linha++)
        {
            for (int coluna = 0; coluna < restricoesRei.length; coluna++)
            {
                if (restricoesRei[linha][coluna] instanceof Rei)
                {
                    if (posicao.getColuna() == coluna + 1 || posicao.getColuna() == coluna - 1
                            || posicao.getLinha() == linha + 1 || posicao.getLinha() == linha - 1)
                    {
                        posicaoAtual.setLinha(linha);
                        posicaoAtual.setColuna(coluna);

                        //encerra o loop quando acha posicao inicial
                        linha = 8;
                        coluna = 8;
                    }
                }
            }
            if (linha == 7)
            {
                return false;
            }
        }
        //-------------------------------------------------------------

        // verificacao da cor da peca
        if (restricoesRei[posicao.getLinha()][posicao.getColuna()] instanceof Peca)
        {
            if (rei.isCorPreta() != restricoesRei[posicao.getLinha()][posicao.getColuna()].isCorPreta())
            {
                // se houver uma peca de cor diferente do rei, o codigo continua na execucao com as proximas verificacoes
            }
            else
            {
                return false;
                // se a peca na nova posicao for da mesma cor que o rei a jogada sera invalida impedindo a movimentacao da peca
            }
        }

        // movimenta o rei nas diagonais principais e secundarias
        if ((posicao.getLinha() == posicaoAtual.getLinha() + 1 || posicao.getLinha() == posicaoAtual.getLinha() - 1)
                    && (posicao.getColuna() == posicaoAtual.getColuna() + 1
                    || posicao.getColuna() == posicaoAtual.getColuna() - 1))
        {
            restricoesRei[posicao.getLinha()][posicao.getColuna()] = rei;
            restricoesRei[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
            Tabuleiro.setMatrizPeca(restricoesRei);
            return true;
        }

        // movimenta rei na horizontal
        if (posicaoAtual.getLinha() == posicao.getLinha() && (posicao.getColuna() == posicaoAtual.getColuna() + 1
                    || posicao.getColuna() == posicaoAtual.getColuna() - 1))
        {
            restricoesRei[posicao.getLinha()][posicao.getColuna()] = rei;
            restricoesRei[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
            Tabuleiro.setMatrizPeca(restricoesRei);
            return true;
        }

        // movimenta rei na vertical
        if (posicaoAtual.getColuna() == posicao.getColuna() && (posicao.getLinha() == posicaoAtual.getLinha() + 1
                    || posicao.getLinha() == posicaoAtual.getLinha() - 1))
        {
            restricoesRei[posicao.getLinha()][posicao.getColuna()] = rei;
            restricoesRei[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
            Tabuleiro.setMatrizPeca(restricoesRei);
            return true;
        }
        return false;
    }
}