package blog.services;

import blog.models.Post;
import blog.services.base.PostService;

import java.util.List;
import java.util.function.Predicate;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> listPosts() {
        return null;
    }

    @Override
    public List<Post> searchPosts(Predicate<Post> condition) {
        return null;
    }

    @Override
    public Post findById(int id) {
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
