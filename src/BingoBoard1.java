import java.util.Arrays;
import java.security.SecureRandom;


public class BingoBoard1 {
    public int[] numbs = new int[25];
    public boolean[] marks = new boolean[25];
    String ID;

    public BingoBoard1(String id){
        ID = id;
        Arrays.fill(marks, Boolean.FALSE);
        marks[12] = true;


        int[] r1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};               //crates a list of possible number to take a random number from
        int[] r2 = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] r3 = {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
        int[] r4 = {46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
        int[] r5 = {61,62,63,64,65,66,67,68,69,70,71,72,73,74,75};
        SecureRandom rndint = new SecureRandom();

        int[] r = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        for(int i = 0; i < 100; i++){
            int rng1 = rndint.nextInt(15);
            int rng2 = rndint.nextInt(15);
            int a = r[rng1];
            int b = r[rng2];
            r[rng1] = b;
            r[rng2] = a;
        }
        for(int i = 0; i < 5; i++){numbs[i] = r1[r[i]];}
        for(int i = 5; i < 10; i++){numbs[i] = r2[r[i]];}
        for(int i = 10; i < 15; i++){numbs[i] = r3[r[i]];}
        for(int i = 15; i < 20; i++){numbs[i] = r4[r[i-12]];} // i goes out of bounds, have to drop back for the sake of 15 long array
        for(int i = 20; i < 25; i++){numbs[i] = r5[r[i-18]];}
        numbs[12] = 99; //free space

    }

    // 0  1  2  3  4            0  5  10  15  20
    // 5  6  7  8  9            1  6  11  16  21
    // 10 11 12 13 14           2  7  12  17  22
    // 15 16 17 18 19           3  8  13  18  23
    // 20 21 22 23 24           4  9  14  19  24


    // display ID / name
    public String getId(){return ID;}
    public void setID(String ID){this.ID = ID;}

    //add a marker to a board
    public void AddMarker(int BingoNumber){
        for(int i = 0; i < numbs.length; i++) {
            if (numbs[i] == BingoNumber) {
                marks[i] = true;
                break;
            }
        }
    }
    //clear a board of any markers
    public void ClearBoard(){
        Arrays.fill(marks, Boolean.FALSE);
        marks[12] = true;
    }

    //Diplay bingo card in line
    public void showBoard(){
        System.out.printf("Bingo board %s%n",ID);
        System.out.printf("%d\t%d\t%d\t%d\t%d%n", numbs[0],numbs[5],numbs[10],numbs[15],numbs[20]);
        System.out.printf("%d\t%d\t%d\t%d\t%d%n", numbs[1],numbs[6],numbs[11],numbs[16],numbs[21]);
        System.out.printf("%d\t%d\t%d\t%d\t%d%n", numbs[2],numbs[7],numbs[12],numbs[17],numbs[22]);
        System.out.printf("%d\t%d\t%d\t%d\t%d%n", numbs[3],numbs[8],numbs[13],numbs[18],numbs[23]);
        System.out.printf("%d\t%d\t%d\t%d\t%d%n", numbs[4],numbs[9],numbs[14],numbs[19],numbs[24]);
    }

    // 0  1  2  3  4            0  5  10  15  20
    // 5  6  7  8  9            1  6  11  16  21
    // 10 11 12 13 14           2  7  12  17  22
    // 15 16 17 18 19           3  8  13  18  23
    // 20 21 22 23 24           4  9  14  19  24

    //Check if a board has gotten a bingo
    public boolean WinCheck(){ ///change because they have to equal tru not each other
        if(marks[0] && marks[1] && marks[2] && marks[3] && marks[4]){return true;}
        else if(marks[5] &&  marks[6] &&  marks[7] &&  marks[8] &&  marks[9]){return true;}
        else if(marks[10] &&  marks[11] &&  marks[12] &&  marks[13] &&  marks[14]){return true;}
        else if(marks[15] &&  marks[16] &&  marks[17] &&  marks[18] &&  marks[19]){return true;}
        else if( marks[20] &&  marks[21] &&  marks[22] &&  marks[23] &&  marks[24]){return true;}
        else if( marks[0] &&  marks[5] &&  marks[10] &&  marks[15] &&  marks[20]){return true;}
        else if( marks[1] &&  marks[6] &&  marks[11] &&  marks[16] &&  marks[21]){return true;}
        else if( marks[2] &&  marks[7] &&  marks[12] &&  marks[17] &&  marks[22]){return true;}
        else if( marks[3] &&  marks[8] &&  marks[13] &&  marks[18] &&  marks[23]){return true;}
        else if( marks[4] &&  marks[9] &&  marks[14] &&  marks[19] &&  marks[24]){return true;}
        else if( marks[0] &&  marks[6] &&  marks[12] &&  marks[18] &&  marks[24]){return true;}
        else if( marks[4] &&  marks[8] &&  marks[12] &&  marks[16] &&  marks[20]){return true;}
        else {return false;}
    }

//    @Override
//   public String toString(){
//        return (String.valueOf(numbs[0]));
//    }

}
