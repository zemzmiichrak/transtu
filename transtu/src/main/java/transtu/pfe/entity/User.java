package transtu.pfe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String FirstName;

    private String LastName;

    private String PhoneNumber;

    private String Adress;
    
    private String Email;
    
    private String Password;

    



	


	public User(long id, String firstName, String lastName, String phoneNumber, String adress, String email,
			String password, District district, Role role) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		Adress = adress;
		Email = email;
		Password = password;
		this.district = district;
		this.role = role;
	}



	public User(long id2, String firstName2, String lastName2, String phoneNumber2, String adress2, String email2,
			String encode) {
		// TODO Auto-generated constructor stub
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	@OneToOne
	    @JoinColumn(name = "district_id")
	    private District district;
	
	
	
	 @OneToOne
	    @JoinColumn(name = "role_id") 
	    private Role role;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getPhoneNumber() {
		return PhoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}



	public String getAdress() {
		return Adress;
	}



	public void setAdress(String adress) {
		Adress = adress;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public District getDistrict() {
		return district;
	}



	public void setDistrict(District district) {
		this.district = district;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", PhoneNumber=" + PhoneNumber
				+ ", Adress=" + Adress + ", Email=" + Email + ", Password=" + Password + ", district=" + district
				+ ", role=" + role + "]";
	}



	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
