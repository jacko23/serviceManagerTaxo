package taxoservice.taxoservice.model;

public class ContactModel {
	
	Integer id;
	String nome;
	String cognome;
	String telefono;
	String citta;

	public ContactModel() {
		super();
	}

	public ContactModel(Integer id, String nome, String cognome, String telefono, String citta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.citta = citta;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
}
