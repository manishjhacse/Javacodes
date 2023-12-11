import java.util.ArrayList;
import java.util.Collections;

public class jobScheduling {
    static class job {
        char id;
        int deadline, marks;

        public job() {
        }

        public job(char id, int deadline, int marks) {
            this.id = id;
            this.deadline = deadline;
            this.marks = marks;
        }

    }

    static void printJobSequence(ArrayList<job> arr, int maxDeadline) {
        int n = arr.size();
        // sort the job on basis of marks(non increasing order)
        Collections.sort(arr, (a, b) -> b.marks - a.marks);
        // create array to track booked slots
        boolean result[] = new boolean[maxDeadline];
        // create array to store the job
        char jobs[] = new char[maxDeadline];
        // start storing job
        for (int i = 0; i < n; i++) {
            // check available time from the last deadline time
            for (int j = Math.min(maxDeadline - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (result[j] == false) {
                    result[j] = true;
                    jobs[j] = arr.get(i).id;
                    break;
                }
            }
        }
        for (char id : jobs) {
            if (id == '\0') {
                System.out.print("NA  ");
            } else {
                System.out.print(id + "  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<job> arr = new ArrayList<>();
        arr.add(new job('1', 5, 55));
        arr.add(new job('2', 2, 65));
        arr.add(new job('3', 7, 75));
        arr.add(new job('4', 3, 60));
        arr.add(new job('5', 2, 70));
        arr.add(new job('6', 1, 50));
        arr.add(new job('7', 4, 85));
        arr.add(new job('8', 5, 68));
        arr.add(new job('9', 3, 45));
        System.out.println("job sequence to get the maximum marks");

        printJobSequence(arr, 7);

    }
}
