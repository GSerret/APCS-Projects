import javax.swing.*;

// This class creates the game itself along with the board
public class Overseer {

    // This constructor just makes a board that changes everytime the user clicks continue
    public Overseer(){
        String row = JOptionPane.showInputDialog(null, "How many rows do you want your board to contain?");
        int r = Integer.parseInt(row);
        String col = JOptionPane.showInputDialog(null, "How many columns do you want your board to contain?");
        int c = Integer.parseInt(col);
        String per = JOptionPane.showInputDialog(null, "What percent of the lights do you want to be on?(pick a number from 0.01 - 0.8)");
        double percent = Double.parseDouble(per);
        Cubes board = new Cubes(r, c, percent);
        while(true){
            String s = board.update();
            String[] mainDisplay = new String[]{ "Continue", "Exit"};
            int main = JOptionPane.showOptionDialog(null,s,"Conway's Game of Life",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,mainDisplay, mainDisplay[mainDisplay.length - 1]);
            board.play();
            if(main == 1){
                break;
            }
        }
    }
}
