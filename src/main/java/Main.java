
public class Main {
    public static void main(String[] args) {
        int kol = 100;
        MyThreadS[] myThreadS = new MyThreadS[kol];

        int start = 1000000;
        int end = 16000000;
        int step = (end - start)/kol;
        long time = System.currentTimeMillis();
        for(int i = 0; i < kol; i++) {

            myThreadS[i] = new MyThreadS("Tread" + Integer.toString(i), start + step*i, start + step*(i+1));
            myThreadS[i].start();

        }
        int iter = 0;
        while(iter < kol) {
            if(myThreadS[iter].isReady()) {
                iter++;
            }else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(System.currentTimeMillis() - time);

    }
}
