import java.util.Scanner;

public class menuMap{
    
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);        

        System.out.println("MAIN MENU");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");

        System.out.print("select: ");
        int mainChoice = inputCollector .nextInt();

        switch (mainChoice) {

            case 1:
                System.out.println("\nPhone book");
                System.out.println("1. Search");
                System.out.println("2. Service Nos");
                System.out.println("3. Add name");
                System.out.println("4. Erase");
                System.out.println("5. Edit");
                System.out.println("6. Assign tone");
                System.out.println("7. Send b’card");
                System.out.println("8. Options");
                System.out.println("9. Speed dials");
                System.out.println("10. Voice tags");

                System.out.print("select: ");
                int phoneChoice = inputCollector .nextInt();

                switch (phoneChoice) {

                    case 1:
                        System.out.println("Search");
                        break;

                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;

                    case 8:
                        System.out.println("\nselect");
                        System.out.println("1. Type of view");
                        System.out.println("2. Memory status");

                        System.out.print("select: ");
                        int optionChoice = inputCollector.nextInt();

                        switch (optionChoice) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                        break;

                    default:
                        System.out.println("Invalid");
                }
                break;

            case 2:
                System.out.println("\nMessages");
                System.out.println("1. Write messages");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture messages");
                System.out.println("5. Templates");
                System.out.println("6. Smileys");
                System.out.println("7. Message settings");
                System.out.println("8. Info service");
                System.out.println("9. Voice mailbox number");  
                System.out.println("10. Service command editor");

                System.out.print("select: ");
                int messageChoice = inputCollector.nextInt();

                switch(messageChoice) {
                    case 1:
                        System.out.print("Write messages");
                        break;

                    case 2:
                        System.out.print("Inbox");
                        break;

                    case 3:
                        System.out.print("Outbox");
                        break;

                    case 4:
                        System.out.print("Picture messages");
                        break;

                    case 5:
                        System.out.print("Templates");
                        break;

                    case 6:
                        System.out.print("Smileys");
                        break;

                    case 7:
                        System.out.print("Message settings");   
                        System.out.println("select");
                        System.out.println("Set 1");   
                        System.out.println("1. Message center number");
                        System.out.println("2. Message sent as");
                        System.out.println("3. Message validity");


                        System.out.print("select: ");
                        int optionChoice = inputCollector.nextInt();

                        switch (optionChoice) {
                            case 1:
                                System.out.println("Message center number");
                                break;
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                            
                            default:
                                System.out.println("Invalid option");
}
                              System.out.println("\nselect");
                     System.out.println("Common");   
                        System.out.println("1. Delivery reports");
                        System.out.println("2. Reply via same center");
                        System.out.println("3. Character support");


                        System.out.print("select: ");
                        int subOptionChoice = inputCollector.nextInt();

                        switch (subOptionChoice) {
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same center");
                                break;
                            case 3:
                                System.out.println("Character support");
                                break;
                            
                            default:
                                System.out.println("Invalid option");
                      
                        }
                        break;
                case 8:
                        System.out.print("Info service");
                        break;
                case 9:
                        System.out.print("Voice mailbox number");
                        break;
                case 10:
                        System.out.print("Service command editor");
                        break;
                   

                    }
                

                break;

            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("Call register");
                System.out.println("1. Missed Calls");
                System.out.println("2. Received Calls");
                System.out.println("3. Dialed numbers");
                System.out.println("4. Erase recent calls list");
                System.out.println("5. Show call duration");
                System.out.println("6. Show call costs");
                System.out.println("7. Call cost settings");
                System.out.println("8. Prepaid credit");
                    System.out.println("Choose a number");
                   int callRegister = inputCollector.nextInt();
                    switch(callRegister){
                        case 1:
                            System.out.println("Missed Calls");
                        break;

                        case 2:
                            System.out.println("Received Calls");
                        break;

                        case 3:
                            System.out.println("Dialed numbers");
                        break;

                        case 4:
                            System.out.println("Erase recent calls list");
                        break;

                        case 5:
                            System.out.println("Show call duration");
                                                                System.out.println("1. Last call duration");
                                System.out.println("2. All calls duration");
                                System.out.println("3. Rececived calls duration");
                                System.out.println("4. Dialled calls duration");
                                System.out.println("5. Clear timers");


                            System.out.println("choose an option");
                            int callDuration = inputCollector.nextInt();
                                switch(callDuration){
                                        case 1: 
                                            System.out.print("Last call duration");
                                         break;   

                                         case 2: 
                                            System.out.print("All calls duration");
                                         break;   

                                         case 3: 
                                            System.out.print("Rececived calls duration");
                                         break;   

                                         case 4: 
                                            System.out.print("Dialled calls duration");
                                         break;   

                                         case 5: 
                                            System.out.print("Clear timers");
                                         break;   

                                    } 
                        break;  

                        case 6:
                            System.out.println("how call cost");
                                System.out.println("1. Last call cost");
                                System.out.println("2. All calls cost");
                                System.out.println("3. Clear counters");

                                System.out.println("Choose an option");
                                int showCallCost = inputCollector.nextInt();
                                
                                switch(showCallCost) {
                                        case 1:
                                            System.out.print("Last call cost");
                                        break;

                                        case 2:
                                            System.out.print("All calls cost");
                                        break;

                                        case 3:
                                            System.out.print("Clear counters");
                                        break;

                                    }
                        break;

                        case 7:
                            System.out.println("\nCall cost settings");
                                System.out.println("1. Call cost limit");
                                System.out.println("2. Show costs in");
                                

                                System.out.println("Choose an option");
                                int callCostSettings = inputCollector.nextInt();
                                
                                switch(callCostSettings) {
                                        case 1:
                                            System.out.print("Call cost limit");
                                        break;

                                        case 2:
                                            System.out.print("Show costs in");
                                        break;

                                    }
                        break;

                        case 8:
                            System.out.println("Prepaid credit");
                        break;

    
                        }
                
                break;
            case 5:
                System.out.println("Tones");
                System.out.println("1. Ringing tone");
                System.out.println("2. Ringing volume");
                System.out.println("3. Incoming call alert");
                System.out.println("4. Composer");
                System.out.println("5. Message alert tone");
                System.out.println("6. Keypad tones");
                System.out.println("7. Warning and game tones");
                System.out.println("8. Vibrating alert");
                System.out.println("9. Screen saver");
                
                System.out.println("Select");
                int tonesChoice = inputCollector.nextInt();

                switch(tonesChoice){
                        case 1:
                            System.out.print("Ringing tone");
                        break;

                        case 2:
                            System.out.print("Ringing volume");
                        break;

                        case 3:
                            System.out.print("Incoming call alert");
                        break;

                        case 4:
                            System.out.print("Composer");
                        break;

                        case 5:
                            System.out.print("Message alert tone");
                        break;

                        case 6:
                            System.out.print("Keypad tones");
                        break;

                        case 7:
                            System.out.print("Warning and game tones");
                        break;

                        case 8:
                            System.out.print("Vibrating alert");
                        break;

                        case 9:
                            System.out.print("Screen saver");
                        break;

                   }
                break;
            case 6:
                System.out.println("Settings");
                System.out.println("1. Call settings");
                System.out.println("2. Phone settings");
                System.out.println("3. Security settings");
                System.out.println("4. Restore factory settings");

                System.out.println("select");
                int settingsChoice = inputCollector.nextInt();
                switch(settingsChoice){
                        case 1:
                            System.out.println("Call settings");
                            System.out.println("1. Automatic redial");
                            System.out.println("2. Speed dialing");
                            System.out.println("3. Call waiting options");
                            System.out.println("4. Own number sending");
                            System.out.println("5. Phone line in use");
                            System.out.println("6. Automatic answer");
                                System.out.print("select: ");
                                int callSettingChoice = inputCollector.nextInt();
                                switch(callSettingChoice){
                                    case 1:
                                        System.out.print("Automatic redial");
                                    break;

                                    case 2:
                                        System.out.print("Speed dialing");
                                    break;

                                    case 3:
                                        System.out.print("Call waiting options");
                                    break;

                                    case 4:
                                        System.out.print("Own number sending");
                                    break;

                                    case 5:
                                        System.out.print("Phone line in use");
                                    break;

                                    case 6:
                                        System.out.print("Automatic answer");
                                    break;
                                }
                        break;

                        case 2:
                            System.out.println("Phone settings");
                            System.out.println("1. Language");
                            System.out.println("2. Cell info display");
                            System.out.println("3. Welcome note");
                            System.out.println("4. Network selection");
                            System.out.println("5. Lights");
                            System.out.println("6. Confirm sim service actions");
                            System.out.print("Select: ");
                            int phoneSettingsChoice = inputCollector.nextInt();
                                switch(phoneSettingsChoice){
                                    case 1:
                                        System.out.print("Language");
                                    break;

                                    case 2:
                                        System.out.print("Cell info display");
                                    break;

                                    case 3:
                                        System.out.print("Welcome note");
                                    break;

                                    case 4:
                                        System.out.print("Network selection");
                                    break;

                                    case 5:
                                        System.out.print("Lights");
                                    break;

                                    case 6:
                                        System.out.print("Confirm sim service actions");
                                    break;
                                }
                            
                        break;

                        case 3:
                            System.out.println("Security settings");
                            System.out.println("1. PIN code request");
                            System.out.println("2. Call barring service");
                            System.out.println("3. Fixed dialing");
                            System.out.println("4. Closed user group");
                            System.out.println("5. Phone security");
                            System.out.println("6. Change access codes");
                            
                                System.out.println("select: ");
                                int securitySettingsChoice = inputCollector.nextInt();
                                switch(securitySettingsChoice){
                                    case 1:
                                        System.out.print("PIN code request");
                                    break;

                                    case 2:
                                        System.out.print("Call barring service");
                                    break;

                                    case 3:
                                        System.out.print("Fixed dialing");
                                    break;

                                    case 4:
                                        System.out.print("Closed user group");
                                    break;

                                    case 5:
                                        System.out.print("Phone security");
                                    break;

                                    case 6:
                                        System.out.print("Change access codes");
                                    break;

                                }
                        break;

                        case 4:
                            System.out.println("Restore factory settings");
                        break;
    

                    }   
                break;
                             

                   
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.println("Clock");
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date settings");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");

                    System.out.print("Select");
                        int clockChoice = inputCollector.nextInt();
                        switch(clockChoice){
                            case 1:
                                System.out.print("Alarm clock");
                            break;

                            case 2:
                                System.out.print("Clock settings");
                            break;

                            case 3:
                                System.out.print("Date settings");
                            break;

                            case 4:
                                System.out.print("Stopwatch");
                            break;

                            case 5:
                                System.out.print("Countdown timer");
                            break;

                            case 6:
                                System.out.print("Auto update of date and time");
                            break;

                        }
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;          

            default:
                System.out.println("Invalid choice");
        }
    }
}

