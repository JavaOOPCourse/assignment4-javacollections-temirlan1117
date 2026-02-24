package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Danya", 3.5));
        students.add(new Student(2, "Nursultan", 1.7));
        students.add(new Student(3, "Ilhan", 3.9));
        students.add(new Student(4, "Iskender", 2.4));
        students.add(new Student(5, "Eldiar", 1.8));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getGpa() < 2.0) {
                it.remove();
            }
        }
        System.out.println("students with GPA < 2.0 were removed.");

    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        if (students.size() == 0) {
            System.out.println("student list is empty.");
            return;
        }

        Student best = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getGpa() > best.getGpa()) {
                best = students.get(i);
            }
        }

        System.out.println("student with highest GPA:" + best);

    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        Student newStudent = new Student(99, "Temirlan", 3.7);

        if (students.size() >= 2) {
            students.add(2, newStudent);
        } else {
            students.add(newStudent);
        }

        System.out.println("new student inserted at index 2.");
    }

    public void printStudents() {
        // TODO: Print using Iterator
        System.out.println("=== students ===");

        if (students.size() == 0) {
            System.out.println("no students.");
            return;
        }

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
