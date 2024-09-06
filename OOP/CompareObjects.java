import java.util.*;

class Student {
    int maxMarks;
    int rollNumber;

    Student(int maxMarks, int rollNumber) {
        this.maxMarks = maxMarks;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        String val = "Roll No. " + this.rollNumber + ", Marks: " + this.maxMarks;
        return val;
    }
}

// making comparable class
class MyStudent implements Comparable<MyStudent> {
    int maxMarks;
    int rollNumber;

    MyStudent(int maxMarks, int rollNumber) {
        this.maxMarks = maxMarks;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        String val = "Roll No. " + this.rollNumber + ", Marks: " + this.maxMarks;
        return val;
    }

    @Override
    public int compareTo(MyStudent that) {
        int mark1 = this.maxMarks;
        int mark2 = that.maxMarks;
        if (mark1 == mark2) {
            return this.rollNumber - that.rollNumber;
        }
        return mark1 - mark2;
    }
}

public class CompareObjects {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(10);
        list.add(51);
        list.add(21);
        list.add(17);
        list.add(15);
        list.add(9);
        CompareObjects obj = new CompareObjects();
        Collections.sort(list);
        obj.display(list);
        // sort on the basis of unit number and if unit number are same then compare the
        // number
        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                // positive return mean swap the numbers
                // negative or 0 means don't swap the numbers
                int u1 = num1 % 10;
                int u2 = num2 % 10;
                if (u1 == u2) {
                    return num1 - num2;
                    // if num1>num2 then return will be positive and numbers will be swapped
                }
                return u1 - u2;
            }
        };
        Collections.sort(list, cmp);
        obj.display(list);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(450, 5));
        students.add(new Student(446, 1));
        students.add(new Student(420, 2));
        students.add(new Student(350, 3));
        students.add(new Student(450, 4));
        // sort student on the basis of marks,if marks are same then on basis of roll
        // no.(increasing order);
        Comparator<Student> comp1 = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int mark1 = s1.maxMarks;
                int mark2 = s2.maxMarks;
                if (mark1 == mark2) {
                    return s1.rollNumber - s2.rollNumber;
                }
                return mark1 - mark2;
            }
        };
        Collections.sort(students, comp1);

        obj.display(students);

        // comparable class object
        ArrayList<MyStudent> myStudents = new ArrayList<>();
        myStudents.add(new MyStudent(450, 5));
        myStudents.add(new MyStudent(446, 1));
        myStudents.add(new MyStudent(420, 2));
        myStudents.add(new MyStudent(350, 3));
        myStudents.add(new MyStudent(450, 4));

        Collections.sort(myStudents);
        obj.display(myStudents);

    }

    public <T> void display(ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            // if (i != list.size() - 1) {
            // System.out.print(",");
            // }
        }
        System.out.println();

    }
}
