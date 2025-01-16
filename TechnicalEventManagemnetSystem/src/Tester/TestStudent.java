package Tester;

import java.util.Scanner;
import Client.Student;
import RunTimeExceptions.InvalidEventTypeException;
import RunTimeExceptions.StudentNotFoundException;
import RunTimeExceptions.StudentAlreadyExistsException;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[10];
        int index = 0;

        stu[index++] = new Student(1, "rushi", 23, "cse", "sport");
        stu[index++] = new Student(2, "om", 23, "b com", "cultural");
        stu[index++] = new Student(3, "harry", 23, "bsc", "sport");

        while (true) {
            System.out.println("----Welcome To College Events----");
            System.out.println("\t 1: Register for event");
            System.out.println("\t 2: Filter students by event type");
            System.out.println("\t 3: Filter students by name");
            System.out.println("\t 4: Count students for specific event");
            System.out.println("\t 5: Display all students");
            System.out.println("\t 6: Exit");
            System.out.println("----------------------------------------------------------------------");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter your student ID: ");
                    int idcheck = sc.nextInt();
                    boolean idexists = false;

                    for (Student s : stu) {
                        if (s != null && s.getStudentid() == idcheck) {
                            idexists = true;
                            throw new StudentAlreadyExistsException("ID already exists: " + idcheck);
                        }
                    }

                    if (!idexists) {
                        if (index < stu.length) {
                            System.out.print("Enter student details (name, age, stream, event type): ");
                            stu[index++] = new Student(idcheck, sc.next(), sc.nextInt(), sc.next(), sc.next());
                            System.out.println("Student registered successfully.");
                        } else {
                            System.out.println("Array is full; cannot add new student.");
                        }
                    }
                } else if (choice == 2) {
                    System.out.print("Enter event type to filter by: ");
                    String eventtype = sc.next();
                    boolean found = false;

                    for (Student s : stu) {
                        if (s != null && s.getEventtpe().equalsIgnoreCase(eventtype)) {
                            System.out.println(s);
                            found = true;
                        }
                    }

                    if (!found) {
                        throw new InvalidEventTypeException("Event type not found: " + eventtype);
                    }
                } else if (choice == 3) {
                    System.out.print("Enter student name to filter by: ");
                    String studentname = sc.next();
                    boolean found = false;

                    for (Student s : stu) {
                        if (s != null && s.getStuname().equalsIgnoreCase(studentname)) {
                            System.out.println(s);
                            found = true;
                        }
                    }

                    if (!found) {
                        throw new StudentNotFoundException("Student with name '" + studentname + "' not found.");
                    }
                } else if (choice == 4) {
                    System.out.print("Enter event type to count: ");
                    String eventtype = sc.next();
                    int count = 0;

                    for (Student s : stu) {
                        if (s != null && s.getEventtpe().equalsIgnoreCase(eventtype)) {
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("No students found for event type: " + eventtype);
                    } else {
                        System.out.println("Total students for event type '" + eventtype + "': " + count);
                    }
                } else if (choice == 5) {
                    for (Student s : stu) {
                        if (s != null) {
                            System.out.println(s);
                        }
                    }
                } else if (choice == 6) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
