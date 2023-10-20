package ChibuzoAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class MBTIPersonalityTest {
    public static void main(String[] args) {
        personalityTest();
    }

    public static String [] extrovertedIntroverted() {
        Scanner input = new Scanner(System.in);
        String[] extrovert = new String[5];
        for (int count = 0; count < extrovert.length; count++) {
            String userInput = " ";
            switch (count) {
                case 0:
                    System.out.println("""
                    A. expand energy, enjoy groups    B. conserve energy, enjoy one-on-one
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        extrovert[count] = "A. expand energy, enjoy groups ";
                    }
                    if (userInput.equals("B")) {
                        extrovert[count] = "B. conserve energy, enjoy one-on-one ";
                    }
                    break;
                case 1:
                    System.out.println("""
                            A. more outgoing, think out loud    B. more reserved, think to yourself                          
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        extrovert[count] = "A. more outgoing, think out loud ";
                    }
                    if (userInput.equals("B")) {
                        extrovert[count] = "B. more reserved, think to yourself ";
                    }
                    break;
                case 2:
                    System.out.println("""
                            A. seek many task, public activities, interaction with others   B. seek private, solitary activities with quite to concentrate
                             """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        extrovert[count] = "A. seek many task, public activities, interaction with others ";
                    }
                    if (userInput.equals("B")) {
                        extrovert[count] = "B. seek private, solitary activities with quite to concentrate ";
                    }

                    break;
                case 3:
                    System.out.println("""
                            A. external, communicative, express yourself  B. internal, reticent, keep to yourself                           
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        extrovert[count] = "A. external, communicative, express yourself ";
                    }
                    if (userInput.equals("B")) {
                        extrovert[count] = " B. internal, reticent, keep to yourself ";
                    }

                    break;
                case 4:
                    System.out.println("""
                            A. active, initiate   B. reflective, deliberate                       
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        extrovert[count] = "A. active, initiate ";
                    }
                    if (userInput.equals("B")) {
                        extrovert[count] = "B. reflective, deliberate ";
                    }

            }
        }

        return extrovert;
    }


    public static String [] sensingIntuitive() {
        Scanner input = new Scanner(System.in);
        String[] sensing = new String[5];
        for (int count = 0; count < sensing.length; count++) {
            String userInput = " ";
            switch (count) {
                case 0:
                    System.out.println("""
                            A. Interpret literally   B. look for meaning and possibilities
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is a n error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        sensing[count] = "A. Interpret literally ";
                    }
                    if (userInput.equals("B")) {
                        sensing[count] = "B. look for meaning and possibilities ";
                    }
                    break;
                case 1:
                    System.out.println("""
                            A. practical, realistic, experiential       B. imaginative, innovative, theoretical
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        sensing[count] = "A. practical, realistic, experiential ";
                    }
                    if (userInput.equals("B")) {
                        sensing[count] = "B. imaginative, innovative, theoretical ";
                    }
                    break;
                case 2:
                    System.out.println("""
                            A. standard, usual, conventional
                            B. different, novel, unique
                             """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        sensing[count] = " A. standard, usual, conventional ";
                    }
                    if (userInput.equals("B")){
                        sensing[count] = " B. different, novel, unique ";
                    }
                    break;
                case 3:
                    System.out.println("""
                            A. focus on here-and-now        B. look to the future, global perspective,big picture
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine();
                    }
                    if (userInput.equals("A")){
                        sensing[count] = "A. focus on here-and-now ";
                    }
                    if (userInput.equals("B")) {
                        sensing[count] = "B. look to the future, global perspective,big picture ";
                    }
                    break;
                case 4:
                    System.out.println("""
                            A. facts, things, what is        B. ideas, dreams, what could be, philosophical
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        sensing[count] = "A. facts, things, what is";
                    }
                    if (userInput.equals("B")){
                        sensing[count] = "B. ideas, dreams, what could be, philosophical";
                    }
            }
        }
        return sensing;
    }

    public static String[] thinkingFeeling() {
        Scanner input = new Scanner(System.in);
        String[] tf = new String[5];
        for (int count = 0; count < tf.length; count++) {
            String userInput = " ";
            switch (count) {
                case 0:
                    System.out.println("""
                            A. logical, thinking, questioning       B. empathetic, feeling, accommodating
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is a n error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        tf[count] = "A. logical, thinking, questioning";
                    }else {
                        tf[count] = "B. empathetic, feeling, accommodating ";
                    }
                    break;
                case 1:
                    System.out.println("""
                            A. candid, straight forward, frank       B. tactful, kind, encouraging
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        tf[count] = "A. candid, straight forward, frank";
                    }else {
                        tf[count] = "B. tactful, kind, encouraging";
                    }
                    break;
                case 2:
                    System.out.println("""
                            A. firm, tend to criticize, hold the line        B. gentle, tend to appreciate, conciliate
                             """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        tf[count] ="A. firm, tend to criticize, hold the line";
                    }
                    else {
                        tf[count] = "B. gentle, tend to appreciate, conciliate";
                    }
                    break;
                case 3:
                    System.out.println("""
                            A. tough-minded, just        B. tender-hearted, merciful
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        tf[count] = "A. tough-minded, just";
                    }else {
                        tf[count] = "B. tender-hearted, merciful" ;
                    }
                    break;
                case 4:
                    System.out.println("""
                            A. matter of fact, issue-oriented           B. sensitive, people-oriented, compassionate
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")){
                        tf[count] = "A. matter of fact, issue-oriented";
                    }
                    else {
                        tf[count] = "B. sensitive, people-oriented, compassionate";
                    }
            }
        }
        return tf;
    }

    public static String [] judgingPerceptive() {
        Scanner input = new Scanner(System.in);
        String[] jp = new String[5];
        for (int count = 0; count < jp.length; count++) {
            String userInput = " ";
            switch (count) {
                case 0:
                    System.out.println("""
                            A. organized, orderly,      B. flexible, adaptable
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is a n error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        jp[count] = "A. organized, orderly ";
                    } else {
                        jp[count] = "B. flexible, adaptable";
                    }
                    break;
                case 1:
                    System.out.println("""
                            A. plan, schedule       B. unplanned, spontaneous
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        jp[count] = "A. plan, schedule ";
                    } else {
                        jp[count] = "B. unplanned, spontaneous";
                    }
                    break;
                case 2:
                    System.out.println("""
                            A. regulated, structured            B. easy-going, live and let live
                             """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        jp[count] = "A. regulated, structured ";
                    } else {
                        jp[count] = "B. easy-going, live and let live ";
                    }
                    break;
                case 3:
                    System.out.println("""
                            A. preparation, plan ahead          B. go with the flow, adapt as you go
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        jp[count] = "A. preparation, plan ahead";
                    } if (userInput.equals("B")){
                        jp[count] = "B. go with the flow, adapt as you go ";
                    }

                    break;
                case 4:
                    System.out.println("""
                            A. control, govern           B. latitude, freedom
                            """);
                    userInput = input.nextLine().toUpperCase();
                    while (!(userInput.equals("A") || userInput.equals("B"))) {
                        System.out.println("""
                                Expected A or B as Response
                                I Know this is an error, please retry again
                                """);
                        userInput = input.nextLine().toUpperCase();
                    }
                    if (userInput.equals("A")) {
                        jp[count] = "A. control, govern ";
                    }if (userInput.equals("B")){
                        jp[count] = "B. latitude, freedom";
                }
            }
        }
        return jp;
    }

    public static void personalityTest() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ");
        String userName = input.nextLine();
     String [] extrovert =   extrovertedIntroverted();
     String [] sensing = sensingIntuitive();
     String [] thinking = thinkingFeeling();
     String [] judging = judgingPerceptive();

        System.out.println("Hello "+userName+" you selected");

     int counterE = 0 ;
     int counterI = 0 ;
        for(String e : extrovert) {
            System.out.println(e);
            if(e.startsWith("A")){
                counterE++;
            }
            else{
                counterI++;
            }
        }
        System.out.println("number of A selected is "+counterE);
        System.out.println("number of A selected is "+counterI);
        int counterS = 0;
        int counterN = 0;
        for (String s : sensing){
            System.out.println(s);
            if (s.startsWith("A")){
                counterS++;
            }
            else {
                counterN++;
            }
        }
        System.out.println("number of A selected is "+counterS);
        System.out.println("number of A selected is "+counterN);
        int counterT = 0;
        int counterF = 0;
        for (String t : thinking){
            System.out.println(t);
            if (t.startsWith("A")){
                counterT++;
            }else {
                counterF++;
            }
        }
        System.out.println("number of A selected is "+counterT);
        System.out.println("number of A selected is "+counterF);
        int counterJ = 0;
        int counterP = 0;
        for (String j : judging){
            System.out.println(j);
            if (j.startsWith("A")){
                counterJ++;
            }
            else {
                counterP++;
            }
        }
        System.out.println("number of A selected is "+counterJ);
        System.out.println("number of A selected is "+counterP);

        if (counterI > counterE && counterN > counterS && counterT > counterF && counterJ > counterP){
            System.out.println("""
                    INTJ
                         Healer
                         The Thoughtful Idealist (MBTI)
                         The Mediator (16Personalities)
                    The INTJ Personality Type
                    An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging
                    personality traits. These thoughtful tacticians love perfecting the details of life, applying
                    creativity and rationality to everything they do. Their inner world is often a private, complex one.
                                        
                    ***********************
                    * A Pioneering Spirit *
                    ***********************
                                        
                    Architects question everything. Many personality types trust the status quo, relying on
                    conventional wisdom and other people’s expertise to guide their lives. But ever-skeptical
                    Architects prefer to make their own discoveries. In their quest to find better ways of doing things,
                    they aren’t afraid to break the rules or risk disapproval – in fact, they rather enjoy it.
                       
                       ***********************************************************************
                       *                                                                     *
                       *     Architects, independent to the core, want to shake off          *
                       *     other people’s expectations and pursue their own ideas.         *
                       *                                                                     *
                       ***********************************************************************
                                       
                    This personality type comes with a strong independent streak. Architects don’t mind acting alone,
                    perhaps because they don’t like waiting around for others to catch up with them. They also generally
                    prefer making decisions without asking for anyone else’s input. At times, this lone-wolf behavior
                    can come across as insensitive, as it fails to take into consideration other people’s thoughts,
                    desires, and plans.
                      **************************
                      * A Thirst for Knowledge *
                      **************************
                      
                    Architects can be both the boldest of dreamers and the bitterest of pessimists.
                    They believe that, through willpower and intelligence, they can achieve even the
                    most challenging goals. But these personalities may be cynical about human nature more generally,
                    assuming that most people are lazy, unimaginative, or simply doomed to mediocrity.
                    
                    **************************
                    * The Chess Game of Life *
                    **************************
                                    
                    Architects are full of contradictions. They are imaginative yet decisive, ambitious yet private, and
                    curious yet focused. From the outside, these contradictions may seem baffling, but they make perfect
                    sense once you understand the inner workings of the Architect mind.
                     
                       """);
        }

        if (counterI > counterE && counterN > counterS && counterT > counterF && counterP > counterJ){

            System.out.println("""
                    INTP
                       Healer
                       The Thoughtful Idealist (MBTI)
                       The Mediator (16Personalities)
                    The INTP Personality Type
                     
                    A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting
                    personality traits. These flexible thinkers enjoy taking an unconventional approach to many aspects
                    of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                     
                    ************************
                    * The Life of the Mind *
                    ************************
                        
                    Logicians often lose themselves in thought – which isn’t necessarily a bad thing.
                    People with this personality type hardly ever stop thinking. From the moment they wake up,
                    their minds buzz with ideas, questions, and insights. At times, they may even find themselves
                    conducting full-fledged debates in their own heads.
                             
                         ***************************************************************
                         *  Imaginative and curious, Logician personalities can find   *
                         *   endless fascination in the workings of their own mind.    *
                         ***************************************************************
                     
                    From the outside, Logicians may seem to live in a never-ending daydream. They have a reputation for
                    being pensive, detached, and a bit reserved. That is, until they try to train all of their mental
                    energy on the moment or the person at hand, which can be a bit uncomfortable for everyone.
                    But regardless of which mode they’re in, Logicians are Introverts and tend to get tired out by
                    extensive socializing. After a long day, they crave time alone to consult their own thoughts.
                      
                    ********************************
                    * Elementary, My Dear Logician *
                    ********************************
                    
                    Logicians love to analyze patterns. Without necessarily knowing how they do it,
                    people with this personality type often have a Sherlock Holmes–like knack for spotting discrepancies
                    and irregularities. In other words, it’s a bad idea to lie to them.
                    
                    ********************************************************
                    *                                                      *
                    *  For Logicians, the best conversations are like      *
                    *  brainstorming sessions, with plenty of room for     *
                    *  unconventional thoughts and off-the-wall what-ifs.  *
                    *                                                      *
                    ********************************************************
                    
                    *****************************
                    * Mysteries of the Universe *
                    *****************************                    
                   
                    People with this personality type want to understand everything in the universe,
                    but one area in particular tends to mystify them: human nature. As their name suggests,
                    Logicians feel most at home in the realm of logic and rationality. As a result,
                    they can find themselves baffled by the illogical, irrational ways that feelings and emotions
                    influence people’s behavior – including their own.
                      """);
        }
        if (counterE > counterI && counterN > counterS && counterT > counterF && counterJ > counterP){

        }
    }
}