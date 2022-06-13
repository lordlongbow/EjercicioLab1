/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio1;
 import java.util.*;
/**
 *
 * @author brand
 */
public class Directorio {
   

  private TreeMap<Long, Cliente> agenda = new TreeMap();

  public boolean agregarCliente(Cliente cliente, long telefono) {

    if (agenda.containsKey(telefono))
      return false;

    agenda.put(telefono, cliente);

    return true;
  }

public Cliente buscarCliente(Long telefono) {
      Cliente cliente = new Cliente();

      for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
         if (entry.getKey() == telefono) {
            cliente = entry.getValue();
         }
      }

      return cliente;
//return entry.get(phone);
   }
public ArrayList<Long> buscarTelefono(String apellido) {
        ArrayList<Long> telefonos = new ArrayList();
        for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
            String value = entry.getValue().getApellido();
            if (value.equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
public ArrayList<Cliente> buscarClientes(String ciudad){
	
	ArrayList <Cliente> clientes = new ArrayList();
	
	for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
	    String value = entry.getValue().getCiudad();
	    if(value.equalsIgnoreCase(ciudad)){
		clientes.add(entry.getValue());
	    }	    
	}
	
	return clientes;
	
    }
public boolean borrarCliente(Long telefono) {

        if (agenda.containsKey(telefono)) {

            agenda.remove(telefono);
            return true;
        }
        return false;
    }

   


}


