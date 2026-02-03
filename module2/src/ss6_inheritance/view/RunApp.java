package ss6_inheritance.view;

import ss6_inheritance.controller.ControllerCodegym;
import ss6_inheritance.controller.StudentController;

public class RunApp {
    public static void main(String[] args) {
        ControllerCodegym controllerCodegym = new ControllerCodegym();
        controllerCodegym.displayMenu();
    }
}
