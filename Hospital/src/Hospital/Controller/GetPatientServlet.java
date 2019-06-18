package Hospital.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Hospital.pojo.Patient;
import Hospital.Service.patientService;

/**
 * 获取病人信息Controller层
 * @author Moline-x
 * 2019-06-18
 */
@WebServlet("/GetPatientServlet")
public class GetPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		Integer pId = Integer.parseInt(request.getParameter("pId"));
		
		patientService service = new patientService();
		
		Patient patient = service.queryPatientId(pId);
		
		Gson gson = new Gson();
		
		String jsonStr = gson.toJson(patient);
		
		out.print(jsonStr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
