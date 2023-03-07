/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojos;

/**
 *
 * @author andre
 */
public class Test {
    private int ID;
    private int question_1;
    private String question_2;
    private String question_3;
    private String question_4;
    private String question_5;
    private String question_6;
    private String question_7;
    private String question_8;
    private String question_9;
    private String question_10;
    private String question_11;
    private String question_12;
    private int score;
    private String droolsAnswer;
    
    public Test() {
        this.question_1 = 0;
        this.question_2 = "";
        this.question_3 = "";
        this.question_4 = "";
        this.question_5 = "";
        this.question_6 = "";
        this.question_7 = "";
        this.question_8 = "";
        this.question_9 = "";
        this.question_10 = "";
        this.question_11 = "";
        this.question_12 = "";
        this.score = 0;
    }
    
    public Test(int score) {
        this.score = score;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuestion_1() {
        return question_1;
    }

    public void setQuestion_1(int question_1) {
        this.question_1 = question_1;
    }

    public String getQuestion_2() {
        return question_2;
    }

    public void setQuestion_2(String question_2) {
        this.question_2 = question_2;
    }

    public String getQuestion_3() {
        return question_3;
    }

    public void setQuestion_3(String question_3) {
        this.question_3 = question_3;
    }

    public String getQuestion_4() {
        return question_4;
    }

    public void setQuestion_4(String question_4) {
        this.question_4 = question_4;
    }

    public String getQuestion_5() {
        return question_5;
    }

    public void setQuestion_5(String question_5) {
        this.question_5 = question_5;
    }

    public String getQuestion_6() {
        return question_6;
    }

    public void setQuestion_6(String question_6) {
        this.question_6 = question_6;
    }

    public String getQuestion_7() {
        return question_7;
    }

    public void setQuestion_7(String question_7) {
        this.question_7 = question_7;
    }

    public String getQuestion_8() {
        return question_8;
    }

    public void setQuestion_8(String question_8) {
        this.question_8 = question_8;
    }

    public String getQuestion_9() {
        return question_9;
    }

    public void setQuestion_9(String question_9) {
        this.question_9 = question_9;
    }

    public String getQuestion_10() {
        return question_10;
    }

    public void setQuestion_10(String question_10) {
        this.question_10 = question_10;
    }

    public String getQuestion_11() {
        return question_11;
    }

    public void setQuestion_11(String question_11) {
        this.question_11 = question_11;
    }

    public String getQuestion_12() {
        return question_12;
    }

    public void setQuestion_12(String question_12) {
        this.question_12 = question_12;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDroolsAnswer() {
        return droolsAnswer;
    }

    public void setDroolsAnswer(String droolsAnswer) {
        this.droolsAnswer = droolsAnswer;
    }
    
    public void calculateScore() {
        //Pregunta 1
        if(this.question_1 >= 36 && this.question_1 <= 37) {
            this.score += 0;
        }
        else if(this.question_1 > 37 && this.question_1 <= 38){
            this.score += 1;
        }
        else if(this.question_1 > 38 && this.question_1 <= 39) {
            this.score += 2;
        }
        else {
            this.score += 3;
        }
        //Pregunta 2
        if(this.question_2.equals("yes")) {
            this.score += 1;
        }
        else{
            this.score += 0;
        }
        //Pregunta 3
        if(this.question_3.equals("yes")) {
            this.score += 1;
        }
        else{
            this.score += 0;
        }
        //Pregunta 4
        if(this.question_4.equals("yes")) {
            this.score += 2;
        }
        else{
            this.score += 0;
        }
        //Pregunta 5
        if(this.question_5.equals("yes")) {
            this.score += 2;
        }
        else{
            this.score += 0;
        }
        //Pregunta 6
        if(this.question_6.equals("yes")) {
            this.score += 2;
        }
        else {
            this.score += 0;
        }
        //Pregunta 7
        if(this.question_7.equals("severe")) {
            this.score+= 3;
        }
        else if(this.question_7.equals("moderate")){
            this.score += 2;
        }
        else if(this.question_7.equals("slight")) {
            this.score += 1;
        }
        else {
            this.score += 0;
        }
        //Pregunta 8
        if(this.question_8.equals("yes")) {
            this.score += 3;
        }
        else{
            this.score += 0;
        }
        //Pregunta 9
        if(this.question_9.equals("severe")) {
            this.score += 3;
        }
        else if(this.question_9.equals("moderate")) {
            this.score += 2;
        }
        else if(this.question_9.equals("slight")){
            this.score += 1;
        }
        else {
            this.score += 0;
        }
        //Prgeunta 10
        if(this.question_10.equals("yes")) {
            this.score += 3;
        }
        else{
            this.score += 0;
        }
        //Pregunta 11
        if(this.question_11.equals("yes")) {
            this.score += 1;
        }
        else{
            this.score += 0;
        }
        //Pregunta 12
        if(this.question_12.equals("yes")) {
            this.score += 3;
        }
        else{
            this.score += 0;
        }
    }
}
