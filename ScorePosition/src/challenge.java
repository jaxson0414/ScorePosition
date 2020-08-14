public class challenge {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position and placed number " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int position;
        if(score>= 1000) {
             position= 1;
        }else if((score>=500)&&(score<1000)) {
            position= 2;
        }else if((score>=100)&&(score<500)) {
            position= 3;
        }else{
            position= 4;
        }
        return position;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(50));
        displayHighScorePosition("Bobby", calculateHighScorePosition(300));
        displayHighScorePosition("Jane", calculateHighScorePosition(2000));
        displayHighScorePosition("Chris", calculateHighScorePosition(800));
    }
}
