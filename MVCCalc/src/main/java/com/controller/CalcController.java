package com.controller;

import com.model.CalcModel;
import com.view.CalcForm;

/**
 * 
 *
 * @since Mar 7, 2018, 11:11:26 PM
 * @author Grzegorz Brodowski
 */
public class CalcController {
    private CalcModel model=new CalcModel();
    private CalcForm view=new CalcForm();

    public CalcController(CalcModel model,CalcForm view) {
        this.model=model;
        this.view=view;
        view.setVisible(true);
        view.getjButtonCalculation().addActionListener(e->{
            oblicz();
        });
    }
    
    public int oblicz(){
        model.setNum1(view.getNum1Value());
        model.setNum2(view.getNum2Value());
        
        int solution=model.getNum1()+model.getNum2();
        
        view.setjLabelSolution(solution);
        return model.getNum1()+model.getNum2();
    }
    
    
    
    
    
    

}