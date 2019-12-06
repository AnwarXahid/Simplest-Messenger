package Offline2;

/**
 * Created by MiNNiE on 11/19/2015.
 */


public class ReadThread implements Runnable {
    private static TableViewController table;
    private Thread thr;
    private NetworkUtil nc;
    private static ClientMessageBoxController clientMessageBoxController;

    public ReadThread(NetworkUtil nc) {
        this.nc = nc;
        this.thr = new Thread(this);
        thr.start();
    }


    public void run() {
        try {
                String s = (String) nc.read();
                clientMessageBoxController.setMsg(s);


        } catch(Exception e) {
            System.out.println ("Error in ReadThread"+e);
        }
        //nc.closeConnection();
    }

    public static void setC(ClientMessageBoxController c){clientMessageBoxController=c;}
}


