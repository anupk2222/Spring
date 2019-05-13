package com.javatechie.es.api.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javatechie.es.api.model.Ticket;

public interface CustomerRepository extends ElasticsearchRepository<Ticket, String>{

	List<Ticket> findAll();

}
