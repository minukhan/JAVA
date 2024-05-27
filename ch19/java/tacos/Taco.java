package tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

    @NotNull
    @Size(min=5 , message = "Name must be least 5 characters long")
    private String name;

    @NotNull
    @Size(min=1,message = "You must chooes at least 1 ingredient")
    private List<Ingredient> ingredients;


}
//end::allButValidation[]
//tag::end[]