// //uppgift 1
// void main () {

//     int cupons_left = 10;

//     // IO.println("circus");
//     // IO.println("go home");
//     while (true) {
//         IO.println("Welcome to park number 11 you as an entree now have 10 cupons");
//         String[] what_to_do = { "1. rolllercoster ", "2. circus ", "3. go home " };
//         IO.print(what_to_do[0]);
//         IO.print(what_to_do[1]);
//         IO.print(what_to_do[2]);

//         int choice = 0;
//         int height= 0;
//         try {

//             choice = Integer.parseInt(IO.readln("give your choice: "));
//             height = Integer.parseInt(IO.readln("how tall are you? "));
//             // how do i make it remember height if not via reurn ?

//         } catch (NumberFormatException a ) {
//             IO.println("sorry not one of the coichses");
//             continue ;
//         }

//         if (choice == 1 && height > 1) {
//             IO.println("whee");
//             cupons_left = cupons_left - 2;
//             IO.println("you spent 2 cupons and now have: " + cupons_left + " cupons left ");

//         } 
//         else if (choice == 1 && height <=1){
//            IO.println(" no can do bacaroo  too short");
//            continue;

//         }

//         if (choice == 2) {
//             IO.println("wheee");
//             cupons_left = cupons_left - 2;
//             IO.println("you spent 2 cupons and now have: " + cupons_left + " cupons left ");
//         } else if (choice == 3) {
//             IO.println("bye");
//             break;

//         } else if (choice == 1 && cupons_left == 0 || choice == 2 && cupons_left == 0) {
//             IO.println("no can do you have 0 cupons left you must go home");
//             break;
//         }

//         if (choice> 3){
//             IO.println("not a choise");
//             continue;
//         }

//     }

//     // int age = Integer.parseInt(IO.readln("give your age:"));

// }

public static double subs(int a) {
    return a;
}

void main() {

    IO.println("hello welcome to the calculator. ");
    IO.println("What would you like to do today? ");
    while (true) {
        IO.println("press 1 to add ");
        IO.println("press 2 to subtract ");
        IO.println("press 3 to multiply ");
        IO.println("press 4 to divide ");
        IO.println("press 5 to stop");

        int eq_of_choice = 0;
        try {
            eq_of_choice = Integer.parseInt(IO.readln("please proceed and write the number:  "));
        } catch (NumberFormatException e) {

            IO.println("unfortunatley not a number");
            return;
        }

        if (eq_of_choice == 1) {
            int add1 = 0;
            int add2 = 0;
            try {
                add1 = Integer.parseInt(IO.readln("write the first number: "));

                add2 = Integer.parseInt(IO.readln("write the second number: "));

            } catch (NumberFormatException a) {

            }
        } else if (eq_of_choice == 2) {

            int sub1 = 0;
            int sub2 = 0;
            try {
                sub1 = Integer.parseInt(IO.readln("write the first number: "));

                sub2 = Integer.parseInt(IO.readln("write the second number: "));

            } catch (NumberFormatException b) {

            }
            int a = sub1 - sub2;
            a = (int) subs(a);
            IO.println("you got:" + a);

        } else if (eq_of_choice == 3) {
            int mult1 = 0;
            int mult2 = 0;
            try {
                mult1 = Integer.parseInt(IO.readln("write the first number: "));

                mult2 = Integer.parseInt(IO.readln("write the second number: "));

            } catch (NumberFormatException c) {

            }

        } else if (eq_of_choice == 4) {
            int div1 = 0;
            int div2 = 0;
            try {
                div1 = Integer.parseInt(IO.readln("write the first number: "));

                div2 = Integer.parseInt(IO.readln("write the second number: "));

            } catch (NumberFormatException l) {

            }

        } else if (eq_of_choice == 5) {

            IO.println("bye");
            break;

        } else {

            IO.println("no such calculation exists here try again");
            IO.readln();
            continue;
        }

        IO.println();
        IO.println();
        IO.println();
        IO.println();

    }

}
