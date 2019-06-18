package Hospital.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Hospital.common.DbUtil;
import Hospital.pojo.Patient;

/**
 * ���˹���Dao��
 * @author moline-x
 * 2019-06-18
 */
public class patientDao {
	/**
	 * ���벡������
	 * @param Patient
	 */
	public void insert(Patient patient) {
		Connection con = DbUtil.getConnection();
		String sql = "insert into TBL_Patient values(seq_P_id.nextval,?,?,?,?)";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, patient.getPname());
			pstmt.setInt(2, patient.getPage());
			pstmt.setString(3, patient.getPsex());
			pstmt.setInt(4, patient.getPphone());
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �޸Ĳ�������
	 * @param Patient
	 */
	public void update(Patient patient) {
		Connection con = DbUtil.getConnection();
		String sql = "update set TBL_Patient P_name = ?,P_age = ?,P_sex = ?,P_phone = ? where P_id = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, patient.getPname());
			pstmt.setInt(2, patient.getPage());
			pstmt.setString(3, patient.getPsex());
			pstmt.setInt(4, patient.getPphone());
			pstmt.setInt(5, patient.getPid());
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ɾ����������
	 * @param Patient
	 */
	public void delete(Integer pId) {
		Connection con = DbUtil.getConnection();
		String sql = "delete from TBL_Patient where P_id = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,pId);
			
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ͨ��id��ѯ����������Ϣ
	 * @param Patient
	 */
	public Patient queryById(Integer pId) {
		Connection con = DbUtil.getConnection();
		String sql = "select * from TBL_Patient where P_id = ?";
		
		Patient patient = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,pId);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				patient = new Patient(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patient;
		
	}
	/**
	 * ��ѯ���в�����Ϣ
	 */
	public ArrayList<Patient> query(){
		Connection con = DbUtil.getConnection();
		String sql = "select * from TBL_Patient order by P_id";
		
		ArrayList<Patient> list = new ArrayList<Patient>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Patient patient = new Patient(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
				list.add(patient);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
