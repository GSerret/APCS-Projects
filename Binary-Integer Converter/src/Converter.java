
// This class contains all the methods to convert binary into integers and vice versa
public class Converter {

    // This method converts a given integer from 0-255 into a binary number
    public String intToBin(int num){
        String ret = "";
        int number = num;
        if(num > 255 && num >=0){
            return "";
        }
        if(number - 128 >= 0){
            ret += 1;
            number = number - 128;
        }
        else{
            ret+= 0;
        }
        if(number - 64 >= 0){
            ret += 1;
            number = number - 64;
        }
        else{
            ret+=0;
        }
        if(number - 32 >= 0){
            ret += 1;
            number = number -32;
        }
        else{
            ret+=0;
        }
        if(number - 16 >= 0){
            ret+= 1;
            number = number - 16;
        }
        else{
            ret+=0;
        }
        if(number - 8 >= 0){
            ret+= 1;
            number = number - 8;
        }
        else{
            ret+=0;
        }
        if(number - 4 >= 0){
            ret+= 1;
            number = number - 4;
        }
        else{
            ret+=0;
        }
        if(number - 2 >= 0){
            ret+= 1;
            number = number - 2;
        }
        else{
            ret+=0;
        }
        if(number - 1 >= 0){
            ret+= 1;
            number = number - 1;
        }
        else{
            ret+=0;
        }
        return ret;
    }

    // This method returns the steps to convert a binary number to an integer
    public String getFirstIntStep(int number){
        String ret = "";
        int num = number;
        String[] step = new String[]{"1", "2", "4", "8", "16", "32", "64", "128"};
        for(int i = step.length-1; i >= 0; i--){
            if(num >= Math.pow(2,i)){
                ret += step[i] + " ";
                num = (int) (num - Math.pow(2,i));
            }
            else{
                ret += "0 ";
            }
        }
        return ret;
    }

    // This method returns the steps to convert an integer to a binary number
    public String step1Bin(int number){
        String ret = "";
        int num = number;
        String[] step = new String[]{"1", "2", "4", "8", "16", "32", "64", "128"};
        for(int i = step.length-1; i >= 0; i--){
            if(num >= Math.pow(10,i)){
                ret += step[i] + " ";
                num = (int) (num - Math.pow(10,i));
            }
            else{
                ret += "0 ";
            }
        }
        return ret;
    }

    // This method converts a binary number to an integer
    public String binToInt(int number){
        String ret = "";
        int num = number;
        int total = 0;
        String[] step = new String[]{"1 + ", "2 + ", "4 + ", "8 + ", "16 + ", "32 + ", "64 + ", "128 + "};
        int[] numbers = new int[]{1,2,4,8,16,32,64,128};
        for(int i = step.length-1; i >= 0; i--){
            if(num >= Math.pow(10,i)){
                ret += step[i];
                num = (int) (num - Math.pow(10,i));
                total += numbers[i];
            }
        }
        ret = ret.substring(0,ret.length() - 3);
        ret += " = " + total;
        return ret;
    }
}
