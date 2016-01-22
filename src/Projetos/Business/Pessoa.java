package Projetos.Business;

import CoreComplete.Data;

/**
 *
 * @author joao
 */
public class Pessoa
{

    private int codpess;
    private String nome;
    private String endereco;
    private char tipo;
    private int codcli;
    private Data admissao;
    private int codCid;

    public Pessoa()
    {
    }

    public Pessoa( int codpess, String nome, String endereco, char tipo, int codcli, Data admissao, int codCid )
    {
        this.codpess = codpess;
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = tipo;
        this.codcli = codcli;
        this.admissao = admissao;
        this.codCid = codCid;
    }

    public int getCodpess()
    {
        return codpess;
    }

    public String getNome()
    {
        return nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public char getTipo()
    {
        return tipo;
    }

    public int getCodcli()
    {
        return codcli;
    }

    public Data getAdmissao()
    {
        return admissao;
    }

    public int getCodCid()
    {
        return codCid;
    }

}
