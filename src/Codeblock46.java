public class Codeblock46 {
    public static void main(String[] args) {
        boolean game = true;
        int score = 900;
        int levelcompleted = 15;
        int bonus = 100;

        if (score <=5000 && score>1000) {
            System.out.println("Your Game was finished");
        }
            else if (score<1000)
        {
                System.out.println("below 1000");
            }
            else{
            System.out.println("no more");
        }
            if (game==true)
            {
                int finalscore=(score+(levelcompleted*bonus));
                System.out.println("my final score is "+ finalscore);
            }
        boolean newgame = true;
        int newscore = 10000;
        int newlevelcompleted = 8;
        int newbonus = 200;
        if (newgame==true)
        {
            int newfinalscore=(newscore+(newlevelcompleted*newbonus));
            System.out.println("my final score is "+ newfinalscore);
        }
    }
}
