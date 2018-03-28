package taxoservice.taxoservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import taxoservice.taxoservice.entity.Contact;
import taxoservice.taxoservice.model.ContactModel;
import taxoservice.taxoservice.repository.ContactRepository;
import taxoservice.taxoservice.services.ContactService;
import taxoservice.taxoservice.utilitis.ContactConverter;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	
	
	@Override
	public List<ContactModel> listAllContacts() {
		
		List<Contact> contatti = contactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<ContactModel>();
		
		for(Contact contact: contatti){
			contactsModel.add(contactConverter.convertContact2ContactModel(contact));
		}
		return contactsModel;
	}

}
