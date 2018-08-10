package struts.data;

import org.hibernate.Session;
import org.hibernate.Transaction;
import struts.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IDao<User> {

    @Override
    public User findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(User.class, id);
    }

    @Override
    public void save(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction saveTransact = session.beginTransaction();
        session.save(user);
        saveTransact.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction updateTransact = session.beginTransaction();
        session.update(user);
        updateTransact.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction deleteTransact = session.beginTransaction();
        session.delete(user);
        deleteTransact.commit();
        session.close();
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try {
            users = (List<User>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("").list();
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
       return users;
    }

}
