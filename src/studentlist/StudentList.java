/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;
/**
 *
 * @author areeb
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] students = new Student[2];
        Scanner a = new Scanner(System.in);
        for (int i =0;i<students.length;i++){
            System.out.print("Print a student name");
            String name = a.nextLine();
            Student student = new Student(name);
            
            students[i]=student;
        }
        
        System.out.println("Printing the students: ");
        String format = "The stdents name is %s\n";
        
        for (Student student:students){
            System.out.printf(format, student.getName());
        }
    }
    
}
