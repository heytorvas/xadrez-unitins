package pecas;

public class Rei extends Peca
{
    @Override
    public boolean mover(Posicao posicao)
    {
        Peca restricoesRei[][] = new Peca[8][8];
        Peca rei = new Rei();
        restricoesRei = tabuleiro.getMatrizPeca();
        Posicao posicaoAtual = new Posicao();

        for (int linha = 0; linha < restricoesRei.length; linha++)
        {
            for (int coluna = 0; coluna < restricoesRei.length; coluna++)
            {
                if (restricoesRei[linha][coluna] instanceof Rei)
                {
                    posicaoAtual.setLinha(linha);
                    posicaoAtual.setColuna(coluna);
                }
            }
        }

        if (restricoesRei[posicao.getLinha()][posicao.getColuna()] instanceof Peca)
        {
            if (rei.isCorPreta() != restricoesRei[posicao.getLinha()][posicao.getColuna()].isCorPreta())
            {
                // se houver uma peca de cor diferente da rainha o codigo continua na execucao com as proximas verificacoes
            } else
                return false;
            // se a peca na nova posicao for da mesma cor que o cavalo a jogada sera invalida impedindo a movimentacao da peca

        }

        // movimenta rei nas diagonais principais e secundaria
        if ((posicao.getLinha() == posicaoAtual.getLinha() + 1
                        || posicao.getLinha() == posicaoAtual.getLinha() - 1)
                        && (posicao.getColuna() == posicaoAtual.getColuna() + 1
                        || posicao.getColuna() == posicaoAtual.getColuna() - 1))
        {
            restricoesRei[posicao.getLinha()][posicao.getColuna()] = rei;
            posicaoAtual = posicao;
            tabuleiro.setMatrizPeca(restricoesRei);
            restricoesRei[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
            return true;
        }

        // movimenta rei na horizontal
        if (posicaoAtual.getLinha() == posicao.getLinha()
                        && (posicao.getColuna() == posicaoAtual.getColuna() + 1
                        || posicao.getColuna() == posicaoAtual.getColuna() - 1))
        {
            restricoesRei[posicao.getLinha()][posicao.getColuna()] = rei;
            posicaoAtual = posicao;
            tabuleiro.setMatrizPeca(restricoesRei);
            restricoesRei[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
            return true;
        }

        // movimenta rei na vertical
        if (posicaoAtual.getColuna() == posicao.getColuna()
                        && (posicao.getLinha() == posicaoAtual.getLinha() + 1
                        || posicao.getLinha() == posicaoAtual.getLinha() - 1))
        {
            restricoesRei[posicao.getLinha()][posicao.getColuna()] = rei;
            posicaoAtual = posicao;
            tabuleiro.setMatrizPeca(restricoesRei);
            restricoesRei[posicaoAtual.getLinha()][posicaoAtual.getColuna()] = null;
            return true;
        }
        return false;
    }
}