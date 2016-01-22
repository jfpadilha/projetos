package Projetos.Business;

import CoreComplete.Data;

/**
 *
 * @author joao
 */
public class Ocorrencia
{

    private String idProj;
    private int sequencia;
    private Data dataOcor;
    private String horaOcor;
    private String descricao;

    public Ocorrencia()
    {
    }

    public Ocorrencia( String idProj, int sequencia, Data dataOcor, String horaOcor, String descricao )
    {
        this.idProj = idProj;
        this.sequencia = sequencia;
        this.dataOcor = dataOcor;
        this.horaOcor = horaOcor;
        this.descricao = descricao;
    }

    public String getIdProj()
    {
        return idProj;
    }

    public int getSequencia()
    {
        return sequencia;
    }

    public Data getDataOcor()
    {
        return dataOcor;
    }

    public String getHoraOcor()
    {
        return horaOcor;
    }

    public String getDescricao()
    {
        return descricao;
    }

}
