/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Andrés de Pereda Cru
 */
public class Encriptor {
    private MessageDigest md;
    
    public Encriptor() throws NoSuchAlgorithmException {
        this.md = MessageDigest.getInstance("MD5");
    }
    
    public String encrypt(String password) {
        byte[] messageDigest = md.digest(password.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);
        
        return bigInt.toString();
    }
}
