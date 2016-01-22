package Projetos.Controll;
// Generated 22/01/2016 10:59:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pessoa generated by hbm2java
 */
public class Pessoa  implements java.io.Serializable {


     private int codpess;
     private Cidade cidade;
     private Cliente cliente;
     private String nome;
     private String endereco;
     private Character tipo;
     private Date admissao;
     private Set participanteativs = new HashSet(0);
     private Person person;

    public Pessoa() {
    }

	
    public Pessoa(int codpess, Cidade cidade, Cliente cliente, String nome, String endereco) {
        this.codpess = codpess;
        this.cidade = cidade;
        this.cliente = cliente;
        this.nome = nome;
        this.endereco = endereco;
    }
    public Pessoa(int codpess, Cidade cidade, Cliente cliente, String nome, String endereco, Character tipo, Date admissao, Set participanteativs, Person person) {
       this.codpess = codpess;
       this.cidade = cidade;
       this.cliente = cliente;
       this.nome = nome;
       this.endereco = endereco;
       this.tipo = tipo;
       this.admissao = admissao;
       this.participanteativs = participanteativs;
       this.person = person;
    }
   
    public int getCodpess() {
        return this.codpess;
    }
    
    public void setCodpess(int codpess) {
        this.codpess = codpess;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Character getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }
    public Date getAdmissao() {
        return this.admissao;
    }
    
    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    public Set getParticipanteativs() {
        return this.participanteativs;
    }
    
    public void setParticipanteativs(Set participanteativs) {
        this.participanteativs = participanteativs;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }




}


