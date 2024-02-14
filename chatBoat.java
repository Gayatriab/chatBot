import java.utile.*;
public class chatBot{
    public static void main (string args[]){
        scanner sc=new scanner(system.in);
        string timeStamp = new
        simpleDate format("dd:mm:yyyy);
        simpleTime format("hh:mm:ss");
        system.out.println("Hello there! I'm chatBot");
        boolean running=true;
        while (runnning==true){
            system.out.println();
            string input=sc.nextLine();
            input=input.toLowerCase();
            if (input.equals('hello')){
                system.out.println("Hello there!");
            }
            elses if (input.equals("what is your name")){
                system.out.println("Hey there! I'm chatBot");
            }
            else if(input.equals("what is the time")){
                system.out.println("hh:mm:ss");
                system.out.println(timeStamp);
            }
            else{
                system.out.println("Sorry I dont understand");
            }
            if(input.equals("today's Date")){
                system.out.println(dd:mm:yyyy);
            }
            else if (input.equals("bye")){
                system.out.println("Bye!Have a nice day")
            }
            
            }

            }
        }
    }
}