package pl.edu.wszib.kk.hw3.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.kk.hw3.dao.IProductDao;
import pl.edu.wszib.kk.hw3.model.Product;

import javax.persistence.NoResultException;
import java.util.List;
@Repository
public class HibernateProductDAOImpl implements IProductDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Product getProductById(int id) {
        Session session = this.sessionFactory.openSession();
        Query<Product> query = session.createQuery("FROM pl.edu.wszib.kk.hw3.model.Product WHERE id = :id");
        query.setParameter("id",id);
        Product product = null;
        try {
            product = query.getSingleResult();
        }catch (NoResultException e){
            System.out.println("nie znaleziono produktu");
        }
        session.close();
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.saveOrUpdate(product);
            tx.commit();
        }catch(Exception e){
            if (tx!=null)
                tx.rollback();
        }finally {
            session.close();
        }
    }

    @Override
    public List<Product> getAllProducts() {
        Session session = this.sessionFactory.openSession();
        Query<Product> query = session.createQuery("FROM pl.edu.wszib.kk.hw3.model.Product");
        List<Product> products = query.getResultList();
        session.close();
        return products;
    }

    @Override
    public void addProduct(Product product) {

        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx=session.beginTransaction();
            session.save(product);
            tx.commit();

        }catch(Exception e){
            if(tx != null)
                tx.rollback();
        } finally {
            session.close();
        }

        return;
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete hibernate");
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx=session.beginTransaction();
            session.delete(product);
            tx.commit();

        }catch(Exception e){
            if(tx != null)
                tx.rollback();
        } finally {
            session.close();
        }


    }

    //    @Override
//    public void deleteProductById(int id) {
//        return;
//    }

}
