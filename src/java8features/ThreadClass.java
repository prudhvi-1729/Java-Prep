package java8features;

public class ThreadClass {
    public static void main(String[] args){
        Runnable t = ()->{
            for(int i=1;i<10;i++){
                System.out.println("value of i "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable t1 =()->{
            for(int i=1;i<10;i++){
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2=new Thread(t);
        t2.setName("Prudhvi");
        t2.start();

        Thread t3= new Thread(t1);
        t3.setName("Laxmi");
        t3.start();
    }
}
