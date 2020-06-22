package exercises;

import java.lang.*;

public class Message {
    public static String getMessage(String lang) {
        String searchTerm = "alice";


        if (lang.toLowerCase().contains(searchTerm)) {
            int firstIndex = lang.toLowerCase().indexOf(searchTerm);
            int length = searchTerm.length();
            int lastIndex = (firstIndex + length)-1;
            String termFound = lang.substring(firstIndex,lastIndex+1);
            StringBuffer paragraph = new StringBuffer(lang);
            paragraph.delete(firstIndex, lastIndex+1);


            System.out.println("Search term is found at indexes: " + firstIndex + " to " + lastIndex);
            System.out.println("Search term length is: " + termFound.length());
            System.out.println(paragraph);

//            System.out.println(termFound);
//            System.out.println(lang.length());


            return "Search term found!";
        } else {
            return "Search term not found!";
        }
    }
}
