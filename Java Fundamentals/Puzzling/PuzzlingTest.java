import java.util.Random;

public class PuzzlingTest {
    public int[] getTenRolls() {
        int[] arr = new int[10];
        Random randMachine = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randMachine.nextInt(21); 
        }
        return arr;
    }

    public String[] getRandomLetter() {
        String[] arr = new String[26];
        Random randMachine = new Random();
        for (int i = 0; i < arr.length; i++) {
            char randomLetter = (char) (randMachine.nextInt(27)); 
            
        }
        return arr;
    }
    public String []generatePassword(){
        String []arr=new String[8];
        Random randMachine = new Random();
        for (int i = 0; i < arr.length; i++){
        
        }
        return arr;
    }



}
