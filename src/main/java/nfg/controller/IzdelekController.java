package nfg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import nfg.model.Izdelek;
import nfg.repository.InMemoryProductRepository;
import nfg.repository.SqlProductRepository;

@RestController
@RequestMapping("api/v1/")
public class IzdelekController {
	
//	@Autowired
//	private IzdelekRepository izdelekRepository;

//	@Autowired
//	private InMemoryProductRepository productRepository;
	
//	private IProductRepository productRepository;
	
	@Autowired
	private SqlProductRepository productRepository;
	
	@ApiOperation(value = "List all products")
	@RequestMapping(value = "izdelki", method = RequestMethod.GET)
	public List<Izdelek> list() {
		return productRepository.getAll();
//		return izdelekRepository.findAll();
	}
	
	@ApiOperation(value = "Add a product")
	@RequestMapping(value = "izdelki", method = RequestMethod.POST)
	public Izdelek create(@RequestBody Izdelek izdelek) {
		return productRepository.add(izdelek);
//		return izdelekRepository.saveAndFlush(izdelek);
	}

    @ApiOperation(value = "Get a product", response = Izdelek.class)
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.GET)
	public Izdelek get(@PathVariable Long id) {
    	return productRepository.get(id);
//    	return izdelekRepository.findOne(id);
	}
	
	@ApiOperation(value = "Update a product")
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.PUT)
	public Izdelek update(@PathVariable Long id, @RequestBody Izdelek izdelek) {
		return productRepository.update(id, izdelek);
//		Izdelek existingIzdelek = izdelekRepository.findOne(id);
//		BeanUtils.copyProperties(izdelek, existingIzdelek);
//		return izdelekRepository.saveAndFlush(existingIzdelek);
	}
	
	@ApiOperation(value = "Delete a product")
	@RequestMapping(value = "izdelki/{id}", method = RequestMethod.DELETE)
	public Izdelek delete(@PathVariable Long id) {
		return productRepository.remove(id);
//		Izdelek existingIzdelek = izdelekRepository.findOne(id);
//		izdelekRepository.delete(existingIzdelek);
//		return existingIzdelek;
	}
}
