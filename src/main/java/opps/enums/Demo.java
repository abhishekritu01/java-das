package opps.enums;

enum status {
    PENDING, APPROVED, REJECTED  // Enum constants ====>>>  are objects of the class
}

public class Demo {

//    public static void main(String[] args) {
//        status s = status.APPROVED;
//        System.out.println(s);
//
//        status [] s1 = status.values();
//        for (status s2 : s1) {
//            System.out.println(s2);
//        }
//    }


    // part 69

    public static void main(String[] args) {
        status s = status.APPROVED;

//        if (s == status.APPROVED) {
//            System.out.println(" this is approved");
//        } else if (s == status.PENDING) {
//            System.out.println(" this is pending");
//        } else {
//            System.out.println(" this is rejected");
//        }


        switch (s) {
            case APPROVED:
                System.out.println(" this is approved");
                break;
            case PENDING:
                System.out.println(" this is pending");
                break;
            case REJECTED:
                System.out.println(" this is rejected");
                break;
        }

    }

}
