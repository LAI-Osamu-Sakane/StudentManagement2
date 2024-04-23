package raisetech.StudentManagement2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayhello() {
    return "Hello, world!";
  }
}
