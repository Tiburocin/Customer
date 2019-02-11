package Service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import Model.Client;

@Service
public class ClientService {
	Hashtable<String, Client> clients = new Hashtable<String, Client>();
	
	public ClientService() {
		Client client = new Client();
		client.setId("1");
		client.setOriginalChannel("Banca SERFIN");
		client.setFullName("Aceves Gonzales Adolfo");
		client.setCondition("Cliente");
		client.setSegment("Premier");
		client.setAddress("Loma Bonita 1839");
		client.setCustomerCategory("Fisica");
		clients.put("1", client);
		
	}
	
	public Client getClient(String id) {
		if (clients.containsKey(id)) {
			return clients.get(id);
		}
		else
			return null;
	}
	
	public Hashtable<String, Client> getAll(){
		return clients;
	}
}
