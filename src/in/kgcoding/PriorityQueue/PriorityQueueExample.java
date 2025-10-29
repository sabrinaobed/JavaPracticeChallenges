package in.kgcoding.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getStudentGrade() -t1.getStudentGrade();
            }
        });

        queue.offer(new Student("Sabrina",'A'));
        queue.offer(new Student("Obed",'A'));
        queue.offer(new Student("Verdha",'B'));
        queue.offer(new Student("Ayesha",'D'));
        queue.offer(new Student("Zeisha",'C'));

        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("Got %s: \n", queue.poll());
        System.out.printf("Got %s: \n", queue.poll());
        System.out.printf("Got %s: \n", queue.poll());
        System.out.printf("Got %s: \n", queue.poll());
        System.out.printf("Got %s: \n", queue.poll());

    }







    private static class Student{
        private final String studentName;
        private final char studentGrade;

        public Student(String studentName, char studentGrade) {
            this.studentName = studentName;
            this.studentGrade = studentGrade;
        }

        public String getStudentName() {return studentName;}
        public char getStudentGrade() {return studentGrade;}

        @Override
        public String toString() {
            return studentName + ":" + studentGrade;
        }
    }


}
