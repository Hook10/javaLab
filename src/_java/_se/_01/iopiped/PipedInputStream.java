//package _java._se._01.iopiped;
//
//import java.io.PipedOutputStream;
//
//public class PipedInputStream {
//    PipedInputStream pipeIn = null;
//    PipedOutputStream pipeOut = null;
//
//    int countRead = 0;
//    int[] toRead = null;
//    pipeIn = new PiperInputStream();
//    pipeOut = new PipeOutputStream(pipeIn);
//
//    for(int i = 0; i < 20; i++){
//        pipeOut.write(i);
//    }
//    int willRead = pipeIn.available();
//
//    private int available() {
//        return 0;
//    }
//
//    toRead = new int[willRead];
//
//    for(int i = 0; i < willRead; i++){
//        toRead[i] = pipeIn.read();
//    }
//
//    private int read() {
//        return 0;
//    }
//
//}
