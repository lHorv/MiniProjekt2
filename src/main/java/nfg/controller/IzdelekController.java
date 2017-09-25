package nfg.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import nfg.model.Izdelek;
import nfg.repository.IzdelekRepository;

@RestController
@RequestMapping("api/v1/")
public class IzdelekController {
	
	//@Autowired
	//private IzdelekRepository izdelekRepository;
	
	@ApiOperation(value = "List all products")
	@RequestMapping(value = "izdelki", method = RequestMethod.GET)
	public List<Izdelek> list() {
		return IzdelekStub.list();
		//return izdelekRepository.findAll();
	}
	
	@ApiOperation(value = "Add a product")
	@RequestMapping(value = "izdelki", method = RequestMethod.POST)
	public Izdelek create(@RequestBody Izdelek izdelek) {
		return IzdelekStub.create(izdelek);
		//return izdelekRepository.saveAndFlush(izdelek);
	}

    @ApiOperation(value = "Search a product with an ID", response = Izdelek.class)
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.GET)
	public Izdelek get(@PathVariable Long id) {
		return IzdelekStub.get(id);
    	//return izdelekRepository.findOne(id);
	}
	
	@ApiOperation(value = "Update a product")
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.PUT)
	public Izdelek update(@PathVariable Long id, @RequestBody Izdelek izdelek) {
		return IzdelekStub.update(id, izdelek);
		/*Izdelek existingIzdelek = izdelekRepository.findOne(id);
		BeanUtils.copyProperties(izdelek, existingIzdelek);
		return izdelekRepository.saveAndFlush(existingIzdelek);*/
	}
	
	@ApiOperation(value = "Delete a product")
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.DELETE)
	public Izdelek delete(@PathVariable Long id) {
		return IzdelekStub.delete(id);
		/*Izdelek existingIzdelek = izdelekRepository.findOne(id);
		izdelekRepository.delete(existingIzdelek);
		return existingIzdelek;*/
	}
}
