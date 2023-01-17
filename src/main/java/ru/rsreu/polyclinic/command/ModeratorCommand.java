package ru.rsreu.polyclinic.command;

import ru.rsreu.polyclinic.data.User;
import ru.rsreu.polyclinic.database.dao.DAOFactory;
import ru.rsreu.polyclinic.database.dao.UserDAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import static ru.rsreu.polyclinic.constant.Routes.MODER;

public class ModeratorCommand extends FrontCommand {

    private UserDAO userDAO;

    @Override
    public void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.init(servletContext, servletRequest, servletResponse);

        userDAO = DAOFactory.getUserDAO();
    }

    @Override
    public void send() throws ServletException, IOException {
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//
//
//        //User user = this.userDAO.getUserByLogin(login).orElseThrow(RuntimeException::new);
//
//        User user = this.userDAO.getUserByLogin(login).orElse(null);
//
//        if (user == null || !user.getPassword().equals(password) || user.isBlocked()) {
//            request.setAttribute("invalidAuth", true);
//            forward(LOGIN);
//        } else {
//            HttpSession session = request.getSession();
//
//            //user.setStatusAuthorize(true);
//            //userDAO.updateUser(user);
//
//            session.setAttribute("user", user);
//
//            redirect(HOME);
//        }
    }

    @Override
    public void process() throws ServletException, IOException {
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");


        //User user = this.userDAO.getUserByLogin(login).orElseThrow(RuntimeException::new);

        List<List<String>> rs = this.userDAO.returnAllUsers();
        HttpSession session = request.getSession();
        request.setAttribute("listOfUsers", rs);
        forward(MODER);

    }
}