package exercises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMC on 9/30/2016.
 */
public class MyCollections {
    

    public static String myList() {
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Ariel");
        myFriends.add("Bert");
        myFriends.add("Cabal");
        Random random = new Random();
        int index = random.nextInt(myFriends.size());


            return myFriends.get(index);

    }


    public static String myEx() {
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Angel");
        myGirlFriends.add("Barbara");
        myGirlFriends.add("Claire");
        Random random = new Random();
        int index = random.nextInt(myGirlFriends.size());


        return myGirlFriends.get(index);

    }

    public static String myRelations() {
        List<String> myRelations = new ArrayList<String>();
        myRelations.add("love");
        myRelations.add("serious");
        myRelations.add("complicated");
        Random random = new Random();
        int index = random.nextInt(myRelations.size());


        return myRelations.get(index);

    }
        public static void random ()
        {

            String listFriend = myList();
            String listEmotion = myRelations();
            String listGf = myEx();

        System.out.print(listFriend + " " + listEmotion + " " + listGf);

    }

}






