/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Pojos.Patient;
import Pojos.Patient.GENDER;
import Pojos.Test;
import java.sql.*;

/**
 *
 * @author andre
 */
public class QuerysInsert {
    private Conector con;
    
    public QuerysInsert(Conector con) {
        this.con = con;
    }

    public void registerPatient(Patient patient) throws SQLException {
        String query =  "";
        query =  "INSERT into patient (name, surname, age, gender, username, password) values (?,?,?,?,?,?)";
        PreparedStatement st = this.con.getConnect().prepareStatement(query);
        
        st.setString(1, patient.getName());
        st.setString(2, patient.getSurname());
        st.setInt(3, patient.getAge());
        if(patient.getGender().equals(GENDER.FEMALE)) {
            st.setString(4, "FEMALE");
        }
        else {
            st.setString(4, "MALE");
        }
        st.setString(5, patient.getUsername());
        st.setString(6, patient.getPassword());
        
        st.executeUpdate();
        
        st.close();
    }
    
    public void insertTest(Test test, Patient patient) throws SQLException {
        String query = "";
        query = "INSERT into test (question1, question2, question3,question4,"
                + "question5,question6,question7,question8,question9,"
                + "question10,question11,question12, idpatient) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = this.con.getConnect().prepareStatement(query);
        st.setString(1, test.getQuestion_1());
        st.setString(2, test.getQuestion_2());
        st.setString(3, test.getQuestion_3());
        st.setString(4, test.getQuestion_4());
        st.setString(5, test.getQuestion_5());
        st.setString(6, test.getQuestion_6());
        st.setString(7, test.getQuestion_7());
        st.setString(8, test.getQuestion_8());
        st.setString(9, test.getQuestion_9());
        st.setString(10, test.getQuestion_10());
        st.setString(11, test.getQuestion_11());
        st.setString(12, test.getQuestion_12());
        st.setInt(13, patient.getID());
        
        st.executeUpdate();
        
        st.close();
    }
}
