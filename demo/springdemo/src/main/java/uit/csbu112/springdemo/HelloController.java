package uit.csbu112.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public Student sayHello() {
        return new Student("Nguyễn Thành Phúc", 24560045);
        // http://localhost:8081/hello
    }
    @GetMapping("/add")
    public Addresult add(@RequestParam int a, @RequestParam int b) {
        return new Addresult(a+b);
    }
        // http://localhost:8081/add?a=1&b=2
    // public int add(@RequestParam int a, @RequestParam int b) {
    //     return (a+b);
    // }
    
}
