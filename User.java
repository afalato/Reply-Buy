package View;

public class User {
	
	private String nome; 
	private String cognome;
	private int id;
	private Account account;
	private static int last_id=0;

	
	
//	public User() {
//
//		nome = null; 
//		cognome = null;
//		id=++last_id;
//		account = new Account();
//		
//	}
//	
	
	public User(String nome, String cognome ) {

		this.nome = nome; 
		this.cognome = cognome;
		id=++last_id;
		account = new Account();
		
	}

	public void setAccount( String user , String pwd) {
	account.setUsername(user);
	account.setPassword(pwd);
		
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public void setAccount(Account a) {
		this.account = a;
	}
	
	public Account getAccount() {
		return account;
	}
}
