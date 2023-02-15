package java8features;
//i have to increase the sallry of each employeee whose age 25  is  then increase 
//than 10%
public class Streamexample {
	private String  name;
	private int age;
	private int sallary;
	public Streamexample(String  name,int age,int sallary) {
		this.name=name;
		this.age=age;
		this.sallary=sallary;
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
	public double getSallary() {
		return sallary;
	}
	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
//	@Override
//	public String toString() {
//		return "Streamexample [age=" + age + "]";
//	}
//	@Override
//	public String toString() {
//		return "Streamexample [sallary=" + sallary + "]";
//	}
//	
	@Override
	public String toString() {
		return "Streamexample [name=" + name + ", age=" + age + ", sallary=" + sallary + "]";
	}
	


}
