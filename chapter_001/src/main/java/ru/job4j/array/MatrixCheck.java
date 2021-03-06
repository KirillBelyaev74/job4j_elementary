package ru.job4j.array;

public class MatrixCheck {
    /**
     * Проверяет идентичность элементов в массиве по диагонали
     * @param data - массив который нужно проверить
     * @return - возвращает true or false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int index = 0; index < data.length - 1; index++) {
                if (data[index][index] != data[index + 1][index + 1] || data[data.length - index - 1][index] != data[data.length - index - 2][index + 1]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}