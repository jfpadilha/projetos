package Projetos.Business;

/**
 *
 * @author joao
 */
public class Cidade
{

    private int codcid;
    private String nome;
    private String uf;

    /**
     * Builders
     */
    public Cidade()
    {
    }

    public Cidade( int codcid, String nome, String uf )
    {
        this.codcid = codcid;
        this.nome = nome;
        this.uf = uf;
    }

    /**
     * Getters
     */
    public void setCodcid( int codcid )
    {
        this.codcid = codcid;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public void setUf( String uf )
    {
        this.uf = uf;
    }

    /**
     * Getters
     */
    public int getCodcid()
    {
        return codcid;
    }

    public String getNome()
    {
        return nome;
    }

    public String getUf()
    {
        return uf;
    }
}
