package com.ra.session18_md3_hn_jv240408.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Users
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fullName;
	private String email;
	private String password;
	private String phone;
	
//	@ManyToMany
//	@JoinTable(
//			  name = "wishlist",
//			  joinColumns = @JoinColumn(name = "user_id"),
//			  inverseJoinColumns = @JoinColumn(name = "product_id")
//	)
//	private Set<Product> products;
}
