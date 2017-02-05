import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;


public class SquareMapping {
    public Map<Integer,Long> getParallelMap(int mapLength){
        Random random = new Random();

        Map<Integer, Long> map = random.ints(mapLength).parallel().sorted().boxed()
                        .collect(Collectors.toMap(x->x, x->new Long(x)*x));
        return map;
    }
    public Map<Integer,Long> getMap(int mapLength){
        Random random = new Random();
        Map<Integer, Long> map = random.ints(mapLength).sorted().boxed()
                .collect(Collectors.toMap(x->x, x->new Long(x)*x));
        return map;
    }
    public void printMap(Map<Integer, Long> map){
        map.entrySet().stream().forEach(entry->System.out.printf("%n%d %d", entry.getKey(), entry.getValue()));
    }
}
