package com.olx;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class AdvertiseController {

	@PostMapping(path="/advertise",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> createAd(@RequestBody Advertise advertise, @RequestHeader("auth-token") String token) {
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	@PutMapping(path="/advertise/{id}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> updateAd(@RequestBody Advertise advertise, @RequestHeader("auth-token") String token,@RequestParam("postId") Integer id) {
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	@GetMapping(path="/user/advertise",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> getAd(@RequestHeader("auth-token") String token) {
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	@GetMapping(path="/user/advertise/{postId}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> getAdbyId(@RequestHeader("auth-token") String token,@RequestParam("postId") Integer postId) {
		System.out.println("postId:"+postId);
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	@DeleteMapping(path="/user/advertise/{postId}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> deleteAdbyId(@RequestHeader("auth-token") String token,@RequestParam("postId") Integer postId) {
		System.out.println("postId:"+postId);
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	@GetMapping(path="/advertise/search/filtercrtieria",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> searchbycriteria(@RequestHeader("auth-token") String token,@RequestParam("postId") Integer postId) {
		System.out.println("postId:"+postId);
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	@GetMapping(path="/advertise/search",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> searchbyText(@RequestHeader("auth-token") String token) {
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	

	@GetMapping(path="/advertise/{postId}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Advertise> searchbyPostId(@RequestHeader("auth-token") String token) {
		Advertise ad = new Advertise();
		ad.setId(1);
		ad.setTitle("laptop");
		ad.setCategory("Electronic goods");
		ad.setUsername("Soma");
		ad.setCreatedDate(new Date(02/10/1999));
		ad.setModifiedDate(new Date(02/10/1999));
		ad.setStatus("OPEN");
		return  new ResponseEntity<Advertise>(ad,HttpStatus.OK);
	}
	
	
}
