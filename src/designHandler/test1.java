package designHandler;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import chartModel.getData;
import db.DataProvider;
import model.Patient;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.jfree.chart.ChartPanel;

import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPasswordField;


public class test1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_12;
	private JTextField textField_14;
	public static String patID;

	public Patient pat = new Patient();
	private JTable table;
	private JTextField txtRespRateInp;
	private JTextField txtTempInp;
	private JTextField txtPulseInp;
	private JTextField txtBPSInp;
	private JTextField txtBPDInp;
	private JPasswordField passwordField;
	
	
	private javax.swing.JPanel jPanel11;
    private javax.swing.JLabel lblTime;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test1() {
		setTitle("PATIENT MONITORING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//Doctor Login Page Begin
		
		JPanel docLogin = new JPanel();
		contentPane.add(docLogin, "name_190462582580425");
		docLogin.setLayout(null);
		
		JLabel lblDoctorId = new JLabel("DOCTOR ID :");
		lblDoctorId.setBounds(495, 248, 92, 39);
		lblDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		docLogin.add(lblDoctorId);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setBounds(495, 298, 92, 39);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		docLogin.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(595, 250, 130, 39);
		docLogin.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(595, 300, 130, 39);
		docLogin.add(passwordField);
		passwordField.setColumns(10);
		
		//textField_1 = new JTextField();
		//textField_1.setBounds(379, 341, 86, 20);
		//docLogin.add(textField_1);
		//textField_1.setColumns(10);
		
		//Doc login page finish
		
		//pat search page begin
		
		JPanel patLogin = new JPanel();
		contentPane.add(patLogin, "name_190462593567884");
		patLogin.setLayout(null);
		
		JPanel patDetails = new JPanel();
		contentPane.add(patDetails, "name_190462603930491");
		patDetails.setLayout(null);
		
		//panel history ends 
		
		//panel pathTest begins
		
		JPanel pathTest = new JPanel();
		pathTest.setBackground(Color.WHITE);
		pathTest.setBounds(147, 0, 1104, 606);
		pathTest.setLayout(null);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(10, 70, 69, 14);
		pathTest.add(lblName);
		
		JLabel lblAge_1 = new JLabel("AGE :");
		lblAge_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge_1.setBounds(10, 95, 46, 14);
		pathTest.add(lblAge_1);
		
		JLabel lblGender_1 = new JLabel("SEX :");
		lblGender_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender_1.setBounds(10, 120, 46, 14);
		pathTest.add(lblGender_1);
		
		JLabel lblTestName = new JLabel("TEST NAME :");
		lblTestName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTestName.setBounds(10, 145, 148, 20);
		pathTest.add(lblTestName);
		
		JLabel lblDescription = new JLabel("DESCRIPTION :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescription.setBounds(10, 296, 148, 32);
		pathTest.add(lblDescription);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 176, 178, 32);
		pathTest.add(comboBox);
		
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 353, 436, 193);
		pathTest.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblPatientId_1 = new JLabel("PATIENT ID :");
		lblPatientId_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatientId_1.setBounds(395, 98, 113, 14);
		pathTest.add(lblPatientId_1);
		
		JButton btnSend = new JButton("");
		btnSend.setIcon(new ImageIcon(test1.class.getResource("/icons/send-button.png")));
		btnSend.setForeground(Color.BLUE);
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSend.setBounds(966, 553, 118, 32);
		pathTest.add(btnSend);
		btnSend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField_12.setText("");
				textField_14.setText("");
			}
		});
		
		JButton btnCancel = new JButton("");
		btnCancel.setIcon(new ImageIcon(test1.class.getResource("/icons/cancel-button-300x115.png")));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setForeground(Color.RED);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				pathTest.setVisible(false);
				//HISTORY.setVisible(false);
				//STATUS.setVisible(false);
			}
		});
				
				
				
				
				
				
				
				
				
				
				
		
				
			
				
		       // frame.getContentPane().add(panel);
				
				//pat search page finish
		
			    //patient profile panel begin
				
				JPanel patient_profile = new JPanel();
				patient_profile.setBounds(147, 0, 1104, 606);
				patient_profile.setBackground(Color.WHITE);
				patient_profile.setLayout(null);
				
				JLabel lblWeight = new JLabel("WEIGHT :");
				lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblWeight.setBounds(64, 209, 109, 20);
				patient_profile.add(lblWeight);
				
				JLabel lblName_1 = new JLabel("NAME :");
				lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblName_1.setBounds(64, 82, 109, 20);
				patient_profile.add(lblName_1);
				
				JLabel lblAge = new JLabel("AGE :");
				lblAge.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblAge.setBounds(64, 127, 78, 20);
				patient_profile.add(lblAge);
				
				JLabel lblSex = new JLabel("SEX :");
				lblSex.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblSex.setBounds(64, 171, 78, 23);
				patient_profile.add(lblSex);
				
				JLabel lblMaritalStatus = new JLabel("MARITAL STATUS :");
				lblMaritalStatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblMaritalStatus.setBounds(64, 279, 220, 28);
				patient_profile.add(lblMaritalStatus);
				
				JLabel lblReligion = new JLabel("RELIGION :");
				lblReligion.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblReligion.setBounds(64, 312, 132, 30);
				patient_profile.add(lblReligion);
				
				JLabel lblOccupation = new JLabel("OCCUPATION :");
				lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblOccupation.setBounds(64, 347, 174, 34);
				patient_profile.add(lblOccupation);
				
				JLabel lblContactNumber = new JLabel("CONTACT NUMBER :");
				lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblContactNumber.setBounds(64, 387, 220, 28);
				patient_profile.add(lblContactNumber);
				
				JLabel lblHeight = new JLabel("HEIGHT  :");
				lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblHeight.setBounds(64, 245, 109, 23);
				patient_profile.add(lblHeight);
				
				JLabel lblCheifComplaint = new JLabel("CHEIF COMPLAINT :");
				lblCheifComplaint.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblCheifComplaint.setBounds(64, 523, 220, 28);
				patient_profile.add(lblCheifComplaint);
				
				JLabel lblDrugHistory = new JLabel("DRUG HISTORY :");
				lblDrugHistory.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblDrugHistory.setBounds(64, 553, 187, 28);
				patient_profile.add(lblDrugHistory);
				
				JLabel lblNewLabel_3Name = new JLabel("New Label");
				lblNewLabel_3Name.setFont(new Font("Tahoma", Font.PLAIN, 24));
				//lblNewLabel_3.setText("");
				lblNewLabel_3Name.setBounds(154, 82, 260, 20);
				patient_profile.add(lblNewLabel_3Name);
				
				JLabel lblAge_2 = new JLabel("Age");
				lblAge_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblAge_2.setBounds(133, 126, 78, 23);
				patient_profile.add(lblAge_2);
				
				JLabel lblSex_1 = new JLabel("Sex");
				lblSex_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblSex_1.setBounds(133, 171, 132, 23);
				patient_profile.add(lblSex_1);
				
				JLabel lblMstatus = new JLabel("MStatus");
				lblMstatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblMstatus.setBounds(280, 279, 174, 28);
				patient_profile.add(lblMstatus);
				
				JLabel lblReligion_1 = new JLabel("Religion");
				lblReligion_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblReligion_1.setBounds(206, 310, 149, 35);
				patient_profile.add(lblReligion_1);
				
				JLabel lblOccupation_1 = new JLabel("Occupation");
				lblOccupation_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblOccupation_1.setBounds(236, 347, 206, 34);
				patient_profile.add(lblOccupation_1);
				
				JLabel lblWeight_1 = new JLabel("Weight");
				lblWeight_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblWeight_1.setBounds(183, 205, 49, 28);
				patient_profile.add(lblWeight_1);
				
				JLabel lblHeight_1 = new JLabel("Height");
				lblHeight_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblHeight_1.setBounds(183, 241, 95, 30);
				patient_profile.add(lblHeight_1);
				
				JLabel lblComplaint = new JLabel("Complaint");
				lblComplaint.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblComplaint.setBounds(294, 520, 722, 35);
				patient_profile.add(lblComplaint);
				
				JLabel lblDrugHistory_1 = new JLabel("Drug History");
				lblDrugHistory_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblDrugHistory_1.setBounds(261, 552, 755, 30);
				patient_profile.add(lblDrugHistory_1);
				
				JLabel lblContact = new JLabel("Contact");
				lblContact.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblContact.setBounds(294, 386, 234, 31);
				patient_profile.add(lblContact);
				
				patDetails.add(patient_profile);
				
				JLabel lblKg = new JLabel("KG");
				lblKg.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblKg.setBounds(240, 208, 38, 23);
				patient_profile.add(lblKg);
				
				JLabel lblNewLabel_9 = new JLabel("");
				lblNewLabel_9.setBounds(0, 0, 1104, 606);
				patient_profile.add(lblNewLabel_9);
				
				JLabel lblPhoto = new JLabel("");
				lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
				lblPhoto.setBounds(526, 71, 350, 350);
				patient_profile.add(lblPhoto);
				
				//panel patient profile ends
				
				//panel history begins
				
				JPanel HISTORY = new JPanel();
				//HISTORY.setToolTipText("");
				HISTORY.setBackground(Color.WHITE);
				HISTORY.setForeground(new Color(0, 0, 0));
				HISTORY.setBounds(148, 0, 1104, 606);
				HISTORY.setLayout(null);
				
				JLabel lblApearance = new JLabel("APEARANCE");
				lblApearance.setForeground(Color.RED);
				lblApearance.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblApearance.setBounds(20, 102, 161, 47);
				HISTORY.add(lblApearance);
				
				JCheckBox chckbxIllLooking = new JCheckBox("ILL LOOKING");
				chckbxIllLooking.setBackground(Color.WHITE);
				chckbxIllLooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxIllLooking.setBounds(20, 139, 125, 23);
				HISTORY.add(chckbxIllLooking);
				
				JCheckBox chckbxLathergic = new JCheckBox("LETHARGIC");
				chckbxLathergic.setBackground(Color.WHITE);
				chckbxLathergic.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxLathergic.setBounds(20, 165, 125, 23);
				HISTORY.add(chckbxLathergic);
				
				JCheckBox chckbxCachexia = new JCheckBox("CACHEXIA");
				chckbxCachexia.setBackground(Color.WHITE);
				chckbxCachexia.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxCachexia.setBounds(20, 191, 125, 23);
				HISTORY.add(chckbxCachexia);
				
				JCheckBox chckbxObesity = new JCheckBox("OBESITY");
				chckbxObesity.setBackground(Color.WHITE);
				chckbxObesity.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxObesity.setBounds(20, 217, 125, 23);
				HISTORY.add(chckbxObesity);
				
				JCheckBox chckbxPale = new JCheckBox("PALE");
				chckbxPale.setBackground(Color.WHITE);
				chckbxPale.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxPale.setBounds(20, 243, 125, 23);
				HISTORY.add(chckbxPale);
				
				JLabel lblMentalStatus = new JLabel("MENTAL STATUS");
				lblMentalStatus.setForeground(Color.RED);
				lblMentalStatus.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblMentalStatus.setBounds(211, 102, 224, 43);
				HISTORY.add(lblMentalStatus);
				
				JCheckBox chckbxUphoric = new JCheckBox("UPHORIC");
				chckbxUphoric.setBackground(Color.WHITE);
				chckbxUphoric.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxUphoric.setBounds(221, 165, 132, 23);
				HISTORY.add(chckbxUphoric);
				
				JCheckBox chckbxPathetic = new JCheckBox("PATHETIC");
				chckbxPathetic.setBackground(Color.WHITE);
				chckbxPathetic.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxPathetic.setBounds(221, 191, 132, 23);
				HISTORY.add(chckbxPathetic);
				
				JCheckBox chckbxVolent = new JCheckBox("VIOLENT");
				chckbxVolent.setBackground(Color.WHITE);
				chckbxVolent.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxVolent.setBounds(221, 217, 132, 23);
				HISTORY.add(chckbxVolent);
				
				JCheckBox chckbxCalmCooperative = new JCheckBox("CALM & COOPERATIVE");
				chckbxCalmCooperative.setBackground(Color.WHITE);
				chckbxCalmCooperative.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxCalmCooperative.setBounds(221, 243, 203, 23);
				HISTORY.add(chckbxCalmCooperative);
				
				JLabel lblRespiratoryRate = new JLabel("RESPIRATORY RATE :");
				lblRespiratoryRate.setIcon(new ImageIcon(test1.class.getResource("/icons/respiratory_system_stop_music-.png")));
				lblRespiratoryRate.setForeground(new Color(255, 102, 0));
				lblRespiratoryRate.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblRespiratoryRate.setBounds(20, 328, 224, 30);
				HISTORY.add(lblRespiratoryRate);
				
				JLabel lblTemparature = new JLabel("TEMPARATURE :");
				lblTemparature.setIcon(new ImageIcon(test1.class.getResource("/icons/temp_1_32x32.png")));
				lblTemparature.setForeground(new Color(255, 102, 0));
				lblTemparature.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblTemparature.setBounds(20, 382, 184, 48);
				HISTORY.add(lblTemparature);
				
				JLabel lblPulseRate = new JLabel("PULSE RATE :");
				lblPulseRate.setIcon(new ImageIcon(test1.class.getResource("/icons/icon-02_32x32.png")));
				lblPulseRate.setForeground(new Color(255, 102, 0));
				lblPulseRate.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblPulseRate.setBounds(20, 450, 162, 32);
				HISTORY.add(lblPulseRate);
				
				JLabel lblBloodPressure_1 = new JLabel("BLOOD PRESSURE :");
				lblBloodPressure_1.setIcon(new ImageIcon(test1.class.getResource("/icons/blood-pressure-screening-clipa.png")));
				lblBloodPressure_1.setForeground(new Color(255, 102, 0));
				lblBloodPressure_1.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblBloodPressure_1.setBounds(20, 498, 204, 36);
				HISTORY.add(lblBloodPressure_1);
				
				JLabel lblAGeneralPhysical = new JLabel("General physical findings");
				lblAGeneralPhysical.setForeground(Color.RED);
				lblAGeneralPhysical.setFont(new Font("Tahoma", Font.PLAIN, 38));
				lblAGeneralPhysical.setBounds(20, 26, 441, 72);
				HISTORY.add(lblAGeneralPhysical);
				
				JCheckBox chckbxNewCheckBox = new JCheckBox("EDEMA");
				chckbxNewCheckBox.setBackground(Color.WHITE);
				chckbxNewCheckBox.setForeground(Color.RED);
				chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
				chckbxNewCheckBox.setBounds(417, 191, 167, 23);
				HISTORY.add(chckbxNewCheckBox);
				
				JCheckBox chckbxCynisis = new JCheckBox("CYNOSIS");
				chckbxCynisis.setBackground(Color.WHITE);
				chckbxCynisis.setForeground(Color.RED);
				chckbxCynisis.setFont(new Font("Tahoma", Font.BOLD, 16));
				chckbxCynisis.setBounds(417, 139, 177, 23);
				HISTORY.add(chckbxCynisis);
				
				JLabel lblBSystemicExamination = new JLabel("SYSTEMIC EXAMINATION FINDINGS");
				lblBSystemicExamination.setForeground(Color.BLUE);
				lblBSystemicExamination.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblBSystemicExamination.setBounds(576, 32, 518, 60);
				HISTORY.add(lblBSystemicExamination);
				
				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alimentary system");
				chckbxNewCheckBox_1.setBackground(new Color(255, 255, 255));
				chckbxNewCheckBox_1.setForeground(Color.BLUE);
				chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxNewCheckBox_1.setBounds(865, 126, 197, 23);
				HISTORY.add(chckbxNewCheckBox_1);
				
				JCheckBox chckbxRespiratorySystem = new JCheckBox("Respiratory system");
				chckbxRespiratorySystem.setBackground(Color.WHITE);
				chckbxRespiratorySystem.setForeground(Color.BLUE);
				chckbxRespiratorySystem.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxRespiratorySystem.setBounds(865, 212, 197, 23);
				HISTORY.add(chckbxRespiratorySystem);
				
				JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cardiovascular system");
				chckbxNewCheckBox_2.setBackground(Color.WHITE);
				chckbxNewCheckBox_2.setForeground(Color.BLUE);
				chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxNewCheckBox_2.setBounds(865, 298, 197, 23);
				HISTORY.add(chckbxNewCheckBox_2);
				
				JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Nervous system");
				chckbxNewCheckBox_3.setBackground(Color.WHITE);
				chckbxNewCheckBox_3.setForeground(Color.BLUE);
				chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxNewCheckBox_3.setBounds(865, 384, 197, 23);
				HISTORY.add(chckbxNewCheckBox_3);
				
				JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Locomotor system");
				chckbxNewCheckBox_4.setBackground(Color.WHITE);
				chckbxNewCheckBox_4.setForeground(Color.BLUE);
				chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxNewCheckBox_4.setBounds(865, 470, 197, 23);
				HISTORY.add(chckbxNewCheckBox_4);
				
				patDetails.add(HISTORY);
				
				JCheckBox chckbxUnconscious = new JCheckBox("UNCONSCIOUS");
				chckbxUnconscious.setBackground(Color.WHITE);
				chckbxUnconscious.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chckbxUnconscious.setBounds(221, 139, 132, 23);
				HISTORY.add(chckbxUnconscious);
				
				JLabel lblResp = new JLabel("Resp");
				lblResp.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblResp.setForeground(Color.RED);
				lblResp.setBounds(245, 328, 27, 30);
				lblResp.setText("");
				HISTORY.add(lblResp);
				
				JLabel lblTemp = new JLabel("temp");
				lblTemp.setForeground(Color.RED);
				lblTemp.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblTemp.setBackground(Color.WHITE);
				lblTemp.setText("");
				lblTemp.setBounds(203, 396, 41, 23);
				HISTORY.add(lblTemp);
				
				JLabel lblPulse = new JLabel("");
				lblPulse.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPulse.setForeground(Color.RED);
				lblPulse.setBounds(173, 455, 27, 23);
				HISTORY.add(lblPulse);
				
				JLabel lblBp = new JLabel("");
				lblBp.setForeground(Color.RED);
				lblBp.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblBp.setBounds(218, 498, 53, 36);
				HISTORY.add(lblBp);
				
				JLabel lblPerMin = new JLabel("per min");
				lblPerMin.setForeground(new Color(255, 102, 0));
				lblPerMin.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblPerMin.setBounds(270, 328, 53, 30);
				HISTORY.add(lblPerMin);
				
				JLabel lblPerMin_1 = new JLabel("F");
				lblPerMin_1.setForeground(new Color(255, 102, 0));
				lblPerMin_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblPerMin_1.setBounds(245, 396, 59, 20);
				HISTORY.add(lblPerMin_1);
				
				JLabel lblPerMin_2 = new JLabel("per min");
				lblPerMin_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblPerMin_2.setForeground(new Color(255, 102, 0));
				lblPerMin_2.setBounds(203, 456, 69, 20);
				HISTORY.add(lblPerMin_2);
				
				txtRespRateInp = new JTextField();
				txtRespRateInp.setBounds(57, 357, 86, 20);
				HISTORY.add(txtRespRateInp);
				txtRespRateInp.setColumns(10);
				
				txtTempInp = new JTextField();
				txtTempInp.setBounds(57, 422, 86, 20);
				HISTORY.add(txtTempInp);
				txtTempInp.setColumns(10);
				
				txtPulseInp = new JTextField();
				txtPulseInp.setText("");
				txtPulseInp.setBounds(57, 479, 86, 20);
				HISTORY.add(txtPulseInp);
				txtPulseInp.setColumns(10);
				
				txtBPSInp = new JTextField();
				txtBPSInp.setForeground(Color.RED);
				txtBPSInp.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtBPSInp.setBounds(57, 532, 86, 20);
				HISTORY.add(txtBPSInp);
				txtBPSInp.setColumns(10);
				
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.setIcon(new ImageIcon(test1.class.getResource("/icons/save-changes (1).png")));
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						//appearance table
						ArrayList<Boolean> Appearance = new ArrayList<Boolean>();
//				JCheckBox chckbxIllLooking = new JCheckBox("ILL LOOKING");
						if(chckbxIllLooking.isSelected()){
							System.out.println("Ill Looking is true");
							Appearance.add(true);
						}
						else{
							System.out.println("Ill Looking is false");
							Appearance.add(false);
						}

//				JCheckBox chckbxLathergic = new JCheckBox("LATHARGIC");
						if(chckbxLathergic.isSelected()){
							System.out.println("chckbxLathergic true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxLathergic false");
							Appearance.add(false);
						}
						//chckbxUnconscious
						if(chckbxUnconscious.isSelected()){
							System.out.println("chckbxUnconscious true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxUnconscious false");
							Appearance.add(false);
						}
//				JCheckBox chckbxCachexia = new JCheckBox("CACHEXIA");
						if(chckbxCachexia.isSelected()){
							System.out.println("chckbxCachexia true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxCachexia false");
							Appearance.add(false);
						}

//				JCheckBox chckbxObesity = new JCheckBox("OBESITY");
						if(chckbxObesity.isSelected()){
							System.out.println("chckbxObesity true");
							Appearance.add(true);
						}
						else
						{
							System.out.println("chckbxObesity false");
							Appearance.add(false);
						}
						
//				JCheckBox chckbxCynisis = new JCheckBox("CYNOSIS");
						if(chckbxCynisis.isSelected()){
							System.out.println("chckbxCynisis true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxCynisis false");
							Appearance.add(false);
						}
//				JCheckBox chckbxNewCheckBox = new JCheckBox("EDEMA");
						if(chckbxNewCheckBox.isSelected()){
							System.out.println("chckbxNewCheckBox-EDMA true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxNewCheckBox-EDMA false");
							Appearance.add(false);
						}

//				JCheckBox chckbxPale = new JCheckBox("PALE");
						if(chckbxPale.isSelected()){
							System.out.println("chckbxPale true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxPale false");
							Appearance.add(false);
						}

//				JCheckBox chckbxUphoric = new JCheckBox("UPHORIC");
						if(chckbxUphoric.isSelected()){
							System.out.println("chckbxUphoric true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxUphoric false");
							Appearance.add(false);
						}

//				JCheckBox chckbxPathetic = new JCheckBox("PATHETIC");
						if(chckbxPathetic.isSelected()){
							System.out.println("chckbxPathetic true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxPathetic false");
							Appearance.add(false);
						}

//				JCheckBox chckbxVolent = new JCheckBox("VIOLENT");
						if(chckbxVolent.isSelected()){
							System.out.println("chckbxVolent true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxVolent false");
							Appearance.add(false);
						}

//				JCheckBox chckbxCalmCooperative = new JCheckBox("CALM & COOPERATIVE");
						if(chckbxCalmCooperative.isSelected()){
							System.out.println("chckbxCalmCooperative true");
							Appearance.add(true);
						}
						else{
							System.out.println("chckbxCalmCooperative false");
							Appearance.add(false);
						}
						DataProvider.UpdateAppearanceTable(pat.getPID(), Appearance);
						//respiratory table
//				JLabel lblResp = new JLabel("Resp");
						
						double RespRateUpdate = Double.parseDouble(lblResp.getText());
						if(!txtRespRateInp.getText().equals("")){
							System.out.println("inside fetch set RespRateUpdate");
							RespRateUpdate = Double.parseDouble(txtRespRateInp.getText());
							System.out.println(RespRateUpdate);
							
						    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						    //get current date time with Date()
						    Date date = new Date();
						    String d = dateFormat.format(date);
						    System.out.println(d);
							
						    DataProvider.InsertRespiratoryTable(pat.getPID(), d, RespRateUpdate);
						  
						    //Updating pat object
							pat.setRp((int)Double.parseDouble(txtRespRateInp.getText()));
							
							//Updating panel labels to current value
							lblResp.setText(Integer.toString(pat.getRp())); 
							
							//Clearing Text Fields
							txtRespRateInp.setText("");
							
						}
						else System.out.println(RespRateUpdate);
						//temp table
//				JLabel lblTemparature = new JLabel("TEMPARATURE :");
						double TempUpdate;
						if(!txtTempInp.getText().equals("")){
							System.out.println("inside fetch set TempUpdate");
							TempUpdate = Double.parseDouble(txtTempInp.getText());
							System.out.println(TempUpdate);
							
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						    Date date = new Date();
						    String d = dateFormat.format(date);
						    System.out.println(d);
							
						    DataProvider.InsertTempTable(pat.getPID(), d, TempUpdate);
						   
						    //Updating pat object
							pat.setTemp((int)Double.parseDouble(txtTempInp.getText()));
							//Updating panel labels to current value
							lblTemp.setText(Double.toString(pat.getTemp()));
							//Clearing Text Fields
							txtTempInp.setText("");
						}
						//pulse table
//				JLabel lblPulseRate = new JLabel("PULSE RATE :");
						int PulseUpdate = Integer.parseInt(lblPulse.getText());;
						if(!txtPulseInp.getText().equals("")){
							System.out.println("inside PulseUpdateInp");
							PulseUpdate = Integer.parseInt(txtPulseInp.getText());
							System.out.println(PulseUpdate);
							
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						    //get current date time with Date()
						    Date date = new Date();
						    String d = dateFormat.format(date);
						    System.out.println(d);
							
						    DataProvider.InsertPulseTable(pat.getPID(), d, PulseUpdate);
						    
						    //Updating pat object
							pat.setPulse(Integer.parseInt(txtPulseInp.getText()));
							//Updating panel labels to current value
							lblPulse.setText(Integer.toString(pat.getPulse()));
							//Clearing Text Fields
							txtPulseInp.setText("");
							
						}
						//bloodpressure table
//				JLabel lblBloodPressure_1 = new JLabel("BLOOD PRESSURE :");
						String BPUpdate= lblBloodPressure_1.getText();
						if(!txtBPSInp.getText().equals("") && !txtBPDInp.getText().equals("")){
							int BPSUpdate = Integer.parseInt(txtBPSInp.getText());
							System.out.println(BPSUpdate);
							int BPDUpdate = Integer.parseInt(txtBPDInp.getText());
							System.out.println(BPDUpdate);
							
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						    //get current date time with Date()
						    Date date = new Date();
						    String d = dateFormat.format(date);
						    System.out.println(d);
							
						    DataProvider.InsertBPTable(pat.getPID(), d, BPSUpdate, BPDUpdate);	
						    
						    //Updating pat object
							pat.setSys(Integer.parseInt(txtBPSInp.getText()));
							pat.setDia(Integer.parseInt(txtBPDInp.getText()));
							
							//Updating panel labels to current value
							lblBp.setText(Integer.toString(pat.getSys())+"/"+Integer.toString(pat.getDia()));
							
							
							//Clearing Text Fields
							txtBPSInp.setText("");
							txtBPDInp.setText("");
						}
					
						//systemic_finding table
						ArrayList<Boolean> SysFind = new ArrayList<Boolean>();
//				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alimentary system");
						if(chckbxNewCheckBox_1.isSelected()){
							System.out.println("chckbxNewCheckBox_1-Alimentary true");
							SysFind.add(true);
						}
						else{
							System.out.println("chckbxNewCheckBox_1-Alimentary false");
							SysFind.add(false);
						}
//				JCheckBox chckbxRespiratorySystem = new JCheckBox("Respiratory system");
						if(chckbxRespiratorySystem.isSelected()){
							System.out.println("chckbxRespiratorySystem-Respiratory true");
							SysFind.add(true);
						}
						else{
							System.out.println("chckbxRespiratorySystem-Respiratory false");
							SysFind.add(false);
						}
//				JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cardiovascular system");
						if(chckbxNewCheckBox_2.isSelected()){
							System.out.println("chckbxNewCheckBox_2-Cardiovascular true");
							SysFind.add(true);
						}
						else{
							System.out.println("chckbxNewCheckBox_2-Cardiovascular false");
							SysFind.add(false);
						}
//				JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Nervous system");
						if(chckbxNewCheckBox_3.isSelected()){
							System.out.println("chckbxNewCheckBox_3-Nervous system true");
							SysFind.add(true);
						}
						else{
							System.out.println("chckbxNewCheckBox_3-Nervous system false");
							SysFind.add(false);
						}
//				JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Locomotor system");
						if(chckbxNewCheckBox_4.isSelected()){
							System.out.println("chckbxNewCheckBox_4-Locomotor system true");
							SysFind.add(true);
						}
						else{
							System.out.println("chckbxNewCheckBox_4-Locomotor system false");
							SysFind.add(false);
						}
						DataProvider.UpdateSysFindTable(pat.getPID(), SysFind);

						
					}
				});		
				btnNewButton_1.setBounds(759, 492, 153, 47);
				
				btnNewButton_1.setBounds(896, 532, 167, 48);
				HISTORY.add(btnNewButton_1);
				
				txtBPDInp = new JTextField();
				txtBPDInp.setForeground(Color.BLUE);
				txtBPDInp.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtBPDInp.setBounds(153, 532, 86, 20);
				HISTORY.add(txtBPDInp);
				txtBPDInp.setColumns(10);
				
				JLabel lblMmhg = new JLabel("mmHg");
				lblMmhg.setForeground(new Color(255, 102, 0));
				lblMmhg.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblMmhg.setBounds(281, 506, 69, 20);
				HISTORY.add(lblMmhg);
				
				JLabel lblDiastole = new JLabel("Diastole");
				lblDiastole.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblDiastole.setForeground(new Color(255, 102, 0));
				lblDiastole.setBounds(165, 554, 91, 23);
				HISTORY.add(lblDiastole);
				
				JLabel lblNewLabel_2 = new JLabel("Systole");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel_2.setForeground(new Color(255, 102, 0));
				lblNewLabel_2.setBounds(74, 554, 69, 23);
				HISTORY.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon(test1.class.getResource("/icons/digestive-system2_render-jpg88_64x64.png")));
				lblNewLabel_3.setBounds(795, 109, 64, 64);
				HISTORY.add(lblNewLabel_3);
				
				JLabel label_1 = new JLabel("");
				label_1.setIcon(new ImageIcon(test1.class.getResource("/icons/icon-respiratory.png")));
				label_1.setBounds(806, 191, 53, 64);
				HISTORY.add(label_1);
				
				JLabel label_2 = new JLabel("");
				label_2.setIcon(new ImageIcon(test1.class.getResource("/icons/icon-cardio (1).gif")));
				label_2.setBounds(795, 278, 64, 64);
				HISTORY.add(label_2);
				
				JLabel lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setIcon(new ImageIcon(test1.class.getResource("/icons/central-nervous-system-icon.png")));
				lblNewLabel_4.setBounds(795, 364, 64, 64);
				HISTORY.add(lblNewLabel_4);
				
				JLabel lblNewLabel_8 = new JLabel("");
				lblNewLabel_8.setForeground(new Color(255, 255, 255));
				lblNewLabel_8.setBackground(new Color(0, 0, 0));
				lblNewLabel_8.setIcon(new ImageIcon(test1.class.getResource("/icons/Standing skeleton.png")));
				lblNewLabel_8.setBounds(795, 450, 64, 64);
				HISTORY.add(lblNewLabel_8);
				
				JLabel lblNewLabel_7 = new JLabel("");
				//lblNewLabel_7.setIcon(new ImageIcon(test1.class.getResource("/images/clinic-slider-compressor.png")));
				lblNewLabel_7.setBounds(0, 0, 1104, 606);
				HISTORY.add(lblNewLabel_7);
		btnCancel.setBounds(10, 557, 90, 35);
		pathTest.add(btnCancel);
		
		textField_14 = new JTextField();
		textField_14.setBackground(Color.WHITE);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_14.setForeground(Color.BLACK);
		textField_14.setBounds(232, 176, 178, 32);
		pathTest.add(textField_14);
		textField_14.setColumns(10);
		
		patDetails.add(pathTest, "name_190462614557490");
		
		JLabel lblPatname = new JLabel("patName");
		lblPatname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatname.setBounds(89, 67, 212, 20);
		pathTest.add(lblPatname);
		
		JLabel lblPatage = new JLabel("patAge");
		lblPatage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatage.setBounds(89, 94, 51, 16);
		pathTest.add(lblPatage);
		
		JLabel lblSex_2 = new JLabel("sex");
		lblSex_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSex_2.setBounds(89, 119, 51, 16);
		pathTest.add(lblSex_2);
		
		JLabel lblPatid = new JLabel("patId");
		lblPatid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatid.setBounds(518, 97, 128, 17);
		pathTest.add(lblPatid);
		
		JButton btnAddtest = new JButton("");
		btnAddtest.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddtest.setBackground(Color.WHITE);
		btnAddtest.setIcon(new ImageIcon(test1.class.getResource("/icons/green-button-add-hi (1).png")));
		btnAddtest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField_14.getText().equals("")){
					DataProvider.InsertTestTable(textField_14.getText());
					ArrayList<String>TestNames = DataProvider.getAllTests();
					for(String name : TestNames){
						comboBox.addItem(name);
					}
					textField_14.setText("");
				}
			}
		});
		btnAddtest.setBounds(444, 176, 106, 32);
		pathTest.add(btnAddtest);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(test1.class.getResource("/images/file.jpeg")));
		lblNewLabel_5.setBounds(0, 0, 1104, 606);
		pathTest.add(lblNewLabel_5);
		pathTest.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblName, lblAge_1, lblGender_1, lblTestName, lblDescription, comboBox, textField_12, lblPatientId_1, btnSend, btnCancel, textField_14, lblPatname, lblPatage, lblSex_2, lblPatid, btnAddtest}));
		
		
		JPanel report = new JPanel();
		report.setBounds(147, 0, 1104, 606);
		patDetails.add(report);
		report.setBackground(Color.WHITE);
		report.setLayout(null);
		
		JComboBox<String> comboboxTestPicker = new JComboBox<String>();
		comboboxTestPicker.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboboxTestPicker.setBounds(355, 99, 188, 38);
		report.add(comboboxTestPicker);
		
		JComboBox<String> comboBoxDatePicker = new JComboBox<String>();
		comboBoxDatePicker.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxDatePicker.setForeground(new Color(0, 0, 0));
		comboBoxDatePicker.setBounds(587, 99, 188, 38);
		report.add(comboBoxDatePicker);
		
		JButton btnView = new JButton("");
		btnView.setIcon(new ImageIcon(test1.class.getResource("/icons/csuvdl-testloginbutton (1).png")));
		btnView.setBounds(794, 99, 147, 38);
		report.add(btnView);	
		
		
		JTable table_1 = new JTable();
		table_1.setBounds(85, 151, 400, 300);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(83, 151, 930, 390);
		report.add(scrollPane);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(test1.class.getResource("/images/doctor-backgrounds-wallpaper-cave-wryjnfg_1104x606111.jpg")));
		lblNewLabel_6.setBounds(0, 0, 1104, 606);
		report.add(lblNewLabel_6);
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String[][] rs = DataProvider.getReport(pat.getPID(), (String)comboboxTestPicker.getSelectedItem(), (String)comboBoxDatePicker.getSelectedItem());

//				for(int i = 0; i<rs.length; i++){
//					for(int j = 0; j<rs[0].length; j++){
//						System.out.println(rs[i][j]);
//					}
//				}
				TableModel tm = new TModel(rs);
				table_1.setModel(tm);
			}
		});
		
		comboboxTestPicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String selectedTest = (String) comboboxTestPicker.getSelectedItem();
				System.out.println(selectedTest);
				if(selectedTest != null){
					comboBoxDatePicker.removeAllItems();
					ArrayList<String> Dates = DataProvider.getTestDates(pat.getPID(), selectedTest);
					for(String Date : Dates){
						comboBoxDatePicker.addItem(Date);
						System.out.println(Date);
					}
				}
			}
		});
		
		//panel pathTest ends
		
		

		//panel graph begins
		
		
		
			
		//graph.repaint();
		patDetails.repaint();
		
		JPanel graph = new JPanel();
		graph.setBounds(148, 0, 1104, 606);
		patDetails.add(graph);
		graph.setLayout(null);
		JButton btnBloodPressure = new JButton("<html>   BLOOD<br> PRESSURE</html>");
		btnBloodPressure.setBackground(Color.DARK_GRAY);
		btnBloodPressure.setForeground(Color.GREEN);
		btnBloodPressure.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//btnBloodPressure.setIcon(new ImageIcon(test1.class.getResource("/icons/RESP.png")));
		
		btnBloodPressure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getData gd = new getData();
				
				gd.setData("bloodpressure");
				ChartPanel c = gd.getDataSet();
				c.setBounds(150, 200, 700, 400);
				//graph.remove(4);
				graph.add(c, 4);
				graph.revalidate();
				graph.repaint();
				graph.setVisible(true);
			}
		});
		btnBloodPressure.setBounds(50, 11, 178, 75);
		graph.add(btnBloodPressure);
		
		JButton btnPulse = new JButton("PULSE");
		btnPulse.setBackground(Color.DARK_GRAY);
		btnPulse.setForeground(Color.GREEN);
		btnPulse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPulse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getData gd = new getData();
				
				gd.setData("pulse");
				ChartPanel c = gd.getDataSet();
				c.setBounds(150, 200, 700, 400);
				//graph.remove(4);
				graph.add(c, 4);
				graph.revalidate();
				graph.repaint();
				graph.setVisible(true);
			}
		});
		btnPulse.setBounds(328, 11, 178, 75);
		graph.add(btnPulse);
		
		JButton btnRespiratory = new JButton("RESPIRATORY");
		btnRespiratory.setBackground(Color.DARK_GRAY);
		btnRespiratory.setForeground(Color.GREEN);
		btnRespiratory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRespiratory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getData gd = new getData();
				
				gd.setData("respiratory");
				ChartPanel c = gd.getDataSet();
				c.setBounds(150, 200, 700, 400);
				//graph.remove(4);
				graph.add(c, 4);
				graph.revalidate();
				graph.repaint();
				graph.setVisible(true);
			}
		});
		btnRespiratory.setBounds(606, 11, 178, 75);
		graph.add(btnRespiratory);
		
		JButton btnTemperature = new JButton("TEMPERATURE");
		btnTemperature.setBackground(Color.DARK_GRAY);
		btnTemperature.setForeground(Color.GREEN);
		btnTemperature.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTemperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getData gd = new getData();
				
				gd.setData("temp");
				ChartPanel c = gd.getDataSet();
				c.setBounds(150, 200, 700, 400);
				//graph.remove(4);
				graph.add(c, 4);
				graph.revalidate();
				graph.repaint();
				graph.setVisible(true);
			}
		});
		btnTemperature.setBounds(872, 11, 178, 75);
		graph.add(btnTemperature);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(0, 0, 1104, 606);
		lblNewLabel_10.setIcon(new ImageIcon(test1.class.getResource("/images/206172_1104x606.jpg")));
		graph.add(lblNewLabel_10);
		

		
		//History button visuals action handler 
		JButton btnHistory = new JButton("HISTORY");
		btnHistory.setForeground(Color.BLACK);
		btnHistory.setBackground(UIManager.getColor("Button.background"));
		btnHistory.setIcon(new ImageIcon(test1.class.getResource("/icons/rsz_heart_pulse-512.png")));
		btnHistory.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHistory.setHorizontalTextPosition(SwingConstants.CENTER);

		btnHistory.setVerticalAlignment(SwingConstants.BOTTOM);
		btnHistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnHistory.setBounds(0, 121, 148, 116);
		patDetails.add(btnHistory);
				
		JButton btnPatient = new JButton("<html>PATIENT<br> PROFILE</html>");
		btnPatient.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPatient.setForeground(new Color(0, 0, 0));
		btnPatient.setIcon(new ImageIcon(test1.class.getResource("/icons/rsz_2pat_pro.png")));
		btnPatient.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPatient.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPatient.setToolTipText("");
		btnPatient.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnPatient.setBounds(0, 0, 148, 116);
		patDetails.add(btnPatient);
		
		
		
		JButton btnTest = new JButton("TEST");
		btnTest.setIcon(new ImageIcon(test1.class.getResource("/icons/rsz_test-tubes-512.png")));
		btnTest.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTest.setHorizontalTextPosition(SwingConstants.CENTER);

		btnTest.setVerticalAlignment(SwingConstants.BOTTOM);
		btnTest.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnTest.setBounds(0, 242, 148, 116);
		patDetails.add(btnTest);
		
		JButton btnReport = new JButton("REPORT");
		btnReport.setIcon(new ImageIcon(test1.class.getResource("/icons/rsz_medical_test_stethoscope-512.png")));
		btnReport.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnReport.setHorizontalTextPosition(SwingConstants.CENTER);

		btnReport.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnReport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReport.setBounds(0, 363, 148, 116);
		patDetails.add(btnReport);
		
		JButton btnLogOut_1 = new JButton("");
		btnLogOut_1.setIcon(new ImageIcon(test1.class.getResource("/icons/logout-btn.png")));
		btnLogOut_1.setForeground(Color.RED);
		btnLogOut_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnLogOut_1.setBounds(0, 609, 148, 34);
		patDetails.add(btnLogOut_1);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(test1.class.getResource("/icons/back-button.png")));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnBack.setBounds(1144, 609, 114, 40);
		patDetails.add(btnBack);
		
		JButton btnGraph = new JButton("GRAPH");
		btnGraph.setIcon(new ImageIcon(test1.class.getResource("/icons/rsz_benchmark1.png")));
		btnGraph.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGraph.setHorizontalTextPosition(SwingConstants.CENTER);

		btnGraph.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnGraph.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGraph.setBounds(0, 484, 148, 116);
		patDetails.add(btnGraph);
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(test1.class.getResource("/icons/loginbutton (1).png")));
		btnNewButton.setBounds(603, 363, 115, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int DID = Integer.parseInt(textField.getText());
				String pass = passwordField.getText();
				
				System.out.println(DID);
				System.out.println(pass);
				
				if(DataProvider.checkDoc(DID, pass)){
					docLogin.setVisible(false);
					patLogin.setVisible(true);
					patDetails.setVisible(false);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(false);
				}
				
				else{
					docLogin.setVisible(false);
					patLogin.setVisible(false);
					patDetails.setVisible(false);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(false);
				}
			
				
				
			}
		});
		docLogin.add(btnNewButton);
		
		JLabel lblPatientMonitoringSystem = new JLabel("PATIENT MONITORING SYSTEM");
		lblPatientMonitoringSystem.setForeground(Color.GREEN);
		lblPatientMonitoringSystem.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblPatientMonitoringSystem.setBounds(304, 41, 715, 115);
		docLogin.add(lblPatientMonitoringSystem);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1274, 651);
		lblNewLabel.setIcon(new ImageIcon(test1.class.getResource("/images/gradient_light_dark_background_51893_3840x2160_1274x651.jpg")));
		docLogin.add(lblNewLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel lblWelcomeToPatient = new JLabel("WELCOME TO PATIENT CARE SYSTEM");
		lblWelcomeToPatient.setForeground(Color.WHITE);
		lblWelcomeToPatient.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblWelcomeToPatient.setBounds(321, 0, 676, 43);
		patLogin.add(lblWelcomeToPatient);
		
		JLabel lblNewLabel_1 = new JLabel("PLEASE INSERT THE PATIENT ID ...");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(379, 54, 508, 34);
		patLogin.add(lblNewLabel_1);
		
		JLabel lblPatientId = new JLabel("PATIENT ID :");
		lblPatientId.setForeground(Color.RED);
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientId.setBounds(397, 524, 142, 34);
		patLogin.add(lblPatientId);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 100, 0));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_2.setBounds(549, 524, 127, 34);
//		patID = textField_2.getText();
		patLogin.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("");
		btnSubmit.setIcon(new ImageIcon(test1.class.getResource("/icons/submit-example_127x34.png")));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setForeground(Color.BLUE);
		btnSubmit.setBounds(695, 524, 127, 34);
		patLogin.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int PID = Integer.parseInt(textField_2.getText());
				
				patID = Integer.toString(PID);
					
				System.out.println(PID);
				
				if(DataProvider.checkPat(PID)){
					docLogin.setVisible(false);
					patLogin.setVisible(false);
					patDetails.setVisible(true);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(true);
					report.setVisible(false);
					graph.setVisible(false);
					
					pat = DataProvider.createPatOb(PID);
					//for patient profile
					//DataProvider.checkPat(102);
					lblNewLabel_3Name.setText(pat.getName());
					lblAge_2.setText(Integer.toString(pat.getAge()));
					lblSex_1.setText(pat.getSex());
					lblMstatus.setText(pat.getMartialStatus());
					lblReligion_1.setText(pat.getReligion());
					lblOccupation_1.setText(pat.getOcupation());
					lblWeight_1.setText(Integer.toString(pat.getWeight()));
					lblHeight_1.setText(pat.getHeight());
					lblComplaint.setText(pat.getchiefComplaint());
					lblDrugHistory_1.setText(pat.getdrug_usage());
					lblContact.setText(Integer.toString(pat.getContact()));
					lblPhoto.setIcon(new ImageIcon(pat.getImg()));
					
					//patient_profile.repaint();
					
					//patient history
					
					chckbxIllLooking.setSelected(pat.getill_Looking());
					chckbxLathergic.setSelected(pat.getLethargic());
					chckbxCachexia.setSelected(pat.getCachexia());
					chckbxObesity.setSelected(pat.getObesity());
					chckbxPale.setSelected(pat.getPale());

					chckbxUnconscious.setSelected(pat.getUnconscious());
					chckbxUphoric.setSelected(pat.getUphoric());
					chckbxPathetic.setSelected(pat.getPathetic());
					chckbxVolent.setSelected(pat.getViolent());
					chckbxCalmCooperative.setSelected(pat.getCalmnCoOp());

					lblResp.setText(Integer.toString(pat.getRp())); 
					lblTemp.setText(Double.toString(pat.getTemp()));
					lblPulse.setText(Integer.toString(pat.getPulse()));
					lblBp.setText(Integer.toString(pat.getSys())+"/"+Integer.toString(pat.getDia()));
					
					
					
					
					chckbxNewCheckBox.setSelected(pat.getEdema());// new JCheckBox("EDEMA");
					chckbxCynisis.setSelected(pat.getCyanosis());
					
					
					//Systematic findings
					
					 chckbxNewCheckBox_1.setSelected(pat.getAlimnentary());;
					 chckbxRespiratorySystem.setSelected(pat.getRespiratory());
					 chckbxNewCheckBox_2.setSelected(pat.getCardiovascular());
					 chckbxNewCheckBox_4.setSelected(pat.getLocmotor());
					 chckbxNewCheckBox_3.setSelected(pat.getNervous());
					 
					 
					 //PathTest
					 lblPatname.setText(pat.getName());
					 lblPatage.setText(Integer.toString(pat.getAge()));
					 lblSex_2.setText(pat.getSex());
					 lblPatid.setText(Integer.toString(pat.getPID()));
					 
					 //report
					 //comboboxTestPicker.removeAllItems();
						ArrayList<String> testlist = DataProvider.getAvailableTest(pat.getPID());
					
						for(String tests : testlist){
								comboboxTestPicker.addItem(tests);
								System.out.println("Added "+tests);
						}
				}
				
				else{
					docLogin.setVisible(false);
					patLogin.setVisible(true);
					patDetails.setVisible(false);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(false);
				}
				
				
			}			
			
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(true);
				patDetails.setVisible(false);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				graph.setVisible(false);
				report.setVisible(false);
				
				comboboxTestPicker.removeAllItems();
				comboBoxDatePicker.removeAllItems();
			
			}
		});
		
		JButton btnLogOut = new JButton("");
		btnLogOut.setIcon(new ImageIcon(test1.class.getResource("/icons/logout-btn.png")));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				docLogin.setVisible(true);
				patLogin.setVisible(false);
				patDetails.setVisible(false);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				graph.setVisible(false);
				report.setVisible(false);
				
				
				
				
			}
		});
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 16));
	
		btnLogOut.setBounds(10, 606, 145, 34);
		patLogin.add(btnLogOut);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(test1.class.getResource("/images/1280x800_love-heart-beat-abstract-widescreen-graph-HD-Wallpaper.jpg")));
		label.setBounds(0, 0, 1274, 651);
		patLogin.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		patLogin.add(panel);
		

		

btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				HISTORY.setVisible(true);
				patient_profile.setVisible(false);
				report.setVisible(false);
				graph.setVisible(false);
				pathTest.setVisible(false);

				
				
				
				
			}
		});

btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(true);
				report.setVisible(false);
				graph.setVisible(false);
				
			}
		});

btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				pathTest.setVisible(true);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				report.setVisible(false);
				graph.setVisible(false);
				
				ArrayList<String>TestNames = DataProvider.getAllTests();
				for(String name : TestNames){
					comboBox.addItem(name);
				}
			}
		});

btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				patient_profile.setVisible(false);
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				graph.setVisible(false);
				report.setVisible(true);
				
//				comboboxTestPicker.addItem("-select Test-");
//				comboBoxDatePicker.addItem("-select Date-");
//				
			}
		});


btnLogOut_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(true);
				patLogin.setVisible(false);
				patDetails.setVisible(false);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				graph.setVisible(false);
				report.setVisible(false);
			}
		});

btnGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				patient_profile.setVisible(false);
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				report.setVisible(false);
				graph.setVisible(true);
			}
		});
patDetails.repaint();
patDetails.repaint();
patDetails.repaint();

		
	}
}
