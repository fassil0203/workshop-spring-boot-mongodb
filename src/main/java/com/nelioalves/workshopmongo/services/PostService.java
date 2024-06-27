package com.nelioalves.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
//	  public Post findById(String id) { 
//		  Optional<Post> obj = repo.findById(id);
//	  return obj.orElseThrow(() -> new
//	  ObjectNotFoundException("Objeto não encontrado")); }
	
	public List<Post> findBytitle(String text){
		return repo.findByTitleContaining(text);
	}
}
