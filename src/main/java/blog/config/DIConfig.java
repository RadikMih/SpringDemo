package blog.config;

import blog.data.InMemoryGenericRepository;
import blog.data.base.GenericRepository;
import blog.models.Post;
import blog.services.PostServiceImpl;
import blog.services.base.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfig {
    @Bean
    public GenericRepository<Post> postGenericRepository(){
        return new InMemoryGenericRepository();
    }
    @Bean
    public PostService postService(GenericRepository<Post> postRepository) {
        return new PostServiceImpl(postRepository);
    }
}
