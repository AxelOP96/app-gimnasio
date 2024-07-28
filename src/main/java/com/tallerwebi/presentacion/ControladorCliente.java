package com.tallerwebi.presentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorCliente {
    private ServicioCliente servicioCliente;
    @Autowired
    public ControladorCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    @RequestMapping(path = "/clientes")
    public ModelAndView clientes() {
        return new ModelAndView("clientes");
    }
}
