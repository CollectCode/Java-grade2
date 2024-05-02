/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carmgr;

/**
 *
 * @author sshj1
 */
public class CarMgr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Car car = new Car("3265");
        
        Car sedan = new Sedan("3265");
        sedan.gas();
        sedan.move();
        
        Car truck = new Truck("7872");
        truck.gas();
        truck.move();
        
        Car car = new Sedan("6429");
        car.gas();
        car.move();
        
//        if(car instanceof Sedan)    {
//            System.out.println("Sedan의 객체입니다.");
//        } else if (car instanceof Truck)    {
//            System.out.println("Truck의 객체입니다.");
//        }
//        
//        car = new Truck("3265");
//        car.gas();
//        car.move();
//        if(car instanceof Sedan)    {
//            System.out.println("Sedan의 객체입니다.");
//        } else if (car instanceof Truck)    {
//            System.out.println("Truck의 객체입니다.");
//        }
        
//        Car car = new Sedan("3265");
//        System.out.println("cc : " + car.cc);                                 // 클래스 내부의 변수나 메서드에 static이 있을경우에는 호출하는것 자체로도 클래스의 메모리 주소를 따라간다.
//        car = new Sedan("7872");
//        System.out.println("cc : " + Car.cc + "," + Math.abs(-123));          // 클래스 내부의 변수에 static이 있으면 --> 객체들끼리 해당 변수를 공유하고싶을때 사용
//        car = new Truck("6429");                                              // 클래스 내부의 메서드에 static이 있으면 --> 객체를 만들지 않고도 사용하고 싶을때 사용
//        System.out.println("cc : " + car.cc);        
    }
}
