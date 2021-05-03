package interfaceAndAbstract;

public class Customer implements IEntity {

	private int id;
	private String FirstName;
	private String LastName;
	private int YearOfBirth;
	private long IdentityNo;

	public Customer(int id, String firstName, String lastName, int yearOfBirth, long identityNo) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		YearOfBirth = yearOfBirth;
		IdentityNo = identityNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	
public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}


	public long getIdentityNo() {
		return IdentityNo;
	}
	

	public void setIdentityNo(long identityNo) {
		IdentityNo = identityNo;
	}

}
