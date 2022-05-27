import javax.swing.*;

// This class creates the converter and gets user input
public class Overseer extends Converter{

    // This constructor makes a converter and then gets user input to use the converter to convert numbers from either integers to binary or binary to integers
    public Overseer(){
        while(true){
            String[] mainPage = new String[]{ "Convert Int to Binary", "Convert Binary to Int", "Exit"};
            int s = JOptionPane.showOptionDialog(null,"What conversion technique would you like to do? \n Conversion Factor\n" + "1 1 1 1 1 1 1 1\n" + "128 64 32 16 8 4 2 1", "Home",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, mainPage, mainPage[mainPage.length - 1]);
            if(s == 0){
                String binary = JOptionPane.showInputDialog(null, "Enter a number between 1 and 255 which you would like to convert to a binary number: \n Conversion Factor\n1 1 1 1 1 1 1 1\n128 64 32 16 8 4 2 1");
                int num = Integer.parseInt(binary);
                String step1Int = getFirstIntStep(num);
                String ans = intToBin(num);
                String str = binary + "\n" + step1Int + "\n" + ans;
                JOptionPane.showMessageDialog(null, str);
            }
            else if(s == 1){
                String integer = JOptionPane.showInputDialog(null,"Enter an 8 bit binary number that you would like to convert to an integer: \n Conversion Factor\n1 1 1 1 1 1 1 1\n128 64 32 16 8 4 2 1" );
                int num = Integer.parseInt(integer);
                String step1Bin = step1Bin(num);
                String ans = binToInt(num);
                String str = integer + "\n" + step1Bin + "\n" + ans;
                JOptionPane.showMessageDialog(null, str);
            }
            else{
                break;
            }
        }
    }
}
