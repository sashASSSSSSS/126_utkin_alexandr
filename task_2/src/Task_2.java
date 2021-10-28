public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        double a = Math.sqrt(num);
        double b =Math.floor(a);
        double h= b*b;
        return (int) h;


        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num


    }
    @Override
    public int subtask_2_while(int num) {
        if(num==0){
            return 1;
        }
        else{
            return 2* subtask_2_while(num-1) +6;
        }
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num

    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        for(int i = 0; i < num; i++ ){
            if(Math.pow(base, i) == num ){
                return true;
            }
        }
        // Проверить, является ли число num натуральной степенью числа base
        return false;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        if (start == end) {
            return 0;
        }


        if(end%2==1){
            return 1+ subtask_4_while(start, end+1);
        }
        if(start%2==1){
            return 1 + subtask_4_while(start-1, end);
        }
        else if (start/2>=end){
            return 1 + subtask_4_while(start/2, end);
        }
        else{
            return 1 + subtask_4_while(start-1, end);
        }

        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1

    }
}
