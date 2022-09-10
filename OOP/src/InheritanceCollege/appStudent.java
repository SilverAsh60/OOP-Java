package InheritanceCollege;
/**
 * Lớp Student(class)
 * @author 
 *
 */
class Student{
	private int id;
	private String name;
	private int age;
	private String address;
	private int score;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*
	 * If score<10 then score=0 else score=10
	 */
	public int getScore() {
		if(this.score<10) this.score=0;
		else this.score=10;
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student() {
		}
	//Hàm khai báo (Constructor)
	public Student (int id,String name, int age,String address, int score) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
		this.score=score;
	}
}
public class appStudent {

	public static void main(String[] args) {
		//Tạo đối tượng(objects)
	Student s=new Student(1,"Huy",18,"Đồng Nai",-4);
	System.out.println("Mã số sinh viên:"+s.getId());
	System.out.println("Tên của bạn"+s.getName());
	System.out.println("Tuổi của bạn:"+s.getAge());
	System.out.println("Tỉnh/thành phố của bạn:"+s.getAddress());
	System.out.println("Điểm trung bình của bạn:"+s.getScore());
	}

}
