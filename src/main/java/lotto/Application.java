package lotto;

import lotto.controller.Controller;
import lotto.controller.MainController;

public class Application {
    public static void main(String[] args) {
        Controller controller = new MainController();
        controller.init();
        controller.runner();
    }
}
