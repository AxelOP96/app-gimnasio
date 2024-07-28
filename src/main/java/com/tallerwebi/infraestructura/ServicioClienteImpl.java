package com.tallerwebi.infraestructura;

import org.springframework.stereotype.Service;
import com.tallerwebi.dominio.*;

@Service("servicioCliente")
public class ServicioClienteImpl implements ServicioCliente{


    public ServicioClienteImpl(){

    }

    @Override
    public void verRutinasAsignadas(){

    }
    @Override
    public void historialDeRutinas(){

    }
    @Override
    public void verTurnosMedicos(){}
    @Override
    public void mostrarDietas(){}
    @Override
    public void solicitarTurnos(){}
    @Override
    public void consultarInfoDeCuotas(){}
    @Override
    public void pagarCuota(){}
}
