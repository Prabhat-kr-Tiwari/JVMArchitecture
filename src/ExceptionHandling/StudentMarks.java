package ExceptionHandling;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    private int rollNumber;
    private int marks;

    public Student(int rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student(1, 85);
        students[1] = new Student(2, 92);
        students[2] = new Student(3, 78);
        students[3] = new Student(4, 105); // Invalid mark
        students[4] = new Student(5, -10); // Invalid mark
        students[5] = new Student(6, 90);
        students[6] = new Student(7, 65);
        students[7] = new Student(8, 75);
        students[8] = new Student(9, 80);
        students[9] = new Student(10, 95);
        try{
            for (int i = 0; i < 10; i++) {
                if (students[i].getMarks()<0||students[i].getMarks()>100)
                {
                    throw new InvalidMarkException("Marks is either less than 0 or greater than 100");
                }
                
            }
            
        } catch (InvalidMarkException e) {
            System.out.println(e);
        }


        // Print student marks
        for (Student student : students) {
            if (student != null) {
                System.out.println("Roll Number: " + student.getRollNumber() + ", Marks: " + student.getMarks());
            }
        }
    }
}

