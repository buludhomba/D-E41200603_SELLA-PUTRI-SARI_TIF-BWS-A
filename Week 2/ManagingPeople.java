/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root
 */
public class ManagingPeople {
     public static void main(String[] args){
        Person p1 = new Person("Lisa","Palombo",123456789,"Active");
        
        System.out.println("Student Name: "+ p1.getfName()+" "+ p1.getlName());
        System.out.println("Student ID: "+ p1.getStuId());
        System.out.println("Student Status: "+ p1.getStuStatus());
     }
}
