package DAO;

import Projetos.Controll.Cliente;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author joao
 */
public class DAOCliente
{

    public void insertCliente( Cliente cliente )
    {
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Insertion successfully!!!");
        }
        catch ( Exception e )
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateCliente( Cliente cliente )
    {
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();
            session.merge(cliente);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Update successfully!!!");
        }
        catch ( Exception e )
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void listCliente()
    {
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();

        try
        {
            session.beginTransaction();
            List cliente = session.createQuery("FROM cliente").list();

            for ( Iterator iterator = cliente.iterator(); iterator.hasNext(); )
            {
                Cliente cli = (Cliente) iterator.next();
                System.out.println(cli.getCodcli() + " | " + cli.getNome() + " | " + cli.getEndereco() + " | " + cli.getCidade());
            }
            JOptionPane.showMessageDialog(null, "Listed successfullyy!!!");
        }
        catch ( Exception e )
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
