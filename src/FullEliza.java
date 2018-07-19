import java.util.*;



public class FullEliza {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String question;
        Random rand = new Random();
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        question = keyboard.nextLine();

        while (!question.equalsIgnoreCase("q") && !question.equalsIgnoreCase("i am feeling great") ) {


            String sampleString = question;
            String[] items = sampleString.split(" ");
            List<String> itemList = new ArrayList<String>(Arrays.asList(items));
            ListIterator<String> iterator = itemList.listIterator();

            while(iterator.hasNext()){
                String next = iterator.next();
                if (next.equalsIgnoreCase("my")){
                    iterator.set("your");
                }else if(next.equalsIgnoreCase("i")){
                    iterator.set("you");
                }else if(next.equalsIgnoreCase("me")){
                    iterator.set("you");
                }else if(next.equalsIgnoreCase("am")){
                    iterator.set("are");
                }
            }
            int qualifier = 1 + rand.nextInt(6);
            if (qualifier == 1){
            itemList.add(0, "Why do you say that ");
            String str = Arrays.toString(itemList.toArray());
            System.out.println(itemList.toString().replace("[","").replace("]","").replace(",", ""));

            question = keyboard.nextLine();
            }
            else if(qualifier == 2){
                itemList.add(0, "You seem to think that ");
                String str = Arrays.toString(itemList.toArray());
                System.out.println(itemList.toString().replace("[","").replace("]","").replace(",", ""));

                question = keyboard.nextLine();
            }
            else if(qualifier == 3){
                itemList.add(0, "So, you are concerned that ");
                String str = Arrays.toString(itemList.toArray());
                System.out.println(itemList.toString().replace("[","").replace("]","").replace(",", ""));

                question = keyboard.nextLine();
            }
            else if(qualifier == 4){
                System.out.println("Please tell me more");
                question = keyboard.nextLine();
            }
            else if(qualifier == 5){
                System.out.println("Many of my patients tell me the same thing");
                question = keyboard.nextLine();
            }
            else{
                System.out.println("It is getting late, maybe we had better quit");
                question = keyboard.nextLine();
            }


        }
        System.out.println("Thank you.");
    }

}