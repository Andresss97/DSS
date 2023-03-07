/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RulesExamples;

import Drools.ExpertSystem;
import Pojos.Test;

/**
 *
 * @author Andrés de Pereda Cru
 */
public class SevereCase {
    public static void main(String args[]){
        Test test = new Test();
        test.setQuestion_1(39);
        test.setQuestion_2("yes");
        test.setQuestion_3("yes");
        test.setQuestion_4("no");
        test.setQuestion_5("yes");
        test.setQuestion_6("yes");
        test.setQuestion_7("severe");
        test.setQuestion_8("yes");
        test.setQuestion_9("severe");
        test.setQuestion_10("yes");
        test.setQuestion_11("yes");
        test.setQuestion_12("yes");
        
        test.calculateScore();
        
        ExpertSystem ex = new ExpertSystem();
        
        ex.executeRules(test);
        
        System.out.append(test.getDroolsAnswer());
    }
}
