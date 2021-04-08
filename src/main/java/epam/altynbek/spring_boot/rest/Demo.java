package epam.altynbek.spring_boot.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    static public Long getValue() {
        return 12L;
    }

    @GetMapping
    ResponseEntity<String> getDemo() {
        return ResponseEntity.ok("Deploy");
    }
}
