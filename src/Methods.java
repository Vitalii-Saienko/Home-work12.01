class Methods {
    /*
    1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
     Выведите массив на экран в строку
     Замените каждый элемент с нечётным индексом на ноль
     Снова выведете массив на экран на отдельной строке
     */
    public int[] createArray () {
        int [] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*50+1);
        }
        return array;
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public int[] modifiedArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            if (i%2!=0){
                array[i] = 0;
            }
        }
        return array;
    }
    /*
        Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на экран в строку.
    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
         */
    public int[] createArray5 () {
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*(99-10+1)+10);
        }
        return array;
    }
    public boolean isArrayIncrease(int[]array){
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (i+1>=array.length){
                break;
            }
            if (array[i]>array[i+1]){
                    flag = false;
                    break;
            }
        }
        return flag;
    }

    public void test(){
        int[] testArray1 = {0,2,3,4,5};
        if (isArrayIncrease(testArray1)==true){
            System.out.println("Test1 succeed");
        }
        else {
            System.out.println("Test1 finished with error");
        }
        int[] testArray2 = {0,2,3,4,2};
        if (isArrayIncrease(testArray2)==true){
            System.out.println("Test2 finished with error");
        }
        else {
            System.out.println("Test2 succeed");
        }

    }
}
