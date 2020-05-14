import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "AddPersonServlet", urlPatterns = "/add")
public class AddPersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Person> list= new ArrayList();
        Person person1 = new Person("Nam",20,"0123456789","Nha a pho b phuong c");
        Person person2 = new Person("Minh",30,"0562169723","Nha a pho b phuong c");
        Person person3 = new Person("Huy",29,"012225684","Nha a pho b phuong c");
        Person person4 = new Person("Bao",25,"0156823269","Nha a pho b phuong c");
        Person person5 = new Person("Anh",22,"01258948923","Nha a pho b phuong c");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("show.jsp");
        request.setAttribute("list",list);
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
