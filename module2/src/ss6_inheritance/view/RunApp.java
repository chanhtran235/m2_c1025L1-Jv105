package ss6_inheritance.view;

import ss6_inheritance.controller.CodegymController;

public class RunApp {
    public static void main(String[] args) {
        CodegymController controllerCodegym = new CodegymController();
        controllerCodegym.displayMenu();
    }
}
