/*Есть строка вида:
 "10 3 1 2\n
 2 3 2 2\n
 5 6 7 1\n
 300 3 1 0"; (другими словами матрица 4x4)

10 3 1 2
2 3 2 2
5 6 7 1
300 3 1 0

Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
3. Ваши методы должны бросить исключения в случаях:
Если размер матрицы, полученной из строки, не равен 4x4;
Если в одной из ячеек полученной матрицы не число; (например символ или слово)
4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
5. * Написать собственные классы исключений для каждого из случаев*/

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int kolvo_strok, kolvo_stolb;

        System.out.println("Введите количество строк: ");
        kolvo_strok = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        kolvo_stolb = scanner.nextInt();

        String[][] str =   new String[kolvo_strok][kolvo_stolb];
        for (int i = 0; i < kolvo_strok; i++) {
            for (int j = 0; j < kolvo_stolb; j++) {
                System.out.println("Введите строку[" + i + "," + j + "]: ");
                str[i][j] = scanner.next();
            }
        }

        for (String[] strings : str) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + "\t");
            }
            System.out.println();
        }

        calc(str);
    }
    private static void calc (String[][] str) {
        double sum = 0;
        if (str.length != 4) {
            throw new SizeException();
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length != 4) {
                throw new SizeException();
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                inputData(str[i][j], i, j);
                sum += Integer.parseInt(str[i][j]);
            }
        }
        sum = sum / 2;
        System.out.println("Результат: " + sum);
    }

    private static void inputData(String str, int a, int b){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new DataException(a, b);
            }
        }
    }


}
