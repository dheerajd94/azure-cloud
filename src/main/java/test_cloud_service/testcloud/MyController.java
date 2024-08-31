package test_cloud_service.testcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/message")
    public String message(){
        return "this is cloud testing...!!";
    }
}
