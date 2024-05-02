/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carmgr;

/**
 *
 * @author sshj1
 */
public class Sedan extends Car {

    public Sedan()  {
    }
    
    public Sedan(String _no) {
        super(_no);                                                             // super();는 부모클래스의 생성자를 해당클래스명으로 실행시킨다.
                                                                                // super()호출이 없을경우 강제적으로 Default값으로 실행된다.
        System.out.println("Sedan()::Contructor : " + no + ", " + cc);
        this.no = _no;
        System.out.println("Sedan()::Contructor : " + no + ", " + cc);
    }
    
    public void gas()   {
        System.out.println("Sedan::gas() : " + no + ", " + cc);
    }
    
    public void move()  {
        System.out.println("Sedan::move() : " + no + ", " + cc);
    }
}
