package Projetos.Screen;

import Projetos.Controll.Cidade;
import org.hibernate.Session;

/**
 *
 * @author joao
 */
public class MainProject
{

    public static void main( String[] args )
    {
//        Postgres

        //Cidade
        Cidade cid = new Cidade();
        cid.setCodcid(103);
        cid.setNome("São Luiz Gonzaga");
        cid.setUf("RS");

        //Pessoa
//        Pessoa pes = new Pessoa();
        Session session = DAO.DAOHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(cid);
        session.getTransaction().commit();
        

        System.exit(0);

//        Data ad = new Data(admissao);
//        Pessoa pes = new Pessoa(cod, nome, endereco, tipo, codCli, ad, codCid);
//        Pessoa p = new Pessoa(codCid, nome, endereco, tipo, codCli, ad, codCid);        
//        System.out.println(p.getNome());
    }

}
