package com.mycompany.mvctest;

/**
 * 
 *
 * @since Mar 8, 2018, 9:25:45 AM
 * @author Grzegorz Brodowski
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name){
        model.setName(name);
    }
    
    public String getStudentName(){
        return model.getName();
    }
    
    public void setStudentRollNo(String studentRoll){
        model.setRollNo(studentRoll);
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}