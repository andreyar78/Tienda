
package com.tienda.controller;


import com.tienda.domain.Articulo;
import com.tienda.service.ArticuloService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private ArticuloService articuloservice;
    @GetMapping("/")
    
    public String inicio(Model model){
      log.info("Estamos usando una arquitectura mvc");
      
      var articulos=articuloservice.getArticulos(true);
      
    
      model.addAttribute("articulos",articulos);
      return "index";
    }
    
    }

