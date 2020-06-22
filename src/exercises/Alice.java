package exercises;


public class Alice {
    public static void main(String[] args){
        String message;

        message = Message.getMessage(
                "Alice was beginning to get very tired of sitting by her sister on the bank, \n" +
                        "and of having nothing to do: once or twice she had peeped into the book her sister was reading, \n" +
                        "but it had no pictures or conversations in it, 'and what is the use of a book,' \n" +
                        "thought Alice 'without pictures or conversation?'");
        System.out.println(message);

    }
}
