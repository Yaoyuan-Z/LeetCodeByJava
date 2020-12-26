/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 */
public class ZigZag {
    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();
        if (numRows == 1) {
            return s;
        }
        int ranks = numRows + numRows - 2;
        int rows = s.length() / ranks;
        if (s.length() % ranks != 0) {
            rows += 1;
        }

        char[][] matrix = new char[rows][ranks];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < ranks; j++) {
                if (k < s.length()) {
                    matrix[i][j] = s.charAt(k);
                    k++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < ranks; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i <= ranks / 2; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i] != '\u0000') {
                    result.append(matrix[j][i]);
                }

                if (ranks - i < ranks && ranks - i != i) {
                    if (matrix[j][ranks - i] != '\u0000') {
                        result.append(matrix[j][ranks - i]);
                    }

                }

            }
        }
        System.out.println(result.toString());


        return result.toString();
    }
}
