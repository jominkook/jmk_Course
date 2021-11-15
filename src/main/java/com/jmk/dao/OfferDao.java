package com.jmk.dao;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jmk.model.Offer;

@Repository 

public class OfferDao { 

 

private JdbcTemplate jdbcTemplate; 

 

@Autowired 

public void setDataSource(DataSource dataSource) { 

jdbcTemplate = new JdbcTemplate(dataSource); 

} 

 

 

 

// query and return a multiple object 

public List<Offer> getOffers1() { //2018-1학기 조회 

String sqlStatment = "select * from 2018offers "; // placeholder 

 

return jdbcTemplate.query(sqlStatment, new RowMapper<Offer>() { 

 

@Override 

public Offer mapRow(ResultSet rs, int rowNum) throws SQLException { 

 

Offer offer = new Offer(); 

 

 

offer.setYear(rs.getInt("year")); 

offer.setSemster(rs.getInt("semster")); 

offer.setCode(rs.getString("code")); 

offer.setName(rs.getString("name")); 

offer.setClassify(rs.getString("classify")); 

offer.setCredit(rs.getInt("credit")); 

 

return offer; 

} 

 

}); 

} 

 

public List<Offer> getOffers2() { //2018-2학기 조회 

String sqlStatment = "select * from 2018offers2 "; // placeholder 

 

return jdbcTemplate.query(sqlStatment, new RowMapper<Offer>() { 

 

@Override 

public Offer mapRow(ResultSet rs, int rowNum) throws SQLException { 

 

Offer offer = new Offer(); 

 

 

offer.setYear(rs.getInt("year")); 

offer.setSemster(rs.getInt("semster")); 

offer.setCode(rs.getString("code")); 

offer.setName(rs.getString("name")); 

offer.setClassify(rs.getString("classify")); 

offer.setCredit(rs.getInt("credit")); 

 

return offer; 

} 

 

}); 

} 

 

public List<Offer> getOffers3() { //2019-1학기 조회 

String sqlStatment = "select * from 2019offers "; // placeholder 

 

return jdbcTemplate.query(sqlStatment, new RowMapper<Offer>() { 

 

@Override 

public Offer mapRow(ResultSet rs, int rowNum) throws SQLException { 

 

Offer offer = new Offer(); 

 

 

offer.setYear(rs.getInt("year")); 

offer.setSemster(rs.getInt("semster")); 

offer.setCode(rs.getString("code")); 

offer.setName(rs.getString("name")); 

offer.setClassify(rs.getString("classify")); 

offer.setCredit(rs.getInt("credit")); 

 

return offer; 

} 

 

}); 

} 

 

public List<Offer> getOffers4() { //2019-2학기 조회 

String sqlStatment = "select * from 2019offers2 "; // placeholder 

 

return jdbcTemplate.query(sqlStatment, new RowMapper<Offer>() { 

 

@Override 

public Offer mapRow(ResultSet rs, int rowNum) throws SQLException { 

 

Offer offer = new Offer(); 

 

 

offer.setYear(rs.getInt("year")); 

offer.setSemster(rs.getInt("semster")); 

offer.setCode(rs.getString("code")); 

offer.setName(rs.getString("name")); 

offer.setClassify(rs.getString("classify")); 

offer.setCredit(rs.getInt("credit")); 

 

return offer; 

} 

 

}); 

} 

 

public List<Offer> getOffers5() { //2020-1학기 예상과목 

String sqlStatment = "select * from 2020offers "; // placeholder 

 

return jdbcTemplate.query(sqlStatment, new RowMapper<Offer>() { 

 

@Override 

public Offer mapRow(ResultSet rs, int rowNum) throws SQLException { 

 

Offer offer = new Offer(); 

 

 

offer.setYear(rs.getInt("year")); 

offer.setSemster(rs.getInt("semster")); 

offer.setCode(rs.getString("code")); 

offer.setName(rs.getString("name")); 

offer.setClassify(rs.getString("classify")); 

offer.setCredit(rs.getInt("credit")); 

 

return offer; 

} 

 

}); 

} 

 

 

 

public boolean insert(Offer offer) { //2020학기 예상과목 입력 

 

int year = offer.getYear(); 

int semster = offer.getSemster(); 

String name = offer.getName(); 

String code = offer.getCode(); 

String classify = offer.getClassify(); 

int credit = offer.getCredit(); 

 

 

 

String sqlStatement = "insert into 2020offers (year,semster,code,name,classify,credit) values (?,?,?,?,?,?)"; 

 

return (jdbcTemplate.update(sqlStatement, new Object[] { 

 

year,semster,code,name, classify, credit}) == 1); 

 

} 