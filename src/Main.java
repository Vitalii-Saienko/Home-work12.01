class Main {
    public static void main(String[] args) {
        /*
        1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
     Выведите массив на экран в строку
     Замените каждый элемент с нечётным индексом на ноль
     Снова выведете массив на экран на отдельной строке
         */
        System.out.println("Task1:");
        Methods methods = new Methods();
        int [] newArray = methods.createArray();
        methods.printArray(newArray);
        System.out.println("");
        methods.modifiedArray(newArray);
        methods.printArray(newArray);
        System.out.println("");

        /*
        Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на экран в строку.
    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
         */
        System.out.println("Task2:");
        int[] newArray2 = methods.createArray5();
        methods.printArray(newArray2);
        System.out.println("");
        System.out.println(methods.isArrayIncrease(newArray2) == true? "массив со строго возрастающей последовательностью":
                "расходимся ребятки, обычный массив:(");
        System.out.println("");
        methods.test();
    }
}