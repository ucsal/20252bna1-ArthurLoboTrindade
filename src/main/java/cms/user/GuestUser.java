package cms.user;

public class GuestUser extends User {
	

	public GuestUser(int id, String nome, String email, String password) {
		super(id, nome, email, password);
		// TODO Auto-generated constructor stub
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}
