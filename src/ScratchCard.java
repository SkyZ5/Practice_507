public class ScratchCard {
    private int CARD_NUMBER;
    private int[] WINNING_NUMBERS;
    private int[] NUMBERS;

    public ScratchCard(String card){

        String tempCardNumber = card.substring(4, card.indexOf(":"));
        tempCardNumber = tempCardNumber.replaceAll(" ", "");
        CARD_NUMBER = Integer.parseInt(tempCardNumber);


        String temp2 = card.substring(card.indexOf(":") + 1);
        String[] temp3 = temp2.split("\\|");
        temp3[0] = temp3[0].replaceAll("  ", " ");
        String[] temp4 = temp3[0].split(" ");
        for(int i = 0; i < temp4.length; i ++){
            temp4[1] = temp4[i].replaceAll(" ", "");
        }
        WINNING_NUMBERS = new int[temp4.length];
        for(int i = 0; i < temp4.length; i ++){
                WINNING_NUMBERS[i] = Integer.parseInt(temp4[i]);
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
}
