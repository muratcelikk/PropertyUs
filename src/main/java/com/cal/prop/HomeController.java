package com.cal.prop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cal.prop.utils.Car;

@Controller
public class HomeController {
	List<Car> cls = new ArrayList<Car>();
	int Count = 0; 

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("data", cls);
		return "home";
	}

	@RequestMapping(value = "/carInsert", method = RequestMethod.POST)
	public String carInsert(Car crs) {

		// System.out.println(crs.getTitle());
		Count++;
		crs.setId(Count);
		cls.add(crs);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		cls.remove(indexSearch(id));
		return "redirect:/";
	}

	public int indexSearch(int id) {
		int s = 0;
		for (Car item : cls) {
			if (item.getId() == id)
				break;
			s++;
		}
		return s;
	}
}
