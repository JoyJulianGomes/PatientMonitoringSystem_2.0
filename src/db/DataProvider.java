package db;
import db.DBConnection;
import model.Patient;
import sun.util.calendar.BaseCalendar.Date;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataProvider {
	

	public DataProvider() {}
	
	public static boolean checkDoc(int DID, String pass){
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();
			String querry = "Select * from doctor where doctor.ID = "+"'"+DID+"'"+" and doctor.PASSWOARD = "+"'"+pass+"'";
			ResultSet rs = stmt.executeQuery(querry);
			
			int size = 0;
			while(rs.next()){
				size++;
			}
			if(size >= 1){
				System.out.println("no problem in Login.check(did,pass)");
				return true;
			}
			else {
				System.out.println(rs.getRow());
				return false;
			}
		} 
		catch (SQLException e) {
			System.out.println("problem in database check part");
			e.printStackTrace();
		}
		System.out.println(DID);
		System.out.println(pass);
		return false;
	}

	public static boolean checkPat(int PID) {
		try{
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();
			String querry = "Select * from patient where patient.PID = "+"'"+PID+"'";
			ResultSet rs = stmt.executeQuery(querry);
			
			int size = 0;
			while(rs.next()){
				size++;
			}
			if(size >= 1){
				System.out.println("no problem in Login.checkPID(pid)");
				return true;
			}
			else {
				System.out.println(rs.getRow());
				return false;
			}
		} 
		catch (SQLException e) {
			System.out.println("problem in database check part");
			e.printStackTrace();
		}
		System.out.println(PID);
		return false;
	}

	public static Patient createPatOb(int pid){
		
		Patient p = new Patient();
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();
			String querry ="SELECT * FROM patient WHERE patient.PID = "+"'"+pid+"'";
			ResultSet rs = stmt.executeQuery(querry);
			
			rs.next();

			p.setName(rs.getString("Name"));
			p.setPID(pid);
			p.setAge(rs.getInt("Age"));
			p.setSex(rs.getString("Sex"));
			p.setMartialStatus(rs.getString("Marital_Status"));
			p.setReligion(rs.getString("Religion"));
			p.setOcupation(rs.getString("Occupation"));
			p.setWeight(rs.getInt("Weight"));
			p.setHeight(rs.getString("Height"));
			p.setContact(rs.getInt("Contact"));
			p.setImg(rs.getBinaryStream("photo"));
			
//			System.out.println(rs.getString("Name"));
//			System.out.println(rs.getInt("Age"));
//			System.out.println(rs.getString("Sex"));
//			System.out.println(rs.getString("Marital_Status"));
//			System.out.println(rs.getString("Religion"));
//			System.out.println(rs.getString("Occupation"));
//			System.out.println(rs.getInt("Weight"));
//			System.out.println(rs.getString("Height"));
//			System.out.println(rs.getInt("Contact"));
			
//			
//			p.setchiefComplaint(rs.getString("Value"));
//			p.setcurrentHistory(rs.getString("Description"));
//			p.setpastHistory(rs.getString("Description"));
//			p.setdrug_usage(rs.getString("Drug"));
			
			String querry2 ="SELECT * FROM appearance WHERE PID = "+"'"+pid+"'";
			ResultSet rs2 = stmt.executeQuery(querry2);
			
			rs2.next();
			p.setill_Looking(rs2.getBoolean("ill_Looking"));
			p.setLethargic(rs2.getBoolean("Lethargic"));
			p.setUnconscious(rs2.getBoolean("Unconscious"));
			p.setCachexia(rs2.getBoolean("Cachexia"));
			p.setObesity(rs2.getBoolean("Obesity"));
			p.setCyanosis(rs2.getBoolean("Cyanosis"));
			p.setEdema(rs2.getBoolean("Edema"));
			p.setPale(rs2.getBoolean("Pale"));
			p.setUphoric(rs2.getBoolean("Uphoric"));
			p.setPathetic(rs2.getBoolean("Pathetic"));
			p.setViolent(rs2.getBoolean("Violent"));
			p.setCalmnCoOp(rs2.getBoolean("CalmnCoOp"));
//			
//			System.out.println(p.getill_Looking());
//			System.out.println(p.getLethargic());
//			System.out.println(p.getUnconscious());
//			System.out.println(p.getCachexia());
//			System.out.println(p.getObesity());
//			System.out.println(p.getCyanosis());
//			System.out.println(p.getEdema());
//			System.out.println(p.getPale());
//			System.out.println(p.getUphoric());
//			System.out.println(p.getPathetic());
//			System.out.println(p.getViolent());
//			System.out.println(p.getCalmnCoOp());
			
			String querryRP = "SELECT * FROM `respiratory` where pid ="+"'"+pid+"'"+" order by date desc";
			ResultSet rsRp = stmt.executeQuery(querryRP);
			rsRp.next();
			p.setRp(rsRp.getInt("Value"));
			
			
			String querryTemp = "SELECT * FROM `temp` WHERE PID ="+"'"+pid+"'"+" Order by Date DESC";
			ResultSet rsTemp = stmt.executeQuery(querryTemp);
			rsTemp.next();
			p.setTemp(rsTemp.getDouble("Value"));
			
			String querryPulse = "SELECT * FROM `pulse` where pid = "+"'"+pid+"'"+" order by date desc";
			ResultSet rsPulse = stmt.executeQuery(querryPulse);
			rsPulse.next();
			p.setPulse(rsPulse.getInt("Value"));
			
			String querryBP = "SELECT * FROM `bloodpressure` WHERE pid = "+"'"+pid+"'"+" order by date desc";
			ResultSet rsBP = stmt.executeQuery(querryBP);
			rsBP.next();
			p.setDia(rsBP.getInt("Diastolic"));
			p.setSys(rsBP.getInt("Systolic"));
			
			//Complaint
			String querryComp = "SELECT * FROM `complaint` where pid = "+"'"+pid+"'";
			ResultSet rsComp = stmt.executeQuery(querryComp);
			rsComp.next();
			p.setchiefComplaint(rsComp.getString("Value"));
			
			//Drug
			String querryDrug = "SELECT * FROM `drug_usage` WHERE pid = "+"'"+pid+"'";
			ResultSet rsDrug = stmt.executeQuery(querryDrug);
			rsDrug.next();
			p.setdrug_usage(rsDrug.getString("Drug"));
			
			//Systematic findings
			String querrySystem ="SELECT * FROM `systemic_finding` WHERE pid = "+"'"+pid+"'";
			ResultSet rsSys = stmt.executeQuery(querrySystem);
			
			rsSys.next();
			p.setAlimnentary(rsSys.getBoolean("Alimentary"));
			p.setRespiratory(rsSys.getBoolean("Respiratory"));
			p.setCardiovascular(rsSys.getBoolean("Cardiovasculat"));
			p.setNervous(rsSys.getBoolean("Nervous"));
			p.setLocmotor(rsSys.getBoolean("Locmotor"));
			
		} 
		catch (SQLException e) {
			System.out.println("problem in database check part");
			e.printStackTrace();
		}
		return p;
	}
	
	public static ArrayList<String> getAvailableTest(int pid){
		try{
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();

			ArrayList<String> AvailableTestList = new ArrayList<String>();
			

			String querry1 = "select * from urine_test where urine_test.pid = "+"'"+pid+"'";
			ResultSet rs1 = stmt.executeQuery(querry1); 
			int size = 0;
			while(rs1.next()){size++;}
			if(size > 0){
				AvailableTestList.add("urine_test");
			}
			
			String querry2 = "select * from cbc where cbc.pid = "+"'"+pid+"'";
			ResultSet rs2 = stmt.executeQuery(querry2); 
			size = 0;
			while(rs2.next()){size++;}
			if(size > 0){
				AvailableTestList.add("cbc");
			}
			
			String querry3 = "select * from lipid_profile where lipid_profile.pid = "+"'"+pid+"'";
			ResultSet rs3 = stmt.executeQuery(querry3); 
			int size3 = 0;
			while(rs3.next()){size3++;}
			if(size3 > 0){
				AvailableTestList.add("lipid_profile");
			}
			
			String querry4 = "select * from liver_function_test where liver_function_test.pid = "+"'"+pid+"'";
			ResultSet rs4 = stmt.executeQuery(querry4); 
			size = 0;
			while(rs4.next()){size++;}
			if(size > 0){
				AvailableTestList.add("liver_function_test");
			}
			
			String querry5 = "select * from stool_test where stool_test.pid = "+"'"+pid+"'";
			ResultSet rs5 = stmt.executeQuery(querry5); 
			size = 0;
			while(rs5.next()){size++;}
			if(size > 0){
				AvailableTestList.add("stool_test");
			}
			
			for(String tests : AvailableTestList)System.out.println(tests);
			return AvailableTestList;
		} 
		catch (SQLException e) {
			System.out.println("problem in database query");
			e.printStackTrace();
		}
		return null;
	}
	public static ArrayList<String> getTestDates(int pid, String testname){
		try{
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();

			ArrayList<String> DateList = new ArrayList<String>();
			
			String querry1 = "select date from "+testname+" where "+testname+".PID = "+"'"+pid+"'";
			System.out.println(querry1);
			ResultSet rs1 = stmt.executeQuery(querry1); 
			while(rs1.next()){
				DateList.add(rs1.getString("Date"));
			}
			for(String Date : DateList){
				System.out.println(Date);
			}
			return DateList;
		} 
		catch (SQLException e) {
			System.out.println("problem in database update 1");
			e.printStackTrace();
		}
		return null;
	}
	public static ArrayList<String> getAllTests(){
		ArrayList<String> names = new ArrayList<String>();
		try{
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();
			
			String q = "select name from test";
			System.out.println(q);
			ResultSet rs = stmt.executeQuery(q);
			
			while(rs.next()){
				names.add(rs.getString("name"));
			}
			return names;
		} 
		catch (SQLException e) {
			System.out.println("problem in database update");
			e.printStackTrace();
		}
		return null;
	}
	public static String[][] getReport(int pid, String test, String Date){
		try{
			Connection con = DBConnection.getConnection();	
			Statement stmt = con.createStatement();
			
			String q = "select * from "+test+" where pid = "+"'"+pid+"'"+" and date = "+"'"+Date+"'";
			System.out.println(q);
			ResultSet rs = stmt.executeQuery(q);
			
			ResultSetMetaData rmd = rs.getMetaData();
			int colcount = rmd.getColumnCount();
			System.out.println(colcount);
			
			String report[][] = new String[colcount][2];
			
			rs.next();
			for(int i = 0; i<colcount; i++){
				report[i][0] = (String) rmd.getColumnName(i+1);
				report[i][1] = rs.getString(i+1);
			}
			for(int i = 0; i<colcount; i++){
				System.out.println(report[i][0]+"    "+report[i][1]);
			}
			return report;
		} 
		catch (SQLException e) {
			System.out.println("problem in database update");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void UpdateAppearanceTable(int pid, ArrayList<Boolean> data){
		System.out.println("inside UpdateAppearanceTable");
	
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "update appearance set ill_Looking = "+data.get(0).toString()+", Lethargic = "+data.get(1).toString()+", Unconscious = "+data.get(2).toString()+", Cachexia = "+data.get(3).toString()+", Obesity = "+data.get(4).toString()+", Cyanosis = "+data.get(5).toString()+", Edema = "+data.get(6).toString()+", Pale = "+data.get(7).toString()+", Uphoric = "+data.get(8).toString()+", Pathetic = "+data.get(9).toString()+", Violent = "+data.get(10).toString()+", CalmnCoOp = "+data.get(11).toString()+" where pid = "+pid;
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void InsertRespiratoryTable(int pid, String date, double value){
		System.out.println("inside InsertRespiratoryTable"+pid+" "+date+" "+value);

		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "insert into respiratory (pid, date, value) Values ("+pid+", '"+date+"', "+value+")";
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void InsertTempTable(int pid, String date, double value){
		System.out.println("inside InsertTempTable"+pid+" "+date+" "+value);
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "insert into temp (pid, date, value) Values ("+pid+", '"+date+"', "+value+")";
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void InsertPulseTable(int pid, String date, int value){
		System.out.println("inside InsertPulseTable"+pid+" "+date+" "+value);
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "insert into pulse (pid, date, value) Values ("+pid+", '"+date+"', "+value+")";
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void InsertBPTable(int pid, String date, int bps, int bpd){
		System.out.println("inside InsertBPTable"+pid+" "+date+" "+bps+" "+bpd);
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "insert into bloodpressure (pid, date, Systolic, Diastolic) Values ("+pid+", '"+date+"', "+bps+", "+bpd+")";
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void UpdateSysFindTable(int pid, ArrayList<Boolean> data){
		System.out.println("inside UpdateSysFindTable");
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "update systemic_finding set Alimentary = "+data.get(0).toString()+", Respiratory = "+data.get(1).toString()+", Cardiovasculat = "+data.get(2).toString()+", Nervous = "+data.get(3).toString()+", Locmotor = "+data.get(4).toString()+" where pid = "+pid;
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void InsertTestTable(String name){
		System.out.println("inside InsertTestTable(String name)");
		try {
			Connection con = DBConnection.getConnection();	
			Statement stmt;
			stmt = con.createStatement();
			String query = "insert into test (name) Values ( "+"'"+name+"' )";
			System.out.println(query);
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
//	public static void Update(int pid, double resp, double temp, int pulse, int sys, int dia ){
//		java.util.Date dt = new java.util.Date();
//		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("YYYY-mm-dd HH:mm:ss");
//		
//		String currentTime = sdf.format(dt);
//		
//	try{
//			Connection con = DBConnection.getConnection();	
//			Statement stmt = con.createStatement();
//			
//			String uprequerry = "insert into respiratory values("+"'"+pid+"','now()','"+resp+"')";
//		String uptequerry ="insert into temp values("+"'"+pid+"','now()','"+temp+"')";
//			String uppuquerry ="insert into pulse values("+"'"+pid+"','now()','"+pulse+"')";
//			String upprquerry = "insert into bloodpressure values("+"'"+pid+"','now()','"+sys+"','"+dia+"')";
//		stmt.executeUpdate(uprequerry); 
//			stmt.executeUpdate(uptequerry);
//		stmt.executeUpdate(uppuquerry);
//			stmt.executeUpdate(upprquerry);
//		} 
//		catch (SQLException e) {
//			System.out.println("problem in database update");
//			e.printStackTrace();
//		}
//	}
//}
