package com.mycompany.poepart1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class POEPART1 {

    //Here we are declaring the variables
    public static String username;
    public static String password;
    public static String firstname;
    public static String lastname;

    public static void main(String[] args) {
      
        JOptionPane.showMessageDialog(null, "We welcome you to the registration and login platform");
        registerUser();
        JOptionPane.showMessageDialog(null, "Registration successful");

        boolean loggedIn = loginUserDetails();
        if (loggedIn ) {
            JOptionPane.showMessageDialog(null, "Login was not successful");
        } else {
            JOptionPane.showMessageDialog(null, "Login was successful, Welcome");
        }
    }

    public static void registerUser() {
        boolean validUsername = false;
        while (!validUsername) {
            //This is a condition for a username
            username = JOptionPane.showInputDialog("Please enter username");
            validUsername = isValidUsername(username);
            if (!validUsername) {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.");
            } else {
                JOptionPane.showMessageDialog(null, "Username successfully captured");
            }
        }

        boolean validPassword = false;
        while (!validPassword) {
            password = JOptionPane.showInputDialog("Please enter password");
            validPassword = checkPasswordComplexity(password);
            if (!validPassword) {
                //This is a condition fo a password
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, numbers, letters, and a special character.");
            } else {
                JOptionPane.showMessageDialog(null, "Password successfully captured");
            }
        }
        //Below are the details of a user
        String firstname = JOptionPane.showInputDialog("Please enter firstname:");
        String lastname = JOptionPane.showInputDialog("Please enter lastname:");
    }

    public static boolean loginUserDetails() {
        String inputUsername = JOptionPane.showInputDialog("Please enter username");
        String inputPassword = JOptionPane.showInputDialog("Please enter password");
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
    //Password validation
    public static boolean checkPasswordComplexity(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&*+=]).{8,}$");
         Matcher matcher = pattern.matcher(password);
        return pattern.matcher(password).matches();
    }

    public static boolean isValidUsername(String username) {
        return username.length() <= 5 && username.contains("_");
    }
}


   
   


    
       
   



    
    




    
    
