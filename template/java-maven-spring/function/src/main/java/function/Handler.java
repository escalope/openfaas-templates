package function;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController("/")
class Handler {

	 @RequestMapping("/")
    public String  handle() {
        return " Hello World from Kotlin Spring Boot!\n".trim();
    }

}
