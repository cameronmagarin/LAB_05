public class LAB_05_02_BirthMonth {
    public static void main(String[] args) throws Exception {
       int birthMonth = 25;
       int highMonth = 13;
       int lowMonth = 0;

        if(birthMonth >= highMonth)//checks if birthMonth value is greater than 12
        {
            System.out.println("You entered an incorrect month value " +birthMonth);
        }
        else if(birthMonth <= lowMonth)//checks if birthMonth value is less than 1 
        {
            System.out.println("You entered an incorrect month value "+birthMonth);
        }
        else//prints if birthMonth value is within the correct range 
        {
            System.out.println("Your birth month is " +birthMonth);
        }
       
       
        
    
    }
}
