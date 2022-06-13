
package directorioegg;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Directorio {
     private TreeMap<Long, Cliente> agenda = new TreeMap();

  public boolean agregarCliente(Cliente cliente, long telefono) {

    if (agenda.containsKey(telefono)){
        return false;
    }
    agenda.put(telefono, cliente);

    return true;
  }
  
  public Cliente buscarCliente(long phone) {
     Cliente cliente =null;

      for (Map.Entry<Long, Cliente> tel_cli : agenda.entrySet()) {
         if (tel_cli.getKey().equals(phone) ) {
            cliente = tel_cli.getValue();
         }
      }

      return cliente;
    

   }

  
public ArrayList<Long> buscarTelefono(String apellido) {
        ArrayList<Long> telefonos = new ArrayList();
        
        for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
            String apel = entry.getValue().getApellido();
            if (apel.equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

  public ArrayList<Cliente> buscarClientes(String ciudad){
	
	ArrayList <Cliente> clientes = new ArrayList();
	
	for (Map.Entry<Long, Cliente> entry : agenda.entrySet()) {
	    String city = entry.getValue().getCiudad();
	    if(city.equalsIgnoreCase(ciudad)){
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
