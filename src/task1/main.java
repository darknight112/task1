package task1;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {

		   String inputArr[] = new String[4];
		    try {
				BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\hkala\\eclipse-workspace\\task1\\src\\task1\\input.txt")); //Creation of BufferedReader object
				Scanner scan = new Scanner(read);
				int count = 0;
				while(scan.hasNextLine()) {
					inputArr[count]=(scan.nextLine());
					count ++;
					}
			}
			catch (IOException except)
				{
					except.printStackTrace();
				}
			for(int w=0; w<4; w++){
			    int count=1;

			    for(int k=w+1; k<4; k++ ){
			        if(inputArr[w].equals(inputArr[k])){
			            count++;
			            inputArr[k]="0";
			        }
			    }
			    if(inputArr[w]!="0"){
			        System.out.println(inputArr[w]+" " +count);
			    }
		
			}	

		
	}

}
