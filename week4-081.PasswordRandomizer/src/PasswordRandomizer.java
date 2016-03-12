import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int passwordLength;

    public PasswordRandomizer(int length) 
    {
        this.passwordLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
            int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newPassword = "";
        while (i < this.passwordLength) 
        {
            newPassword = newPassword + alphabet.charAt(this.random.nextInt(26));
            i++;
        }
        return newPassword;
    }
}
