/*
60. TASK 1 - STUDENT RECORD
Required filename: StudentRecord.java
Create a Student model class and a public StudentRecord driver.
Student requirements:
- private String name
- private String studentId
- private int mark
- a constructor receiving all three values
- name and studentId must be non-null and non-blank
- mark must remain between 0 and 100
- getters for all fields
- boolean setMark(int newMark), preserving the old mark when invalid
- boolean hasPassed()
- String getClassification()
- a useful toString()
Driver requirements:
- create at least three students
- test marks 49, 50, 79, 80, and an invalid update
- display every object directly with println

*/




public class Student
{
    private String name;
    private String studentId;
    private int mark;
    public Student(String name, String studentId, int mark)
    {
        if (name == null || name.isBlank())
            {
                throw new IllegalArgumentException();
            }
        if (studentId == null || studentId.isBlank())
            {
                throw new IllegalArgumentException();
            }
        if (mark<0 || mark>100)
            {
                throw new IllegalArgumentException();
            }

        this.name= name;
        this.studentId= studentId;
        this.mark= mark;
    }
    public String getName()
    {
        return name;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public int getMark()
    {
        return mark;
    }
    public boolean setMark(int newMarks)
    {
        if(newMarks>= 0 && newMarks<= 100)
            {
            mark = newMarks;
            return true;
        }

        return false;
    }

    public boolean hasPassed()
    {
        return mark>= 50;
    }

    public String getClassification()
    {

        if (mark >= 80)
            {
            return "Distinction";
        } 
        else if(mark >= 50)
            {
                return "Pass";
            } 
        else
            {
            return "Fail";
        }
    }

    public String toString()
    {
        return name + " (" + studentId + ") - Mark: " + mark+ ", Classification: " + getClassification();
    }
}