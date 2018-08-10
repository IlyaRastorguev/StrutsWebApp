package struts.data;

import struts.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface IDao<T> {

    T findById(int id);

    void save(T user);

    void update(T user);

    void delete(T user);

    List<T> getAll();

}
