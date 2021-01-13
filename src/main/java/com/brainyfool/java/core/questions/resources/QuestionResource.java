package com.brainyfool.java.core.questions.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brainyfool.java.core.questions.model.Questions;
import com.brainyfool.java.core.questions.repository.QuestionRepository;

@RestController
@CrossOrigin(origins = "https://1-1-0-release.d17k616589wzcp.amplifyapp.com")

//SET PORT=4200 &&			https://localhost:4200
public class QuestionResource {

	@Autowired
	private QuestionRepository questionRepository;

//	// JWT
//	@Autowired
//	private AuthenticationManager authenticationManager;

//	@Autowired
//	private MyUserDetailsService userDetailsService;
//
//	@Autowired
//	private JwtUtil jwtUtilToken;

//	// JWT
//	@GetMapping(value = "/rest/questions/welcome")
//	public String welcome() {
//		return "Welcome";
//	}

//	// JWT
//	@PostMapping(value = "/authenticate")
//	public ResponseEntity<?> createAuthentionToken(@RequestBody AuthenticationRequest authenticationRequest)
//			throws Exception {
//		try {
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
//		} catch (BadCredentialsException e) {
//			throw new Exception("Incorrect Credentials");
//		}
//		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//		final String jwtToken = jwtUtilToken.generateToken(userDetails);
//		return ResponseEntity.ok(new AuthenticationResponse(jwtToken));
//
//	}

	@GetMapping(value = "/rest/questions/all")
	public List<Questions> getAll() {
		return questionRepository.findAll();
	}

	@GetMapping(value = "/rest/questions/{id}")
	public Optional<Questions> getAll(@PathVariable Integer id) {
		return questionRepository.findById(id);
	}

	@PostMapping(value = "/rest/questions/load")
	public void createQuestion(@RequestBody Questions questions) {
		questionRepository.save(questions);
	}

	@PutMapping(value = "/rest/questions/load/{id}")
	public Questions updateQuestion(@RequestBody Questions questions) {
		return questionRepository.save(questions);

	}

}
