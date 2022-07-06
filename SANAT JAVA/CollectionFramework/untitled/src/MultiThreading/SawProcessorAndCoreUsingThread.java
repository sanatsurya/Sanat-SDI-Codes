package MultiThreading;

public class SawProcessorAndCoreUsingThread {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());//Active thread at that time
        System.out.println("Your processor is "+Runtime.getRuntime().availableProcessors());//Available processors we have
//        System.out.println(Runtime.getRuntime().maxMemory());

      }
}
