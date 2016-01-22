package Projetos.Business;

import CoreComplete.Data;

/**
 *
 * @author joao
 */
public class Atividade
{
    private String idProj;
    private int sequencia;
    private String nome;
    private Data dataIniPrev;
    private Data dataFimPrev;
    private Data dataIniReal;
    private Data dataFimReal;
    private String horaIniPrev;
    private String horaFimPrev;
    private String horaIniReal;
    private String horaFimReal;
    private double duracaoEst;
    private double duracaoReal;
    private double custoEst;
    private double dustoReal;
    private String status;
    private int codFase;

    public Atividade()
    {
    }
    
    public Atividade( String idProj, int sequencia, String nome, Data dataIniPrev, Data dataFimPrev, Data dataIniReal, Data dataFimReal, String horaIniPrev, String horaFimPrev, String horaIniReal, String horaFimReal, double duracaoEst, double duracaoReal, double custoEst, double dustoReal, String status, int codFase )
    {
        this.idProj = idProj;
        this.sequencia = sequencia;
        this.nome = nome;
        this.dataIniPrev = dataIniPrev;
        this.dataFimPrev = dataFimPrev;
        this.dataIniReal = dataIniReal;
        this.dataFimReal = dataFimReal;
        this.horaIniPrev = horaIniPrev;
        this.horaFimPrev = horaFimPrev;
        this.horaIniReal = horaIniReal;
        this.horaFimReal = horaFimReal;
        this.duracaoEst = duracaoEst;
        this.duracaoReal = duracaoReal;
        this.custoEst = custoEst;
        this.dustoReal = dustoReal;
        this.status = status;
        this.codFase = codFase;
    }

    public String getIdProj()
    {
        return idProj;
    }

    public int getSequencia()
    {
        return sequencia;
    }

    public String getNome()
    {
        return nome;
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

    public String getHoraIniPrev()
    {
        return horaIniPrev;
    }

    public String getHoraFimPrev()
    {
        return horaFimPrev;
    }

    public String getHoraIniReal()
    {
        return horaIniReal;
    }

    public String getHoraFimReal()
    {
        return horaFimReal;
    }

    public double getDuracaoEst()
    {
        return duracaoEst;
    }

    public double getDuracaoReal()
    {
        return duracaoReal;
    }

    public double getCustoEst()
    {
        return custoEst;
    }

    public double getDustoReal()
    {
        return dustoReal;
    }

    public String getStatus()
    {
        return status;
    }

    public int getCodFase()
    {
        return codFase;
    }
    
    
    
}
