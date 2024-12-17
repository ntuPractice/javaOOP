import java.io.*;
import java.util.Scanner;

public class stream {
    public static void main(String[] args) throws FileNotFoundException {
        /*try{
            File myObj=new File("content.txt");
            Scanner read=new Scanner(myObj);
            while (read.hasNextLine()){
                String data=read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }*/




//        try {
//            int data1=5;
//            String data2="This is progrmaiz";
//            FileOutputStream fileStream=new FileOutputStream("file.txt");
//            ObjectOutputStream objOutput=new ObjectOutputStream(fileStream);
//            objOutput.writeInt(data1);
//            objOutput.writeObject(data2);
//
//           FileInputStream file=new FileInputStream("file.txt");
//           ObjectInputStream obj=new ObjectInputStream(file);
//            System.out.println("Integer data:"+obj.readInt());
//            System.out.println("String data:"+obj.readObject());
//
//            objOutput.close();
//            obj.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

        try{
            String data="This is a text inside the file";
            String content="This is another line of text";
            int date=23;
            PrintWriter output=new PrintWriter("file.txt");
            output.printf("I am %d years old\n",date);
            output.println(content);
            output.println(data);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}