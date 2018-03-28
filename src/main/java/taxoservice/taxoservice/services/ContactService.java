package taxoservice.taxoservice.services;

import java.util.List;

import taxoservice.taxoservice.model.ContactModel;



public interface ContactService {
	
	public abstract List<ContactModel> listAllContacts();
	
}
