package _java._se._04;



import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedExample {
    public static void main(String[] args) throws IOException {
        PipedInputStream pipeIn = null;
        PipedOutputStream pipeOut = null;

        int countRead = 0;
        int[] toRead = null;
        pipeIn = new PipedInputStream();
        pipeOut = new PipedOutputStream(pipeIn);

        for(int i = 0; i < 20; i++){
            pipeOut.write(i);
        }
        int willRead = pipeIn.available();
        toRead = new int[willRead];

        for (int i = 0; i < willRead; i++) {
            toRead[i] = pipeIn.read();
            System.out.println(toRead[i] + " ");
        }

    }
}
