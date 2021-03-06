package com.qiusuo.SpringBootGraphqlStarter.domain.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
