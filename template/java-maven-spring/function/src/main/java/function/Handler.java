package function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/")
class Handler {

	 @RequestMapping("/")
    public ResponseEntity<String>  handle() {
        return new ResponseEntity<>(" Hello World from Kotlin Spring Boot!\n".trim(), HttpStatus.OK);
    }

}
