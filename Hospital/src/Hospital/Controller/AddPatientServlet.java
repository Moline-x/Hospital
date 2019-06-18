package Hospital.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.pojo.Patient;
import Hospital.Service.patientService;
/**
 * �������˷���Controller��
 * @author Moline-x
 * 2019-06-18
 */
@WebServlet("/AddPatientServlet")
public class AddPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ñ���
		request.setCharacterEncoding("UTF-8");
				
		String pName = request.getParameter("P_name");
		Integer pAge = Integer.parseInt(request.getParameter("P_age"));
		String pSex = request.getParameter("P_sex");
		Integer pPhone = Integer.parseInt(request.getParameter("P_phone"));
				
		//��װ����ʵ����
		Patient patient = new Patient(pName, pAge, pSex, pPhone);
				
        //����ҵ���߼���
		patientService service = new patientService();
		service.addPatient(patient);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
