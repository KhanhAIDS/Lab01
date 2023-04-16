import java.util.Scanner;
public class NumOfDaysPredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        while (year < 0) {
            System.out.println("An invalid year. Please enter the year again: ");
            year = scanner.nextInt();
        }

        scanner.nextLine();
        System.out.println("Enter the month: ");
        String month = scanner.nextLine();

        while (check==false) {
            check=true;
            switch (month) {
                case "1": case "Jan": case "Jan.": case "January":
                System.out.println("31 days");
                break;
                case "2": case "Feb": case "Feb.": case "February":
                if (year%400==0) {
                    System.out.println("29 days");
                    break;
                }
                else if (year%4==0 && year%100!=0) {
                    System.out.println("29 days");
                    break;
                }
                else {
                    System.out.println("28 days");
                    break;
                }
                case "3": case "Mar": case "Mar.": case "March":
                System.out.println("31 days");
                case "4": case "Apr": case "Apr.": case "April":
                System.out.println("30 days");
                case "5": case "May": case "May.":
                System.out.println("31 days");
                case "6": case "Jun": case "Jun.": case "June":
                System.out.println("30 days");
                case "7": case "Jul": case "Jul.": case "July":
                System.out.println("31 days");
                case "8": case "Aug": case "Aug.": case "August":
                System.out.println("31 days");
                case "9": case "Sep": case "Sep.": case "September":
                System.out.println("30 days");
                case "10": case "Oct": case "Oct.": case "October":
                System.out.println("31 days");
                case "11": case "Nov": case "Nov.": case "November":
                System.out.println("30 days");
                case "12": case "Dec": case "Dec.": case "December":
                System.out.println("31 days");
                default:
                System.out.println("An invalid month. Please enter the month again: ");
                month = scanner.nextLine();
                check=false;
            }
        }
        scanner.close();
    }
}