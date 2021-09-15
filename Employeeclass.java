class Employee
{
  int id;
  String name;
  int salary;

  void setID(int i)
  {
    id = i;
  }
  void setName(String n)
  {
    name = n;
  }
  void setSalary(int s)
  {
    salary = s;
  }
  
  void getEmployeeDetails( )
  {
    System.out.println(name+ "Salary is:"+salary);
  }
  public static void main(String args[]) 
   {
     Employee emp=new Employee();
     emp.setID(2000080031);
     emp.setName("Siddhartha");
     emp.setSalary(400000);
     emp.getEmployeeDetails();
   }
}











    