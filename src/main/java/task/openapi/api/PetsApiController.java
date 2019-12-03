package task.openapi.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.openapi.example.api.PetsApi;
import org.openapi.example.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
public class PetsApiController implements PetsApi{

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return PetsApi.super.getRequest();
	}

	@Override
	public ResponseEntity<Void> createPets() {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<Pet> showPetById(String petId) {
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Pet>> listPets(@Valid Integer limit) {
		System.out.println("Here list pet");
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
