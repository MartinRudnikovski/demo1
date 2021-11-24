package com.example.demo.webServlets;

import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class GoodbyeFromRaspPi extends HttpServlet {
    private final SpringTemplateEngine springTemplateEngine;


    public GoodbyeFromRaspPi(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        springTemplateEngine.process("goodbye.html", new WebContext(req, resp, req.getServletContext()), resp.getWriter());
    }
}
