package collection.enums;

public class Demo {


    // this is not public and protected
    enum Week{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THRUSDAY

    }


    public static void main(String[] args) {

        Week  week = Week.MONDAY;

        for(Week day: Week.values()){
            System.out.println(day);
        }

    }
}
