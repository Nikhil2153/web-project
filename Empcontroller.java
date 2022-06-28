package com.nikhil.controller;

	import java.util.List;    
	import org.springframework.beans.factory.annotation.Autowired;    
	import org.springframework.stereotype.Controller;  
	import org.springframework.ui.Model;  
	import org.springframework.web.bind.annotation.ModelAttribute;    
	import org.springframework.web.bind.annotation.PathVariable;    
	import org.springframework.web.bind.annotation.RequestMapping;    
	import org.springframework.web.bind.annotation.RequestMethod;     
	import com.nikhil.model.Employee;    
	import com.nikhil.database.Empdatabase;    
	@Controller    
	public class Empcontroller {    
	    @Autowired    
	    Empdatabase dao; 
	    
	    @RequestMapping("/registration")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Employee());  
	        return "registration";   
	    }    
	      
	    @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("emp") Employee emp){    
	        dao.save(emp);    
	        return "redirect:/listing";   
	    }    
	    
	    @RequestMapping("/listing")    
	    public String listing(Model m){    
	        List<Employee> list=dao.getEmployees();    
	        m.addAttribute("list",list);  
	        return "listing";    
	    }    
	       
	    @RequestMapping(value="/listing/{first_name}")    
	    public String edit(@PathVariable String first_name, Model m){    
	        Employee emp=dao.getEmployeeByfirst_name(first_name);    
	        m.addAttribute("command",emp);  
	        return "Editlist";    
	    }    
	    
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("emp") Employee emp){    
	        dao.update(emp);    
	        return "redirect:/listing";    
	    }    
	        
	    @RequestMapping(value="/deleteemp/{}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String first_name){    
	        dao.delete(first_name);    
	        return "redirect:/listing";   
	        
	        
	        @RequestMapping(value = "/save", method = RequestMethod.POST)
	        public String handleFormUpload( 
	            @RequestParam("photo") MultipartFile file) throws IOException{
	        if (!file.isEmpty()) {
	         BufferedImage src = ImageIO.read(new ByteArrayInputStream(file.getBytes()));
	         File destination = new File("File directory with file name") 
	         ImageIO.write(src, "png", destination);
	         
	         }  
	        }
	    }     
	}  

