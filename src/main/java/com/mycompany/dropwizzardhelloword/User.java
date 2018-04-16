package com.mycompany.dropwizzardhelloword;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"first_name",
"last_name",
"avatar"
})
public class User {

@JsonProperty("id")
public Integer id;
@JsonProperty("first_name")
public String firstName;
@JsonProperty("last_name")
public String lastName;
@JsonProperty("avatar")
public String avatar;

public User withId(Integer id) {
this.id = id;
return this;
}

public User withFirstName(String firstName) {
this.firstName = firstName;
return this;
}

public User withLastName(String lastName) {
this.lastName = lastName;
return this;
}

public User withAvatar(String avatar) {
this.avatar = avatar;
return this;
}

}