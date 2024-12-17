package crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {

    Map<Long, User> db = new HashMap<Long, User>();


    public UserRestController() {
        db.put(10L, new User("a", "1", "김", "123"));
        db.put(11L, new User("b", "2", "이", "456"));
        db.put(12L, new User("c", "3", "박", "789"));
        db.put(13L, new User("d", "4", "최", "1234567"));
    }
    @GetMapping("/profile/{userId}")
    UserResponse getProfile(@PathVariable Long userId) {

        User user = db.get(userId);

        return new UserResponse(
                user.getLoginId(),
                user.getNickname(),
                user.getName());
    }
}

