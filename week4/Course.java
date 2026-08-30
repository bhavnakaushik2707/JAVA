/*
65. TASK 6 - COURSE ENROLLMENT
Required filename: CourseEnrollment.java
Create a Course class and a public CourseEnrollment driver.
Course requirements:
- course code, title, capacity, and enrolled count
- constructor establishes a positive capacity and zero enrollment
- boolean enroll()
- boolean withdraw()
- boolean isFull()
- int getAvailableSeats()
- no direct setter for enrolled count
- readable toString()
Test empty, one-seat-remaining, full, over-enrollment, withdrawal, and
withdrawal from an empty course.
*/
public class Course {
    private String course_code;
    private String title;
    private int capacity;
    private int enrolled_count;

    public Course(String course_code,String title,int capacity)
    {
        this.course_code = course_code;
        this.title = title;
        if (capacity > 0) {
            this.capacity = capacity;
        }
        else
            {
            this.capacity =1;
        }
        enrolled_count = 0;
    }

    public boolean enroll() {

        if (enrolled_count <capacity)
            {
            enrolled_count++;
            return true;
        }
        return false;
    }
    public boolean withdraw() {
        if (enrolled_count > 0) {
            enrolled_count--;
            return true;
        }
        return false;
    }
    public boolean isFull(){
        return enrolled_count == capacity;
    }

    public int getAvailableSeats() {
        return capacity-enrolled_count;
    }

    public String getCourseCode() {
        return course_code;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledCount() {
        return enrolled_count;
    }

    public String toString()
    {
        return "course=" + course_code+ ",Title=" + title+ ", Enrolled= " + enrolled_count+ ",Available Seats= "+getAvailableSeats();
    }
}
