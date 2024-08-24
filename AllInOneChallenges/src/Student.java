class DataOfStudents
{
String name;
int age;

DataOfStudents(String name,int age)
{
    this.name=name;
    this.age=age;
}

    @Override
    public String toString() {
    StringBuilder s1=new StringBuilder("the student information are here: \n");
        s1.append("Name: ").append(name).append("\n Age: ").append(age);
        return s1.toString();
    }
}

public class Student {
    public static void main(String args[])
    {
      DataOfStudents d1=new DataOfStudents("vishal kumar",23);
        System.out.println(d1);
    }
}
