import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee
{
	private int id;
	private String name;
	private char gender;
	private long mobileNo;
	private boolean isMarried;
	private double salary;
	private LocalDate dob;
	private LocalDateTime joinedAt;
	public Employee() {
	}
	public Employee(int id, String name, char gender, long mobileNo, boolean isMarried, double salary, LocalDate dob,
			LocalDateTime joinedAt) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.isMarried = isMarried;
		this.salary = salary;
		this.dob = dob;
		this.joinedAt = joinedAt;
	}
	public int getId() {
		return id;
	}
    public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
    }
    public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDateTime getJoinedAt() {
		return joinedAt;
	}
	public void setJoinedAt(LocalDateTime joinedAt) {
		this.joinedAt = joinedAt;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", isMarried=" + isMarried + ", salary=" + salary + ", dob=" + dob + ", joinedAt=" +joinedAt +"]";
	}

}
