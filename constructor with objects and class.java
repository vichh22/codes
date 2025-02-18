class student
{
    static String dept = "CYBER";
    String name;
    double cgpa;
    
    student(String name,double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println("NAME :"+name);
        System.out.println("DEPT :"+dept);
        System.out.println("CGPA :"+cgpa);
        
    }
}
public class Main
{
	public static void main(String[] args) {
		student[] s= new student[5];
		
		String[] name= {"kapil","sush","dhaya","rishabh","vichu"};
		double[] cgpa={9,9.9,9,9.9,9};
		
		for (int i=0;i<5;i++){
		    s[i]= new student(name[i],cgpa[i]);
		} 
		
		for (int i=0;i<5 ;i++) {
		    s[i].display();
		}
	}
}
