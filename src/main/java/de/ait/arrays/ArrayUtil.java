package de.ait.arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        String[] books = new String[1];
        books[0] = "Harry Potter";
        //books[1] = "Harry Potter 2";
        System.out.println(books[0]);

        //"123121", "12312", "432123", "23245", "6565";
        //"1221", "312", "4313", "345", "665";
        //"1231", "231", "4212", "245", "66";

        String[][] pinCodes = new String[3][5];
        pinCodes[0][0] = "123121";
        pinCodes[1][0] = "1221";
        pinCodes[2][0] = "1231";

        String [][] pinCodesReserve = {{"123121", "12312", "432123"},
                                        {"1221", "312", "4313"},
                                        {"1231", "231", "4212"}};
        //System.out.println(pinCodesReserve[0][1]);

        for (int i =0; i < pinCodesReserve.length; i++)
        {
            for (int y =0; y < pinCodesReserve[i].length; y++){
                System.out.println(pinCodesReserve[i][y]);
            }
        }

    }
}
