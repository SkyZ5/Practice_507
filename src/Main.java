import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = GetInput.getInputData();
        ScratchCard[] cards = new ScratchCard[strs.length];


        for (int i = 0; i < strs.length; i++) {
            cards[i] = new ScratchCard(strs[i]);
        }
        int playableCards = 1;
        int currentCard = 1;
        while(playableCards != 0){
            playableCards = cards[currentCard - 1].calculatedCards();
            currentCard += 1;
        }
        System.out.println(currentCard);
    }
}
