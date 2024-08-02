package school.faang.user_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import school.faang.user_service.entity.contact.PreferredContact;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    @Size(min = 6, max = 16)
    private String password;
    @Email
    private String email;
    @NotNull
    private String phone;
    private boolean active;
    @NotNull
    private Long countryId;
    private PreferredContact preference;
}
