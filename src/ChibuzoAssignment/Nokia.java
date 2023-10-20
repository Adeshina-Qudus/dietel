package ChibuzoAssignment;

import java.util.Scanner;

public class Nokia {
    public static void mainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("""
                1.  Phone book
                2.  Messages
                3.  Chat
                4.  Call register
                5.  Tones
                6.  Setting
                7.  Call divert
                8.  Games
                9.  Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                phoneBook();
            break;
            case 2:
                message();
            break;
            case 3:
                chat();
            break;
            case 4:
                callRegister();
            break;
            case 5:
                tones();
            break;
            case 6:
                setting();
            break;
            case 7:
                callDivert();
            break;
            case 8:
                games();
            break;
            case 9:
                calculator();
            break;
            case 10:
                Reminder();
            break;
            case 11:
                Clock();
            break;
            case 12:
                Profiles();
            break;
            case 13:
                SIM_services();

        }
    }
    public static void phoneBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10.Voice tags
                11.Go back
                """);
        int useInputp = input.nextInt();
        switch (useInputp){
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos.");
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
                System.out.println("""
                        1. Type of view
                        2. Memory status
                        3. go back
                        4. main menu
                                               
                      """);
                int userInput8 = input.nextInt();
                switch (userInput8) {
                    case 1:
                        System.out.println("Type of view");
                        break;
                    case 2:
                        System.out.println("Memory status");
                        break;
                    case 3:
                        phoneBook();
                    case 4:
                        mainMenu();

                }
                    break;

            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            case 11:
                mainMenu();

        }


        }
    public static void message() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                1. Write messages
                2. inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. info service
                9. Voice mailbox number
                10.Services command editor
                11.Go back""");
        int userinputm = input.nextInt();
        switch (userinputm) {
            case 1:
                System.out.println("write messages");
                break;
            case 2:
                System.out.println("inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                System.out.println("""
                        1. Set 1
                        2. Common 3
                           """);
                int userInputs = input.nextInt();
                switch (userInputs) {
                    case 1:
                        System.out.println("""
                                1. Message centre number
                                2. Messages sent as
                                3. Message validity
                                4. go back
                                5. main menu""");
                        int userInputSe = input.nextInt();
                        switch (userInputSe) {
                            case 1:
                                System.out.println("Message centre number");
                            case 2:
                                System.out.println("Message sent as ");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                            case 4:
                                message();
                            case 5:
                                mainMenu();
                        }
                        break;
                    case 2:
                        System.out.println("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                4. go back
                                5. main menu
                                """);
                        int userInputC = input.nextInt();
                        switch (userInputC) {
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                                break;
                            case 4:
                                message();
                            case 5:
                                mainMenu();
                        }
                        break;
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                    case 11:
                        mainMenu();



                }
        }
    }
        public static void chat(){
           Scanner input = new Scanner(System.in);
            System.out.println("""
                    1. Chat
                    2. go back
                    3. Main menu""");
            int userInput = input.nextInt();

            switch (userInput) {
                case 1 -> System.out.println("Chat");
                case 2 -> chat();
                case 3 -> mainMenu();
            }

        }
        public static void callRegister(){
        Scanner input = new Scanner(System.in);
            System.out.println("""
                    1. Missed calls     
                    2. Received calls
                    3. Dialled number 
                    4. Erase recent call list                
                    5. show call duration
                    6. Show call costs
                    7. Call cost settings 
                    8. Prepaid credit
                    9. Go Back
                    """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> System.out.println("""
                        1. DELIGHTED
                           0807203442
                        2. AGNES
                           07066221008
                        3. UDEME
                           090182966447
                           """);
                case 2 -> System.out.println("Received calls");
                case 3 -> System.out.println("Dialled number");
                case 4 -> System.out.println("Erase recent call list");
                case 5 -> {
                    System.out.println("""
                            1. Last Call duration
                            2. All calls' duration
                            3. Received calls' duration
                            4. Dialled calls' duration
                            5. Clear timers
                            6. Go back
                            """);
                    int userInputL = input.nextInt();
                    switch (userInputL) {
                        case 1 -> System.out.println("Last calls duration");
                        case 2 -> System.out.println("All calls' duration");
                        case 3 -> System.out.println("Received calls");
                        case 4 -> System.out.println("Dialled calls' duration");
                        case 5 -> System.out.println("Clear timers");
                        case 6 -> callRegister();
                    }
                }
                case 6 -> {
                    System.out.println("""
                            1. Last call cost
                            2. All calls' cost
                            3. Clear counters
                            4. Go bck
                            """);
                    int userInput6 = input.nextInt();
                    switch (userInput6) {
                        case 1 -> System.out.println("Last call cost");
                        case 2 -> System.out.println("All calls' cost");
                        case 3 -> System.out.println("Clear counters");
                        case 4 -> callRegister();
                    }
                }
                case 7 -> {
                    System.out.println("""
                            1. Call cost limit
                            2. Show costs in
                            3. Go back
                            """);
                    int userInputC = input.nextInt();
                    switch (userInputC) {
                        case 1 -> System.out.println("Call cost limit");
                        case 2 -> System.out.println("Sow costs in");
                        case 3 -> callRegister();
                    }
                }
                case 8 -> System.out.println("Prepaid credit");
                case 9 -> mainMenu();
            }
    }
            public static void tones(){
                Scanner input = new Scanner(System.in);
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9 Screen saver
                        10.Go back
                        """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tone");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                    case 10 -> tones();
                }
            }
            public static void setting() {
                Scanner input = new Scanner(System.in);
                System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        5. Go back                 
                        """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                7. Go back
                                """);
                        int userInputA = input.nextInt();
                        switch (userInputA) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialing");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                            case 7 -> setting();
                        }
                        break;
                    case 2:
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service action
                                7. Go back
                                """);
                        int userInputL = input.nextInt();
                        switch (userInputL) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Call info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service action");
                            case 7 -> setting();
                        }
                        break;
                    case 3:
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dilling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                7. Go back
                                """);
                        int userInputP = input.nextInt();
                        switch (userInputP) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dilling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");
                            case 7 -> setting();
                        }
                        break;
                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                    case 5:
                        mainMenu();
                }
            }
            public static void callDivert(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                1.Call divert
                2. Go back
                3.Main menu
                """);
                int userInputC = input.nextInt();
                switch (userInputC) {
                    case 1 -> System.out.println("call divert");
                    case 2 -> callDivert();
                    case 3-> mainMenu();
                }
            }

            public static void games(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                        1.Games
                        2.Go back
                        """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Games");
                    case 2 -> games();
                }
            }
            public static void calculator(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                        1.Calculator
                        2.Go back
                        """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Calculator");
                    case 2 -> calculator();
                }
            }
            public static void Reminder(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                        1. Reminders
                        2. Go back
                        """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Reminders");
                    case 2 -> Reminder();
                }
            }
            public static void Clock(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                        1. Alarm clock
                        2. Clock setting
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        7.Go back
                        """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date settings");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                    case 7 -> Clock();
                }
            }
            public static void Profiles(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                1.Profiles
                2.Go back
                3.Main menu
                """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Profiles");
                    case 2 -> Profiles();
                    case 3 -> mainMenu();

                }
            }
            public static void SIM_services(){
        Scanner input = new Scanner(System.in);
                System.out.println("""
                1.SIM services
                2.Go Back
                3.Main menu
                """);
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("SIM services");
                    case 2 -> SIM_services();
                    case 3 -> mainMenu();
                }
            }

        }




