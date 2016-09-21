package id.appl.model;

import id.appl.view.IControllerView;

public class Model implements IModel{
    
    IControllerView cv;
    String textHello;
    
    @Override
    public void attach(IControllerView cv){
        this.cv = cv;
    }
    
    @Override
    public void sendNotification(){
        cv.updateView();
    }
    
    public void createText(String input){
        this.textHello = "Hello, "+input+" !";
        sendNotification();
    }

    public String getTextHello() {
        return textHello;
    }
       
}