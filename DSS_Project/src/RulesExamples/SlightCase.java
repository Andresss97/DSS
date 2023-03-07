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
public class SlightCase {
    public static void main(String args[]) {
        Test test = new Test();
        test.setQuestion_1(36);
        test.setQuestion_2("no");
        test.setQuestion_3("no");
        test.setQuestion_4("no");
        test.setQuestion_5("yes");
        test.setQuestion_6("no");
        test.setQuestion_7("no");
        test.setQuestion_8("no");
        test.setQuestion_9("no");
        test.setQuestion_10("yes");
        test.setQuestion_11("no");
        test.setQuestion_12("no");
        
        test.calculateScore();
        
        ExpertSystem ex = new ExpertSystem();
        
        ex.executeRules(test);
        
        System.out.append(test.getDroolsAnswer());
    }
}
