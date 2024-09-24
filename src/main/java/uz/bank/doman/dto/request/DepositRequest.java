package uz.bank.doman.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepositRequest {
    private UUID DepositTypeId;
    private UUID customerId;
    private LocalDateTime date;


}
