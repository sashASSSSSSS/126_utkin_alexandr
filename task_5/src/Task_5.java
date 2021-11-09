import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        ArrayList<Integer> gg = new ArrayList<>();
        for(int i = 0; i< data.size(); i++){
            int x = data.get(i);
            if((x%k==0)&(x%n!=0)){
                gg.add(x);
            }
        }
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        return gg;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        ArrayList<Integer> gg = new ArrayList<>();
        int n = 0;

        for(int i = 1; i<=size;i++){
            for (int j = 0; j < i; j++) {
                if(gg.size()==size) {
                    break;
                }
                gg.add(i);

            }
        }
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        return gg;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        s1.retainAll(s2);
        // найдите пересечение множеств s1 и s2
        return s1;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        s1.addAll(s2);
        // найдите объединение множеств s1 и s2
        return s1;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> gg = new HashSet<>(s1);
        gg.addAll(s2);
        gg.removeAll(s1);
        return gg;
        // найдите дополнение множества s1 до множества s2

    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> gg = new HashSet<>(s2);
        HashSet<Integer> ff = new HashSet<>(s1);
        gg.addAll(s1);
        ff.retainAll(s2);
        gg.removeAll(ff);
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        return gg;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        return null;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        return null;
    }
}
