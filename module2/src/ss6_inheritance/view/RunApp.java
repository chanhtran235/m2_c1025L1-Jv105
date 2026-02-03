package ss6_inheritance.view;

import ss6_inheritance.controller.StudentController;

public class RunApp {
    public static void main(String[] args) {

        StudentController studentController = new StudentController();
        studentController.displayMenu();
    }
}
