/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.variables;

/**
 *
 * @author Asus
 */
class CustomCheckedException extends Exception {     
    public CustomCheckedException(String message) {
        super(message);     
    } 
} // Custom unchecked exceptionclass 
class CustomUncheckedException extends RuntimeException {     
    public CustomUncheckedException(String message) {         
        super(message);
    }
}    



public class ExceptionHandlingWithoutIO {  
    public static void main(String[] args) {   
        try {             // Simulate some operations           
            int result = performOperations("5");           
            // Display the result          
            System.out.println("Result: " + result);  
        } 
        catch (CustomUncheckedException e) {       
            System.out.println("Caught CustomUncheckedException: " + e.getMessage());     
        } catch (ArithmeticException e) {            
            System.out.println("Caught ArithmeticException: " + e.getMessage());      
        } catch (Exception e) {           
            System.out.println("Caught generic Exception: " + e.getMessage());       
        } finally {          
            System.out.println("Inside finally block: Cleanup code or final operations.");         }     }

    private static int performOperations(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}