package Navbar;

import Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Navbar {
    static Student students[] = new Student[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        students[0] = new Student(1, "Nguyen Văn A", 18);
        students[1] = new Student(2, "Nguyen Văn A", 5);
        students[2] = new Student(3, "Nguyen Văn A", 18);
        students[3] = new Student(4, "Nguyen Văn A", 10);
        students[4] = new Student(5, "Nguyen Văn A", 20);

        while (true) {
            System.out.println("***************STUDENT MANAGE***************************\n" +
                    "1. Show List Student. \n" +
                    "2. Create Student \n" +
                    "3. Update Student \n" +
                    "4. Delete Student \n" +
                    "5. Sort Student By Age ASC (Tăng Dần).\n" +
                    "6. Exit ");

            System.out.println("Vui lòng chọn: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                        } else {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 2:
// thêm
                    System.out.println("Nhập vào tên sinh viên: ");
                    String studentName = scanner.next();
                    System.out.println("Nhập vào tuổi sinh viên: ");
                    int age = scanner.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            students[i] = new Student(i+1,studentName,age );
                            break;
                        }
                    }

                    break;
                case 3:
                    // sửa
                    System.out.println("Nhập vào id cần sửa: ");
                    int updateId = scanner.nextInt();
                    System.out.println("Nhập lại tên cần sửa:");
                    String updateName = scanner.next();
                    System.out.println("Nhập lại tuổi cần sửa: ");
                    int updateAge = scanner.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                        } else if (updateId - 1 == i) {
                            students[i] = new Student(i, updateName, updateAge);
                        }

                    }
                    break;
                case 4:
                    System.out.println("Nhập vào id cần xóa: ");
                    int deleteId = scanner.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                        } else if (students[i].studentId == deleteId) {
                            students[i] = null;
                        }
                    }
                    break;
                case 5:

                    Student temp;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                        } else {
                            for (int j = i + 1; j < students.length - 1; j++) {
                                if (students[j] == null) {
                                } else {
                                    if (students[i].age > students[j].age) {
                                        temp = students[j];
                                        students[j] = students[i];
                                        students[i] = temp;
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 6:
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại: ");
                    break;
            }
        }
    }


}
