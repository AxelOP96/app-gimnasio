package com.tallerwebi.presentacion;

import static org.mockito.Mockito.mock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import com.tallerwebi.dominio.ServicioLogin;
import com.tallerwebi.dominio.*;

public class ControladorClienteTest {
    private ControladorCliente controladorCliente;
    private Usuario usuarioMock;
	private DatosLogin datosLoginMock;
	private HttpServletRequest requestMock;
	private HttpSession sessionMock;
	private ServicioCliente servicioClienteMock;

    @BeforeEach
	public void init(){
        usuarioMock = mock(Usuario.class);
        requestMock = mock(HttpServletRequest.class);
		sessionMock = mock(HttpSession.class);
		servicioClienteMock = mock(ServicioCliente.class);
		controladorCliente = new ControladorCliente(servicioClienteMock);
    }

    @Test
    public void queAlTenerRolClienteVayaALaPantallaCliente(){
        ModelAndView mav = this.controladorCliente.clientes();
        assertThat(mav.getViewName(), equalToIgnoringCase("clientes"));

    }

}
