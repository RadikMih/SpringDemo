package blog.services;

import blog.data.base.GenericRepository;
import blog.models.Post;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PostServiceImplTest {

    GenericRepository<Post> mockRepository;

    private List<Post> posts;
    private PostServiceImpl service;


    @Before
    public void beforeTest() {
        mockRepository = mock(GenericRepository.class);




        posts = new ArrayList<>();

        when(mockRepository.modelStream())
                .thenReturn(posts.stream());

        service = new PostServiceImpl(mockRepository);
    }

    @Test
    public void SearchPosts_whenMatch_returnListOfPosts() {
        // arrange
        posts.add(new Post(1, "Test 1"));
        posts.add(new Post(2, "Test 2"));
        posts.add(new Post(3, "Test 3"));
        posts.add(new Post(4, "Test 4"));
        posts.add(new Post(11, "Test 11"));

        // act
        List<Post> actualPosts = service.searchPosts(
                post -> post.getText()
                        .contains("1"));

        //assert
        Assert.assertNotNull(
                actualPosts.stream()
                .filter(post -> post.getText().equals("Test 1"))
                .findFirst()
                .orElse(null)
        );

        Assert.assertEquals(
                actualPosts.size(), 2
        );

    }
}
