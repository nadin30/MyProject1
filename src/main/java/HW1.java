public class HW1 {

    public int uslovnieoperatori(int a, int b, int c) {
        int result = 0;
        //if a - even number res - а*б/с
        if (isEven(a)) {
            result = a * b / c;
        } else if (isEven(a + c) || isEven((b + c))) {
            result = (int) (Math.pow((double) (a), (double) (c)));
        } else {
            result = a + b - c;
        }
        return result;

    }

    private boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

    //koordinats
    public String coordinati(double x, double y, double z) {
        String resultMessage = "";
        int quarter = 0;
        if (x == 0 && y == 0 && z == 0) {
            resultMessage = "Belongs to all 4 quarters";
        }
        return resultMessage;
    }

    //factorial n. n! = 1*2*…*n-1*n;
    public int factorialN(int n) {
        int result = 0;
        if (n == 0) return 1;
        else {
            result += n * factorialN(n - 1);
        }
        return result;
    }

    //123 return to 321
    public int mirrored(int num) {
        String resultStr = "";
        String str = num + "";

        String[] splitted = splitted(str);
        String[] temp = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            temp[i] = splitted[str.length() - i - 1];
        }
        resultStr = resultStr.join("", temp);

        return Integer.parseInt(resultStr);
    }

    private String[] splitted(String str) {
        return str.split("(?!^)");
    }

    //change 1 and 2

    public int[] halfSwappedArray(int[] num) {
        int[] result = new int[num.length];
        int temp;
        if (isEven(num.length)) {
            for (int i = 0; i < num.length / 2; i++) {
                temp = num[i];
                result[i] = num[num.length / 2 + i];
                result[num.length / 2 + i] = temp;
            }
        } else {
            for (int i = 0; i < num.length / 2; i++) {
                temp = num[i];
                result[i] = num[num.length / 2 + i + 1];
                result[num.length / 2 + i + 1] = temp;
            }
            result[num.length / 2] = num[num.length / 2];
        }
        return result;
    }

    //sort array by bubble
    public int[] bubbleSort(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    //conversion functions:
    //an integer in a string
    public String intToString(int num) {
        return num + "";
    }

    //of a real number in a row
    public String doubleToString(double num) {
        return num + "";
    }

    //string to integer
    public int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    //string to a real number
    public double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    //Determine the length of the shortest word
    public int shortestWord(String str) {
        String[] splitted = str.split("(\\s+)|(,\\s)|(\\.\\s)|(\\.)|(,)");
        int shortest = splitted[0].length();
        for (int i = 0; i < splitted.length; i++) {
            shortest = shortest > splitted[i].length() ? splitted[i].length() : shortest;
        }
        return shortest;
    }

    public int numberOfWords(String str) {
        String[] splitted = str.split("(\\s+)|(,\\s)|(\\.\\s)|(\\.)|(,)");
        return str.length();
    }


}
