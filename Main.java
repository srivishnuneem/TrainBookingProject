import java.util.*;

public class Main {



    static Scanner X = new Scanner(System.in);
    private static int referenceNo = 0;
    private static String nameAndReferenceNoForLowerBerth[] = new String[18];
    private static List<String> nameAndReferenceNoForLowerBerthWaitingList = new ArrayList<String>();
    private static String nameAndReferenceNoForMiddleBerth[] = new String[18];
    private static List<String> nameAndReferenceNoForMiddleBerthWaitingList = new ArrayList<String>();
    private static String nameAndReferenceNoForUpperBerth[] = new String[18];
    private static List<String> nameAndReferenceNoForUpperBerthWaitingList = new ArrayList<String>();
    private static String nameAndReferenceNoForSideUpperBerth[] = new String[9];
    private static List<String> nameAndReferenceNoForSideUpperBerthWaitingList = new ArrayList<String>();
    private static String nameAndReferenceNoForSideLowerBerth[] = new String[9];
    private static List<String> nameAndReferenceNoForSideLowerBerthWaitingList = new ArrayList<String>();
    private static String nameAndReferenceNoForSideLowerBerthSpecial[] = new String[9];

    public static void main(String[] args) {
        main();
    }
    public static void main() {
        while (true) {
            System.out.print("enter 1 to check availability, 2 to train booking and 3 to cancel the ticket : ");
            int c = X.nextInt();
            switch (c) {
                case 1:
                    availability();
                    break;
                case 2:
                    booking();
                    break;
                case 3:
                    cancel();
                    break;
                default:
                    System.out.println(" pls, Enter the correct input, enter 1 to check availability, 2 to train booking and 3 to cancel the ticket : ");
            }
        }
    }


    public static void availability() {
        int availableBerth = 0;
        for (int i = 0; i < nameAndReferenceNoForLowerBerth.length; i++) {
            if (nameAndReferenceNoForLowerBerth[i] == null) {
                availableBerth++;
            }
        }
        System.out.println("In Lower Birth sheet availability : " + availableBerth);
        availableBerth = 0;
        for (int i = 0; i < nameAndReferenceNoForMiddleBerth.length; i++) {
            if (nameAndReferenceNoForMiddleBerth[i] == null) {
                availableBerth++;
            }
        }
        System.out.println("In Middle Birth sheet availability : " + availableBerth);
        availableBerth = 0;
        for (int i = 0; i < nameAndReferenceNoForUpperBerth.length; i++) {
            if (nameAndReferenceNoForUpperBerth[i] == null) {
                availableBerth++;
            }
        }
        System.out.println("In Upper Birth sheet availability : " + availableBerth);
        availableBerth = 0;
        for (int i = 0; i < nameAndReferenceNoForSideUpperBerth.length; i++) {
            if (nameAndReferenceNoForSideUpperBerth[i] == null) {
                availableBerth++;
            }
        }
        System.out.println("In Side Upper Birth sheet availability : " + availableBerth);
        int sideLowerAvailableBerth = 0;
        for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
            if (nameAndReferenceNoForSideLowerBerth[i] == null) {
                sideLowerAvailableBerth++;
            }
        }
        if (sideLowerAvailableBerth != 0)
            System.out.println("In Side Lower Birth sheet availability : " + sideLowerAvailableBerth);
        else {
            for (int i = 0; i < nameAndReferenceNoForSideLowerBerthSpecial.length; i++) {
                if (nameAndReferenceNoForSideLowerBerthSpecial[i] == null) {
                    sideLowerAvailableBerth++;
                }
            }
            System.out.println("In Side Lower Birth sheet availability : 0 \n In Side Lower non bed Birth sheet availability : " + sideLowerAvailableBerth);
        }
        sideLowerAvailableBerth = 0;
    }


    public static void booking() {
        while (true) {
            System.out.print("enter 1 to lowerBerth, 2 to middleBerth, 3 to upperBerth, 4 to sideUpperBerth, 5 to sideLowerBerth, and 6 to main menu : ");
            int c = X.nextInt();
            switch (c) {
                case 1:
                    if (nameAndReferenceNoForLowerBerth[17] == null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        for (int i = 0; i < nameAndReferenceNoForLowerBerth.length; i++) {
                            if (nameAndReferenceNoForLowerBerth[i] == null) {
                                nameAndReferenceNoForLowerBerth[i] = name + ", " + ++referenceNo;
                                System.out.println("Your train is booked successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                                break;
                            }
                        }
                    } else {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        nameAndReferenceNoForLowerBerthWaitingList.add(name + ", " + ++referenceNo);
                        System.out.println("Your train is in waiting list Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                    }
                    break;
                case 2:
                    if (nameAndReferenceNoForMiddleBerth[17] == null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        for (int i = 0; i < nameAndReferenceNoForMiddleBerth.length; i++) {
                            if (nameAndReferenceNoForMiddleBerth[i] == null) {
                                nameAndReferenceNoForMiddleBerth[i] = name + ", " + ++referenceNo;
                                System.out.println("Your train is booked successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                                break;
                            }
                        }
                    } else {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        nameAndReferenceNoForMiddleBerthWaitingList.add(name + ", " + ++referenceNo);
                        System.out.println("Your train is in waiting list Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                    }
                    break;
                case 3:
                    if (nameAndReferenceNoForUpperBerth[17] == null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        for (int i = 0; i < nameAndReferenceNoForUpperBerth.length; i++) {
                            if (nameAndReferenceNoForUpperBerth[i] == null) {
                                nameAndReferenceNoForUpperBerth[i] = name + ", " + ++referenceNo;
                                System.out.println("Your train is booked successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                                break;
                            }
                        }
                    } else {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        nameAndReferenceNoForUpperBerthWaitingList.add(name + ", " + ++referenceNo);
                        System.out.println("Your train is in waiting list Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                    }
                    break;
                case 4:
                    if (nameAndReferenceNoForSideUpperBerth[8] == null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        for (int i = 0; i < nameAndReferenceNoForSideUpperBerth.length; i++) {
                            if (nameAndReferenceNoForSideUpperBerth[i] == null) {
                                nameAndReferenceNoForSideUpperBerth[i] = name + ", " + ++referenceNo;
                                System.out.println("Your train is booked successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                                break;
                            }
                        }
                    } else {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        nameAndReferenceNoForSideUpperBerthWaitingList.add(name + ", " + ++referenceNo);
                        System.out.println("Your train is in waiting list Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                    }
                    break;
                case 5:
                    if (nameAndReferenceNoForSideLowerBerth[8] == null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
                            if (nameAndReferenceNoForSideLowerBerth[i] == null) {
                                nameAndReferenceNoForSideLowerBerth[i] = name + ", " + ++referenceNo;
                                System.out.println("Your train is booked successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                                break;
                            }
                        }
                    } else if (nameAndReferenceNoForSideLowerBerthSpecial[8] == null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        for (int i = 0; i < nameAndReferenceNoForSideLowerBerthSpecial.length; i++) {
                            if (nameAndReferenceNoForSideLowerBerthSpecial[i] == null) {
                                nameAndReferenceNoForSideLowerBerthSpecial[i] = name + ", " + ++referenceNo;
                                System.out.println("Your train is booked successfully in non bed berth Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                                break;
                            }
                        }
                    } else {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        nameAndReferenceNoForSideLowerBerthWaitingList.add(name + ", " + ++referenceNo);
                        System.out.println("Your train is in waiting list Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                    }
                    break;
                case 6:
                    main();
                    break;
                default:
                    System.out.println(" pls, Enter the correct input, enter 1 to check availability, 2 to train booking and 3 to cancel the ticket : ");
            }
        }
    }

    public static void cancel() {
        while (true){
            System.out.print("enter 1 to lowerBerth, 2 to middleBerth, 3 to upperBerth, 4 to sideUpperBerth, 5 to sideLowerBerth, and 6 to main menu : ");
            int c = X.nextInt();
            switch (c) {
                case 1:
                    if (nameAndReferenceNoForLowerBerth[0] != null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        System.out.print("Enter your reference no : ");
                        String refNo = X.nextLine();
                        String detail = name + ", " + refNo;
                        boolean isPresent = false;
                        for (int i = 0; i < nameAndReferenceNoForLowerBerth.length; i++) {
                            if (Objects.equals(nameAndReferenceNoForLowerBerth[i], detail)) {
                                isPresent = true;
                                break;
                            }
                        }
                        if (isPresent == true) {
                            String[] newArray = new String[nameAndReferenceNoForLowerBerth.length];
                            int j = 0;
                            for (int i = 0; i < nameAndReferenceNoForLowerBerth.length; i++) {
                                if (!Objects.equals(nameAndReferenceNoForLowerBerth[i], detail)) {
                                    newArray[j] = nameAndReferenceNoForLowerBerth[i];
                                    j++;
                                }
                            }
                            nameAndReferenceNoForLowerBerth = newArray;
                            if (nameAndReferenceNoForLowerBerthWaitingList.size() > 0) {
                                String detail1 = nameAndReferenceNoForLowerBerthWaitingList.get(0);
                                nameAndReferenceNoForLowerBerth[17] = detail1;
                                nameAndReferenceNoForLowerBerthWaitingList.remove(detail1);
                            }
                            System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + ++referenceNo);
                        } else {
                            if (nameAndReferenceNoForLowerBerthWaitingList.contains(detail)) {
                                nameAndReferenceNoForLowerBerthWaitingList.remove(detail);
                                System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                            } else
                                System.out.println("Enter the Correct input");
                        }
                    } else
                        System.out.println("Enter the Correct input");
                    break;
                case 2:

                    if (nameAndReferenceNoForMiddleBerth[0] != null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        System.out.print("Enter your reference no : ");
                        String refNo = X.nextLine();
                        String detail = name + ", " + refNo;
                        boolean isPresent = false;
                        for (int i = 0; i < nameAndReferenceNoForMiddleBerth.length; i++) {
                            if (Objects.equals(nameAndReferenceNoForMiddleBerth[i], detail)) {
                                isPresent = true;
                                break;
                            }
                        }
                        if (isPresent == true) {
                            String[] newArray = new String[nameAndReferenceNoForMiddleBerth.length];
                            int j = 0;
                            for (int i = 0; i < nameAndReferenceNoForMiddleBerth.length; i++) {
                                if (!Objects.equals(nameAndReferenceNoForMiddleBerth[i], detail)) {
                                    newArray[j] = nameAndReferenceNoForMiddleBerth[i];
                                    j++;
                                }
                            }
                            nameAndReferenceNoForMiddleBerth = newArray;
                            if (nameAndReferenceNoForMiddleBerthWaitingList.size() > 0) {
                                String detail1 = nameAndReferenceNoForMiddleBerthWaitingList.get(0);
                                nameAndReferenceNoForMiddleBerth[17] = detail1;
                                nameAndReferenceNoForMiddleBerthWaitingList.remove(detail1);
                            }
                            System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + ++referenceNo);
                        } else {
                            if (nameAndReferenceNoForMiddleBerthWaitingList.contains(detail)) {
                                nameAndReferenceNoForMiddleBerthWaitingList.remove(detail);
                                System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                            } else
                                System.out.println("Enter the Correct input");
                        }
                    } else
                        System.out.println("Enter the Correct input");
                    break;
                case 3:

                    if (nameAndReferenceNoForUpperBerth[0] != null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        System.out.print("Enter your reference no : ");
                        String refNo = X.nextLine();
                        String detail = name + ", " + refNo;
                        boolean isPresent = false;
                        for (int i = 0; i < nameAndReferenceNoForUpperBerth.length; i++) {
                            if (Objects.equals(nameAndReferenceNoForUpperBerth[i], detail)) {
                                isPresent = true;
                                break;
                            }
                        }
                        if (isPresent == true) {
                            String[] newArray = new String[nameAndReferenceNoForUpperBerth.length];
                            int j = 0;
                            for (int i = 0; i < nameAndReferenceNoForUpperBerth.length; i++) {
                                if (!Objects.equals(nameAndReferenceNoForUpperBerth[i], detail)) {
                                    newArray[j] = nameAndReferenceNoForUpperBerth[i];
                                    j++;
                                }
                            }
                            nameAndReferenceNoForUpperBerth = newArray;
                            if (nameAndReferenceNoForUpperBerthWaitingList.size() > 0) {
                                String detail1 = nameAndReferenceNoForUpperBerthWaitingList.get(0);
                                nameAndReferenceNoForUpperBerth[17] = detail1;
                                nameAndReferenceNoForUpperBerthWaitingList.remove(detail1);
                            }
                            System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + ++referenceNo);
                        } else {
                            if (nameAndReferenceNoForUpperBerthWaitingList.contains(detail)) {
                                nameAndReferenceNoForUpperBerthWaitingList.remove(detail);
                                System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                            } else
                                System.out.println("Enter the Correct input");
                        }
                    } else
                        System.out.println("Enter the Correct input");
                    break;
                case 4:

                    if (nameAndReferenceNoForSideUpperBerth[0] != null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        System.out.print("Enter your reference no : ");
                        String refNo = X.nextLine();
                        String detail = name + ", " + refNo;
                        boolean isPresent = false;
                        for (int i = 0; i < nameAndReferenceNoForSideUpperBerth.length; i++) {
                            if (Objects.equals(nameAndReferenceNoForSideUpperBerth[i], detail)) {
                                isPresent = true;
                                break;
                            }
                        }
                        if (isPresent == true) {
                            String[] newArray = new String[nameAndReferenceNoForSideUpperBerth.length];
                            int j = 0;
                            for (int i = 0; i < nameAndReferenceNoForSideUpperBerth.length; i++) {
                                if (!Objects.equals(nameAndReferenceNoForSideUpperBerth[i], detail)) {
                                    newArray[j] = nameAndReferenceNoForSideUpperBerth[i];
                                    j++;
                                }
                            }
                            nameAndReferenceNoForSideUpperBerth = newArray;
                            if (nameAndReferenceNoForSideUpperBerthWaitingList.size() > 0) {
                                String detail1 = nameAndReferenceNoForSideUpperBerthWaitingList.get(0);
                                nameAndReferenceNoForSideUpperBerth[17] = detail1;
                                nameAndReferenceNoForSideUpperBerthWaitingList.remove(detail1);
                            }
                            System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + ++referenceNo);
                        } else {
                            if (nameAndReferenceNoForSideUpperBerthWaitingList.contains(detail)) {
                                nameAndReferenceNoForSideUpperBerthWaitingList.remove(detail);
                                System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                            } else
                                System.out.println("Enter the Correct input");
                        }
                    } else
                        System.out.println("Enter the Correct input");
                    break;
                case 5:

                    if (nameAndReferenceNoForSideLowerBerth[0] != null) {
                        System.out.print("Enter your name : ");
                        X.nextLine();
                        String name = X.nextLine();
                        System.out.print("Enter your reference no : ");
                        String refNo = X.nextLine();
                        String detail = name + ", " + refNo;
                        boolean isPresent = false;
                        boolean isPresentInSpecial = false;
                        for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
                            if (Objects.equals(nameAndReferenceNoForSideLowerBerth[i], detail)) {
                                isPresent = true;
                                break;
                            }
                        }
                        for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
                            if (Objects.equals(nameAndReferenceNoForSideLowerBerthSpecial[i], detail)) {
                                isPresentInSpecial = true;
                                break;
                            }
                        }
                        if (isPresent == true) {
                            String[] newArray = new String[nameAndReferenceNoForSideLowerBerth.length];
                            int j = 0;
                            for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
                                if (!Objects.equals(nameAndReferenceNoForSideLowerBerth[i], detail)) {
                                    newArray[j] = nameAndReferenceNoForSideLowerBerth[i];
                                    j++;
                                }
                            }
                            nameAndReferenceNoForSideLowerBerth = newArray;
                            if (nameAndReferenceNoForSideLowerBerthSpecial.length > 0) {
                                nameAndReferenceNoForSideLowerBerth[8] = nameAndReferenceNoForSideLowerBerthSpecial[0];
                                j = 0;
                                for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
                                    if (!Objects.equals(nameAndReferenceNoForSideLowerBerthSpecial[i], nameAndReferenceNoForSideLowerBerthSpecial[0])) {
                                        newArray[j] = nameAndReferenceNoForSideLowerBerthSpecial[i];
                                        j++;
                                    }
                                }
                                nameAndReferenceNoForSideLowerBerthSpecial = newArray;
                            }
                                if (nameAndReferenceNoForSideLowerBerthWaitingList.size()>0){
                                nameAndReferenceNoForSideLowerBerth [8] = nameAndReferenceNoForSideLowerBerthWaitingList.get(0);
                                nameAndReferenceNoForSideLowerBerthWaitingList.remove(nameAndReferenceNoForSideLowerBerth [8]);
                            }
                            System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + ++referenceNo);
                        } else if (isPresentInSpecial == true) {
                            String[] newArray = new String[nameAndReferenceNoForSideLowerBerthSpecial.length];
                            int j = 0;
                            for (int i = 0; i < nameAndReferenceNoForSideLowerBerth.length; i++) {
                                if (!Objects.equals(nameAndReferenceNoForSideLowerBerthSpecial[i], detail)) {
                                    newArray[j] = nameAndReferenceNoForSideLowerBerthSpecial[i];
                                    j++;
                                }
                            }
                            nameAndReferenceNoForSideLowerBerthSpecial = newArray;
                            if (nameAndReferenceNoForSideLowerBerthWaitingList.size() > 0) {
                                String detail1 = nameAndReferenceNoForSideLowerBerthWaitingList.get(0);
                                nameAndReferenceNoForSideLowerBerthSpecial[8] = detail1;
                                nameAndReferenceNoForSideLowerBerthWaitingList.remove(detail1);
                            }
                            System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + ++referenceNo);
                        }
                        else {
                            if (nameAndReferenceNoForSideLowerBerthWaitingList.contains(detail)) {
                                nameAndReferenceNoForSideLowerBerthWaitingList.remove(detail);
                                System.out.println("Your train is canceled successfully Mr./Ms. " + name + " And your Reference Number is " + referenceNo);
                            } else
                                System.out.println("Enter the Correct input");
                        }
                    } else
                        System.out.println("Enter the Correct input");
                    break;
                case 6:
                    main();
                    break;
                default:
                    System.out.println(" pls, Enter the correct input, enter 1 to check availability, 2 to train booking and 3 to cancel the ticket : ");
            }
        }
    }
}