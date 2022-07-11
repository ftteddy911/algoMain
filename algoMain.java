import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 



public class algoMain{
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("---------------------------------------------");
        System.out.println("---- WARNING YOU ARE TAKLING TO AI ROBOT ----");
        System.out.println("----   for any type of help type help    ----");
        System.out.println("---------------------------------------------");
        
        // making  object and class
        Scanner sc = new Scanner(System.in); // this is scnner class object to take user input

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");   // taking date and time 
        LocalDateTime now = LocalDateTime.now();  
        

        // making user interface variables
        String greetingHello = "hello";
        String greetingHii = "hii";
        String greetingHyy = "hyy";
        String whatIsYourName = "what is your name";
        String exitSystem = "exit";
        String whoAreYou = "who are you";
        String whatIsTime = "what is time";
        String whatIsDate = "what is date";
        String whatIsDateAndTime = "what is date and time";
        String helpUser = "help";
        String githubApiUser = "search for github user";
        String aboutTimeAndDate = "about time and date";

        // making all software need vaariables
        boolean alwaysTrue = true;
        boolean alwaysFalse = false;
        boolean mainLoopTrue = true;
        var gitApiUrl = "https://api.github.com/users/";

        // making user info variables 
        String userName = "vivek";
        String userSurName = "kathrotiya";

        // making software info variables
        String myNameIs = "mr.cortin"; // this is what software name is 

        // maker or compney info

        // cheaking username and enter the main loop 
        System.out.print("what is your Username:- ");
        String nameAsk = sc.nextLine();
        if (nameAsk.equals(userName)){
        }
        else{
            System.out.println("sorry your username is invalid. You cannot enter.");
            mainLoopTrue = false;
        }

        // print variables
        String helpUserPrintStatement = ("""
                        WARNING YOU ARE TAKLING TO AI ROBOT
                        1. for exit type (exit)
                        2. you can takling to system type any thing 
                        3. if your username are not valid you can't enter to system. you are thare so i hope you enter right username
                        4. searching for github user word for is this (search for github user)
                        """);


        /*
         thare is algo variables and algo systems (in every variables the variables by default 0 and than that going to add on by the time)
        */
        int helloCountingSystem = 0;
        int hiiCountingSystem = 0;
        int hyyCountingSystem = 0;
        int whoAreYouCountingSystem = 0;
        int whatIsYourNameCountingSystem = 0;
        int whatIsDateCounting = 0;
        int whatIsTimeCounting = 0;
        int whatIsDateAndTimeCounting = 0;
        int helpUserCounting = 0;
        int githuUserSearchCountin = 0;
        int aboutTimeAndDateCounting = 0;

        
        
        // starting main loop from here
        while(mainLoopTrue){
            System.out.print("Enter Your Q. :- ");
            String mainSystemAsk = sc.nextLine().toLowerCase(); // this line well ask main Q.

            if(mainSystemAsk.equals(greetingHello)){
                System.out.println("Hello I'm good What about you.");
            }
            else if(mainSystemAsk.equals(greetingHii)){
                System.out.println("HI'm good What about you.");
            }
            else if(mainSystemAsk.equals(greetingHyy)){
                System.out.println("Hyy I'm good What about you");
            }
            else if(mainSystemAsk.equals(whatIsYourName)){
                System.out.println("My Name Is MR.Cortin. How can i help you.");
            }
            else if(mainSystemAsk.equals(whoAreYou)){
                System.out.println("im your Virtual Assistant");
            }
            else if(mainSystemAsk.equals(whatIsDate)){
                System.out.println("the local date is " + dtf.format(now));
            }
            else if(mainSystemAsk.equals(whatIsTime)){
                System.out.println("the local time is " + dtf.format(now));
            }
            else if(mainSystemAsk.equals(whatIsDateAndTime)){
                System.out.println("the local date and time is " + dtf.format(now));
            }
            else if(mainSystemAsk.equals(helpUser)){
                System.out.println(helpUserPrintStatement); 
            }
            else if(mainSystemAsk.equals(aboutTimeAndDate)){
                System.out.println("The Time And Date Is Taking From Your Device. So becouse of that is your local date and time.");
            }
            else if(mainSystemAsk.equals(githubApiUser)) {

                System.out.println("""

                        this something to know about to get info
                        1. your internet much be turn on
                        2. no need of git hub account 
                        3. type user name as it is in github
                        thanks for using it.
                        """);

                System.out.print("Enter GitHub username :- ");
                String githubUserName = sc.nextLine();
                String makingGithubUserApi = gitApiUrl + githubUserName;

                // http request
                var request = HttpRequest.newBuilder().GET().uri(URI.create(makingGithubUserApi)).build();
                // bulding the url
                var client = HttpClient.newBuilder().build();
                // send the url and request for data
                var responce = client.send(request, HttpResponse.BodyHandlers.ofString());
                // printing out came data from github server
                System.out.println(responce.body());

            }

            
            else if(mainSystemAsk.equals(exitSystem)){ // this is making loop false and exit from program
                mainLoopTrue = false;
            }
            else{
                System.out.println("Invalid Input Enter Someting else.");
            }


            // Starting Counting System
            if(mainSystemAsk.equals(greetingHello)){
                helloCountingSystem ++;
            } else if(mainSystemAsk.equals(greetingHii)){
                hiiCountingSystem ++;
            } else if(mainSystemAsk.equals(greetingHyy)){
                hyyCountingSystem ++;
            } else if(mainSystemAsk.equals(whoAreYou)){
                whoAreYouCountingSystem ++;
            } else if(mainSystemAsk.equals(whatIsYourName)){
                whatIsYourNameCountingSystem ++;
            } else if(mainSystemAsk.equals(whatIsDate)){
                whatIsDateCounting ++;
            } else if(mainSystemAsk.equals(whatIsTime)){
                whatIsTimeCounting ++;
            } else if(mainSystemAsk.equals(whatIsDateAndTime)){
                whatIsDateAndTimeCounting ++;
            } else if(mainSystemAsk.equals(helpUser)){
                helpUserCounting ++;
            } else if(mainSystemAsk.equals(githubApiUser)){
                githuUserSearchCountin ++;
            } else if(mainSystemAsk.equals(aboutTimeAndDate)){
                aboutTimeAndDateCounting ++;
            }

        }
        
        






    }
}