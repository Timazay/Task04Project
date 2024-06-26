package by.itstep.javatraining.revision.task;

/*	Task 04. Student and Swimming Pool [студент и бассейн]
 *
 *	Студент плавал в бассейне размером N×M метров и устал. В этот момент он
 *	обнаружил, что находится на расстоянии X метров от одного из ДЛИННЫХ
 *	бортиков (не обязательно от ближайшего) и Y метров от одного из КОРОТКИ бортиков.
 *  Какое минимальное расстояние должен проплыть студент, чтобы выбраться
 *	из бассейна на бортик и не утонуть?
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить -1.
 *
 *	Формат входных данных [input]
 *	На вход метод получает четыре целых числа типа int: N и M - соответствующие
 *	размеры бассейна, X и Y - расстояние до бортиков, где X и(или) Y могут быть
 *	также нулями.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить число метров, которое нужно проплыть студенту до
 *	бортика, чтобы не утонуть, или -1, если данные некорректны.
 *
 *	[ input 1]: 23 52 8 43
 *	[output 1]: 8
 *
 *	[ input 2]: 14 7 6 11
 *	[output 2]: 1
 *
 *	[ input 3]: 23 52 0 43
 *	[output 3]: 0
 *
 *	[ input 4]: 23 52 -1 43
 *	[output 4]: -1
 *
 *	[ input 5]: 0 52 6 43
 *	[output 5]: -1
 *
 *	[ input 6]: 10 20 6 21
 *	[output 6]: -1
 */

public class Task04 {
    public static int start(int n, int m, int x, int y) {
        if (n <= 0 || m <= 0 || x < 0 || y < 0 || x > n || y > m || x > m) {
            return -1;
        }



        int distanceToLongSide = Math.min(x, n - x);
        if (n == x){
            distanceToLongSide = x;
        }


        int distanceToShortSide = Math.min(y, m - y);
        if (m == y){
            distanceToShortSide = y;
        }

        return Math.min(distanceToLongSide, distanceToShortSide);
    }

}