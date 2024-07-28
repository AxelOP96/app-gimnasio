package com.tallerwebi.dominio;

import org.springframework.stereotype.Service;


public interface ServicioCliente {
    //PODER VER RUTINAS ASIGNADAS
    //Historial de rutinas.
    //En caso de tener turnos médicos, poder verlos.
    //En caso de contar con dieta, poder verlos.
    //Solicitar turno médicos o con nutricionistas.
    //Ver fechas de vencimientos de cuotas
    //Pagar cuota

    void verRutinasAsignadas();
    void historialDeRutinas();
    void verTurnosMedicos();
    void mostrarDietas();
    void solicitarTurnos();
    void consultarInfoDeCuotas();
    void pagarCuota();
}
