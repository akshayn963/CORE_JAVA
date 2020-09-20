 class Student{
	 private int rno;
	 private String name;
	  static int count;
	 Student()
	 {
		 count++;
	 }
	 
	 void setData(int roll,String nm)
	 {
		 rno=roll;
		 name=nm;
	 }
	 void showData()
	 {
		 System.out.println("Roll no. is " +rno);
		 System.out.println("name is: " +name);
	 }
	 
	 
 }
 

	class StudentDemo1{
		public static void main(String ab[])
		{
			Student s1=new Student();
			s1.setData(14,"akshay");
			s1.showData();
			Student s2=new Student();
			Student s3=new Student();
			System.out.println(Student.count);
		}
	}