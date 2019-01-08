package blog.services;

import blog.data.base.GenericRepository;
import blog.models.Post;
import blog.services.base.PostService;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PostServiceImpl implements PostService {
    private GenericRepository<Post> postRepository;

    public PostServiceImpl(GenericRepository<Post> postRepository) {
        this.postRepository = postRepository;
    }

    public PostServiceImpl() {

    }

    @Override
    public List<Post> listPosts() {
        return postRepository.listAll();
    }

    @Override
    public List<Post> searchPosts(Predicate<Post> condition) {
        return postRepository.modelStream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    @Override
    public Post findById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public void create(Post post) {
        postRepository.create(post);
    }

    @Override
    public void update(int id, Post post) {
        postRepository.update(id, post);
    }

    @Override
    public void delete(int id) {
        postRepository.delete(id);
    }
}
