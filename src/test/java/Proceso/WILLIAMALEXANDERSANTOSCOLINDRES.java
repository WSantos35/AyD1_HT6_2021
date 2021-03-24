package Proceso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Objetos.Carrera;
import Objetos.RegistroAcademico;
import Objetos.Estudiante;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.Mockito;

/**
 *
 * @author William
 */
public class WILLIAMALEXANDERSANTOSCOLINDRES {
    private Estudiante estudiante;
    private Carrera carrera;
    private RegistroAcademico reg;
    
    @BeforeEach
    public void setUp(){
        carrera = Mockito.mock(Carrera.class);
        reg = Mockito.mock(RegistroAcademico.class);
        try{
            estudiante = new Estudiante(carrera, reg);
        }catch(Exception e){
            
        }
    }
    
    @Test
    public void verificandoDescripcion(){
        //when(carrera.getDescripcion()).equals("ejemplo descripcion carrera con codigo 2");
        Mockito.when(estudiante.getCarrera().getDescripcion()).thenReturn("ejemplo descripcion carrera con codigo 2");
        assertEquals("ejemplo descripcion carrera con codigo 2", estudiante.getCarrera().getDescripcion());
    }
    
    @Test
    public void verificandoCodigo(){
        Mockito.when(estudiante.getCarrera().getCodigo()).thenReturn(2);
        assertEquals(2, estudiante.getCarrera().getCodigo());
        assertNotEquals("2", estudiante.getCarrera().getCodigo());
    }
}
