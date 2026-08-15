/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trinity;

/**
 *
 * @author CompLabC209-PC8
 */
public class Trinity {

    public static void main(String[] args) {
        displayGreetings();
        displayInfo();
        
        
      
    }
   
    static void displayGreetings(){
        System.out.println("------------------------------");  
        System.out.println("--- Gate---");
        System.out.println("------------------------------");
        lineBreak();
    }
    static void displayInfo(){
        displayCharacter();
        displayClass();
    }
    static void displayCharacter(){
        System.out.println("========Character========");
        lineBreak();
        System.out.println("Name: Zane");
        lineBreak();
        System.out.println("Backstory: Zane was once an ordinary child like everyone else, Until he got hit by an irresponsible driver with a fully charged and wide body kitted ebike. \n The driver of the fully charged and widebodykitted ebike ran after he hit Zane! So his dad was forced to help Zane with his unfinished mech/robot parts in his secret garage which noone knew about.\n After a week of nonstop working Zane was all well again, but with superhuman cyborg abilities. His current goal is to end all fully charged ebikes from hitting innocent people.\n He turns ebike victims into Cyborgs to further help his cause. ");
        lineBreak();
        System.out.println("Race: Cyborg");
        lineBreak();
        System.out.println("Race Description: Cybernetic organism consisting of both biological and artificial mechanical parts.");
        lineBreak();
    
    }         
    static void displayClass(){
        System.out.println("========Class========");
        lineBreak();
        System.out.println("Class: Engineer");
        lineBreak();
        System.out.println("Class Description: Technical specialist who excels at designing, building, and modifying mechanical devices, gadgets and cybernetic systems.");
        lineBreak();
        System.out.println("Unique Trait: Absolute Perfection ");
        lineBreak();       
        System.out.println("Trait Description: When it comes to his field of knowledge he has gained an immeasurable amount of knowledge regarding anything related to machines, electronics,etc.");
        lineBreak();
        displaySkills();
    } 
    static void displaySkills(){
        System.out.println("========Skills========");
        lineBreak();
        overClock();
        empBurst();
        neuralHack();
        backupCore();
    }
    
    static void overClock(){
        System.out.println("#Overclock");
        System.out.println("Effect: Boosts attack speed and movement speed but drains HP in return.");
        lineBreak();
    } 
    static void empBurst(){
        System.out.println("# EMP Burst");
        System.out.println("Effect: Emits an electromagnetic pulse that stuns enemies for a few seconds.");
        lineBreak();
    } 
    static void neuralHack(){
        System.out.println("#Neural Hack");
        System.out.println("Effect: Takes control of any machine.");
        lineBreak();   
    }  
    static void backupCore(){
        System.out.println("#Backup Core");
        System.out.println("Effect: When HP drops to zero, a secondary power core activates, reviving the cyborg once with partial health.");  
        lineBreak();       
    }  

    static void lineBreak(){
        System.out.println("");
        
    }
    
    
}
