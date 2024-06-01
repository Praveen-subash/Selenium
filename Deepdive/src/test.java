import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\sprav\\Downloads\\6688.txt")));
		
		System.out.println(content);
		
		

	}

}
