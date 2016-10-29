package chartModel;


import org.jfree.data.jdbc.*;

import java.awt.Color;
import java.sql.Connection;

import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import db.DBConnection;
import designHandler.test1;


public class getData {
	
	private static String query;
	private static String test_name;
	
	public void setData(String test_name){
		
		getData.test_name = test_name;
		if(test_name.equals("bloodpressure")){
			query = "Select date, Systolic, Diastolic FROM bloodpressure where pid = "+test1.patID+" order by date asc limit 4";
		}
		else if(test_name.equals("temp")){
			query = "select date, value from "+test_name+" where pid = "+test1.patID+" order by date asc limit 4";
		}
		else if(test_name.equals("respiratory")){
			query = "select date, value from javaproject."+test_name+" where pid = "+test1.patID+" order by date asc limit 4";
		}
		else if(test_name.equals("pulse")){
			query = "select date, value from javaproject."+test_name+" where pid = "+test1.patID+" order by date asc limit 4";
		}
		
	}
	
	public ChartPanel getDataSet(){
		try{
			Connection con = DBConnection.getConnection();
			
			JDBCCategoryDataset dataset = new JDBCCategoryDataset(con,query);
			
			
			
			JFreeChart chart = ChartFactory.createLineChart(test_name, "Date", "Values", dataset, PlotOrientation.VERTICAL, false, true, true);
			//JFreeChart chart1 = ChartFactory.createLineChart(test_name, "Date", "Values", dataset1, PlotOrientation.VERTICAL, false, true, true);
			
			chart.getPlot().setBackgroundPaint(Color.WHITE);
			//chart.getXYPlot().set
			ChartPanel pan1 = new ChartPanel(chart);
			BarRenderer render = null;
			CategoryPlot plot = null;
			
			render = new BarRenderer();
			//plot.getRenderer().setSeriesPaint(0, Color.BLUE);
			pan1.setVisible(true);
			pan1.setSize(400, 320);
			
			System.out.println("Chart returned!");
			return pan1;
			
			
		}catch (Exception e){
			
			System.out.println(e.getMessage());
			
		}
		System.out.println("Getting NULL Chart");
		return null;
		
	}
	
	

}
