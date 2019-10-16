import java.util.*;
import java.io.*;
public class hashflora {

    public static void main(String[] args) throws IOException
    {
        //Create a hashtable
        Hashtable<String, String> Flora = new Hashtable<String, String>();

        //File file = new File("flora.csv");
        //Scanner infile = new Scanner(file);

        BufferedReader rd = new BufferedReader(new FileReader("flora.csv"));

        String line;
        int count = 0;
        while((line = rd.readLine()) != null){

        //while (infile.hasNextLine()) {
            count++;
            //Temp = infile.nextLine();
            //System.out.println(Temp);
            String[] Parts = line.split(",");
            Flora.put(Parts[0],Parts[1]);
        }
        System.out.println();
        System.out.println(count + " flora read into a hashtable");
        System.out.println();

        System.out.println("1 = Search for a flora.");
        System.out.println("2 = Add a new flora.");
        System.out.println("3 = Delete a flora.");
        System.out.println();
        System.out.println("Select one of the option from the above list.");

        int choice = 0;
        //System.out.println("Your choice: " + choice );
        boolean validInput = false;
        while(!validInput) {
            try {
                Scanner console = new Scanner(System.in);
                choice = console.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers between 0 - 4.");
                Scanner console = new Scanner(System.in);
                console.next();
            }
        }

        System.out.println("Your choice: " + choice);

            if (choice == 1) {
                System.out.println("Enter the name of the flora.");
                //console.nextLine();
                Scanner console1 = new Scanner(System.in);
                String f1 = console1.nextLine();

                System.out.println("Flora Name: " + f1);
                Flora.get(f1);
                if (Flora.get(f1) != null)
                    System.out.println("This flora was found. Family = " + Flora.get(f1));
                else
                    System.out.println("This flora was not found!");
            } else if (choice == 2) {
                Scanner console2 = new Scanner(System.in);
                System.out.println("To add, enter the name and family.");
                System.out.print("Flora name: ");
                String f2 = console2.nextLine();
                System.out.print("Flora family: ");
                String f3 = console2.nextLine();
                Flora.put(f2, f3);
                System.out.println();
                System.out.println("Name " + f2 + " & family " + f3 + " has been successfully added.");
            } else if (choice == 3) {
                System.out.println("Delete - Enter the name to delete.");
                //console.nextLine();
                Scanner console3 = new Scanner(System.in);
                String f4 = console3.nextLine();
                Flora.remove(f4);
                System.out.println(f4 + " has been deleted successfully. Cheers!! :)");
            } else {
                System.out.println("Please enter the number from the list and try again.");
            }

/*
        //search - ask the user to enter name of the flora
        System.out.println(Flora.get("pear"));
        //add - ask user to enter name and family
        //delete - ask user to enter name to delete
        Flora.remove("pear");
 */
    }
}
