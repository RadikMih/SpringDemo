package blog.services.base;

import blog.models.Post;

import java.util.List;
import java.util.function.Predicate;

public interface PostService {
   List<Post> listPosts();

   List<Post> searchPosts(Predicate<Post> condition);

   Post findById(int id);

   void create(Post post);

   void update(int id, Post post);

    void delete(int id);
}
