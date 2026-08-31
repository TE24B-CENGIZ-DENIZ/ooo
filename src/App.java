//uppgift 1
void main () {

    int cupons_left = 10;

    IO.println("Welcome to park number 11 you as an entree now have 10 cupons");
    String[] what_to_do = { "1. rolllercoster ", "2. circus ", "3. go home " };
    IO.print(what_to_do[0]);
    IO.print(what_to_do[1]);
    IO.print(what_to_do[2]);
    // IO.println("circus");
    // IO.println("go home");
    while (true) {
        
        int choice = 0;
        int height= 0;
        try {

            choice = Integer.parseInt(IO.readln("give your choice: "));
            height = Integer.parseInt(IO.readln("how tall are you? "));


        } catch (NumberFormatException a ) {
            IO.println("sorry not one of the coichses");
            return;
        }

        if (choice == 1 && height > 1) {
            IO.println("whee");
            cupons_left = cupons_left - 2;
            IO.println("you spent 2 cupons and now have: " + cupons_left + " cupons left ");

        } 
        else if (choice == 1 && height <=1){
           IO.println(" no can do bacaroo  too short");
           break;

        }

        if (choice == 2) {
            IO.println("wheee");
            cupons_left = cupons_left - 2;
            IO.println("you spent 2 cupons and now have: " + cupons_left + " cupons left ");
        } else if (choice == 3) {
            IO.println("bye");
            break;

        } else if (choice == 1 && cupons_left == 0 || choice == 2 && cupons_left == 0) {
            IO.println("no can do you have 0 cupons left you must go home");
            break;
        }
        
    }

    // int age = Integer.parseInt(IO.readln("give your age:"));

}
