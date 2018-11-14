package pecas;

import tabuleiro.Peca;
import tabuleiro.Posicao;

public class Rei extends Peca
{

    public Rei()
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

        // acima
        p.setValores(p.getLinha() - 1, p.getColuna());
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // abaixo
        p.setValores(p.getLinha() + 1, p.getColuna());
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // esquerda
        p.setValores(p.getLinha(), p.getColuna() - 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // direita
        p.setValores(p.getLinha(), p.getColuna() + 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // nordeste
        p.setValores(p.getLinha() - 1, p.getColuna() - 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // noroeste
        p.setValores(p.getLinha() - 1, p.getColuna() + 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // sudeste
        p.setValores(p.getLinha() + 1, p.getColuna() - 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // sudoeste
        p.setValores(p.getLinha() + 1, p.getColuna() + 1);
        if(p.existePosicao(p) && podeMover(p))
        {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }
}