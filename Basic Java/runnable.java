class runnable implements interfaceRunnable {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        runnable obj = new runnable();
        Thread t = new Thread(obj);
        t.start();
    }
}