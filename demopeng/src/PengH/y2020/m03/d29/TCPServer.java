package PengH.y2020.m03.d29;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        while(true){
            Socket socket=server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{InputStream is=socket.getInputStream();
                        File file=new File("G:\\load");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        String filename="\\itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".png";
                        FileOutputStream fos=new FileOutputStream(file+filename);
                        int len=0;
                        byte[] bytes=new byte[1024];
                        while((len=is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        OutputStream os=socket.getOutputStream();
                        os.write("已保存".getBytes());
                        fos.close();
                        socket.close();
                    }catch(IOException e){
                        System.out.println(e);
                    }

                }
            }).start();
            server.close();
        }
    }
}
