/*59. APPLICATION 3 - PAYROLL MANAGEMENT
--------------------------------------

Required filename: PayrollManagementApp.java

Purpose:

Build a payroll system that combines an interface, an abstract employee class,
concrete employee types, and a separate processor object that manages an array
of interface references.

Common evidence required in every solution:

- A Payable interface containing a method that returns a payment amount.
- An abstract Employee class that implements Payable and protects common
    employee state.
- At least two concrete Employee subclasses chosen by the student. Examples
    include SalariedEmployee, HourlyEmployee, CommissionEmployee, or
    ContractEmployee.
- One non-Employee class that also implements Payable. Examples include
    Invoice, ExpenseClaim, SupplierBill, or ServiceCharge.
- Different payment calculations in the implementation classes.
- Valid constructors, super(...), and @Override.
- A separate PayrollProcessor class containing a private Payable[] and a size
    or count field.
- The PayrollProcessor constructor establishes the array capacity.
- PayrollProcessor provides an operation that receives a Payable reference
    and adds it when space is available.
- PayrollProcessor calculates the total payment by calling calculatePayment()
    polymorphically on its stored objects.
- PayrollProcessor provides at least two additional array-processing
    operations chosen from the feature list below.
- One safe instanceof use inside an appropriate processor operation.
- A useful textual representation of payment objects.
- PayrollManagementApp creates payment objects and calls PayrollProcessor
    methods; it must not directly manage the Payable[] or calculate the total.
- At least five mixed Payable objects are processed.

Choose any two PayrollProcessor operations:

- find the largest or smallest payment
- count Employee and non-Employee payment objects
- search for an employee or payment using a String identifier
- calculate a total for one selected payment category
- safely display Employee-specific information
- add another Employee or non-Employee Payable type

Student design choices:

- concrete Employee types and the non-Employee Payable type
- payment formulas and supporting fields
- additional Payable methods, if any
- the common Employee fields beyond an identifier
- which two processor operations to implement
- processor method names, return values, helper methods, and displayed text

Expected object interaction:

    PayrollManagementApp -> PayrollProcessor -> Payable[]
                                               -> calculatePayment()

The marker will look for one interface, an abstract Employee class, at least
two employee implementations, one unrelated Payable implementation, a mixed
Payable[], different payment behavior, runtime dispatch, and genuine
delegation from the driver to PayrollProcessor. The processor must call
methods on Payable objects rather than exposing its private array. Exact class
names for the selected concrete types are not prescribed.

*/
class Employee
{
    private String name;
    private int EmployeeId;

    Employee(String name, int EmployeeId)
    {
        this.name = name;
        this.EmployeeId = EmployeeId;
    }

    String GetName()
    {
        return name;
    }

    int GetId()
    {
        return EmployeeId;
    }

    double CalcSalary(){
        return 0;
    }

    double CalcSalary(double amount)
    {
        return amount;
    }

    void DisplayDetails()
    {
        System.out.println("employee name:" +name);
        System.out.println("employee id:" +EmployeeId);
    }
}

class SalariedEmployee extends Employee
{
    private double salary;
    SalariedEmployee(String name, int employeeId, double salary)
    {
        super(name, employeeId);
        if (salary > 0) 
            {
                this.salary = salary;
            }
        else
            {
            this.salary = 1;
            }
    }

    @Override
    double CalcSalary()
    {
        return salary;
    }

    @Override
    void DisplayDetails()
    {
        System.out.println("name:" + GetName());
        System.out.println("id:" + GetId());
        System.out.println("monthly salary:" + CalcSalary());
    }
}

class HourlyEmployee extends Employee
{
    private double WorkingHours;
    private double rate;

    HourlyEmployee(String name, int employeeId,double WorkingHours, double rate)
    {
        super(name, employeeId);
        if (WorkingHours > 0)
            {
            this.WorkingHours =WorkingHours;
        }
        else
            {
            this.WorkingHours= 1;
        }
        if(rate> 0)
            {
                this.rate = rate;
            }
        else
        {
            this.rate = 1;
        }
    }

    @Override
    double CalcSalary()
    {
        return WorkingHours * rate;
    }

    @Override
    void DisplayDetails()
    {
        System.out.println("name: " + GetName());
        System.out.println("id:" + GetId());
        System.out.println("working hours: " + WorkingHours);
        System.out.println("rate: " + rate);
        System.out.println("salary: " + CalcSalary());
    }
}

class CommissionEmployee extends Employee
{
    private double TotalSales;
    private double commission;

    CommissionEmployee(String name, int EmployeeId,double TotalSales, double commission)
    {
        super(name, EmployeeId);
        this.TotalSales = TotalSales;
        this.commission = commission;
    }

    @Override
    double CalcSalary()
    {
        return TotalSales*commission/100;
    }

    @Override
    void DisplayDetails()
    {
        System.out.println("name: "+ GetName());
        System.out.println("id: " + GetId());
        System.out.println("total sales: " + TotalSales);
        System.out.println("commission IS" + commission + "%");
        System.out.println("salary:" + CalcSalary());
    }
}

class PayrollProcessor {
    private Employee[]EmployeeList;
    private int count;

    PayrollProcessor(int capacity)
    {
        EmployeeList = new Employee[capacity];
        count = 0;
    }

    void addEmployee(Employee employee)
    {
        if (count < EmployeeList.length) 
            {
            EmployeeList[count] = employee;
            count++;
        }
    }

    void ShowEmployees()
    {
        for (int i= 0; i < count; i++)
            {
            EmployeeList[i].DisplayDetails();
            System.out.println();
        }
    }

    void FindEmployee(String name){
        for (int i =0; i < count; i++)
            {
            if (EmployeeList[i].GetName().equalsIgnoreCase(name))
                {
                EmployeeList[i].DisplayDetails();
                return;
            }
        }

        System.out.println("employee nt found");
    }
    double GetTotalSalary()
    {
        double total = 0;
        for (int i =0; i < count; i++)
            {
            total += EmployeeList[i].CalcSalary();
        }

        return total;
    }
}
