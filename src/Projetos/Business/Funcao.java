package Projetos.Business;

/**
 *
 * @author joao
 */
public class Funcao
{

    private int codFunc;
    private String nome;

    public Funcao()
    {
    }

    public Funcao( int codFunc, String nome )
    {
        this.codFunc = codFunc;
        this.nome = nome;
    }

    public int getCodFunc()
    {
        return codFunc;
    }

    public String getNome()
    {
        return nome;
    }

}
