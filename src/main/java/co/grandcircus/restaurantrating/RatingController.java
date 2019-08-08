package co.grandcircus.restaurantrating;

import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.restaurantrating.dao.RestaurantDao;
import co.grandcircus.restaurantrating.entity.Restaurant;

@Controller
public class RatingController {
	
	@Autowired
	private RestaurantDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println("first");
		return new ModelAndView("redirect:/home");
	}
	
	@RequestMapping("/home")
	public ModelAndView showHome() {
		
		List<Restaurant> restaurantList = dao.findAll();
		//TreeSet(restaurantList);
		
		//System.out.println(restaurantList);
		
		return new ModelAndView("home", "restaurants", restaurantList);
	}

}
