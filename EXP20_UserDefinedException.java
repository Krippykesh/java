import java.io.IOException;

class UserError extends Exception{
    UserError(){}

   // public String toString(){return "SOMEERROR";}
}

public class EXP20_UserDefinedException {
    public static void main(String args[]){
        try{
            throw new IOException();
        }catch (Exception ue){
            System.out.println("Caught user defined exception from throw:"+ue);
        }

    }
}
