import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = GetInput.getInputData();
        ScratchCard[] cards = new ScratchCard[6];

        for (int i = 0; i < strs.length; i++) {
            cards[i] = new ScratchCard(strs[i]);
            System.out.println(cards[i].getCARD_NUMBER());
//            System.out.println(Arrays.toString(cards[i].getWINNING_NUMBERS()));
        }
    }
}
