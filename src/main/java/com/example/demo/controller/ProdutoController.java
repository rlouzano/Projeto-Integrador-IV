package com.example.demo.controller;

import com.example.demo.model.Produto;
import com.example.demo.respository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping(value= "/listar")
	public ModelAndView listar(Produto produto, Model model) {
		List<Produto> produtos = produtoRepository.findAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("produtos", produtos);
		return mv;
	}


}
