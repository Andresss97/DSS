/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import Pojos.Patient;
import Pojos.Patient.GENDER;
import Pojos.Test;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author andre
 */
public class QuerysSelect {
    private Conector con;
    
    public QuerysSelect(Conector con) {
        this.con = con;
    }
    
    public Patient selectPatient(String username, String password) throws SQLException {
        Patient patient = new Patient();
        String query = "";
        query = "SELECT * from patient where username = '" + username + "' and password = '" + password + "'";
        PreparedStatement st = this.con.getConnect().prepareStatement(query);
        
        ResultSet set = st.executeQuery();
        
        while(set.next()) {
            patient.setName(set.getString("name"));
            patient.setSurname(set.getString("surname"));
            patient.setAge(set.getInt("age"));
            if(set.getString("GENDER").equals("MALE")) {
                patient.setGender(GENDER.MALE);
            }
            else if(set.getString("GENDER").equals("FEMALE")) {
                patient.setGender(GENDER.FEMALE);
            }
            patient.setUsername(set.getString("username"));
            patient.setPassword(set.getString("password"));
            patient.setID(set.getInt("id"));
        }
        
        patient.setTests(this.selectTestsByPatient(patient));
                
        set.close();
        st.close();
        
        return patient;
    }
    
    public List<Test> selectTestsByPatient(Patient patient) throws SQLException {
        List<Test> tests = new ArrayList();
        String query =  "SELECT * from test where IDPATIENT = '" + patient.getID() + "'";
        PreparedStatement st = this.con.getConnect().prepareStatement(query);
        
        ResultSet set = st.executeQuery();
        
        while(set.next()) {
            Test test = new Test();
            test.setQuestion_1(set.getInt("question1"));
            test.setQuestion_2(set.getString("question2"));
            test.setQuestion_3(set.getString("question3"));
            test.setQuestion_4(set.getString("question4"));
            test.setQuestion_5(set.getString("question5"));
            test.setQuestion_6(set.getString("question6"));
            test.setQuestion_7(set.getString("question7"));
            test.setQuestion_8(set.getString("question8"));
            test.setQuestion_9(set.getString("question9"));
            test.setQuestion_10(set.getString("question10"));
            test.setQuestion_11(set.getString("question11"));
            test.setQuestion_12(set.getString("question12"));
            tests.add(test);
        }
        
        set.close();
        st.close();
        return tests;
    }
}
