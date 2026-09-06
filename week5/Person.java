/*58. APPLICATION 2 - CAMPUS REGISTRY
-----------------------------------

Required filename: CampusManagementApp.java

Purpose:

Build a campus application in which a driver delegates storage, searching,
and reporting to a separate registry object. The registry manages different
kinds of Person objects through one polymorphic array.

Common evidence required in every solution:

- An abstract Person base class with private common state.
- A Student subclass containing an int[] relevant to student performance.
- At least one other Person subclass chosen by the student. Examples include
    Instructor, Administrator, Librarian, Researcher, or Coach.
- Valid constructors that use super(...).
- At least one abstract Person method implemented differently by every
    concrete subclass using @Override.
- A useful toString() implementation in the hierarchy.
- A separate CampusRegistry class containing a private Person[] and a size or
    count field.
- The CampusRegistry constructor establishes the array capacity.
- CampusRegistry provides an operation that receives a Person reference and
    adds it when space is available.
- CampusRegistry provides at least two additional array-processing operations
    chosen from the feature list below.
- At least one registry loop invokes overridden behavior through Person
    references.
- One safe instanceof check and downcast to use subtype-specific behavior.
- CampusManagementApp creates the objects and calls CampusRegistry methods;
    it must not directly manage the Person[] or contain all report logic.
- At least five mixed Person objects are processed.

Choose any two CampusRegistry operations:

- search for a person using a String field
- count people by runtime type
- calculate a summary from Student int[] data
- find a Student with a highest or lowest result
- produce a summary for one selected campus category
- remove or replace an object while preserving valid array contents

Student design choices:

- the second Person subtype, and any additional subtype
- common and subtype-specific fields beyond the minimum above
- the abstract method name and return type
- subtype-specific behavior
- which two registry operations to implement
- registry method names, return values, helper methods, and output format

Expected object interaction:

    CampusManagementApp -> CampusRegistry -> Person[]
                                           -> overridden Person behavior

The marker will look for inheritance, constructor chaining, encapsulation,
runtime dispatch, and genuine delegation from the driver to CampusRegistry.
The registry must call methods on Person objects rather than exposing its
private array to the driver. A specific output layout is not required.


*/
class Person
{
    private String name;
    private String id;    
    Person(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    String GetName()
    {
        return name;
    }

    String GetId()
    {
        return id;
    }

    void GetDetails()
    {
        System.out.println("Name:" + name);
        System.out.println("id:" + id);
    }
    @Override
    public String toString()
    {
    return "Name: " + name + ", Id: " + id;
}
    void Display(String name)
    {
        System.out.println("name of person:"+name);
    }
    void displayInfo(String name, String id)
    {
        System.out.println("name of person:"+name);
        System.out.println("person idd:"+id);
    }
}


class Student extends Person
{
    private int[] marks;
    Student(String name,String id, int[]marks)
    {
        super(name,id);
        this.marks =marks;
    }

    double CalcAverage()
    {
        if(marks.length== 0)
            {
            return 0;
             }

        int totalMarks=0;

        for (int i = 0; i <marks.length; i++)
            {
            totalMarks+= marks[i];
        }

        return (double)totalMarks/marks.length;
    }
    @Override
    void GetDetails()
    {
        System.out.println("student name:"+GetName());
        System.out.println("student id:" +GetId());
        System.out.println("average marks:" +CalcAverage());
    }
}
class Instructor extends Person
{
    private String subject;

    Instructor(String name,String id, String subject )
    {
        super(name, id);
        this.subject= subject;
    }

    @Override
    void GetDetails()
    {
        System.out.println("instructor name:"+ GetName());
        System.out.println("instructor id:" + GetId());
        System.out.println("subject:"+ subject);
    }
}
class CampusRegistry
{
    private Person[]members;
    private int total;
    CampusRegistry(int capacity)
    {
        members=new Person[capacity];
        total=0;
    }
    void RegisterPerson(Person person)
    {

        if (total <members.length)
            {
            members[total] =person;
            total++;
        }
    }

    void DisplayAll() {

        for (int i = 0; i < total; i++) {
            members[i].GetDetails();
            System.out.println();
        }
    }

    void findPerson(String name) {

        for (int i = 0; i < total; i++)
            {
                if (members[i].GetName().equals(name))
                    {
                        members[i].GetDetails();
                        return;
            }
        }

        System.out.println("not found");
    }

    void showStudentAverages()
    {
        for (int i = 0; i < total; i++)
            {
                if (members[i] instanceof Student)
                    {
                        Student student = (Student) members[i];
                        System.out.println("student: " + student.GetName());
                        System.out.println("average marks:"+ student.CalcAverage());
            }
        }
    }
}
