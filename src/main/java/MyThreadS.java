public class MyThreadS extends Thread{

    private int start;
    private int end;
    private int counter;
    private boolean ready;

    MyThreadS(String name, int start, int end){
        super(name);
        this.start = start;
        this.end = end;
        this.counter = 0;
        this.ready = false;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isReady() {
        return ready;
    }

    @Override
    public void run() {
        for(int i = this.start; i < this.end; i++) {
            if(Simple.isSimple(i)) {
                this.counter++;
            }
        }
        this.ready = true;
        System.out.println(getName());
        System.out.println(this.counter);
    }


}
