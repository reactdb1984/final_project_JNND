package com.udacity.course3.reviews.repository;

import com.udacity.course3.reviews.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    public List<Review> findReviewByProduct(Integer productId);
    @Query("Select r.reviewId from Review r join r.product p where p.productId = ?1")
    List<Review> findAllByProductId(Integer productId);


}



