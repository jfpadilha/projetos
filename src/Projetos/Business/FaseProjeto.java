package Projetos.Business;

/**
 *
 * @author joao
 */
public class FaseProjeto
{

    private String idProj;
    private int codFase;

    public FaseProjeto()
    {
    }

    public FaseProjeto( String idProj, int codFase )
    {
        this.idProj = idProj;
        this.codFase = codFase;
    }

    public String getIdProj()
    {
        return idProj;
    }

    public int getCodFase()
    {
        return codFase;
    }

}
