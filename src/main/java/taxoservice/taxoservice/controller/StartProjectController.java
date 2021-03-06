package taxoservice.taxoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import taxoservice.taxoservice.model.ContactModel;
import taxoservice.taxoservice.services.ContactService;


@RestController
@RequestMapping("/contacts")
public class StartProjectController {
	
	@Autowired
	@Qualifier("contactServiceImpl")
	private ContactService contactAll;
	
    @RequestMapping("/")
    public String index() {
        return "Bienvenido a la pagina de Jackson Freire";
    }
    
    @CrossOrigin(origins = "https://taxoservicefe.herokuapp.com/")
    @GetMapping("/showcontacts")
    public List<ContactModel> showContacts() {
    	
    	return contactAll.listAllContacts();
    	
    	
    }

}
