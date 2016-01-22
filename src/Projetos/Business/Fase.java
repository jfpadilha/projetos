package Projetos.Business;

/**
 *
 * @author joao
 */
public class Fase
{

    private int codFase;
    private String nome;

    public Fase()
    {
    }

    public Fase( int codFase, String nome )
    {
        this.codFase = codFase;
        this.nome = nome;
    }

    public int getCodFase()
    {
        return codFase;
    }

    public String getNome()
    {
        return nome;
    }

}
