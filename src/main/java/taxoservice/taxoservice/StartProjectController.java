package taxoservice.taxoservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartProjectController {
	
    @RequestMapping("/")
    public String index() {
        return "Bienvenido a la pagina de Jackson Freire";
    }

}
