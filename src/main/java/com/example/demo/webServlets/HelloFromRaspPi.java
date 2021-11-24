package com.example.demo.webServlets;

import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloFromRaspPi", urlPatterns = "/hello")
public class HelloFromRaspPi extends HttpServlet {

    private final SpringTemplateEngine springTemplateEngine;

    public HelloFromRaspPi(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        springTemplateEngine.process("helloworld.html", new WebContext(req, resp, req.getServletContext()), resp.getWriter());
    }

}
