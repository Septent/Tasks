import java.util.*;

/*
 * Вы участвуете в разработке подсистемы проверки поля для игры <<Морской бой>>. Вам требуется написать проверку корректности количества кораблей на поле,
 * учитывая их размеры. Напомним, что на поле должны быть:
 *    - четыре однопалубных корабля,
 *    - три двухпалубных корабля,
 *    - два трёхпалубных корабля,
 *    - один четырёхпалубный корабль.
 * Вам заданы 10 целых чисел от 1 до 4. Проверьте, что заданные размеры соответствуют требованиям выше.
 */

public class SeaBattle {
    public static void main(String[] args){
    
        HashMap<Integer, Integer> rules = new HashMap<>();
        rules.put(1, 4);
        rules.put(2, 3);
        rules.put(3, 2);
        rules.put(4, 1);

        HashMap<Integer, Integer> real = new HashMap<>();
        real.put(1, 0);
        real.put(2, 0);
        real.put(3, 0);
        real.put(4, 0);

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < 10; j++) {
                int value = scanner.nextInt();
                int currValue = real.get(value);
                real.put(value, ++currValue);
            }
            if (real.equals(rules)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            real.put(1, 0);
            real.put(2, 0);
            real.put(3, 0);
            real.put(4, 0);
        }
        scanner.close();
    }
}