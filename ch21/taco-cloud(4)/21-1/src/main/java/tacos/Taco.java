package tacos;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.Errors;

@Data
@Table
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long" )
    private String name;

    @NotNull
    @Size(min = 1, message = "You must chose at least 1 ingredient")
    private List<IngredientRef> ingredients = new ArrayList<>();

    @Id
    private Long id;

    private Date placedAt = new Date();

    @PostMapping
    public String processTaco(@Valid @ModelAttribute("taco") Taco taco, Errors errors){
        if (errors.hasErrors()){
            return "design";
        }
        //log.info("Processing taco: "+ taco);

        return "redirect:/orders/current";
    }

    public void setCreatedAt(Date date) {
        placedAt = date;
    }

    public Date getCreatedAt() {
        return placedAt;
    }

}
