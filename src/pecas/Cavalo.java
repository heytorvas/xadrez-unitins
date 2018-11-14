package pecas;

import tabuleiro.Peca;
import tabuleiro.Posicao;

public class Cavalo extends Peca
{

    public Cavalo()
    {
    }

    private boolean podeMover(Posicao posicao)
    {
        Peca p = (Peca)getPosicao().peca(posicao);
        return p == null || p.isCorPreta() != isCorPreta();
    }

    public boolean[][] movimentosPossiveis()
    {
        Posicao p = new Posicao(0, 0);
        boolean[][] mat = new boolean[p.getLinha()][p.getColuna()];

        p.setValores(p.getLinha() - 1, p.getColuna() - 2);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() - 2 , p.getColuna() - 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() - 2, p.getColuna() + 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() - 1, p.getColuna() + 2);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() + 1, p.getColuna() + 2);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() + 2, p.getColuna() + 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() + 2, p.getColuna() - 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        p.setValores(p.getLinha() + 1, p.getColuna() - 2);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }
}