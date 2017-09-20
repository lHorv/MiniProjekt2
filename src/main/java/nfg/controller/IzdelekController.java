package nfg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nfg.model.Izdelek;

@RestController
@RequestMapping("api/v1/")
public class IzdelekController {

	@RequestMapping(value = "izdelki", method = RequestMethod.GET)
	public List<Izdelek> list() {
		return IzdelekStub.list();
	}
	
	@RequestMapping(value = "izdelki", method = RequestMethod.POST)
	public Izdelek create(@RequestBody Izdelek izdelek) {
		return IzdelekStub.create(izdelek);
	}
	
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.GET)
	public Izdelek get(@PathVariable Long id) {
		return IzdelekStub.get(id);
	}
	
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.PUT)
	public Izdelek update(@PathVariable Long id, @RequestBody Izdelek izdelek) {
		return IzdelekStub.update(id, izdelek);
	}
	
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.DELETE)
	public Izdelek delete(@PathVariable Long id) {
		return IzdelekStub.delete(id);
	}
}
