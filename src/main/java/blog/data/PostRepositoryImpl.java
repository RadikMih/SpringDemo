package blog.data;

import blog.data.base.GenericRepository;
import blog.data.base.PostRepository;
import blog.models.Post;

import java.util.List;
import java.util.stream.Stream;

public class PostRepositoryImpl implements GenericRepository<Post> {
    @Override
    public List<Post> listAll() {
        return null;
    }

    @Override
    public Post findById(int id) {
        return null;
    }

    @Override
    public Stream<Post> modelStream() {
        return null;
    }

    @Override
    public void create(Post post) {

    }

    @Override
    public void update(int id, Post post) {

    }

    @Override
    public void delete(int id) {

    }
}
