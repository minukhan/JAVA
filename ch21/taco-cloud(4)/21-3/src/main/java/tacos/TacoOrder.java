package tacos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import lombok.Data;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.*;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Entity
public class TacoOrder implements Serializable {

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @NotBlank(message = "City is required")
    private String deliveryCity;

    @NotBlank(message = "State is required")
    private String deliveryState;

    @NotBlank(message = "Zip code is required")
    private String deliveryZip;

    @NotBlank(message = "Nota valid credit card number")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message = "Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer = 3,fraction = 0,message = "Invalid CVV")
    private String ccCVV;

    @OneToMany
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date placedAt = new Date();

    @PostMapping
    public String processOrder(@Valid  TacoOrder order, Errors errors){
        if (errors.hasErrors()){
            return "orderForm";
        }
        //log.info("Processing taco: "+ order);

        return "redirect:";
    }
}
