package transtu.pfe.Request;

import transtu.pfe.entity.District;

public class UserRequest {
	
    private long id;

    private String FirstName;

    private String LastName;

    private String PhoneNumber;

    private String Adress;
    
    private String Email;
  
    private District district;
    
    private String Password;


	



	public UserRequest(long id, String firstName, String lastName, String phoneNumber, String adress, String email,
			District district, String password) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		Adress = adress;
		Email = email;
		this.district = district;
		Password = password;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}

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





	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "UserRequest [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", PhoneNumber="
				+ PhoneNumber + ", Adress=" + Adress + ", Email=" + Email + ", district=" + district + ", Password="
				+ Password + "]";
	}








	
	}





	

	
	
	
	

