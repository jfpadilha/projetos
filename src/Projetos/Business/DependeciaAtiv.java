package Projetos.Business;

/**
 *
 * @author joao
 */
public class DependeciaAtiv
{

    private String idProj;
    private int sequencia;
    private int sequenciaDep;

    public DependeciaAtiv()
    {
    }

    public DependeciaAtiv( String idProj, int sequencia, int sequenciaDep )
    {
        this.idProj = idProj;
        this.sequencia = sequencia;
        this.sequenciaDep = sequenciaDep;
    }

    public String getIdProj()
    {
        return idProj;
    }

    public int getSequencia()
    {
        return sequencia;
    }

    public int getSequenciaDep()
    {
        return sequenciaDep;
    }

}
