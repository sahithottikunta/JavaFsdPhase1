package prac;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class FileHandlingWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner work = new Scanner(System.in);
		 String cin,cout = "YES"; 
		 
		 while( cout.equalsIgnoreCase("YES") ) { 
		 System.out.println("\t\t Worker Information\n\n");
		 
		 System.out.println("1 Add New Worker Record : ");
		 System.out.println("2 View All Worker Record :");
		 System.out.println("3 Delete Worker Record :");
		 System.out.println("4 Search Worker Record :");
		 System.out.println("5 Update Worker Record :"); 
		 
		 System.out.print("\n\n");
		 System.out.println("SELECT FROM ABOVE OPTIONS: ");
		 cin = work.nextLine();
		 
		 if( cin.equals("1") ) {
		 try {
		AddRecord();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( cin.equals("2") ) {
		 try {
		ViewAllRecord();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( cin.equals("3") ) {
		 try {
		DeleteRecordByID();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( cin.equals("4")) {
		 try {
		SearchRecordbyID();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( cin.equals("5") ) {
		 try {
		updateRecordbyID();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 }
		 
		 System.out.println("DO YOU WANT TO CONTINUE :YES/NO");
		 cout = work.nextLine();
		 
		 }
		}
		 public static void AddRecord() throws IOException {
		 
		 BufferedWriter bufferwriter = new BufferedWriter( new 
		FileWriter("records.txt",true) );
		 @SuppressWarnings("resource")
		Scanner work = new Scanner(System.in);
		 
		 String ID, name, age, addr;
		 
		 System.out.print("Enter the Worker ID: ");
		 ID = work.nextLine();
		 System.out.print("Enter the Worker Name: ");
		 name = work.nextLine();
		 System.out.print("Enter the Worker Age: ");
		 age = work.nextLine();
		 System.out.print("Enter the Worker Address: ");
		 addr = work.nextLine(); 
		 
		 bufferwriter.write(ID +","+ name+ ","+ age+ ","+ addr);
		 bufferwriter.flush();
		 bufferwriter.newLine();
		 bufferwriter.close();
		 
		 }
		 
		 
		 
		public static void ViewAllRecord() throws IOException {
		 BufferedReader br = new BufferedReader( new FileReader("records.txt") );
		 
		 String record;
		 
		 System.out.println(" _____________________________________________________________ ");
		 
		 System.out.println("| ID Name Age Address |");
		 
		 System.out.println(" _____________________________________________________________ ");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 System.out.println("| |");
		 
		 System.out.println(" ________________________________________________________________ ");
		 br.close(); 
		 
		 }
		public static void DeleteRecordByID() throws IOException {
		 @SuppressWarnings("resource")
		Scanner work = new Scanner(System.in);
		 String ID, record;
		 
		 
		 File tempDB = new File("records_temp.txt");
		 File db = new File("records.txt");
		 
		 
		 BufferedReader br = new BufferedReader( new FileReader( db ) );
		 BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
		 
		 
		 System.out.println("\t\t Delete Worker Record\n");
		 
		 System.out.println("Enter your Worker ID: ");
		 ID = work.nextLine();
		 
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 
		 if( record.contains(ID) ) 
		 continue;
		 
		 bw.write(record);
		 bw.flush();
		 bw.newLine();
		 }
		 
		 br.close();
		 bw.close();
		 
		 db.delete();
		 
		 tempDB.renameTo(db);
		 }
		public static void SearchRecordbyID() throws IOException {
		 String ID,record;
		 @SuppressWarnings("resource")
		Scanner work = new Scanner(System.in);
		 
		 BufferedReader br = new BufferedReader( new FileReader("records.txt") );
		 
		 System.out.println("\t\t Search Worker Record\n");
		 
		 
		 System.out.println("Enter the Worker ID: ");
		 ID = work.nextLine();
		 
		 System.out.println(" _______________________________________________________________");
		 System.out.println("| ID Name Age Address |");
		 System.out.println(" ______________________________________________________________ ");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 if( record.contains(ID) ) {
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 
		 
		 }
		 
		 System.out.println("| |");
		 System.out.println(" _______________________________________________________________");
		 
		 br.close();
		 }
		public static void updateRecordbyID() throws IOException {
		 String newName, newAge, newAddr, record, ID,record2;
		 
		 File db = new File("records.txt");
		 File tempDB = new File("records_temp.txt");
		 
		 BufferedReader br = new BufferedReader( new FileReader(db) );
		 BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
		 
		 @SuppressWarnings("resource")
		Scanner work = new Scanner(System.in);
		 
		 System.out.println("\t\t Update Worker Record\n\n"); 
		/**/
		System.out.println("Enter the Worker ID: ");
		 ID = work.nextLine(); 
		 System.out.println(" ______________________________________________________________");
		 System.out.println("| ID Name Age Address |");
		 System.out.println(" ______________________________________________________________");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 if( record.contains(ID) ) {
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 } 
		 System.out.println("| |");
		 System.out.println("________________________________________________________________");
		 
		 br.close();
		/**/ 
		 System.out.println("Enter the new Name: ");
		 newName = work.nextLine(); 
		 System.out.println("Enter the new Age: ");
		 newAge = work.nextLine(); 
		 System.out.println("Enter the new Address: ");
		 newAddr = work.nextLine(); 
		 
		 BufferedReader br2 = new BufferedReader( new FileReader(db) );
		 
		 while( (record2 = br2.readLine() ) != null ) { 
		 if(record2.contains(ID)) {
		 bw.write(ID+ ","+newName+ ","+ newAge+ ","+ newAddr);
		 } else {
		 
		 bw.write(record2);
		 } 
		 bw.flush();
		 bw.newLine();
		 }
		 
		 bw.close();
		 br2.close(); 
		 db.delete(); 
		 boolean success = tempDB.renameTo(db); 
		 System.out.println(success); 
		 
		 }
		 
		}
