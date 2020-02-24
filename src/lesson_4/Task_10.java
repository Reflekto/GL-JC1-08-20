package lesson_4;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        String txt = new String("Комбинация всех вышеназванных методов позволяет анатомически точно определять размеры камер сердца и крупных сосудов, оценивать сократительную способность миокарда, диагностировать наличие внутрисердечных шунтов.");
        int[] arr = new int[33];
        for(int i = 0; i < txt.length(); i++) {
            char symb = txt.charAt(i);
            if (symb == 'а') {
                arr[0] ++;
            }
            else if (symb == 'б') {
                arr[1] ++;
            }
            else if (symb == 'в') {
                arr[2] ++;
            }
            else if (symb == 'г') {
                arr[3] ++;
            }
            else if (symb == 'д') {
                arr[4] ++;
            }
            else if (symb == 'е') {
                arr[5] ++;
            }
            else if (symb == 'ё') {
                arr[6] ++;
            }
            else if (symb == 'ж') {
                arr[7] ++;
            }
            else if (symb == 'з') {
                arr[8] ++;
            }
            else if (symb == 'и') {
                arr[9] ++;
            }
            else if (symb == 'й') {
                arr[10] ++;
            }
            else if (symb == 'к') {
                arr[11] ++;
            }
            else if (symb == 'л') {
                arr[12] ++;
            }
            else if (symb == 'м') {
                arr[13] ++;
            }
            else if (symb == 'н') {
                arr[14] ++;
            }
            else if (symb == 'о') {
                arr[15] ++;
            }
            else if (symb == 'п') {
                arr[16] ++;
            }
            else if (symb == 'р') {
                arr[17] ++;
            }
            else if (symb == 'с') {
                arr[18] ++;
            }
            else if (symb == 'т') {
                arr[19] ++;
            }
            else if (symb == 'у') {
                arr[20] ++;
            }
            else if (symb == 'ф') {
                arr[21] ++;
            }
            else if (symb == 'х') {
                arr[22] ++;
            }
            else if (symb == 'ц') {
                arr[23] ++;
            }
            else if (symb == 'ч') {
                arr[24] ++;
            }
            else if (symb == 'ш') {
                arr[25] ++;
            }
            else if (symb == 'щ') {
                arr[26] ++;
            }
            else if (symb == 'ъ') {
                arr[27] ++;
            }
            else if (symb == 'ы') {
                arr[28] ++;
            }
            else if (symb == 'ь') {
                arr[29] ++;
            }
            else if (symb == 'э') {
                arr[30] ++;
            }
            else if (symb == 'ю') {
                arr[31] ++;
            }
            else if (symb == 'я') {
                arr[32] ++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("а: %d, б: %d, в: %d, г: %d, д: %d, е: %d, ё: %d, ж: %d, з: %d, и: %d, й: %d\n" +
                "к: %d, л: %d, м: %d, н: %d, о: %d, п: %d, р: %d, с: %d, т: %d, у: %d, ф: %d\n" +
                "х: %d, ц: %d, ч: %d, ш: %d, щ: %d, ъ: %d, ы: %d, ь: %d, э: %d, ю: %d, я: %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9], arr[10], arr[11], arr[12], arr[13], arr[14], arr[15], arr[16], arr[17], arr[18], arr[19], arr[20], arr[21], arr[22], arr[23], arr[24], arr[25], arr[26], arr[27], arr[28], arr[29], arr[30], arr[31], arr[32]);
    }
}
