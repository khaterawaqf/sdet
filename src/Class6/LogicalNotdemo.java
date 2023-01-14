package Class6;

public class LogicalNotdemo {
    public static void main(String[] args) {

        String day="monday";
        if (day.equalsIgnoreCase("monday")||day.equals("friday")){
            System.out.println("no class today enjoy");

        }else if(day.equalsIgnoreCase("saturday")|| day.equalsIgnoreCase("sunday")){
            System.out.println("java class enjoy");

        }else  if (day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("tuesday")){
            System.out.println("manual Testing class");


        }else if (day.equalsIgnoreCase("thursday")){
            System.out.println("review class");

        }else {
            System.out.println("wrong dar entered");

        }

    }
}
