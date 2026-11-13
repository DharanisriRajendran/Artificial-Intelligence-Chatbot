
import java.util.*;

class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       JAVA AI CHATBOT");
        System.out.println("================================");

        System.out.println("Bot: Hello! Welcome to Java Chatbot.");
        System.out.println("Bot: Ask me anything!");
        System.out.println("Bot: Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase().trim();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            else if (input.contains("hello") ||
                     input.contains("hi")) {

                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (input.contains("your name") ||
                     input.contains("who are you")) {

                System.out.println("Bot: I am a Java AI Chatbot.");
            }

            else if (input.contains("java")) {

                System.out.println("Bot: Java is an object-oriented programming language.");
            }

            else if (input.contains("python")) {

                System.out.println("Bot: Python is a popular programming language.");
            }

            else if (input.contains("internship")) {

                System.out.println("Bot: Internship helps students gain practical experience.");
            }

            else if (input.contains("college")) {

                System.out.println("Bot: College is a place for learning and development.");
            }

            else if (input.contains("help")) {

                System.out.println("Bot: Sure! What do you need help with?");
            }

            else if (input.contains("thank")) {

                System.out.println("Bot: You're welcome!");
            }

            else if (input.contains("how are you")) {

                System.out.println("Bot: I am fine. Thank you!");
            }

            else {

                System.out.println("Bot: Sorry, I don't understand.");
                System.out.println("Bot: Please ask another question.");
            }
        }

        sc.close();
    }
}
