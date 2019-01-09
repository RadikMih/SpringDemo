package blog.data;

import blog.data.base.GenericRepository;
import blog.models.Post;

import java.util.List;
import java.util.stream.Stream;

public class InMemoryGenericRepository<T> implements GenericRepository<T> {



    @Override
    public List<T> listAll() {
        return null;
    }

    @Override
    public T findById(int id) {
        return null;
    }

    @Override
    public Stream<T> modelStream() {
        return null;
    }

    @Override
    public void create(T post) {

    }

    @Override
    public void update(int id, T post) {

    }


    @Override
    public void delete(int id) {

    }
}
