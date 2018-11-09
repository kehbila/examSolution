package za.co.examsolutions.people;

public abstract class Person {

	private String name;
	private int age;
	private long idNumber;
	private String gender;
	private boolean isLoggedIn;
	private String username;
	private String password;


	public Person() {

	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Person(String name, int age, int idNumber, String gender) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public String getgender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean login(String username, String password){
		this.isLoggedIn = this.username.equals(username) && this.password.equals(password);
		return this.isLoggedIn;
	}

}
