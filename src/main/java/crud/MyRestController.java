package crud;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @PostMapping("/products")
    String create() {
        return "생성!";
    }

    @GetMapping("/products")
    String read() {
        return "조회!";
    }

    @PutMapping("/products/{productId}")
    String upDate(@PathVariable Long productId) {

        return "수정 id:" + productId;
    }

    @DeleteMapping("/products/123")
    String delete() {
        return "삭제!";
    }
}
