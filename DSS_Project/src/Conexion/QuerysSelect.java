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
        
        set.close();
        st.close();
        
        return patient;
    }
    
}
