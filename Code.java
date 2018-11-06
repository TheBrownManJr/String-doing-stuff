/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author abram
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
        System.out.println("You need to fill out your job app to start what is your name?");
        String name = userinput.nextLine();
        
        System.out.println("What's your Age");
        String Age = userinput.nextLine();
        System.out.println("name:"+name);
        System.out.println("Age:"+Age.trim());
        
        System.out.println("Have you had a job before");
        String input = userinput.nextLine();
        if(input.contains("Y")) {
            System.out.println("good for you");
        } if {
            System.out.println("what you doing with your life");
        }
        
        System.out.println("What was your Job");
        String Job = userinput.nextLine();
        System.out.println("name:"+name);
        System.out.println("Age:"+Age);
        System.out.println("Job:"+Job.trim());
        
        System.out.println("How Many Years Have You worked");
        String Years = userinput.nextLine();
        //System.out.println(Years.trim());
        System.out.println("name:"+name);
        System.out.println("Age:"+Age);
        System.out.println("Job:"+Job);
        System.out.println("Years:"+Years.trim());
        
        System.out.println("Do you think you have a good work ethic");
        String workethic = userinput.nextLine();
        System.out.println("name:"+name);
        System.out.println("Age:"+Age);
        System.out.println("Job:"+Job);
        System.out.println("Years:"+Years);
        System.out.println("workethic:"+workethic.trim());
    }
    
}

    
    

