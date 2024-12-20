package com.myproject.callabo_user_boot.review.domain;

import com.myproject.callabo_user_boot.common.BasicEntity;
import com.myproject.callabo_user_boot.customer.domain.CustomerEntity;
import com.myproject.callabo_user_boot.product.domain.ProductEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "review")
public class ReviewEntity extends BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_no", nullable = false)
    private Long reviewNo;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "reply", nullable = false)
    private String reply;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_no", referencedColumnName = "product_no")
    private ProductEntity productEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private CustomerEntity customerEntity;
  
}