class Student 
{
	private int sno;
	private String sname;
	private String course;

	Student(int sno , String sname , String course){
		this.sno=sno;
		this.sname=sname;
		this.course=course;
	}

	//overriding equals method
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		else{
		
		if(obj instanceof Student){
                  Student s = (Student)obj;
				  return (this.sno==s.sno)&&this.sname.equals(s.sname)&&this.course.equals(s.course);
		}
		else
			return false;
		}
	}
}

class Bh
{
	public static void main(String[] args){
		Student s1= new Student(1,"bharat","cj");
		Student s2= new Student(1,"bharat","cj");
		Student s3= new Student(2,"him","cjn");
		Student s4= s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

        System.out.println(s2==s4);
		System.out.println(s2.equals(s4));

}
}