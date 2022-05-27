import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Comparator;
import java.util.Collections;

// This class creates a light board and gets user input on what to do
public class Overseer {

    // This constructor creates a light board and changes it based on user input until the user exits
    public Overseer() {
        int version = 2;
        String s = "";
        String row = JOptionPane.showInputDialog(null, "How many rows do you want your light board to contain");
        int r = Integer.parseInt(row);
        String col = JOptionPane.showInputDialog(null, "How many columns do you want your light board to contain");
        int c = Integer.parseInt(col);
        LightBoard board = new LightBoard(r, c);
        String[] mainDisplay = new String[]{"Change Switch", "Change Row", "Change Col", "Change Grid", "Change All", "Randomize", "Change Design", "Exit"};
        while(true){
            if(version == 2) {
                s = board.updateGrid2();
            }
            else if(version == 3){
                s = board.updateGrid3();
            }
            else if(version == 1){
                s = board.updateGrid1();
            }
            JOptionPane.showMessageDialog(null,s);
            int main1 = JOptionPane.showOptionDialog(null,"What do you want to do?","Home",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,mainDisplay, mainDisplay[mainDisplay.length - 1]);
            if(main1 == 0){
                String _row = JOptionPane.showInputDialog(null, "At which row is the switch you would like to change?");
                int _r = Integer.parseInt(_row);
                String _col = JOptionPane.showInputDialog(null, "At which column is the switch you would like to change?");
                int _c = Integer.parseInt(_col);
                String[] switchDisplay = new String[]{"On", "Off"};
                int main2 = JOptionPane.showOptionDialog(null,"Would you like to turn the switch on or off?","Change Switch",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,switchDisplay, switchDisplay[switchDisplay.length - 1]);
                if(main2 == 0){
                    board.singleLight(_r, _c, true);
                }
                else{
                    board.singleLight(_r,_c,false);
                }
            }
            else if(main1 == 1){
                String _row = JOptionPane.showInputDialog(null, "What row would you like to change?");
                int _r = Integer.parseInt(_row);
                String[] rowDisplay = new String[]{"On", "Off"};
                int main3 = JOptionPane.showOptionDialog(null,"Would you like to turn the switch on or off?","Change Switch",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,rowDisplay, rowDisplay[rowDisplay.length - 1]);
                if(main3 == 0){
                    board.rowLight(_r, true);
                }
                else{
                    board.rowLight(_r,false);
                }
            }
            else if(main1 == 2){
                String _col = JOptionPane.showInputDialog(null, "What column would you like to change?");
                int _c = Integer.parseInt(_col);
                String[] colDisplay = new String[]{"On", "Off"};
                int main3 = JOptionPane.showOptionDialog(null,"Would you like to turn the switch on or off?","Change Switch",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,colDisplay, colDisplay[colDisplay.length - 1]);
                if(main3 == 0){
                    board.colLight(_c, true);
                }
                else{
                    board.colLight(_c,false);
                }
            }
            else if(main1 == 3){
                String startRow = JOptionPane.showInputDialog(null, "What is the starting row of the grid you would like to change?");
                int sr = Integer.parseInt(startRow);
                String startCol = JOptionPane.showInputDialog(null, "What is the starting column of the grid you would like to change?");
                int sc = Integer.parseInt(startCol);
                String endRow = JOptionPane.showInputDialog(null, "What is the ending row of the grid you would like to change?");
                int er = Integer.parseInt(endRow);
                String endCol = JOptionPane.showInputDialog(null, "What is the ending column of the grid you would like to change?");
                int ec = Integer.parseInt(endCol);
                String[] gridDisplay = new String[]{"On", "Off"};
                int main4 = JOptionPane.showOptionDialog(null,"Would you like to turn the switch on or off?","Change Switch",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,gridDisplay, gridDisplay[gridDisplay.length - 1]);
                if(main4 == 0){
                    board.gridLight(sr,sc,er,ec,true);
                }
                else{
                    board.gridLight(sr,sc,er,ec,false);
                }
            }
            else if(main1 == 4){
                String[] allDisplay = new String[]{"On", "Off"};
                int main5 = JOptionPane.showOptionDialog(null,"Would you like to turn the switch on or off?","Change Switch",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,allDisplay, allDisplay[allDisplay.length - 1]);
                if(main5 == 0){
                    board.allLight(true);
                }
                else{
                    board.allLight(false);
                }
            }
            else if(main1 == 5){
                String d = JOptionPane.showInputDialog(null,"What would you like the chance to be for a light to turn on? (Pick a number from 0 to 1) )");
                double percent = Double.parseDouble(d);
                board.randomLight(percent);
            }
            else if(main1 == 6){
                String[] changeDisplay = new String[]{"On/Off", "O/X", "true/false"};
                int main6 = JOptionPane.showOptionDialog(null,"How would you like the lights to be displayed","Change Display",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,changeDisplay, changeDisplay[changeDisplay.length - 1]);
                if(main6 == 0){
                    version = 1;
                }
                else if(main6 == 1){
                    version = 2;
                }
                else{
                    version = 3;
                }
            }
            else{
                break;
            }
        }
    }
}

