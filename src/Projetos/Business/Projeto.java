package Projetos.Business;

import CoreComplete.Data;

/**
 *
 * @author joao
 */
public class Projeto
{

    private String idProj;
    private String nome;
    private String tipo;
    private Data dataIniPrev;
    private Data dataFimprev;
    private Data dataIniReal;
    private Data dataFimReal;
    private double custoEst;
    private int codCli;

    public Projeto()
    {
    }

    public Projeto( String idProj, String nome, String tipo, Data dataIniPrev, Data dataFimprev, Data dataIniReal, Data dataFimReal, double custoEst, int codCli )
    {
        this.idProj = idProj;
        this.nome = nome;
        this.tipo = tipo;
        this.dataIniPrev = dataIniPrev;
        this.dataFimprev = dataFimprev;
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

    public Data getDataFimprev()
    {
        return dataFimprev;
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
