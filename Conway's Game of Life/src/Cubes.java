
// This class contains the methods for the game board and the methods to control it
public class Cubes {

    // This array is the board using true as on and false as off
    boolean[][] light = new boolean[0][0];

    // This constructor makes a game board with a given number of rows and columns and a given percent of lights on
    public Cubes(int numRows, int numCols, double percent)
    {
        boolean[][] lights = new boolean[numRows][numCols];

        for(int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                if (Math.random() <= percent) {
                    lights[r][c] = true;
                }
            }
        }
        light = lights;
    }

    // This method changes the game board array into a string to be printed
    public String update(){
        String grid = "";
        String off = "_";
        String on = "*";
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

    // This method changes the array based on the rules provided by Conway's Game of Life
    public void play(){
        int cnt = 0;
        boolean[][] lights = new boolean[light.length][light[0].length];
        for(int r = 0; r < lights.length; r++){
            for(int c = 0; c < lights[0].length; c++){
                if(light[r][c] == true){
                    if(r - 1 >= 0 && c - 1 >=0 && r + 1 < light.length && c+1 < light[0].length){
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(light[r+1][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c-1] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r == 0 && c != 0 && c + 1 != lights[0].length){
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r+1][c+1]){
                            cnt++;
                        }
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c-1] == true){
                            cnt++;
                        }
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r != 0 && c == 0 && r + 1 != lights.length){
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c+1]){
                            cnt++;
                        }
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r-1][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r == 0 && c==0){
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r][c+1]){
                            cnt++;
                        }
                        if(light[r+1][c+1] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r+1 == lights.length && c+1 != lights[0].length && c != 0){
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(light[r-1][c+1]){
                            cnt++;
                        }
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r+1 != lights.length && c+1 == lights[0].length && r != 0){
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(light[r+1][c-1]){
                            cnt++;
                        }
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r == 0 && c + 1 == lights[0].length){
                        if(light[r+1][c]){

                        }
                        if(light[r][c-1]){

                        }
                        if(light[r+1][c-1]){

                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else if(r + 1 == light.length && c == 0){
                        if(light[r][c+1]){
                            cnt++;
                        }
                        if(light[r-1][c]){
                            cnt++;
                        }
                        if(light[r-1][c]){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                    else{
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(light[r][c-1]){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(cnt < 2){
                            lights[r][c] = false;
                        }
                        else if(cnt < 4){
                            lights[r][c] = true;
                        }
                        else{
                            lights[r][c] = false;
                        }
                    }
                }
                else{
                    if(r - 1 >= 0 && c - 1 >=0 && r + 1 < light.length && c+1 < light[0].length){
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(light[r+1][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c-1] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                    else if(r == 0 && c != 0 && c+1 != lights[0].length ){
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r+1][c+1]){
                            cnt++;
                        }
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c-1] == true){
                            cnt++;
                        }
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                    else if(r != 0 && c == 0 && r + 1 != lights.length){
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c+1] == true){
                            cnt++;
                        }
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r-1][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                    else if(r == 0 && c==0){
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r][c+1]){
                            cnt++;
                        }
                        if(light[r+1][c+1] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                    else if(r+1 == lights.length && c+1 != lights[0].length && c != 0){
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(light[r-1][c+1]){
                            cnt++;
                        }
                        if(light[r][c+1] == true){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                    else if(r+1 != lights.length && c+1 == lights[0].length && r != 0){
                        if(light[r][c-1] == true){
                            cnt++;
                        }
                        if(light[r+1][c-1]){
                            cnt++;
                        }
                        if(light[r+1][c] == true){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                    else if(r == 0 && c + 1 == lights[0].length){
                         if(light[r+1][c]){

                         }
                         if(light[r][c-1]){

                         }
                         if(light[r+1][c-1]){

                         }
                         if(cnt == 3){
                             lights[r][c] = true;
                         }
                    }
                    else if(r + 1 == light.length && c == 0){
                         if(light[r][c+1]){
                             cnt++;
                         }
                         if(light[r-1][c]){
                             cnt++;
                         }
                         if(light[r-1][c]){
                             cnt++;
                         }
                         if(cnt == 3){
                             lights[r][c] = true;
                         }
                    }
                    else{
                        if(light[r-1][c] == true){
                            cnt++;
                        }
                        if(light[r][c-1]){
                            cnt++;
                        }
                        if(light[r-1][c-1] == true){
                            cnt++;
                        }
                        if(cnt == 3){
                            lights[r][c] = true;
                        }
                    }
                }
                cnt = 0;
            }
        }
        light = lights;
    }

}
