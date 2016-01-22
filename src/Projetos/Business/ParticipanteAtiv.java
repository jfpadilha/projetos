package Projetos.Business;

import CoreComplete.Data;

/**
 *
 * @author joao
 */
public class ParticipanteAtiv
{

    private String idProj;
    private String nome;
    private String tipo;
    private Data dataIniPrev;
    private Data dataFimPrev;
    private Data dataIniReal;
    private Data dataFimReal;
    private double custoEst;
    private int codCli;

    public ParticipanteAtiv()
    {
    }

    public ParticipanteAtiv( String idProj, String nome, String tipo, Data dataIniPrev, Data dataFimPrev, Data dataIniReal, Data dataFimReal, double custoEst, int codCli )
    {
        this.idProj = idProj;
        this.nome = nome;
        this.tipo = tipo;
        this.dataIniPrev = dataIniPrev;
        this.dataFimPrev = dataFimPrev;
        this.dataIniReal = dataIniReal;
        this.dataFimReal = dataFimReal;
        this.custoEst = custoEst;
        this.codCli = codCli;
    }

    public String getIdProj()
    {
        return idProj;
    }

    public String getNome()
    {
        return nome;
    }

    public String getTipo()
    {
        return tipo;
    }

    public Data getDataIniPrev()
    {
        return dataIniPrev;
    }

    public Data getDataFimPrev()
    {
        return dataFimPrev;
    }

    public Data getDataIniReal()
    {
        return dataIniReal;
    }

    public Data getDataFimReal()
    {
        return dataFimReal;
    }

    public double getCustoEst()
    {
        return custoEst;
    }

    public int getCodCli()
    {
        return codCli;
    }

}
