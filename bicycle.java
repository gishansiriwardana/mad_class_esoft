/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author ESOFT
 */
public class bicycle {
    
    int gear;
    int speed;
    
    public bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    
    public void applybreak(int speedDown)
    {
         //apply breake   
        
        speed -= speedDown; 
    }
    
    public void speedup(int speedUp)
    {
        //speed up
        gear += speedUp;
    }
    
    public String print()
    {
        //print statements
        
        return ("speed is = " + speed + " and gear = " + gear);
        
    }
}
