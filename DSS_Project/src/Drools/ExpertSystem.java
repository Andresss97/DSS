/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author Andrés de Pereda Cru
 */
public class ExpertSystem {
    private KieServices ks;
    private KieContainer kc;
    
    public ExpertSystem() {
        this.ks = KieServices.Factory.get();
        this.kc = ks.getKieClasspathContainer();
    }
    
    public void executeRules() {
        KieSession ksession = kc.newKieSession("EpilepsySession");
    }
}
