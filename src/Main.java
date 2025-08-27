import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhoneBook pb1 = new PhoneBook();
        System.out.println("enter the size of your phoneBook");
        int size=in.nextInt();
        in.nextLine();
        pb1.setSize(size);
        for(int i=0;i<size ;i++)
        {
            System.out.println("enter Name#"+(i+1));
            String name=in.nextLine();
            System.out.println("enter phone#"+(i+1));
            String phone=in.nextLine();
            pb1.addEntry(name,phone);
            pb1.displayEntryAtIndex(i);
        }

        System.out.println("1-display all phone book");
        System.out.println("2-search for entry/entries by name");
        System.out.println("3-search for entry/entries by phone");
        System.out.println("4-find an entry by index");
        System.out.println("5-update name by index");
        System.out.println("6-update phone by index");
        System.out.println("7-copy phone book to another and display entries");
        System.out.println("8-exit");

        System.out.println("Enter your choice: ");
        int choice = in.nextInt();
        in.nextLine();
        switch (choice) {
            case 1:
                pb1.displayAll();
                break;
            case 2:
                System.out.println("Enter name to search:");
                String search = in.nextLine();
                int[] arr = pb1.findByName(search);
                pb1.displayEntryAtIndices(arr);
                break;
            case 3:
                System.out.println("enter phone number");
                String phone = in.nextLine();
                System.out.println(pb1.findByPhone(phone));
                break;
            case 4:
                System.out.println("enter index");
                int i = in.nextInt();
                pb1.displayEntryAtIndex(i);
                break;
            case 5:
                System.out.println("enter the index ");
                int i5 = in.nextInt();
                in.nextLine();
                System.out.println("enter new name");
                String name = in.nextLine();
                pb1.updateNameAt(name, i5);
                break;
            case 6:
                System.out.println("enter the index ");
                int i6 = in.nextInt();
                in.nextLine();
                System.out.println("enter new phone number");
                String newPhone = in.nextLine();
                pb1.updatePhoneAt(newPhone, i6);
                break;
            case 7:
                PhoneBook pb2 = new PhoneBook();
                pb1.copyPB(pb2);
                System.out.println("Copied phonebook:");
                pb2.displayAll();
                break;
            case 8:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
        }




  }

    }

