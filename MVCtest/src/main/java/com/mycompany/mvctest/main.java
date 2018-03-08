package com.mycompany.mvctest;

/**
 * 
 *
 * @since Mar 8, 2018, 9:41:03 AM
 * @author Grzegorz Brodowski
 */
public class main {
    public static void main(String[] args) {
        Model model=new Model();
        View view =new View();
        Controller controller=new Controller(model, view);
        
        model.setName("marek");
        model.setRollNo("22");
        
        controller.updateView();
    }
}