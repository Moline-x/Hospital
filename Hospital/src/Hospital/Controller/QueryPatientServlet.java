package Hospital.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import Hospital.Service.patientService;
import Hospital.pojo.Patient;

/**
 * ��ѯ������ϢController��
 * @author Moline-x
 * 2019-06-18
 */
@WebServlet("/QueryPatientServlet")
public class QueryPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		//ҵ�����
		patientService service = new patientService();
		//�������ݼ���
		ArrayList<Patient> list = service.queryPatient();
		//�����ݼ���ת����json�ַ���
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		
		//��Ӧjson���ݵ�ǰ��
		out.print(jsonStr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
