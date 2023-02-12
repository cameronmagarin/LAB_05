public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args) throws Exception {
        String partyChoice;
        String partyMenu = "D - Democrat R - Donkey I - Independent O - Other"; //Identifies which values for which party

        //input partyChoice
        partyChoice = "o";

        if(partyChoice.equalsIgnoreCase("D"))//Identifies if input D is used
        {
            System.out.println("You chose a Donkey!");
        }
        else if(partyChoice.equalsIgnoreCase("R"))//Identifies if input R is used
        {
            System.out.println("You chose an Elephant!");
        }
        else if(partyChoice.equalsIgnoreCase("I"))//Identifies if input I is used
        {
            System.out.println("You are independent!");
        }
        else //Identifies if input O is used
        {
            System.out.println("You are other!");
        }
    }
}
