/**
 * Created by roma on 05.02.17.
 */
import org.junit.*;
public class StreamTest {
    @Test
    public void getAndPrintMap(){
        SquareMapping sqM = new SquareMapping();
        sqM.printMap(sqM.getMap(10000));
    }
    @Test
    public void getMap(){
        SquareMapping sqM = new SquareMapping();
        sqM.getMap(10000);
    }
    @Test
    public void getParallelMap(){
        SquareMapping sqM = new SquareMapping();
        sqM.getParallelMap(10000);
    }
}
