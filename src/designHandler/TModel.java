package designHandler;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

import db.DataProvider;

public class TModel extends AbstractTableModel {
	private String columns[] = {"Parameter", "Value"};
	private String data[][];
	public TModel(String[][] rs) {
//			data = new Object[rs.length][rs[0].length];
//			for(int i = 0; i<rs.length; i++){
//				for(int j = 0; j<rs[0].length; j++){
//					data[i][j] = rs[i][j];
//				}
//			}
		data = rs;
		for(int i = 0; i<data.length; i++){
			for(int j = 0; j<data[0].length; j++){
				 System.out.println(data[i][j]);
			}
		}
	}
	public TModel(){
	}
	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
    public String getColumnName(int column) {
        return columns[column];
    }
}
