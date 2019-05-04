package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World, Spring!";
    }
    
    @RequestMapping("/abc/")
    public String indexAbc() {
        return "Hello World, Spring abc!";
    }
    
}
