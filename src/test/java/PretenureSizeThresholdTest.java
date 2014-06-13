/**
 * Created with IntelliJ IDEA.
 *
 * VM 参数 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 * User: aseara
 * Date: 2014/6/13
 * Time: 10:36
 */
public class PretenureSizeThresholdTest {

    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * _1MB];  // 直接分配在老年代中
    }
}
