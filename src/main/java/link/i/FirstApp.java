package link.i;

public class FirstApp {

    public static void main (String[] args) {

        Integer anInteger = 9000;
        String aString = "I can't work with nothing =(";
        char aChar = 'q';
        double aDouble = 10.000;
        float aFloat = 10.001F;

//        Если все числовые значения не равны 0
        if (anInteger != 0 && aDouble != 0 && aFloat != 0) {
//            Делим числа потехи ради
            double divisionResult = anInteger / aDouble;
            System.out.println("DivisionResult is " + divisionResult);
//            Если получилось не целое (что почти наверняка)
            if (!(divisionResult % 1 == 0)) {
//                Переводим в целое
                int intFromDouble = (int) divisionResult;
                System.out.println("Make DivisionResult = "
                        + divisionResult
                        + " integer again!\nAnd we get "
                        + intFromDouble);
//                Если получисшееся целое в переводе в символ будет буквой
                if (intFromDouble >= 65 && intFromDouble < 91) {
                    System.out.println("We can work with char! aChar = " + aChar);
//                    Переводим в формат символа
                    char numberChar = (char) intFromDouble;
                    System.out.println("And new char = " + numberChar);
//                    В противном случае (что весьма вероятно)
                } else {
//                    Вычитаем из него значение номера символа в таблице ASCII
                    int newCharAfterSubtract = intFromDouble - (int) aChar;
                    System.out.println("We have clean char = " + aChar);
//                    И надеемся, что там что-то, кроме "?"
                    System.out.println("And dirty char = " + (char)newCharAfterSubtract);
                }
//                В случае, если всё-таки получилось не целое число
            } else {
                System.out.println("We have too big number. Reduce it");
//                Умножаем его и из произведения вычитаем само число
                double multiResult = divisionResult * aFloat - divisionResult;
//                Если перестарались и получили отрицательное
                if(multiResult < 0) {
                    System.out.println("Too many reduce =(");
//                    В противном случае вышла красота
                } else {
                    System.out.println("This ia our beautiful number: " + multiResult);
                }
            }
//            Ну, а если всё-таки равны 0
        } else {
            System.out.println(aString);
        }
    }
}
