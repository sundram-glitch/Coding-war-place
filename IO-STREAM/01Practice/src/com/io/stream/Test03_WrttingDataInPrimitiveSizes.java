package com.io.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_WrttingDataInPrimitiveSizes {
//FIS and FOS has limit that it can write only 255 byte
	//to overcome this problem we go for dos dis
	public static void main(String[] args) throws IOException {
    DataOutputStream dos=new DataOutputStream(new FileOutputStream("abc.txt"));
	dos.writeChars("Sundaram");
	dos.writeInt(98);//4 bytes
	dos.writeBoolean(true);
	dos.writeDouble(342);
	int data;
	/*while((data=fish.read())!=-1) {
		System.out.println(data);
	}*/
		DataInputStream dish=new DataInputStream(new FileInputStream("abc.txt"));
	    System.out.println(dish.readChar());
	    System.out.println(dish.readInt());
		System.out.println(dish.readBoolean());
		System.out.println(dish.readByte());
		System.out.println(dish.readDouble());
	}

}
