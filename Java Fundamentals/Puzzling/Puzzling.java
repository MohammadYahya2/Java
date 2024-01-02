public class Puzzling {
    public static void main(String[] args) {
        PuzzlingTest puzzlingTest = new PuzzlingTest();
        int[] testing = puzzlingTest.getTenRolls();

        for (int roll : testing) {
            System.out.print(roll + " ");
        }
        String[] randomLetters = puzzlingTest.getRandomLetter();
        System.out.println();
        for (String letter : randomLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        String[] password = puzzlingTest.generatePassword();
        for (String character : password) {
            System.out.print(character);
        }
        System.out.println();
    }
}
