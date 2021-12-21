package dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class GetAllContactsDTO {
    List <ContactDTO> contacts;
}
