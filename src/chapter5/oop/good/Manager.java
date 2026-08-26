package chapter5.oop.good;
/* 관리자 클래스 */
public class Manager extends Employee{
	private String depName;
	
    public Manager (String name, double salary) {
    	super(name,salary);
    }
    
    public Manager (String name, double salary,String deptName) {
    	this(name, salary);
    	this.depName = deptName;
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
        salary += 20; // 20만원을 추가로 받는다.
    }
}
