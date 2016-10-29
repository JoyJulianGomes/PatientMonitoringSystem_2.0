package model;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Patient {

	//patient_profile panel
	private int PID;
	private String Name;
	private int Age;
	private String Sex;
	private String Religion;
	private String Ocupation;
	private String MartialStatus;
	private int Contact;
	private String Informant;
	private String Height;
	private int Weight;
	private Image img;
	
	private String chiefComplaint;
	private String currentHistory;
	private String pastHistory;
	private String drug_usage;
	
	//History panel
	private boolean ill_Looking;
	private boolean Lethargic;
	private boolean Unconscious;
	private boolean Cachexia;
	private boolean Obesity;
	private boolean Cyanosis;
	private boolean Edema;
	private boolean Pale;
	private boolean Uphoric;
	private boolean Pathetic;
	private boolean Violent;
	private boolean CalmnCoOp;

	public Patient() {
		
	}
	
	public void setPID(int id ){
		this.PID = id;
	}
	public void setName(String n){
		this.Name = n;
	}
	public void setAge(int age){
		this.Age=age;
	}
	public void setSex(String x){
		this.Sex=x;
	}
	public void setReligion(String r){
		this.Religion = r;
	}
	public void setOcupation( String pa){
		this.Ocupation = pa;
	}
	public void setMartialStatus(String x){
		this.MartialStatus = x;
	}
	public void setContact(int x){
		this.Contact = x;
	}
	public void setHeight(String x){
		this.Height = x;
	}
	public void setWeight(int x){
		this.Weight = x;
	}
	public void setInformant(String x){
		this.Informant = x;
	}
	public void setchiefComplaint(String x){
		this.chiefComplaint = x;
	}
	public void setcurrentHistory(String x ){
		this.currentHistory = x;
	}
	public void setpastHistory(String x ){
		this.pastHistory = x;
	}
	public void setdrug_usage(String x ){
		this.drug_usage = x;
	}
	public void setill_Looking(boolean x){
		this.ill_Looking = x;
	}
	public void setLethargic(boolean x){
		this.Lethargic = x;
	}
	public void setUnconscious(boolean x){
		this.Unconscious = x;
	}
	public void setCachexia(boolean x){
		this.Cachexia = x;
	}
	public void setObesity(boolean x){
		this.Obesity = x;
	}
	public void setCyanosis(boolean x){
		this.Cyanosis = x;
	}
	public void setEdema(boolean x){
		this.Edema = x;
	}
	public void setPale(boolean x){
		this.Pale = x;
	}
	public void setUphoric(boolean x){
		this.Uphoric = x;
	}
	public void setPathetic(boolean x){
		this.Pathetic = x;
	}
	public void setViolent(boolean x){
		this.Violent = x;
	}
	public void setCalmnCoOp(boolean x){
		this.CalmnCoOp = x;
	}
	
	public int getPID(){
		return this.PID;
	}
	public String getName(){
		return this.Name;
	}
	public int getAge(){
		return this.Age;
	}
	public String getSex(){
		return this.Sex;
	}
	public String getReligion(){
		return this.Religion;
	}
	public String getOcupation(){
		return this.Ocupation;
	}
	public String getMartialStatus(){
		return this.MartialStatus;
	}
	public int getContact(int x){
		return this.Contact;// = x;
	}
	public String getHeight(){
		return this.Height;// = x;
	}
	public int getWeight(){
		return this.Weight;// = x;
	}
	public String getInformant(){
		return this.Informant;
	}
	public String getchiefComplaint(){
		return this.chiefComplaint;
	}
	public String getcurrentHistory(){
		return this.currentHistory;
	}
	public String getpastHistory(){
		return this.pastHistory;
	}
	public String getdrug_usage(){
		return this.drug_usage;
	}
	public int getContact(){
		return this.Contact;
	}
	public boolean getill_Looking(){
		return this.ill_Looking;// = x;
	}
	public boolean getLethargic(){
		return this.Lethargic;// = x;
	}
	public boolean getUnconscious(){
		return this.Unconscious;// = x;
	}
	public boolean getCachexia(){
		return this.Cachexia;// = x;
	}
	public boolean getObesity(){
		return this.Obesity;//= x;
	}
	public boolean getCyanosis(){
		return this.Cyanosis;// = x;
	}
	public boolean getEdema(){
		return this.Edema;// = x;
	}
	public boolean getPale(){
		return this.Pale;// = x;
	}
	public boolean getUphoric(){
		return this.Uphoric;// = x;
	}
	public boolean getPathetic(){
		return this.Pathetic;// = x;
	}
	public boolean getViolent(){
		return this.Violent;// = x;
	}
	public boolean getCalmnCoOp(){
		return this.CalmnCoOp; // = x;
	}
	
	
	
	private double temp;
	public void setTemp(double tem){
		this.temp = tem;
	}
	public double getTemp(){
		return this.temp;
	}
	
	private int pulse;
	public void setPulse(int tem){
		this.pulse = tem;
	}
	public int getPulse(){
		return this.pulse;
	}
	
	private int sys;
	private int dia;
	public void setSys(int tem){
		this.sys = tem;
	}
	public int getSys(){
		return this.sys;
	}
	public void setDia(int tem){
		this.dia = tem;
	}
	public int getDia(){
		return this.dia;
	}
	
	private int Rp;
	public void setRp(int tem){
		this.Rp = tem;
	}
	public int getRp(){
		return this.Rp;
	}
	
	private String Comp;
	public void setComp(String x){
		this.Comp = x;
	}
	public String getComp(){
		return this.Comp;// = x;
	}

	private String Drug;
	public void setDrug(String x){
		this.Drug = x;
	}
	public String getDrug(){
		return this.Drug;// = x;
	}
	
	private boolean Alimnentary;
	private boolean Respiratory;
	private boolean Cardiovascular;
	private boolean Nervous;
	private boolean Locmotor;
	
	public void setAlimnentary(boolean x){
		this.Alimnentary = x;
	}
	public void setRespiratory(boolean x){
		this.Respiratory= x;
	}
	public void setCardiovascular(boolean x){
		this.Cardiovascular = x;
	}
	public void setNervous(boolean x){
		this.Nervous = x;
	}
	public void setLocmotor(boolean x){
		this.Locmotor = x;
	}
	public boolean getAlimnentary(){
		return this.Alimnentary;// = x;
	}
	public boolean getRespiratory(){
		return this.Respiratory;//= x;
	}
	public boolean getCardiovascular(){
		return this.Cardiovascular;// = x;
	}
	public boolean getNervous(){
		return this.Nervous;// = x;
	}
	public boolean getLocmotor(){
		return this.Locmotor;// = x;
	}
	public void setImg(InputStream x){
		//this.img = x.toImage(true);
		try {
			this.img = ImageIO.read(x);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem in InputStream to Image Convertion");
			e.printStackTrace();
		}
	}
	public Image getImg(){
		return this.img;
	}
	
}
