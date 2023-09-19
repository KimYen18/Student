/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Manager;
import controller.Validation;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author A
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Hoang Thi Kim Yen", "Spring", "java"));
        ls.add(new Student("2", "Ha Thanh Thanh", "Summer", ".net"));
        ls.add(new Student("3", "Duong Hue Duyen", "Summer", "c/c++"));
        int count = 3;
        //loop until user want to exit program
        while (true) {
            //Show menu option
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDelete(count, ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}
