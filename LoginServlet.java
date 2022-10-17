import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/airport?&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String user = request.getParameter("id");
        String pass = request.getParameter("pwd");

        PrintWriter out = response.getWriter();
        out.println("用户名" + user);
        out.println("密码" + pass);
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("加载驱动成功！");

            Connection con = DriverManager.getConnection(DB_URL, user, pass);

            System.out.println("连接数据库成功！");

            Statement st = con.createStatement();
            System.out.println("创建Statement成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
