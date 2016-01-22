package DAO;

import Projetos.Controll.Cidade;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author joao
 */
public class DAOCidade
{

    /**
     * Insertion of the CIDADE object in the database
     *
     * @param cidade
     */
    public void insertCidade( Cidade cidade )
    {
        //criar uma sessao para gerenciamento do DAO (data access object)
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();         //abrir uma transacao
            session.save(cidade);               //salvar o objeto
            session.getTransaction().commit();  //realizar definitivamente a operacao
            JOptionPane.showMessageDialog(null, "Insertion of CIDADE successfully!!!");

        }
        catch ( Exception e )
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Perform update the CIDADE object
     *
     * @param cidade
     */
    public void updateCidade( Cidade cidade )
    {
        //criar um objeto sessao
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();             //abrir a transacao
            session.merge(cidade);                  //dizer o que fazer com o object
            session.getTransaction().commit();      //realizar a operacao
            JOptionPane.showMessageDialog(null, "update od the object CIDADE successfully!");
        }
        catch ( Exception e )
        {
            System.out.println("Erro-->   " + e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void deleteCidade( Cidade cidade )
    {
        //criar uma sessao
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();             //abrir a sessao
            session.delete(cidade);                 //dizer o que fazer com o object
            session.getTransaction().commit();      //efetuar a operacao
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
        }
        catch ( Exception e )
        {
            System.out.println("Erro: " + e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void listCidade()
    {
        //criar uma sessao
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();             //abrir a sessao

            //criar uma lista a partir da DB
            List listaCidade = session.createQuery("FROM Cidade").list();

            //Iterador que vai preencher o objeto city com o que veio da base
            for ( Iterator iterator = listaCidade.iterator(); iterator.hasNext(); )
            {
                Cidade city = (Cidade) iterator.next();
                System.out.println("Código " + city.getCodcid());
                System.out.println("Cidade: " + city.getNome());
                System.out.println("UF: " + city.getUf());
                System.out.println("Cliente: " + city.getClientes());
            }

            JOptionPane.showMessageDialog(null, "Listed successfully!!!");
        }
        catch ( Exception e )
        {
            System.out.println("erro: " + e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
