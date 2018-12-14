/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

import administraciondecampos.Presentador;

/**
 *
 * @author andresteve07
 */
public interface PresentadorRegistro extends Presentador{
    public void validarNombreCampo(String nombre);
    public void validarSuperficieCampo(String superficie);
    public void validarNumeroLote(String numeroLote);
    public void validarSuperficieLote(String superficieLote);
    public void agregarLote(String nroLote, String supLote, Integer tipoSuelo);
    public void editarLote(Integer indice);
    public void quitarLote(Integer indice);
    public void cancelarRegistro();
    public void registrarCampo();
}
