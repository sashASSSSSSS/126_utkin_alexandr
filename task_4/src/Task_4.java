import java.util.Arrays;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        int[] ff= new int[size];
        ff[0]=a0;
        for(int i = 1; i<size; i++){
            ff[i]=ff[i-1]+ d;
        }

        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        return ff;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        int[] ff= new int[size];
        int d = 2;
        for(int i =0; i<size; i++){
            if((i==0)|(i==1)){
                ff[i]=1;
            }
            else{
                for(int j=0; j<i;j++){
                    ff[i]+=ff[j];
                }
            }
            //ff[i]= d*2;
            //d=d*2;
        }
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        return ff;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        int[] ff= new int[size];
        for(int i=0;i<size; i++ ){
            if(i==0){
                ff[i]=0;
            }
            else if(i==1){
                ff[i]=1;
            }
            else if(i==2){
                ff[i]=1;
            }
            else{
                ff[i]=ff[i-1]+ff[i-2];

            }
        }
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        return ff;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        int d = Integer.MIN_VALUE;
        for( int j : data){
            if(j>d){
               d=j;
           }
       }
        /*int s= data.length;
        for(int i=0; i<s; i++){
            if(d<data[i]){
                d=data[i];
            }
        }

         */
        // Для данного массива вычислить максимальный элемент
        return d;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        int d = Integer.MIN_VALUE;
        for( int j : data){
            if((j>d)&&(j%k==0)){
                d=j;
            }
        }

        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        return d;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        int r = arr1.length+arr2.length;
        int a[]=new int[r];
        for(int i =0; i<arr1.length;i++){
            a[i]=arr1[i];
        }
        int k = 0;
        for(int j=arr1.length; j<r; j++) {
            a[j] = arr2[k];
            k++;
        }
        Arrays.sort(a);


        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        return a;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {

        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
