// Write a program that demonstrates handling of exceptions
// in inheritance tree. Create a base class called “Father” and
// derived class called “Son” which extends the base class. In
// Father class, implement a constructor which takes the age
// and throws the exception WrongAge( ) when the input
// age<0. In Son class, implement a constructor that uses both
// father and son’s age and throws an exception if son’s age is
// >=father’s age.
import java.util.Scanner;
class WrongAgeException extends Exception{
        public WrongAgeException(String message){
            super(message);
        }
        
}
class father{
    
    public father(int f_age ) throws WrongAgeException{
        if(f_age<=0){
            throw new WrongAgeException("age cant be less than 0");
        }
        else{
            System.out.println("f_age: "+f_age);
        }
    }
}
class son extends father{
    public son(int s_age,int f_age)throws WrongAgeException {
        super(f_age);
        if(f_age<=s_age){
            throw new WrongAgeException("son age cant be greater then father  age");
        }
        else{
            System.out.println("son age:"+s_age);
        }

    }
}
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Father Age: ");
        int f_age = sc.nextInt();
        System.out.println("Enter son Age: ");
        int s_age = sc.nextInt();
        try{
            
            son s = new son(s_age, f_age);
        }
        catch(WrongAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

