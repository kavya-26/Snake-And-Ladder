package service;

import static service.BoardFunctions.pauseGame;

public class AsciiArt {
    public static void printDice(int d) {
        if (d ==1) {
            System.out.println(" ----- ");
            System.out.println("|     |");
            System.out.println("|  0  |");
            System.out.println("|     |");
            System.out.println(" ----- ");
            pauseGame(999);
        } else if (d ==2) {
            System.out.println(" ----- ");
            System.out.println("|0    |");
            System.out.println("|     |");
            System.out.println("|    0|");
            System.out.println(" ----- ");
            pauseGame(999);
        } else if (d ==3) {
            System.out.println(" ----- ");
            System.out.println("|0    |");
            System.out.println("|  0  |");
            System.out.println("|    0|");
            System.out.println(" ----- ");
            pauseGame(999);
        } else if (d == 4) {
            System.out.println(" ----- ");
            System.out.println("|0   0|");
            System.out.println("|     |");
            System.out.println("|0   0|");
            System.out.println(" ----- ");
            pauseGame(999);
        }else if (d == 5) {
            System.out.println(" ----- ");
            System.out.println("|0   0|");
            System.out.println("|  0  |");
            System.out.println("|0   0|");
            System.out.println(" ----- ");
            pauseGame(999);
        } else if (d == 6) {
            System.out.println(" ----- ");
            System.out.println("|0   0|");
            System.out.println("|0   0|");
            System.out.println("|0   0|");
            System.out.println(" ----- ");
            pauseGame(999);
        }

    }
    public static void boardImage(){
        System.out.println("WELCOME TO SNAKES AND LADDER  ");
        System.out.println(" ");
        pauseGame(1000);
        System.out.print("          ...I. ~7?N..                                      \n" +
                "       ...O7I.  .7I7777Z...                                 \n" +
                "      .=77II$$ ..III777OOOD.                                \n" +
                "    .$777IIIM..=?IIII7ZOOO$7+.                              \n" +
                "   .777IIIIIIII+:~~?I7$ZZ$777M                              \n" +
                "  .Z77INIIIII?~::~~+IIO~~I$ZZO            . .               \n" +
                "  ..+?????+=~:~:~:+O.. .~IOOOO        ....O,.               \n" +
                "     ..7::~:=,O..     .:=7ZOZ8   ..O88OZZZO8                \n" +
                "    .    ...       ..~=+I777.. .,$$ZO8OZZZOO.               \n" +
                "  .777$MNM.     ..~~~+$OZ$,.  .OOZZZOZZZOO88.               \n" +
                "  .8Z..=. ~  ..~~==+?7ZO..   Z$OOOZZ$.=O888.                \n" +
                "  .$.     .O~~~~?$ZZ7M.    .ZZ$ZOOZ.,~7OOO..                \n" +
                "  ..   . :=~+?II7ZO..     .OOOZ$$$.~=$ZZ$.. ... ..$         \n" +
                "       ~~~=7ZOZ$..     ..O$ZOOO$7M~?O88.  ..:8OOZ.          \n" +
                "     .~~=I7$ZOZ.      ..OZ$$ZZZ.==IZOO.. ..ZO88OZ.          \n" +
                "    .~~?$Z$7$.      ..$OOOZ$$Z.==O8O,   .OOOOI=ZO.          \n" +
                "   .O~+$OOOZ.       Z$$ZOOZZ8.~=$O8.. ..O88OO.=Z..      ... \n" +
                " .. =~IZZO8O.  ..7OOOZ$ZZZZ..+~$ZZ.  .,OOOON.M=O     ...$.  \n" +
                "   .7=IZZZZZZO88ZZO88OZZZ8.  ~+OO8. .88OZZM. N=Z=.  ..Z..   \n" +
                " ..8.=IZZZOO888OZZOOOOZ$..   ~?8888OO88OO..  .M+ZOOOO..     \n" +
                "     7~IZO8888OZZZZZZZ.     7.~ZOOOOO8OZ..       .          \n" +
                "     ..~=?7ZZZZZZZ$. .     ..:.=IZZZZN.                     \n" +
                "         ,=~=+M..                ...                        ");
        pauseGame(1000);
        System.out.print(" ,., , ,,.M$N.,  ,., ,.M$M,., ,  ,., , ,\n" +
                " ,.,., ,,.M$8.,. ,.,.,.Z$M,.,.,. ,.,., ,\n" +
                " , , , ,, M$8$$$$$$$$$$Z$M, , ,  , , , ,\n" +
                " , , , ,,.M$88DDDDDDDDDZ$M, , ,  , , , ,\n" +
                ",.,.,.,. .M$8,.,,.,.,..Z$M.,.,.,,.,.,.,.\n" +
                ", ,.,.,. ,M$8?+??+?+?+?Z$M.,., ,, ,.,.,.\n" +
                ", ,.,.,. .M$8$$$$$$$$$$Z$M.,., ,, ,.,.,.\n" +
                ". , , , .,M$8,.,, , , .Z$M , ,.,. , , , \n" +
                "..,.,... ,M$8,.,..,.,..Z$M.,.,.,..,.,...\n" +
                " ,.,., ,,.M$8MMMMMMMMMMZ$M,.,.,. ,.,., ,\n" +
                " ..,., ,,.M$8$$$$$$$$$$Z$M,.,.,. ..,., ,\n" +
                " ,.,., ,,.M$8.,. ,.,.,.Z$M,.,.,. ,.,., ,\n" +
                ".,.,., ,,.M$8.,..,.,.,.Z$M,.,.,..,.,., ,\n" +
                "..........M$8MMMMMMMMMMZ$M..............\n" +
                ",.,.,.,. .M$8$$$$$$$$$$Z$M.,., ,,.,.,.,.\n" +
                ",.,.,.,. .M$8, ,,.,.,..Z$M.,., ,,.,.,.,.\n" +
                ", ,.,.,. ,M$8, ,, ,.,..Z$M.,., ,, ,.,.,.\n" +
                ",.,.,.,. ,M$8$$$$$$$$$$Z$M.,., ,,.,.,.,.\n" +
                ".,.,., ,. M$8MMMMMMMMMMZ$M,.,.,..,.,., ,\n" +
                " ,.,., ,,.M$8.,. ,.,.,.Z$M,.,.,. ,.,., ,\n" +
                " ,.,., ,,.M$8 ,. ,.,.,.Z$M,.,.,. ,.,., ,\n" +
                " ,.,., ,,.M$8$$$$$$$$$$Z$M,.,.,. ,.,., ,\n" +
                " , , , ,, M$87777777777Z$M, , ,  , , , ,\n" +
                ",.,.,.,. ,M$8, ,,.,.,..Z$M.,., ,,.,.,.,.\n" +
                ",.,.,.,. .M$8, ,,.,.,..Z$M.,., ,,.,.,.,.\n" +
                ",.,.,.,. ,.:.,.,,.,.,.,.,,.,.,.,,.,.,.,.\n" +
                ", ,.,.,. ,.,., ,, ,.,.,. ,.,., ,, ,.,.,.\n" +
                " , , , ,,.,., ,  , , , ,,.,., ,  , , , ,\n" +
                "                         ");
        System.out.println(" ");
        pauseGame(1000);
        System.out.println("<<< LETS START THE GAME >>>");
        pauseGame(1000);




    }
}
