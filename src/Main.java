public class Main
{
    public static void main(String[] args)
    {
        int birthMonth = 13;
        System.out.println("(Simulated Input) Please input your birth month: " + birthMonth);

        if (birthMonth > 12) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
        else {
            System.out.println("Your birth month is: " + birthMonth);
        }
    }
}