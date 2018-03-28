package taxoservice.taxoservice.utilitis;

import org.springframework.stereotype.Component;

import taxoservice.taxoservice.entity.Contact;
import taxoservice.taxoservice.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {
	
	public Contact convertContactModel2Contact(ContactModel contactModel) {
		
		Contact contatto = new Contact();
		contatto.setId(contactModel.getId());
		contatto.setFirstname(contactModel.getNome());
		contatto.setLastname(contactModel.getCognome());
		contatto.setTelephone(contactModel.getTelefono());
		contatto.setCity(contactModel.getCitta());
		
		return contatto;
	}
	
	public ContactModel convertContact2ContactModel(Contact contatto) {
		
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contatto.getId());
		contactModel.setNome(contatto.getFirstname());
		contactModel.setCognome(contatto.getLastname());
		contactModel.setTelefono(contatto.getTelephone());
		contactModel.setCitta(contatto.getCity());
		
		return contactModel;
	}
	

}
