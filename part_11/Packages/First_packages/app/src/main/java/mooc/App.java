/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;

public class App {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();

        new ApplicationLogic(ui).execute(3);
    }
}