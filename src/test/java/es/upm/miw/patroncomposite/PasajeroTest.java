package es.upm.miw.patroncomposite;

import java.time.LocalDate;

import java.time.ZoneId;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Date;

public class PasajeroTest {

    private PasajeroComponent benitoPerez;
    private PasajeroComponent rosaRuiz;
    private PasajeroComponent albertoMateo;
    private PasajeroComponent antonioGarcia;
    private PasajeroComponent carmenMenendez;

    private PasajeroComponent grupoEscolar;
    private PasajeroComponent grupoInserso;

    @BeforeEach
    void before() {
        Date input = new Date();
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        this.benitoPerez = new PasajeroLeaf("243", date , true );
        this.rosaRuiz = new PasajeroLeaf("456", date, false);

        this.grupoEscolar = new PasajeroComposite("Grupo Escolar ESO");
        this.grupoEscolar.add(this.benitoPerez);
        this.grupoEscolar.add(this.rosaRuiz);

        this.albertoMateo = new PasajeroLeaf("101", date, false);
        this.antonioGarcia = new PasajeroLeaf("232", date, false);
        this.carmenMenendez = new PasajeroLeaf("876", date , false);
        this.grupoInserso = new PasajeroComposite("Viaje del Inserso a Asturias 2019");
        this.grupoInserso.add(this.albertoMateo);
        this.grupoInserso.add(this.antonioGarcia);
    }

    @Test
    public void testDiscapacidad(){
        assertEquals(false, ((PasajeroLeaf) this.carmenMenendez).getDiscapacidad());
    }

    @Test
    public void testSizeComposite() {
        assertEquals(2, this.grupoEscolar.size());
    }

    @Test
    public void testSizeLeaf() {
        assertEquals(0, this.carmenMenendez.size());
    }

    @Test
    void testAddDriverComposite() {
        assertEquals(2, this.grupoInserso.size());
        this.grupoInserso.add(this.carmenMenendez);
        assertEquals(3, this.grupoInserso.size());
        this.grupoInserso.remove(this.carmenMenendez);
    }

    @Test
    void testDeleteDriverComposite() {
        assertEquals(2, this.grupoInserso.size());
        this.grupoInserso.remove(this.albertoMateo);
        assertEquals(1, this.grupoInserso.size());
        this.grupoInserso.add(this.albertoMateo);
    }

    @Test
    public void testViewLeaf() {
        assertEquals("243", this.benitoPerez.view());
    }

    @Test
    public void testViewComposite() {
        assertEquals("Grupo Escolar ESO", this.grupoEscolar.view());
    }

    @Test
    public void testIsCompositeLeaf() {
        assertFalse(this.carmenMenendez.isComposite());
    }

    @Test
    public void testIsCompositeComposite() {
        assertTrue(this.grupoEscolar.isComposite());
    }
}
