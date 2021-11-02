/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Nov 1, 2021
 */

package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.repository.MusicianRepository;

/**
 * @author cmboe
 *
 */
@Controller
public class WebController {
	@Autowired
	MusicianRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllContacts(Model model) {
    model.addAttribute("musicians", repo.findAll());
    
    return "results";
}

}
