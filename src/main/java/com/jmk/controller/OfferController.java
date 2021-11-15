package com.jmk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jmk.model.Offer;
import com.jmk.service.OfferService;

@Controller
public class OfferController {
	@Autowired 

	private OfferService offerService; 

	 

	@RequestMapping("/offers1")  

	public String showOffers1(Model model) { //2018-1학기 성적 

	List<Offer> offers = offerService.getCurrent1(); 

	model.addAttribute("offers1", offers); 

	 

	return "offers1"; 

	} 

	 

	@RequestMapping("/offers2") 

	public String showOffers2(Model model) { //2018-2학기 성적 

	List<Offer> offers = offerService.getCurrent2(); 

	model.addAttribute("offers2",offers); 

	 

	return "offers2"; 

	} 

	@RequestMapping("/offers3") 

	public String showOffers3(Model model) { //2019-1학기 성적 

	List<Offer> offers = offerService.getCurrent3(); 

	model.addAttribute("offers3",offers); 

	 

	return "offers3"; 

	 

	} 

	 

	@RequestMapping("/offers4") 

	public String showOffers4(Model model) { //2019-1학기 성적 

	List<Offer> offers = offerService.getCurrent4(); 

	model.addAttribute("offers4",offers); 

	 

	return "offers4"; 

	} 

	 

	@RequestMapping("/selectoffers") 

	public String showOffers5(Model model) { //2020-1학기 성적조회 

	List<Offer> offers = offerService.getCurrent5(); 

	model.addAttribute("selectoffers",offers); 

	 

	return "selectoffers"; 

	} 

	@RequestMapping("/createoffers") 

	public String createoffers(Model model) {  

	 

	model.addAttribute("offer",new Offer()); 

	 

	return "createoffers"; 

	} 

	 

	@RequestMapping("/docreate") 

	public String docreate(Model model, Offer offer) { //2020-1학기 예상성적 insert 

	 

	offerService.insert(offer); 

	 

	return "offercreated"; 

	} 

}
