package com.systechafrica.controlflow;

import java.util.logging.Logger;

public class ControlFlow {
    private static final Logger LOGGER = Logger.getLogger(ControlFlow.class.getName());

    public void ifelseStatement() {
        int maths = 35;
        char grade;

        if (maths >= 70) {
            grade = 'A';
             LOGGER.info("Student grade: " + grade);
        }
        // TODO: add conditions here to assign grade variable as expected
        else if (maths >=60 && maths <= 69) {
          grade = 'B';
          LOGGER.info("Student grade: " + grade); // + grade
        }
        else if (maths >=50 && maths <=59){
            grade = 'C';
            LOGGER.info("Student grade: " + grade);
        }
        else if (maths >=40 && maths <=49){
            grade = 'D';
            LOGGER.info("Student grade: " + grade);
        }
        else{
            grade = 'E';
            LOGGER.info("Student grade: " + grade + "  1F622 Take a Retake or a Supplementary Exam");  
        }
        
    }
    public void switchStatement(){
        String day = "Unknown";
        switch(day){
            case "MONDAY":
                LOGGER.info("Monday working day");
                break;
            case "TUESDAY":
                LOGGER.info("Tuesday working day");
                break;
            case "WEDNESDAY":
                LOGGER.info("Wednesday  working day");
                break;
            case "THURSDAY":
                LOGGER.info("Thursday working day");
                break;
            case "FRIDAY":
                LOGGER.info("Friday working day");
                break;
            case "SATURDAY":
            case "SUNDAY":
                LOGGER.info("Sherehe");
                break;          
            default:
                LOGGER.info("Please specify a valid day");

        }



    }
    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        app.ifelseStatement();
        // app.switchStatement();

    }
}