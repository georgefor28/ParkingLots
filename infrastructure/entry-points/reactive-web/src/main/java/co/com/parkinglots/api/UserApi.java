package co.com.parkinglots.api;

import co.com.parkinglots.model.user.User;
import co.com.parkinglots.usecase.user.UserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserApi {

    private UserUseCase userUseCase;

    @GetMapping(path = "/id={id}")
    public Mono<User> getUser(@PathVariable int id){
    //public ResponseEntity<Mono<User>> getUser(@PathVariable int id, ServerHttpResponse response){
        //response.setStatusCode(HttpStatus.NOT_FOUND);
        //return userUseCase.getUser(id);
        /*return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .header("X-Reason", "user-not exists")
                .body(Mono.empty());*/
        return userUseCase.getUser(id);
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User user){
        /*Mono<User> monoUser = Mono.just(User.builder().id(user.getId())
                        .firstname(user.getFirstname())
                        .lastname(user.getLastname())
                        .document(user.getDocument())
                        .email(user.getEmail())
                        .phone(user.getPhone())
                        .locationX(user.getLocationX())
                        .locationY(user.getLocationY())
                        .password(user.getPassword())
                        .build());*/
        return userUseCase.createUser(user);
    }

    @PutMapping
    public Mono<User> updateUser(@RequestBody User user){
        /*Mono<User> monoUser = Mono.just(User.builder().id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .document(user.getDocument())
                .email(user.getEmail())
                .phone(user.getPhone())
                .locationX(user.getLocationX())
                .locationY(user.getLocationY())
                .password(user.getPassword())
                .build());*/
        return userUseCase.updateUser(user);
    }


}
