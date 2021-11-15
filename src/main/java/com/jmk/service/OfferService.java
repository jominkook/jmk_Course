package com.jmk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmk.dao.OfferDao;
import com.jmk.model.Offer;

@Service
public class OfferService {
	@Autowired 

	private OfferDao offerDao; 

	 

	public List<Offer> getCurrent1() { //2018-1학기 성적 

	 

	return offerDao.getOffers1(); 

	} 

	 

	public List<Offer> getCurrent2() { //2018-2학기 성적 

	return offerDao.getOffers2(); 

	} 

	 

	public List<Offer> getCurrent3() { //2019-1학기 성적 

	return offerDao.getOffers3(); 

	} 

	 

	public List<Offer> getCurrent4() { //2019-2학기 성적 

	return offerDao.getOffers4(); 

	 

	} 

	public List<Offer> getCurrent5() { //2020-1학기 성적 

	return offerDao.getOffers5(); 

	} 

	 

	public void insert(Offer offer) { //2020-1학기 성적 입력 

	offerDao.insert(offer); 

	 

	} 
}
