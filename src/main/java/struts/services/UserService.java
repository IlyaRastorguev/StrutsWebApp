package struts.services;

import struts.data.IDao;
import struts.data.UserDaoImpl;
import struts.model.User;

import java.util.List;

public class UserService implements Service<User> {

    @Override
    public IDao<User> getDao() {
        return new UserDaoImpl();
    }

    @Override
    public User find(int id) {
        return getDao().findById(id);
    }

    @Override
    public void save(User o) {
        getDao().save(o);
    }

    @Override
    public void update(User o) {
        getDao().update(o);
    }

    @Override
    public void delete(User o) {
        getDao().delete(o);
    }

    @Override
    public List<User> findAll() {
        return getDao().getAll();
    }
}
