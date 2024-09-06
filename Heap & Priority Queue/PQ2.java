import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    int mark;
    String name;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Studen " + name + " scored " + mark + " marks";
    }

    @Override
    public int compareTo(Student that) {
        if (this.mark == that.mark) {
            return this.name.compareTo(that.name);
        }
        return this.mark - that.mark;
        // return that.mark-this.mark; this will make max PQ

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student that = (Student) obj;
            if (this.mark == that.mark && (this.name.compareTo(that.name)) == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

public class PQ2 {
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.offer(new Student("Manish", 99));
        students.offer(new Student("Rahul", 90));
        students.offer(new Student("Subhash", 93));
        students.offer(new Student("Lucky", 90));
        System.out.println(students.peek());
        System.out.println(students.contains(new Student("Manish", 99)));
        System.out.println(students.contains(new Student("Manish", 100)));
    }
}
