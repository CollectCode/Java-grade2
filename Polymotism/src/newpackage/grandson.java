/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import polymotism.parent;

/**
 *
 * @author sshj1
 */
public class grandson extends parent {
    String name;
    
    public grandson (String name)    {
        super();
        this.name = name;
    }
    
//    public void work()  {
//        System.out.println("son :: work()");
//        show();
//    }
    
    public void show() {
        System.out.println("grandson :: show()");
    }
    
    public void gogo()  {
        System.out.println("gogo");
    }
    
    protected void freeze()  {
        System.out.println("freeze");
    }
}


