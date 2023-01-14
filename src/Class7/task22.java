package Class7;

public class task22 {
    public static void main(String[] args) {
         boolean workday=true;
         int day=1;
         while ((day>8)){
             if (day>=5){
                 System.out.println("i need a day off");

             }else{
                 System.out.println(" im do not need a day off anympre");
                 workday=false;

             }
             day++;
         }

    }
}
