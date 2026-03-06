package studenttracker;

import java.util.ArrayList;
public class Grademanager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int grade) {
        students.add(new Student(name, grade));
    }

    public double getAverage() {
        int sum = 0;

        for (Student s : students) {
            sum += s.getGrade();
        }

        return (double) sum / students.size();
    }

    public int getHighest() {
        int highest = 0;

        for (Student s : students) {
            if (s.getGrade() > highest) {
                highest = s.getGrade();
            }
        }

        return highest;
    }

    public int getLowest() {
        int lowest = 100;

        for (Student s : students) {
            if (s.getGrade() < lowest) {
                lowest = s.getGrade();
            }
        }

        return lowest;
    }

    public void displayReport() {
        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGrade());
        }

        System.out.println("\nAverage: " + getAverage());
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }
}