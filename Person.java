/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root
 */
public class Person {

    /**
     * @param args the command line arguments
     */
  
    String fName;
    String lName;
    int stuId;
    String stuStatus;
    
    public Person(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public String getStuStatus() {
        return stuStatus;
    }
    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }     


// TODO code application logic here
    }
 

