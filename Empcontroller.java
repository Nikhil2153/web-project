package com.nikhil.controller;

	import java.util.List;    
	import org.springframework.beans.factory.annotation.Autowired;    
	import org.springframework.stereotype.Controller;  
	import org.springframework.ui.Model;  
	import org.springframework.web.bind.annotation.ModelAttribute;    
	import org.springframework.web.bind.annotation.PathVariable;    
	import org.springframework.web.bind.annotation.RequestMapping;    
	import org.springframework.web.bind.annotation.RequestMethod;     
	import com.javatpoint.beans.Emp;    
	import com.javatpoint.dao.EmpDao;    
	@Controller    
	public class Empcontroller {    
	    @Autowired    
	    Empdatabase dao;//will inject dao from XML file    
	        
	    /*It displays a form to input data, here "command" is a reserved request attribute  
	     *which is used to display object data into form  
	     */    
	    @RequestMapping("/registration")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Employee());  
	        return "registration";   
	    }    
	    /*It saves object into database. The @ModelAttribute puts request data  
	     *  into model object. You need to mention RequestMethod.POST method   
	     *  because default request is GET*/    
	    @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("emp") Employee emp){    
	        dao.save(emp);    
	        return "redirect:/listing";//will redirect to viewemp request mapping    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/listing")    
	    public String listing(Model m){    
	        List<Employee> list=dao.getEmployees();    
	        m.addAttribute("list",list);  
	        return "listing";    
	    }    
	    /* It displays object data into form for the given id.   
	     * The @PathVariable puts URL data into variable.*/    
	    @RequestMapping(value="/listing/{first_name}")    
	    public String edit(@PathVariable String first_name, Model m){    
	        Employee emp=dao.getEmployeeByfirst_name(first_name);    
	        m.addAttribute("command",emp);  
	        return "Editlist";    
	    }    
	    /* It updates model object. */    
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("emp") Employee emp){    
	        dao.update(emp);    
	        return "redirect:/listing";    
	    }    
	    /* It deletes record for the given id in URL and redirects to /viewemp */    
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
	         //Save the id you have used to create the file name in the DB. You can retrieve the image in future with the ID.
	         }  
	        }
	    }     
	}  

