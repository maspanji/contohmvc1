package id.appl.main;

import id.appl.model.Model;
import id.appl.view.ControllerView;

/**
 *
 * @author panji
 */
public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        ControllerView cv = new ControllerView(model);
        model.attach(cv);        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cv.setVisible(true);
            }
        });
    }
}
