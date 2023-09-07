package Student;

import java.util.*;

public class CrudOperation {
    public static void main(String[] args) {
        List<student> s = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.Exit");
            System.out.print("Enter your choice : ");
             ch = sc1.nextInt();
            switch (ch) {
                //Insert Operation
                case 1:
                    System.out.print("Enter Student Roll No : ");
                    int sno = sc1.nextInt();
                    System.out.print("Enter Student Name: ");
                    String sName = sc1.next();
                    System.out.print("Enter Student Subject : ");
                    String sSubject = sc1.next();
                    s.add(new student(sno, sName, sSubject));
                    System.out.println("---------------------");
                    System.out.println("Record Inserted Successfully");
                    System.out.println("---------------------");
                    break;
                //Display Operation
                case 2:
                    System.out.println("---------------------");
                    Iterator<student> i = s.iterator();
                    while (i.hasNext()) {
                        student s1 = i.next();
                        System.out.println(s1);
                    }
                    System.out.println("---------------------");
                    break;
                //Search Operation
                case 3:
                    boolean found = false;
                    System.out.print("Enter student roll no to Search : ");
                     sno = sc1.nextInt();
                    System.out.println("---------------------");
                    i = s.iterator();
                    while (i.hasNext()) {
                        student s1 = i.next();
                        if (s1.getStudentRollNo() == sno) {
                            System.out.println(s1);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("---------------------");
                    break;
                //Delete Operation
                case 4:
                    found = false;
                    System.out.print("Enter student roll no to Delete : ");
                    sno = sc1.nextInt();
                    System.out.println("---------------------");
                    i = s.iterator();
                    while (i.hasNext()) {
                        student s1 = i.next();
                        if (s1.getStudentRollNo() == sno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Successfully");
                    }
                    System.out.println("---------------------");
                    break;
                //Update Operation
                case 5:
                    found = false;
                    System.out.print("Enter student roll no to Update : ");
                    sno = sc1.nextInt();
                    ListIterator<student> li = s.listIterator();
                    while (li.hasNext()) {
                        student s1 = li.next();
                        if (s1.getStudentRollNo() == sno) {
                            System.out.print("Enter new Name : ");
                            sName = sc1.next();
                            System.out.print("Enter new Subject: ");
                            sSubject = sc1.next();
                            li.set(new student(sno, sName, sSubject));
                            found = true;
                        }
                    }
                    System.out.println("---------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Updated Successfully");
                    }
                    System.out.println("---------------------");
                    break;
                case 6:
                    System.out.println("invalid choice");
                    break;
            }
        }
        while (ch != 0);
    }
}
