package blog.data.base;

import java.util.List;
import java.util.stream.Stream;

public interface GenericRepository <T> {
    List<T> listAll();

    T findById(int id);

    Stream<T> modelStream();

    void create(T post);

    void update(int id, T post);

    void delete(int id);




}
