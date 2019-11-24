package task.openapi.api;

import java.util.List;

import javax.validation.Valid;

import org.openapi.example.api.PetsApi;
import org.openapi.example.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetsApiController implements PetsApi{

	@Override
	public ResponseEntity<List<Pet>> listPets(@Valid Integer limit) {
		System.out.println("Here list pet");
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
