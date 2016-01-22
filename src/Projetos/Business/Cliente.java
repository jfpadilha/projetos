package Projetos.Business;

/**
 *
 * @author joao
 */
public class Cliente
{

    private int codcli;
    private String nome;
    private String endereco;
    private int codcid;

    public Cliente()
    {
    }

    public Cliente( int codcli, String nome, String endereco, int codcid )
    {
        this.codcli = codcli;
        this.nome = nome;
        this.endereco = endereco;
        this.codcid = codcid;
    }

    public int getCodcli()
    {
        return codcli;
    }

    public String getNome()
    {
        return nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public int getCodcid()
    {
        return codcid;
    }

}
