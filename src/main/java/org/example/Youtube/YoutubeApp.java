package org.example.Youtube;

import java.util.Hashtable;
import java.util.Scanner;

public class YoutubeApp {
    public static void main(String[] args) {
        Hashtable<String,Channeldetails> app=new Hashtable<>();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Youtube Application");
            System.out.println("1 Create new youtube channel");
            System.out.println("2 Search for youtube channel");
            System.out.println("3 Exit");
            System.out.println("Enter your choice(1,2,3)");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter your Channel key");
                    String Channelkey=scanner.nextLine();
                    System.out.println("Enter your Channelname");
                    String ChannelName=scanner.nextLine();
                    System.out.println("Enter your Channelname discription");
                    String Discription=scanner.nextLine();
                    System.out.println("Enter your Channelname subscribers");
                    String Subscription=scanner.nextLine();
                    Channeldetails newChannel=new Channeldetails(Channelkey,ChannelName,Discription,Subscription);
                    app.put(newChannel.getChannelname(),newChannel);
                    System.out.println("Channel created Successfully");
                    break;
                case 2:
                    System.out.println("Enter your Channelname to Search");
                    String SearchKey=scanner.nextLine();
                    Channeldetails foundChannel=app.get(SearchKey);
                    if(foundChannel!=null){
                        System.out.println("Channel details for the name :"+SearchKey);
                        System.out.println("channel key"+foundChannel.getKey());
                        System.out.println("channel discription"+foundChannel.getDescription());
                        System.out.println("channel subscription"+foundChannel.getSubscription());
                    }else{
                        System.out.println("Channel with name "+SearchKey+" not found");
                    }
                    break;
                    case 3:
                        System.out.println("exisitng youtube application");
                        System.exit(0);
                        break;
                default:
                    System.out.println("Invalid channel - please select 1,2 or 3");


            }


        }
    }
}
