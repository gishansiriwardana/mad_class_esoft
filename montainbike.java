/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author ESOFT
 */
public class montainbike extends bicycle{
    
    int seatHeight;
    
    public montainbike(int seatHeight,int startSpeed, int startGear) 
    {
        super(startSpeed, startGear);             
        this.seatHeight = seatHeight;
        
    }
    
    public void seatHeight(int newValue)
    {
        seatHeight = newValue;
    }
    
    @Override public String print()
    {
        return (super.print()+ " seat height is = " + seatHeight);
    }
}
