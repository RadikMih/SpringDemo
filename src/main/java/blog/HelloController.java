package blog;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/messages")
public class HelloController {

//    @RequestMapping("/")
//    public String sayHello(){
//        return "Hello";
//    }

    @RequestMapping("/")
    List<Message> listMessages() {
        return Arrays.asList(
                new Message("one"),
                new Message("Two"),
                new Message("Three")
        );
    }

//    @RequestMapping("/{id}")
//    String findById(int id) {
//     return "";
//    }


}
