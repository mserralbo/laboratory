
package com.proyecto.laboratorio.ws;

import com.proyecto.laboratorio.dto.Estudiante;
import com.proyecto.laboratorio.dto.MysqlEstudiante;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService(serviceName = "WSE")
public class WSE {

    @WebMethod(operationName = "getEstudiante")
    public List<Estudiante> getEstudiante() {
 MysqlEstudiante dao = new MysqlEstudiante();
List<Estudiante> estudiantes = dao.getEstud();
 return estudiantes;
 
    }   
}
