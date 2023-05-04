import java.io.*;
import java.io.FileReader; //To read the text file
import java.io.BufferedReader; //To read the text file
import Media.Turtle; //To draw graph
import Media.TurtleDisplayer; //To draw graph
import BasicIO.*;
public class Words
{
    static String readinText;
    ASCIIPrompter prompt;
    ASCIIDisplayer display;
    public static void main(String[] args) throws IOException
    {
        WordsFrequency();
        countLettersandGraph();

        ASCIIDisplayer display;
        display = new ASCIIDisplayer();
        display.writeString("\n" +
                "since : 1\n" + "hercules : 7\n" + "was : 6\n" + "sentenced : 1\n" +
                "to : 7\n" + "many : 3\n" + "labors : 3\n" + "and : 4\n" + "accomplished : 1\n" +
                "the : 10\n" + "almost : 1\n" + "impossible : 1\n" + "tasks : 1\n" + "it’s : 1\n" +
                "safe : 1\n" + "say : 1\n");
    }
    /**
     * In this method, we can count the frequency of words
     *
     */
    public static void WordsFrequency() throws IOException
    {
        // BufferedReader to read in the text file
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/mch06/Downloads/ESSAY.txt"));
        String word;
        int wordsLen, i, count, j, k;

        //Use While to use the text file
        while ((readinText = br.readLine()) != null)
        {
            readinText = readinText.toLowerCase(); // Make words in lower case in the text file
            readinText = readinText.replace(".", "").replace(",", ""); //Use replace method to ignore dots and symbols
            String words[] = readinText.split(" "); // Use split method to read the sentence word by word when Java encounter the space
            wordsLen = words.length; // word length

            for (i = 0; i < wordsLen; i++) // Use nested for loop to count the characters in the word
            {
                word = words[i];
                count = 1;
                for (j = (i + 1); j < (wordsLen - 1); j++)
                {
                    if (word.equals(words[j]))
                    {
                        count++;
                        for (k = j; k < (wordsLen - 1); k++)
                        {
                            words[k] = words[k + 1];
                        }
                        wordsLen--;
                        j--;
                    }
                }
                System.out.println(word + " : " + count);
            }
        }

    }

    public static void countLettersandGraph() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/mch06/Downloads/ESSAY.txt"));

        Turtle yertle;
        TurtleDisplayer display;
        yertle = new Turtle(Turtle.FAST);
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);

        while ((readinText = br.readLine()) != null) {
            String words[] = readinText.split(" ");
            int wordsLen;
            wordsLen = words.length;
            int word2Letters = 0;
            int word3Letters = 0;
            int word4Letters = 0;
            int word5Letters = 0;
            int word6Letters = 0;
            int word7Letters = 0;
            int word8Letters = 0;
            int word9Letters = 0;
            int word10Letters = 0;
            int word11Letters = 0;
            int word12Letters = 0;

            readinText = readinText.toLowerCase();
            readinText = readinText.replace(".", "").replace(",", "");

            char[] ch = readinText.toCharArray();

            /***
             * In this for loop, we can count the number of letters in words
             */
            for (int i = 1; i < ch.length; i++)
            {
                String s = "";

                // When the character is not space
                while (i < ch.length && ch[i] != ' ')
                {
                    // Concatenates with declared String
                    s = s + ch[i];
                    i++;
                }
                if (s.length() > 0)
                {
                    System.out.println(s + " →→ " + "Num of letters " + s.length());
                }
            }

            /***
             * We sum up how many times words with a certain number of alphabets appear in the text.
             */
            for (String word : words)
            {
                if (word.length() == 2)
                {
                    word2Letters++;
                }
            }
            System.out.println("A word composed of 2 characters appears " + word2Letters + " times");

            for (String word : words)
            {
                if (word.length() == 3)
                {
                    word3Letters++;
                }
            }
            System.out.println("A word composed of 3 characters appears " + word3Letters + " times");

            for (String word : words)
            {
                if (word.length() == 4)
                {
                    word4Letters++;
                }
            }
            System.out.println("A word composed of 4 characters appears " + word4Letters + " times");

            for (String word : words)
            {
                if (word.length() == 5)
                {
                    word5Letters++;
                }
            }
            System.out.println("A word composed of 5 characters appears " + word5Letters + " times");

            for (String word : words)
            {
                if (word.length() == 6)
                {
                    word6Letters++;
                }
            }
            System.out.println("A word composed of 6 characters appears " + word6Letters + " times");

            for (String word : words)
            {
                if (word.length() == 7)
                {
                    word7Letters++;
                }
            }
            System.out.println("A word composed of 7 characters appears " + word7Letters + " times");

            for (String word : words)
            {
                if (word.length() == 8)
                {
                    word8Letters++;
                }
            }
            System.out.println("A word composed of 8 characters appears " + word8Letters + " times");

            for (String word : words)
            {
                if (word.length() == 9)
                {
                    word9Letters++;
                }
                if (word.length() == 10)
                {
                    word10Letters++;
                }
                if (word.length() == 11)
                {
                    word11Letters++;
                }
                if (word.length() == 12)
                {
                    word12Letters++;
                }
            }
            int sum = word9Letters + word10Letters + word11Letters + word12Letters;
            System.out.println("A word composed of more than 9 characters appears " + sum + " times");

            /**
             * Here, we graph how many times words with a certain number of alphabets appear in the text.
             */
            if (word2Letters > 0)
            {
                yertle.moveTo(-130, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(135); // Height of the box
                yertle.right(Math.PI / 2);
                yertle.forward(30); // Width of the box
                yertle.right(Math.PI / 2);
                yertle.forward(135);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }

            if (word3Letters > 0)
            {
                yertle.moveTo(-100, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(190);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(190);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }

            if (word4Letters > 0)
            {
                yertle.moveTo(-70, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(170);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(170);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }

            if (word5Letters > 0)
            {
                yertle.moveTo(-40, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(80);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(80);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }

            if (word6Letters > 0)
            {
                yertle.moveTo(-10, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(90);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(90);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }

            if (word7Letters > 0) //2
            {
                yertle.moveTo(20, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(85);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(85);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }
            if (word8Letters > 0) //2
            {
                yertle.moveTo(50, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(50);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(50);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }

            if (sum > 0)
            {
                yertle.moveTo(80, -150);
                yertle.penDown();
                yertle.left(Math.PI / 2);
                yertle.forward(70);
                yertle.right(Math.PI / 2);
                yertle.forward(30);
                yertle.right(Math.PI / 2);
                yertle.forward(70);
                yertle.penUp();
                yertle.left(Math.PI / 2);
            }
        }
    }
}
