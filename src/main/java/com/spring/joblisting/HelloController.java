package com.spring.joblisting;


// import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello from Spring Boot!";
    }

    @RequestMapping("/api/get")
    public String home(@RequestParam(name = "name", required = false, defaultValue = "Guest") String name)
    // public String home(HttpServletRequest req)
    {
        String name = req.getParameter("name");
        System.out.println(name);
        return "Hi "+name;
    }
}
