/*
 * Задача 27.
 * Нужно:
 * а. Создать коллекцию ArrayList и добавить в него 6 строчных элементов;
 * б. Используя итератор, вывести на консоль элементы коллекции в строку через пробел;
 * в. Используя итератор, добавить к каждому элементу знак "+";
 * г. Используя итератор, вывести на консоль элементы измененной коллекции в строку через пробел;
 * д. Используя лист-итератор, вывести на консоль элементы измененной коллекции задом наперед в строку через пробел;
 */

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.printElements();
        list.addPlusToElements();
        System.out.println();
        list.printElements();
        System.out.println();
        list.printElementsInReverseOrder();






    }
}