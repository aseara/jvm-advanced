/**
 * Created with IntelliJ IDEA.
 * VM 参数 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * User: aseara
 * Date: 2014/6/11
 * Time: 16:02
 */
public class Test1 {

    private static final int _1MB = 1024 * 1024;


    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];   // 出现一次 Minor GC
    }
}