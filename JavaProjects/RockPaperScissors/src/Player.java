public class Player {
    RockPaperScissors rPS = new RockPaperScissors();

    public String getDecision(int value)
    {
        return rPS.rockPaperScissors[value - 1];
    }
}
