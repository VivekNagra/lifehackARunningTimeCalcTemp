package com.example.lifehackarunningtimecalc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCalculatePace", value = "/ServletCalculatePace")
public class ServletCalculatePace extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        /*int distance = Integer.parseInt(request.getParameter("distance"));
        session.setAttribute("distance", distance);*/

        String d = request.getParameter("distance");
        int distance = Integer.parseInt(d);
        session.setAttribute("distance", distance);

        String h = request.getParameter("hours");
        int hours = Integer.parseInt(h);
        session.setAttribute("hours", hours);

        String m = request.getParameter("minutes");
        int min = Integer.parseInt(m);
        session.setAttribute("minutes", min);

        String s = request.getParameter("seconds");
        int seconds = Integer.parseInt(s);
        session.setAttribute("seconds", seconds);

       /* int hours = Integer.parseInt(request.getParameter("hour"));
        session.setAttribute("hours", hours);
        int minutes = Integer.parseInt(request.getParameter("hour"));
        session.setAttribute("minutes", minutes);
        int seconds = Integer.parseInt(request.getParameter("seconds"));
        session.setAttribute("seconds", seconds);*/

        int time = 3600 * hours + 60 * min + seconds;
        session.setAttribute("time", time);

        int pace = time/distance;
        session.setAttribute("pace", pace);

        request.getRequestDispatcher("WEB-INF/showPace.jsp").forward(request,response);


    }
}
