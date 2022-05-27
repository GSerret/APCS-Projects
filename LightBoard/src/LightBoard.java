/* This class contains methods relating to light boards */
public class LightBoard {
    // This array is a boolean array where tru means that "light" is on
    boolean[][] light = new boolean[0][0];

    // This constructor makes a light board with a given number of rows and columns and a random percent of light on
    public LightBoard(int numRows, int numCols)
    {
        boolean[][] lights = new boolean[numRows][numCols];

        for(int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                if (Math.random() <= 0.4) {
                    lights[r][c] = true;
                }
            }
        }
        light = lights;
    }

    // This method sets the light at a specific position given the row and column to on if the boolean is true and off if false
    public void singleLight(int row, int col, boolean b){
        light[row][col] = b;
    }

    // This method turns all the lights on if the boolean is true and off if the boolean is false
    public void allLight(boolean b){
        for(int r = 0; r < light.length; r++){
            for(int c = 0; c < light[0].length; c++){
                light[r][c] = b;
            }
        }
    }

    // This method turns all the lights in a given row on if the boolean is true and off if the boolean is false
    public void rowLight(int row, boolean b){
        for(int c = 0; c < light[0].length; c++){
            light[row][c] = b;
        }
    }

    // This method turns all the lights in a given column on if the boolean is true and off if the boolean is false
    public void colLight(int col, boolean b){
        for(int r = 0; r < light.length; r++){
            light[r][col] = b;
        }
    }

    // This method turns all the lights in a given area of lights on if the boolean is true and off if the boolean is false
    public void gridLight(int startRow, int startCol, int endRow, int endCol, boolean b){
        for(int r = startRow; r <= endRow; r++){
            for(int c = startCol; c <= endCol; c++){
                light[r][c] = b;
            }
        }
    }

    // This method turns a percent of lights on based on what is given
    public void randomLight(double percent){
        boolean[][] lights = new boolean[light.length][light[0].length];

        for(int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                if (Math.random() <= percent) {
                    lights[r][c] = true;
                }
            }
        }
        light = lights;
    }

    // This method returns a String value of the light board using on and off
    public String updateGrid1(){
        String grid = "";
        String off = "Off";
        String on = "On ";
        String space = " ";
        for(int r = 0; r < light.length; r++){
            for(int c = 0; c < light[0].length; c++){
                if(light[r][c] == true){
                    grid += on + space;
                }
                else{
                    grid += off + space;
                }
            }
            grid += "\n";
        }
        return grid;
    }

    // This method returns a String value of the light board using Xs and Os
    public String updateGrid2(){
        String grid = "";
        String off = "X";
        String on = "O";
        String space = " ";
        for(int r = 0; r < light.length; r++){
            for(int c = 0; c < light[0].length; c++){
                if(light[r][c] == true){
                    grid += on + space;
                }
                else{
                    grid += off + space;
                }
            }
            grid += "\n";
        }
        return grid;
    }

    // This method returns a String value of the light board using True and False
    public String updateGrid3(){
        String grid = "";
        String off = "False";
        String on = "True ";
        String space = " ";
        for(int r = 0; r < light.length; r++){
            for(int c = 0; c < light[0].length; c++){
                if(light[r][c] == true){
                    grid += on + space;
                }
                else{
                    grid += off + space;
                }
            }
            grid += "\n";
        }
        return grid;
    }


}
