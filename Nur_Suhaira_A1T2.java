// Assignment 1 Task 2
// Nur Suhaira Bte Badrul Hisham
// UOW ID: 5841549
// This is my own work, and 
// I have not passed my program to my friends
// and willing to accept whatever 

// Four suits (Spade, Heart, Diamond and Club (in that order). 
// Use characters  ‘S’, ‘H’, ‘D’ and ‘C’ to denote the 4 suits.

import java.util.ArrayList;

enum SuitEnum
{
    Spade ('S'),
    Heart ('H'),
    Diamond ('D'),
    Club ('C');
    
    private final char suit;
    
    SuitEnum (char suit)
    {
        this.suit = suit;
    }
    
    public char getSuitType ()
    {
        return suit;
    }
}
// Rank values from Two, Three â€¦â€¦Ten, Jack, King, Queen and Ace (in that order). 
// We usually use characters ‘2’, ‘3’, ‘4’, … , ‘9’, ‘T’, ‘J’, ‘Q’, ‘K’, ‘A’ 
// to denote the rank values

enum RankEnum
{
    Two ('2'),
    Three ('3'),
    Four ('4'),
    Five ('5'),
    Six ('6'),
    Seven ('7'),
    Eight ('8'),
    Nine ('9'),
    Ten ('T'),
    Jack ('J'),
    Queen ('Q'),
    King ('K'),
    Ace ('A');
    
    private final char rank;
    
    RankEnum (char rank)
    {
        this.rank = rank;
    }
    
    public char getRankType ()
    {
        return rank;
    }
}

class PlayingCard
{
    private SuitEnum suit;
    private RankEnum rank;
    
    PlayingCard (SuitEnum suit, RankEnum rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    public SuitEnum getSuit ()
    {
        return suit;
    }
    
    public RankEnum getRank ()
    {
        return rank;
    }
    
    void set (SuitEnum suit, RankEnum rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    @Override
    public String toString ()
    {
        char suitChar, rankChar;
        String pcString;
        
        suitChar = suit.getSuitType();
        rankChar = rank.getRankType();
        StringBuilder sb = new StringBuilder();
        sb.append(suitChar);
        sb.append(rankChar);
        pcString = sb.toString();
        
        return pcString;
    }
}

class Nur_Suhaira_A1T2
{
    static SuitEnum getASuit (int i)
    {
        switch (i)
        {
            case 0: return SuitEnum.Spade;
            case 1: return SuitEnum.Heart;
            case 2: return SuitEnum.Diamond;
            default: return SuitEnum.Club;
        }
    }
    
    static RankEnum getARank (int i)
    {
        switch (i)
        {
            case 0: return RankEnum.Two;
            case 1: return RankEnum.Three;
            case 2: return RankEnum.Four;
            case 3: return RankEnum.Five;
            case 4: return RankEnum.Six;
            case 5: return RankEnum.Seven;
            case 6: return RankEnum.Eight;
            case 7: return RankEnum.Nine;
            case 8: return RankEnum.Ten;
            case 9: return RankEnum.Jack;
            case 10: return RankEnum.Queen;
            case 11: return RankEnum.King;
            default: return RankEnum.Ace;
        }
    }
    
  
    // Construct an array of 52 playing cards (ideally call a method to achieve this target) 
    public static ArrayList constructArray (ArrayList <PlayingCard> pc)
    {
        SuitEnum se;
        RankEnum re;
        
        for (int row = 0; row < 4; row++)
        {
            se = getASuit (row);
            for (int column = 0; column < 13; column++)
            {
                re = getARank (column);
                PlayingCard pc0 = new PlayingCard (se, re);
                
                pc.add (pc0);
            }
        }
            
        return pc;
    }
    
    // Display the array (why not by another method to do this task)
    public static void displayArray (ArrayList <PlayingCard> pc, int startIndex, int endIndex)
    {
        for (int i = startIndex; i < endIndex; i++)
        {
            System.out.printf ("%s%s", 
                               pc.get(i).toString(),
                               " "
                               );
        }
        
        System.out.println();
    }
        
    public static void main (String [] args)
    {
        ArrayList <PlayingCard> pc = new ArrayList <> ();
        
        Nur_Suhaira_A1T2.constructArray(pc);
        Nur_Suhaira_A1T2.displayArray(pc, 0, 13);
        Nur_Suhaira_A1T2.displayArray(pc, 13, 26);
        Nur_Suhaira_A1T2.displayArray(pc, 26, 39);
        Nur_Suhaira_A1T2.displayArray(pc, 39, 52);
        
    }
}
