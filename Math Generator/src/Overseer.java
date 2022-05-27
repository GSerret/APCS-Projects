import javax.swing.*;

// This class runs the math generator
public class Overseer {
    // These integers are used to calculate the percent wrong and correct
    private int wrong = 0;
    private int correct = 0;
    private int total = 0;
    private int score = 0;

    // These booleans determine which problems the user would like to do
    private boolean doAddition = false;
    private boolean doSubtraction = false;
    private boolean doMultiplication = false;
    private boolean doDivision = false;
    private boolean doExponents = false;
    private boolean doAlgebra = false;
    private boolean doFactorial = false;
    private boolean doSummation = false;
    private int types = 0;

    // This constructor gets user input to make the math generator and gets user input to answer the questions
    public Overseer(){
        String s = JOptionPane.showInputDialog(null, "We offer questions on multiplication, division, addition, exponents, algebra, factorial, summation, and subtraction. How many different types of questions would you liked to be asked? (Input number from 1-8)");
        String[] mainOptionArr = new String[]{"Multiplication", "Division", "Subtraction", "Exponents", "Algebra", "Factorial", "Summation", "Addition"};
        String[] holder = new String[]{"Multiplication", "Division", "Subtraction", "Exponents", "Algebra", "Factorial", "Summation", "Addition"};
        while(types < Integer.parseInt(s)){
            int main = JOptionPane.showOptionDialog(null,
                    "What type of questions would you like to practice?",
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    mainOptionArr, mainOptionArr[mainOptionArr.length - 1]);
            if(mainOptionArr[main].equals("■■■■■")) {
                if (main == 0) {
                    doMultiplication = false;
                    types--;
                } else if (main == 1) {
                    doDivision = false;
                    types--;
                } else if (main == 2) {
                    doSubtraction = false;
                    types--;
                } else if (main == 3) {
                    doExponents = false;
                    types--;
                } else if (main == 4) {
                    doAlgebra = false;
                    types--;
                } else if (main == 5) {
                    doFactorial = false;
                    types--;
                } else if (main == 6) {
                    doSummation = false;
                    types--;
                } else {
                    doAddition = false;
                    types--;
                }
                String[] arr = new String[mainOptionArr.length];
                for(int i = 0; i < mainOptionArr.length ; i++){
                    if(i != main){
                        arr[i] = mainOptionArr[i];
                    }
                    else{
                        arr[i] = holder[main];
                    }
                }
                mainOptionArr = arr;
            }
            else{
                if (main == 0) {
                    doMultiplication = true;
                    types++;
                } else if (main == 1) {
                    doDivision = true;
                    types++;
                } else if (main == 2) {
                    doSubtraction = true;
                    types++;
                } else if (main == 3) {
                    doExponents = true;
                    types++;
                } else if (main == 4) {
                    doAlgebra = true;
                    types++;
                } else if (main == 5) {
                    doFactorial = true;
                    types++;
                } else if (main == 6) {
                    doSummation = true;
                    types++;
                } else {
                    doAddition = true;
                    types++;
                }
                String[] arr = new String[mainOptionArr.length];
                for(int i = 0; i < mainOptionArr.length; i++){
                    if(i == main){
                        arr[i] = "■■■■■";
                    }
                    else{
                        arr[i] = mainOptionArr[i];
                    }
                }
                mainOptionArr = arr;
            }
        }

        int questions = Integer.parseInt(JOptionPane.showInputDialog(null,"Now that we are aware of your question preferences, How many total problems would you like to do? "));
        int extra = questions % types;
        String[] arr = new String[]{"Word Problems","Multiple Choice", "Free Response", "IXL"};
        int main = JOptionPane.showOptionDialog(null,
                    "How would you like to answer the questions?",
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr, arr[arr.length - 1]);
        if(main == 0){
            for (int i = 0; i < questions / types; i++) {
                if (doAddition == true) {
                    if (additionWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doSubtraction == true) {
                    if (subtractionWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doDivision == true) {
                    if (divisionWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doMultiplication == true) {
                    if (multiplicationWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doExponents == true) {
                    if (exponentsWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doAlgebra == true) {
                    if (algebraWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if(doFactorial == true){
                    if(factorialWP() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if(doSummation == true){
                    if(summationWP() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
            }
            for (int i = 0; i < extra; i++) {
                if (doAddition == true) {
                    if (additionWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doAddition = false;
                } else if (doSubtraction == true) {
                    if (subtractionWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doSubtraction = false;
                } else if (doDivision == true) {
                    if (divisionWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doDivision = false;
                } else if (doMultiplication == true) {
                    if (multiplicationWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doMultiplication = false;
                } else if (doExponents == true) {
                    if (exponentsWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doExponents = false;
                } else if (doAlgebra == true) {
                    if (algebraWP() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doAlgebra = false;
                }
                else if(doFactorial == true){
                    if(factorialWP() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doFactorial = false;
                }
                else if(doSummation == true){
                    if(summationWP() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doSummation = false;
                }
            }
            if ((int) (((double) correct / total) * 100) >= 70) {
                JOptionPane.showMessageDialog(null, "You have completed all the questions and passed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            } else {
                JOptionPane.showMessageDialog(null, "You have completed all the questions and failed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            }
        }
        else if(main == 1){
            for (int i = 0; i < questions / types; i++) {
                if (doAddition == true) {
                    if (additionMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doSubtraction == true) {
                    if (subtractionMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doDivision == true) {
                    if (divisionMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doMultiplication == true) {
                    if (multiplicationMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doExponents == true) {
                    if (exponentsMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doAlgebra == true) {
                    if (algebraMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if(doFactorial == true){
                    if(factorialMC() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if(doSummation == true){
                    if(summationMC() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
            }
            for (int i = 0; i < extra; i++) {
                if (doAddition == true) {
                    if (additionMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doAddition = false;
                } else if (doSubtraction == true) {
                    if (subtractionMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doSubtraction = false;
                } else if (doDivision == true) {
                    if (divisionMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doDivision = false;
                } else if (doMultiplication == true) {
                    if (multiplicationMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doMultiplication = false;
                } else if (doExponents == true) {
                    if (exponentsMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doExponents = false;
                } else if (doAlgebra == true) {
                    if (algebraMC() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doAlgebra = false;
                }
                else if(doFactorial == true){
                    if(factorialMC() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doFactorial = false;
                }
                else if(doSummation == true){
                    if(summationMC() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doSummation = false;
                }
            }
            if ((int) (((double) correct / total) * 100) >= 70) {
                JOptionPane.showMessageDialog(null, "You have completed all the questions and passed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            } else {
                JOptionPane.showMessageDialog(null, "You have completed all the questions and failed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            }
        }
        else if(main == 2){
            for (int i = 0; i < questions / types; i++) {
                if (doAddition == true) {
                    if (additionFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doSubtraction == true) {
                    if (subtractionFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doDivision == true) {
                    if (divisionFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doMultiplication == true) {
                    if (multiplicationFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doExponents == true) {
                    if (exponentsFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if (doAlgebra == true) {
                    if (algebraFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if(doFactorial == true){
                    if(factorialFR() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
                if(doSummation == true){
                    if(summationFR() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                }
            }
            for (int i = 0; i < extra; i++) {
                if (doAddition == true) {
                    if (additionFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doAddition = false;
                } else if (doSubtraction == true) {
                    if (subtractionFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doSubtraction = false;
                } else if (doDivision == true) {
                    if (divisionFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doDivision = false;
                } else if (doMultiplication == true) {
                    if (multiplicationFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doMultiplication = false;
                } else if (doExponents == true) {
                    if (exponentsFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doExponents = false;
                } else if (doAlgebra == true) {
                    if (algebraFR() == true) {
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    } else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doAlgebra = false;
                }
                else if(doFactorial == true){
                    if(factorialFR() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doFactorial = false;
                }
                else if(doSummation == true){
                    if(summationFR() == true){
                        correct++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    else {
                        wrong++;
                        total++;
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%");
                    }
                    doSummation = false;
                }
            }
            if ((int) (((double) correct / total) * 100) >= 70) {
                JOptionPane.showMessageDialog(null, "You have completed all the questions and passed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            } else {
                JOptionPane.showMessageDialog(null, "You have completed all the questions and failed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Keep in mind since you chose this mode, the amount of questions you chose is void, you must continue answering questions until you reach 100 points.");
            while(score < 100) {
                if (doAddition == true) {
                    if (additionFR() == true) {
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    } else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if (doSubtraction == true) {
                    if (subtractionFR() == true) {
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    } else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if (doDivision == true) {
                    if (divisionFR() == true) {
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    } else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if (doMultiplication == true) {
                    if (multiplicationFR() == true) {
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    } else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if (doExponents == true) {
                    if (exponentsFR() == true) {
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    } else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if (doAlgebra == true) {
                    if (algebraFR() == true) {
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    } else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if(doFactorial == true){
                    if(factorialFR() == true){
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                    else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
                if(doSummation == true){
                    if(summationFR() == true){
                        correct++;
                        total++;
                        add();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                    else {
                        wrong++;
                        total++;
                        subtract();
                        JOptionPane.showMessageDialog(null, "Correct answers: " + Integer.toString(correct) + "\nPercentage of correct answers" + Integer.toString((int) (((double) correct / total) * 100)) + "%\nIncorrect answers: " + Integer.toString(wrong) + "\nPercentage of incorrect answers" + Integer.toString((int) (((double) wrong / total) * 100)) + "%\nScore: " +score);
                    }
                }
                if(score >= 100){
                    break;
                }
            }
            if ((int) (((double) correct / total) * 100) >= 70) {
                JOptionPane.showMessageDialog(null, "You have completed the IXL and passed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            } else {
                JOptionPane.showMessageDialog(null, "You have completed the IXL but failed with a " + Integer.toString((int) (((double) correct / total) * 100)) + "%");
            }

        }
    }

    // This method changes the score in the ixl mode if you get a questions correct
    public void add(){
        if(score> 95){
            score++;
        }
        else if(score>90){
            score += 2;
        }
        else if(score > 75){
            score += 5;
        }
        else if(score > 50){
            score += 8;
        }
        else{
            score += 12;
        }
    }

    // This method changes the score in the ixl mode if you get a questions wrong
    public void subtract(){
        score = score - 4;
    }

    // This creates a free response addition problem and returns true or false depending on if the user got the correct answer
    public boolean additionFR(){
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        int sum = num1 + num2;
        String s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " + " + Integer.toString(num2));
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a free response subtraction problem and returns true or false depending on if the user got the correct answer
    public boolean subtractionFR(){
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        int sum;
        String s;
        if(num1>num2){
            sum = num1 - num2;
            s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " - " + Integer.toString(num2));
        }
        else{
            sum = num2 -num1;
            s = JOptionPane.showInputDialog(null,Integer.toString(num2) + " - " + Integer.toString(num1));
        }
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a free response multiplication problem and returns true or false depending on if the user got the correct answer
    public boolean multiplicationFR(){
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int sum = num1 * num2;
        String s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " x " + Integer.toString(num2));
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a free response division problem and returns true or false depending on if the user got the correct answer
    public boolean divisionFR(){
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000)+1;
        while(num1 % num2 != 0 && num2 != 0){
            num1 = (int)(Math.random() * 1000);
            num2 = (int)(Math.random() * 1000)+1;
        }
        int sum = num1 / num2;
        String s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " / " + Integer.toString(num2));
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a free response problem with exponents and returns true or false depending on if the user got the correct answer
    public boolean exponentsFR(){
        int num = (int)(Math.random() * 10);
        int exp = (int)(Math.random() * 5);
        int sum = (int) Math.pow((double)num,(double)exp);
        String s = JOptionPane.showInputDialog(null,Integer.toString(num) + " to the power of " + Integer.toString(exp));
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a free response algebra problem and returns true or false depending on if the user got the correct answer
    public boolean algebraFR(){
        int random = (int) (Math.random() * 4);
        while(random == 0) {
            random = (int) (Math.random() * 4);
        }
        if(random == 1){
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000);
            int sum = num1 + num2;
            String s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " + ? = " + Integer.toString(sum));
            if(Integer.parseInt(s) == num2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                return false;
            }
        }
        if(random == 2){
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000);
            int sum;
            String s;
            if(num1>num2){
                sum = num1 - num2;
                s = JOptionPane.showInputDialog(null, "? - " + Integer.toString(num2) + " = " + Integer.toString(sum));
                if(Integer.parseInt(s) == num1){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num1));
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num1));
                    return false;
                }
            }
            else{
                sum = num2 -num1;
                s = JOptionPane.showInputDialog(null,"? - " + Integer.toString(num1) + " = " + Integer.toString(sum));
                if(Integer.parseInt(s) == num2){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                    return false;
                }
            }

        }
        if(random == 3){
            int num1 = (int)(Math.random() * 100);
            int num2 = (int)(Math.random() * 100);
            int sum = num1 * num2;
            String s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " x ? = " + Integer.toString(sum));
            if(Integer.parseInt(s) == num2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                return false;
            }
        }
        else{
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000)+1;
            while(num1 % num2 != 0 && num2 != 0){
                num1 = (int)(Math.random() * 1000);
                num2 = (int)(Math.random() * 1000)+1;
            }
            int sum = num1 / num2;
            String s = JOptionPane.showInputDialog(null,Integer.toString(num1) + " / ? = " + Integer.toString(sum));
            if(Integer.parseInt(s) == num2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                return false;
            }
        }
    }

    // This creates a free response problem with factorials and returns true or false depending on if the user got the correct answer
    public boolean factorialFR(){
        int num = (int)(Math.random() * 5)+1;
        int sum = 1;
        for(int i = num; i > 0; i--){
            sum = sum * i;
        }
        String s = JOptionPane.showInputDialog(null,"What is the value of multiplying all numbers from 1 to " + Integer.toString(num));
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a free response problem with summations and returns true or false depending on if the user got the correct answer
    public boolean summationFR(){
        int num = (int)(Math.random() * 20)+1;
        int sum = 0;
        for(int i = num; i > 0; i--){
            sum = sum + i;
        }
        String s = JOptionPane.showInputDialog(null,"What is the value of adding all numbers from 1 to " + Integer.toString(num));
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a multiple choice addition problem and returns true or false depending on if the user got the correct answer
    public boolean additionMC(){
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        int sum = num1 + num2;
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(random == 1) {
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " + " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr1, arr1[arr1.length - 1]);
            if(main == 0){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 2){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " + " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr2, arr2[arr2.length - 1]);
            if(main == 1){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 3){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " + " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr3, arr3[arr3.length - 1]);
            if(main == 2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 4){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " + " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr4, arr4[arr4.length - 1]);
            if(main == 3){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates a multiple choice subtraction problem and returns true or false depending on if the user got the correct answer
    public boolean subtractionMC(){
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        int sum;
        boolean firstOption = false;
        if(num1>num2){
            sum = num1 - num2;
            firstOption = true;
        }
        else{
            sum = num2 -num1;
            firstOption = false;
        }
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(firstOption == true) {
            if (random == 1) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " - " + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr1, arr1[arr1.length - 1]);
                if (main == 0) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            } else if (random == 2) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " - " + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr2, arr2[arr2.length - 1]);
                if (main == 1) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            } else if (random == 3) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " - " + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr3, arr3[arr3.length - 1]);
                if (main == 2) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            } else if (random == 4) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " - " + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr4, arr4[arr4.length - 1]);
                if (main == 3) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
        }
        else{
            if (random == 1) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num2) + " - " + Integer.toString(num1),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr1, arr1[arr1.length - 1]);
                if (main == 0) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            } else if (random == 2) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num2) + " - " + Integer.toString(num1),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr2, arr2[arr2.length - 1]);
                if (main == 1) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            } else if (random == 3) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num2) + " - " + Integer.toString(num1),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr3, arr3[arr3.length - 1]);
                if (main == 2) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            } else if (random == 4) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num2) + " - " + Integer.toString(num1),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr4, arr4[arr4.length - 1]);
                if (main == 3) {
                    JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates a multiple choice multiplication problem and returns true or false depending on if the user got the correct answer
    public boolean multiplicationMC(){
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int sum = num1 * num2;
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(random == 1) {
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " x " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr1, arr1[arr1.length - 1]);
            if(main == 0){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 2){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " x " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr2, arr2[arr2.length - 1]);
            if(main == 1){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 3){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " x " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr3, arr3[arr3.length - 1]);
            if(main == 2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 4){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " x " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr4, arr4[arr4.length - 1]);
            if(main == 3){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates a multiple choice division problem and returns true or false depending on if the user got the correct answer
    public boolean divisionMC(){
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000)+1;
        while(num1 % num2 != 0 && num2 != 0){
            num1 = (int)(Math.random() * 1000);
            num2 = (int)(Math.random() * 1000)+1;
        }
        int sum = num1 / num2;
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(random == 1) {
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " / " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr1, arr1[arr1.length - 1]);
            if(main == 0){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 2){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " / " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr2, arr2[arr2.length - 1]);
            if(main == 1){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 3){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " / " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr3, arr3[arr3.length - 1]);
            if(main == 2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 4){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " / " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr4, arr4[arr4.length - 1]);
            if(main == 3){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates a multiple choice problem with exponents and returns true or false depending on if the user got the correct answer
    public boolean exponentsMC(){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 5);
        int sum = (int) Math.pow((double)num1,(double)num2);
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(random == 1) {
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " to the power of " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr1, arr1[arr1.length - 1]);
            if(main == 0){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 2){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " to the power of " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr2, arr2[arr2.length - 1]);
            if(main == 1){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 3){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " to the power of " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr3, arr3[arr3.length - 1]);
            if(main == 2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 4){
            int main = JOptionPane.showOptionDialog(null,
                    Integer.toString(num1) + " to the power of " + Integer.toString(num2),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr4, arr4[arr4.length - 1]);
            if(main == 3){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates a multiple choice algebra problem and returns true or false depending on if the user got the correct answer
    public boolean algebraMC(){
        int rand = (int) (Math.random() * 4);
        while(rand == 0) {
            rand = (int) (Math.random() * 4);
        }
        if(rand == 1){
            int num1 = (int)(Math.random() * 1000);
            int sum = (int)(Math.random() * 1000);
            int num2 = num1 + sum;
            String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
            int random = 0;
            while(random == 0){
                random = (int)(Math.random() * 4);
            }
            if(random == 1) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " + ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr1, arr1[arr1.length - 1]);
                if(main == 0){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 2){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " + ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr2, arr2[arr2.length - 1]);
                if(main == 1){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 3){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " + ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr3, arr3[arr3.length - 1]);
                if(main == 2){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 4){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " + ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr4, arr4[arr4.length - 1]);
                if(main == 3){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
            return false;
        }
        if(rand == 2){
            int num1 = (int)(Math.random() * 1000);
            int sum = (int)(Math.random() * 1000);
            int num2;
            boolean firstOption = false;
            if(num1>sum){
                num2 = num1 - sum;
                firstOption = true;
            }
            else{
                num2 = sum -num1;
                firstOption = false;
            }
            String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
            int random = 0;
            while(random == 0){
                random = (int)(Math.random() * 4);
            }
            if(firstOption == true) {
                if (random == 1) {
                    int main = JOptionPane.showOptionDialog(null,
                            Integer.toString(num1) + " - ? = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr1, arr1[arr1.length - 1]);
                    if (main == 0) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                } else if (random == 2) {
                    int main = JOptionPane.showOptionDialog(null,
                            Integer.toString(num1) + " - ? = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr2, arr2[arr2.length - 1]);
                    if (main == 1) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                } else if (random == 3) {
                    int main = JOptionPane.showOptionDialog(null,
                            Integer.toString(num1) + " - ? = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr3, arr3[arr3.length - 1]);
                    if (main == 2) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                } else if (random == 4) {
                    int main = JOptionPane.showOptionDialog(null,
                            Integer.toString(num1) + " - ? = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr4, arr4[arr4.length - 1]);
                    if (main == 3) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                }
            }
            else{
                if (random == 1) {
                    int main = JOptionPane.showOptionDialog(null,
                            "? - " + Integer.toString(num1) + " = " + Integer.toString(num2) ,
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr1, arr1[arr1.length - 1]);
                    if (main == 0) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                } else if (random == 2) {
                    int main = JOptionPane.showOptionDialog(null,
                            "? - " + Integer.toString(num1) + " = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr2, arr2[arr2.length - 1]);
                    if (main == 1) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                } else if (random == 3) {
                    int main = JOptionPane.showOptionDialog(null,
                            "? - " + Integer.toString(num1) + " = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr3, arr3[arr3.length - 1]);
                    if (main == 2) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                } else if (random == 4) {
                    int main = JOptionPane.showOptionDialog(null,
                            "? - " + Integer.toString(num1) + " = " + Integer.toString(num2),
                            "Home",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                            arr4, arr4[arr4.length - 1]);
                    if (main == 3) {
                        JOptionPane.showMessageDialog(null, "You got the answer correct, the answer was " + Integer.toString(sum));
                        return true;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
            return false;

        }
        if(rand == 3){
            int num1 = (int)(Math.random() * 100);
            int sum = (int)(Math.random() * 100);
            int num2 = num1 * sum;
            String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
            int random = 0;
            while(random == 0){
                random = (int)(Math.random() * 4);
            }
            if(random == 1) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " x ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr1, arr1[arr1.length - 1]);
                if(main == 0){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 2){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " x ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr2, arr2[arr2.length - 1]);
                if(main == 1){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 3){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " x ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr3, arr3[arr3.length - 1]);
                if(main == 2){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 4){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " x ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr4, arr4[arr4.length - 1]);
                if(main == 3){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
            return false;
        }
        else{
            int num1 = (int)(Math.random() * 1000);
            int sum = (int)(Math.random() * 1000)+1;
            while(num1 % sum != 0 && sum != 0){
                num1 = (int)(Math.random() * 1000);
                sum = (int)(Math.random() * 1000)+1;
            }
            int num2 = num1 / sum;
            String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
            String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
            int random = 0;
            while(random == 0){
                random = (int)(Math.random() * 4);
            }
            if(random == 1) {
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " / ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr1, arr1[arr1.length - 1]);
                if(main == 0){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 2){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " / ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr2, arr2[arr2.length - 1]);
                if(main == 1){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 3){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " / ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr3, arr3[arr3.length - 1]);
                if(main == 2){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            else if(random == 4){
                int main = JOptionPane.showOptionDialog(null,
                        Integer.toString(num1) + " / ? =" + Integer.toString(num2),
                        "Home",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        arr4, arr4[arr4.length - 1]);
                if(main == 3){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a multiple choice problem with factorials and returns true or false depending on if the user got the correct answer
    public boolean factorialMC(){
        int num = (int)(Math.random() * 5)+1;
        int sum = 1;
        for(int i = num; i > 0; i--){
            sum = sum * i;
        }
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(random == 1) {
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of multiplying all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr1, arr1[arr1.length - 1]);
            if(main == 0){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 2){
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of multiplying all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr2, arr2[arr2.length - 1]);
            if(main == 1){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 3){
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of multiplying all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr3, arr3[arr3.length - 1]);
            if(main == 2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 4){
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of multiplying all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr4, arr4[arr4.length - 1]);
            if(main == 3){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates a multiple choice problem with summations and returns true or false depending on if the user got the correct answer
    public boolean summationMC(){
        int num = (int)(Math.random() * 20)+1;
        int sum = 0;
        for(int i = num; i > 0; i--){
            sum = sum + i;
        }
        String[] arr1 = new String[]{Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr2 = new String[]{Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum), Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr3 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum),Integer.toString(sum +1+(int)(Math.random()*20))};
        String[] arr4 = new String[]{ Integer.toString(sum +1+(int)(Math.random()*20)),Integer.toString(sum +1+(int)(Math.random()*20)) ,Integer.toString(sum +1+(int)(Math.random()*20)), Integer.toString(sum)};
        int random = 0;
        while(random == 0){
            random = (int)(Math.random() * 4);
        }
        if(random == 1) {
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of adding all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr1, arr1[arr1.length - 1]);
            if(main == 0){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 2){
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of adding all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr2, arr2[arr2.length - 1]);
            if(main == 1){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 3){
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of adding all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr3, arr3[arr3.length - 1]);
            if(main == 2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        else if(random == 4){
            int main = JOptionPane.showOptionDialog(null,
                    "What is the value of adding all numbers from 1 to " + Integer.toString(num),
                    "Home",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    arr4, arr4[arr4.length - 1]);
            if(main == 3){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"You got the answer wrong, the answer was " + Integer.toString(sum));
        return false;
    }

    // This creates an addition word problem and returns true or false depending on if the user got the correct answer
    public boolean additionWP(){
        String[] items = new String[]{"dogs", "fish", "cats", "birds", "cards", "toys", "slices of pizza", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        int sum = num1 + num2;
        String s = JOptionPane.showInputDialog(null,name + " has " +Integer.toString(num1) + " " + item +" and gets " + Integer.toString(num2) +" more. How many " + item + " does " + name + " have now?");
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a subtraction word problem and returns true or false depending on if the user got the correct answer
    public boolean subtractionWP(){
        String[] items = new String[]{"dogs", "fish", "cats", "birds", "cards", "toys", "slices of pizza", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        int sum;
        String s;
        if(num1>num2){
            sum = num1 - num2;
            s = JOptionPane.showInputDialog(null,name + " has " +Integer.toString(num1) + " " + item +" and loses " + Integer.toString(num2) +" " + item + ". How many " + item + " does " + name + " have now?");
        }
        else{
            sum = num2 -num1;
            s = JOptionPane.showInputDialog(null,name + " has " +Integer.toString(num2) + " " + item +" and loses " + Integer.toString(num1) +" " + item + ". How many " + item + " does " + name + " have now?");
        }
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a multiplication word problem and returns true or false depending on if the user got the correct answer
    public boolean multiplicationWP(){
        String[] items = new String[]{"chocolate", "candy", "clothes", "trophies", "cards", "toys", "fries", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int sum = num1 * num2;
        String s = JOptionPane.showInputDialog(null,name+ " has "+ Integer.toString(num1) + " boxes of " + item+ " and each box has " + Integer.toString(num2)+" " + item + ". How many " + item + " does " + name + " have?");
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a division word problem and returns true or false depending on if the user got the correct answer
    public boolean divisionWP(){
        String[] items = new String[]{"chocolate", "candy", "clothes", "trophies", "cards", "toys", "fries", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000)+1;
        while(num1 % num2 != 0 && num2 != 0){
            num1 = (int)(Math.random() * 1000);
            num2 = (int)(Math.random() * 1000)+1;
        }
        int sum = num1 / num2;
        String s = JOptionPane.showInputDialog(null,name+ " has " +Integer.toString(num1) +" "+ item +" that came in " + Integer.toString(num2) + " boxes. How many " + item + " came in each box?");
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a word problem with exponents and returns true or false depending on if the user got the correct answer
    public boolean exponentsWP(){
        String[] items = new String[]{"chocolate", "candy", "clothes", "trophies", "cards", "toys", "fries", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num = (int)(Math.random() * 10);
        int exp = (int)(Math.random() * 5) + 1;
        int sum = (int) Math.pow((double)num,(double)exp);
        String s = JOptionPane.showInputDialog(null,"The amount of " + item + " that "+ name + " has, has increased exponentially from year to year. If " + name + " originally had "+Integer.toString(num) + " " + item + " then how many " + item + " does " +name+ " have on year " + Integer.toString(exp) + "?");
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates an algebra word problem and returns true or false depending on if the user got the correct answer
    public boolean algebraWP(){
        int random = (int) (Math.random() * 4);
        while(random == 0) {
            random = (int) (Math.random() * 4);
        }
        if(random == 1){
            String[] items = new String[]{"dogs", "fish", "cats", "birds", "cards", "toys", "slices of pizza", "hats", "socks", "shirts"};
            String item = items[(int)(Math.random()* 10)];
            String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
            String name = people[(int)(Math.random()* 10)];
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000);
            int sum = num1 + num2;
            String s = JOptionPane.showInputDialog(null,name + " had " +Integer.toString(num1) + " " + item +", now " + name + " has " + Integer.toString(sum) +" " + item + ". How many " + item + " did " + name + " get?");
            if(Integer.parseInt(s) == num2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                return false;
            }
        }
        if(random == 2){
            String[] items = new String[]{"dogs", "fish", "cats", "birds", "cards", "toys", "slices of pizza", "hats", "socks", "shirts"};
            String item = items[(int)(Math.random()* 10)];
            String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
            String name = people[(int)(Math.random()* 10)];
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000);
            int sum;
            String s;
            if(num1>num2){
                sum = num1 - num2;
                s = JOptionPane.showInputDialog(null,name + " had " +Integer.toString(num1) + " " + item +", now " + name + " has " + Integer.toString(sum) +" " + item + ". How many " + item + " did " + name + " lose?");
                if(Integer.parseInt(s) == num2){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                    return false;
                }
            }
            else{
                sum = num2 -num1;
                s = JOptionPane.showInputDialog(null,name + " had " +Integer.toString(num2) + " " + item +", now " + name + " has " + Integer.toString(sum) +" " + item + ". How many " + item + " did " + name + " lose?");
                if(Integer.parseInt(s) == num1){
                    JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num1));
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num1));
                    return false;
                }
            }

        }
        if(random == 3){
            String[] items = new String[]{"chocolate", "candy", "clothes", "trophies", "cards", "toys", "fries", "hats", "socks", "shirts"};
            String item = items[(int)(Math.random()* 10)];
            String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
            String name = people[(int)(Math.random()* 10)];
            int num1 = (int)(Math.random() * 100);
            int num2 = (int)(Math.random() * 100);
            int sum = num1 * num2;
            String s = JOptionPane.showInputDialog(null,name+ " has " +Integer.toString(sum) +" "+ item +" that came in " + Integer.toString(num1) + " boxes. How much " + item + " came in each box?");
            if(Integer.parseInt(s) == num2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                return false;
            }
        }
        else{
            String[] items = new String[]{"chocolate", "candy", "clothes", "trophies", "cards", "toys", "fries", "hats", "socks", "shirts"};
            String item = items[(int)(Math.random()* 10)];
            String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
            String name = people[(int)(Math.random()* 10)];
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000)+1;
            while(num1 % num2 != 0 && num2 != 0){
                num1 = (int)(Math.random() * 1000);
                num2 = (int)(Math.random() * 1000)+1;
            }
            int sum = num1 / num2;
            String s = JOptionPane.showInputDialog(null,name+ " has " +Integer.toString(sum) +" "+ item +" that came in boxes containing " + Integer.toString(num1) + " "+ item +" each. How many boxes did " + name + " receive?");
            if(Integer.parseInt(s) == num2){
                JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(num2));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(num2));
                return false;
            }
        }
    }

    // This creates a word problem with factorials and returns true or false depending on if the user got the correct answer
    public boolean factorialWP(){
        String[] items = new String[]{"chocolate", "candy", "clothes", "trophies", "cards", "toys", "fries", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num = (int)(Math.random() * 5)+1;
        int sum = 1;
        for(int i = num; i > 0; i--){
            sum = sum * i;
        }
        String s = JOptionPane.showInputDialog(null,name + " gets boxes of " + item + " each month. After one month not only does the amount of boxes increase by one, but so does the amount of " +item+ " in each box. How much "+item+ " does " +name+ " have after " + Integer.toString(num) + " months.");
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

    // This creates a word problem with summations and returns true or false depending on if the user got the correct answer
    public boolean summationWP(){
        String[] items = new String[]{"dogs", "fish", "cats", "birds", "cards", "toys", "slices of pizza", "hats", "socks", "shirts"};
        String item = items[(int)(Math.random()* 10)];
        String[] people = new String[]{"Mr. Rico", "Gabriel", "Rodrigo", "Jorge", "Jack", "Alyssa", "Jasmine", "Jenny", "Sarah", "Clara"};
        String name = people[(int)(Math.random()* 10)];
        int num = (int)(Math.random() * 20)+1;
        int sum = 0;
        for(int i = num; i > 0; i--){
            sum = sum + i;
        }
        String s = JOptionPane.showInputDialog(null,name+ " is given " + item +" each day. The amount of "+item + " given increase by one each day. How much " +item +" does "+ name + " have after " + Integer.toString(num)+ " days?");
        if(Integer.parseInt(s) == sum){
            JOptionPane.showMessageDialog(null,"You got the answer correct, the answer was " + Integer.toString(sum));
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "You got the answer incorrect, the answer was " + Integer.toString(sum));
            return false;
        }
    }

}
