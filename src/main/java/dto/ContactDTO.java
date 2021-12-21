package dto;

//eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImFsaXNpYWFncmFub3YrMUBnbWFpbC5jb20ifQ.1DPn-HqYgzWbZkVJOqEiX2DO5l2UkgwX8HYWaBvdrsM

import lombok.*;

//{
 //       "address": "string",
 //       "description": "string",
 //       "email": "string",
 //      "id": 0,
 //       "lastName": "string",
 //       "name": "string",
 //       "phone": "string"
  //      }
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class ContactDTO {
    String address;
    String description;
    String email;
    int id;
    String lastName;
    String name;
    String phone;
}
