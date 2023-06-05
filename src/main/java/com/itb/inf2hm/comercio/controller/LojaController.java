package com.itb.inf2hm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2hm.comercio.model.Produto;
@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarProdutos() {
		Produto produto = new Produto() {
			produto.setNome = ("Televisor 70' Samsung");
		}
		
		return "produto";
	}

}
