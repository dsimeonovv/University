import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import com.mysql.jdbc.Statement;

public class Client {
	
	public static void main(String[] args) {
		
		Socket connection = null;
		Scanner getResult = null;
		Scanner keyboard = new Scanner(System.in);
		
		final String host = "localhost";
		final int port = 1111;
		
		System.out.println("������� �� �� ������ ��� �������...");
		try{
			connection = new Socket(host, port);
			getResult = new Scanner(connection.getInputStream());
		}
		catch(IOException e1){
			e1.printStackTrace();
		}
		System.out.println("����������� � �������!");
		
		while(true){
			printMenu(connection);
			System.out.println("������� ENTER, �� �� ���������� ... ");
			keyboard.nextLine();
			
		}
		
		
	}
	
	public static void printMenu(Socket s){
		
		int myChoice;
		Socket c = s;
		String str = null;
		PrintWriter out = null;
		try {
			out = new PrintWriter(c.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner input = new Scanner(System.in);
		System.out.println("����:");
		System.out.println("1.������ ���� ����.");
		System.out.println("2.����������� �� ����.");
		System.out.println("3.����������� ������.");
		System.out.println("4.�����.");
		
		do{
			System.out.println("�����: ");			
			myChoice = input.nextInt();
			input.nextLine();
		}while(myChoice <1 && myChoice >4);
		
		
		switch(myChoice){
		case 1:{
			System.out.print("������ ID �� ������ ");
			String ID = input.nextLine();
			System.out.print("������ ��� �� ������ ");
			String NAME = input.nextLine();
			System.out.print("������ ���� �� ������� �� ������ ");
			String BDATE = input.nextLine();
			System.out.print("������ ������� ����� �� ��������� �� ������ ");
			String OWNER = input.nextLine();
			str = "INSERT INTO DOGS (`ID` ,`NAME`,`BDATE`, `OWNER`) VALUES ( ' " + ID + "','" + NAME + "','" + BDATE + "','" + OWNER + "');";
			out.println(str);
			break;
		}case 2:{
			
			System.out.print("������ ID �� ������ ");
			String ID = input.nextLine();
			System.out.print("������ ��� �� ������ ");
			String NAME = input.nextLine();
			System.out.print("������ ���� �� ������� �� ������ ");
			String BDATE = input.nextLine();
			System.out.print("������ ������� ����� �� ��������� �� ������ ");
			String OWNER = input.nextLine();
			str = " UPDATE DOGS SET NAME='" + NAME + "',BDATE='" + BDATE + "',OWNER='" + OWNER + "' WHERE ID= '" + ID+"' ";
			out.println(str);
			break;
		}case 3:{
			System.out.print("������ ID �� ������: ");
			String ID = input.nextLine();
			System.out.print("������ ���� �� ���������� �� ������ � ���������: ");
			String DATE = input.nextLine();
			System.out.print("������ ���������� �� �������: ");
			String REC = input.nextLine();                        
			str = "INSERT INTO MEDREC (`ID` ,`DATE`, `REC`) VALUES ( '"+ ID + "','"+ DATE +"','" + REC + "');";
			out.println(str);
			break;
		}case 4:{
			out.println("exit");
			System.exit(0);
		}
		}		
	}
	
}