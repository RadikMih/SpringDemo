package blog.web;


import blog.models.Post;
import blog.services.base.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
curl -d ‘{“author”:“Ivan”, “content”:“message is cool”}’ -H “Content-Type: application/json”
-X POST http://localhost:8080/api/blogposts/
curl -d -H "Content-Type: application/json" -X DELETE localhost:8080/api/restaurants/2

curl -d '{"name": "Pri Krasi"}' -H "Content-Type: application/json" -X POST localhost:8080/api/restaurants/
curl -d '{"name": "Pri Krasi"}' -H "Content-Type: application/json" -X PUT localhost:8080/api/restaurants/3
 */



@RestController
@RequestMapping("/api/posts")
public class PostController {
    List<Post> posts;
    private PostService postService;


    public PostController() {
        posts = new ArrayList<>();
    }

    @RequestMapping("/")
    public List<Post> listPosts() {
        return posts;
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET
    )
    public Post findById(@PathVariable("id") String idString) {
        int id = Integer.parseInt(idString);
        return posts.stream()
                .filter(post -> post.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST
    )
    public void addPost(@RequestBody Post post) {
        int maxId = posts.stream()
                .mapToInt(Post::getId)
                .max()
                .orElse(0);
        int newId = maxId + 1;
        post.setId(newId);
        posts.add(post);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.PUT
    )
    public void update(@PathVariable("id") String idString, @RequestBody Post updatePost) {
        Post post = findById(idString);
        post.setText(updatePost.getText());
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE
    )
    public void remove(@PathVariable("id") String idString) {
        int id = Integer.parseInt(idString);
        postService.delete(id);
//        int index = -1;
//        for (int i = 0; i < posts.size(); i++) {
//            if (posts.get(i).getId() == id){
//                index = i;
//                break;
//            }
//        }
//        posts.remove(index);
//    }


    }
}