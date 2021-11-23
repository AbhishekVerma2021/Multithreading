public class Multi01
{
    public static void main(String[] args) {
        Thread obj =Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("VERMA");
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());
        System.out.println(obj.getPriority());
        System.out.println(obj.isDaemon());
    }
}
//how to create multithreaded application
//two ways to create multithreaded application
//By the thread class
//It is known as functional interface
//one method
//run() method
//lamda expression