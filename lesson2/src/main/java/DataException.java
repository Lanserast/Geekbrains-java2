public class DataException extends NumberFormatException {
    public DataException(int i, int j){
        super("Не удалось преобразовать элемент массива к int (строка " + i + ",столбец " + j + ")");
    }
}
