package Hospital.Service;

import java.util.ArrayList;

import com.sun.prism.paint.Paint;

import Hospital.Dao.patientDao;
import Hospital.pojo.Patient;

/**
 * ≤°»Àπ‹¿ÌService≤„
 * @author Moline-x
 * 2019-06-18
 */
public class patientService {
	patientDao dao = new patientDao();
	
	public void addPatient(Patient patient) {
		dao.insert(patient);
	}
	
	public void updatePatient(Patient patient) {
		dao.update(patient);
	}
	
	public void deletePatient(Integer pId) {
		dao.delete(pId);
	}
	
	public Patient queryPatientId(Integer pId) {
		return dao.queryById(pId);
	}
	
	public ArrayList<Patient> queryPatient() {
		return dao.query();
	}

}
