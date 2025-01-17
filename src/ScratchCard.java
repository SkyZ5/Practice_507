import java.util.Arrays;

public class ScratchCard {
    private int CARD_NUMBER;
    private int[] WINNING_NUMBERS;
    private int[] NUMBERS;

    public ScratchCard(String card){

        String tempCardNumber = card.substring(4, card.indexOf(":"));
        tempCardNumber = tempCardNumber.replaceAll(" ", "");
        CARD_NUMBER = Integer.parseInt(tempCardNumber);


        String temp2 = card.substring(card.indexOf(":") + 2);
        String[] temp3 = temp2.split(" \\| ");
        temp3[0] = temp3[0].replaceAll("  ", " ");
        while(temp3[0].indexOf(" ") == 0){
            temp3[0] = temp3[0].substring(1);
        }
        String[] temp4 = temp3[0].split(" ");
        WINNING_NUMBERS = new int[temp4.length];
        for(int i = 0; i < temp4.length; i ++){
            WINNING_NUMBERS[i] = Integer.parseInt(temp4[i]);
        }
        temp3[1] = temp3[1].replaceAll("  ", " ");
        while(temp3[1].indexOf(" ") == 0){
            temp3[1] = temp3[1].substring(1);
        }
        String[] temp5 = temp3[1].split(" ");
        NUMBERS = new int[temp5.length];
        for(int i = 0; i < temp5.length; i ++){
            NUMBERS[i] = Integer.parseInt(temp5[i]);
        }



    }

    public int getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public int[] getWINNING_NUMBERS() {
        return WINNING_NUMBERS;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

    public int calculatedPoints(){
        int points = 0;
        boolean firstPoint = true;
        for(int winningNumbers: WINNING_NUMBERS){
            for(int numbers: NUMBERS){
                if(winningNumbers == numbers && firstPoint){
                    firstPoint = false;
                    points += 1;
                }
                else if(winningNumbers == numbers){
                    points *= 2;
                }
            }
        }
        return points;
    }
    public int calculatedCards(){
        int cards = 0;
        for(int winningNumbers: WINNING_NUMBERS){
            for(int numbers: NUMBERS){
                if(winningNumbers == numbers){
                    cards += 1;
                }
            }
        }
        return cards;
    }
}
