/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Pojos.Patient;
import Pojos.Patient.GENDER;
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
}
