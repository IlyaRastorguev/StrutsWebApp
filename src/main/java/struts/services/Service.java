package struts.services;

import struts.data.IDao;

import java.util.List;

public interface Service<T> {

    IDao<T> getDao();

    T find(int id);

    void save(T o);

    void update(T o);

    void delete (T o);

    List<T> findAll();
}
