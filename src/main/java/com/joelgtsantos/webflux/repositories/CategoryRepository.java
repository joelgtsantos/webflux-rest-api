/**
 * 
 */
package com.joelgtsantos.webflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.joelgtsantos.webflux.model.Category;

/**
 * @author Joel Santos
 *
 * webflux-rest-api
 * 2018
 */
public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{

}
