package uit.csbu112.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public Student sayHello() {
        return new Student("Nguyễn Thành Phúc", 24560045);
    }
    @GetMapping("/add")
    public Addresult add(@RequestParam int a, @RequestParam int b) {
        return new Addresult(a+b);
    }

    // public int add(@RequestParam int a, @RequestParam int b) {
    //     return (a+b);
    // }
    
}
