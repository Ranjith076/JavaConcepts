package JavaBasics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path="D:\\Users\\testfile.txt";
		String content = new String(Files.readAllBytes(Paths.get(path)));
		System.out.println(content);

	}

}
