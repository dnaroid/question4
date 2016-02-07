package question4;

import question4.train.Train;
import java.util.Scanner;

/**
 * Задания к главе 4
 * Вариант В
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении
 * кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения параметров инициализации можно использовать файлы.
 *===========================================================================
 * 8. Транспорт. Определить иерархию подвижного состава железнодорожного
 * транспорта. Создать пассажирский поезд. Подсчитать общую численность
 * пассажиров и багажа.
 * Провести сортировку вагонов поезда на основе уровня комфортности.
 * Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
 *
 * @author Vasil Talkachou
 */
public class Runner {
    public static final int TRAIN_LENGTH = 10;

    public static void main(String[] args) {
        Train train = new Train(TRAIN_LENGTH);
        System.out.println(train.toString());
        System.out.println("\nВсего пассажиров:\t" + train.getPassangers());
        System.out.println("Всего багажа:\t\t" + train.getBaggage());
        
        System.out.println("\nСортировка вагонов по уровню комфорта:\n");
        train.sortByLevel();
        System.out.println(train.toString());
        
        System.out.println("Введите диапазон количества пассажиров");
        Scanner con = new Scanner(System.in);
        System.out.print("MIN:");
        int min = con.nextInt();
        System.out.print("MAX:");
        int max = con.nextInt();
        System.out.println();
        
        for(int i = 0; i < TRAIN_LENGTH; i++) {
            int p = train.getCoach(i).getPassangers();
            if(p >= min && p <= max) 
                System.out.println(train.getCoach(i).toString());
        }
    }
}
