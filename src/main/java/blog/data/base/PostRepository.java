package blog.data.base;

import blog.models.Post;

import java.util.List;

public interface PostRepository {
    List<Post> listAll();

    Post findById(int id);

    void create(Post post);

    void update(int id, Post post);

    void delete(int id);

}
