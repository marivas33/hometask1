package hometask13;

import utils.Helper;

public class Password {
    public static void passwordGenerator(){
        char[] password = new char[8];
        char smallL[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char bigL[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char number[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char symbol[] = {'!', '@', '#', '%', '_'};

        int symbol1 = Helper.getRandom(0, 5);
        int number1 = Helper.getRandom(0, 9);
        int number2 = Helper.getRandom(0, 9);
        int number3 = Helper.getRandom(0, 9);
        int smallL1 = Helper.getRandom(0, 25);
        int smallL2 = Helper.getRandom(0, 25);
        int bigL1 = Helper.getRandom(0, 25);
        int bigL2 = Helper.getRandom(0, 25);

        password[0] = symbol[symbol1];
        password[1] = number[number1];
        password[2] = smallL[smallL1];
        password[3] = number[number2];
        password[4] = bigL[bigL1];
        password[5] = smallL[smallL2];
        password[6] = number[number3];
        password[7] = bigL[bigL2];

        for (int i = 0; i < password.length; i++) {
            Helper.swapChar(password, i, Helper.getRandom(0, 7));

        }
        System.out.println(password);

    }
}
