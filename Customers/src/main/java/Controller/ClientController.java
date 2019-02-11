package Controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import Model.Client;
import Service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	ClientService cs;
	
	@RequestMapping("/all")
	public Hashtable<String, Client> getAll() {
		return cs.getAll();
	}
	
	@GetMapping
	public Client getClients(@RequestParam(value="id") String id) {
		return cs.getClient(id);
	}
	
	//@RequestMapping("{id}")
	//public Client getClient(@PathVariable("id") String id) {
		//return cs.getClient(id);
	//}
}
