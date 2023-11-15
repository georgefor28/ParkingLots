package co.com.parkinglots.usergeneric;

import co.com.parkinglots.model.location.Location;
import co.com.parkinglots.model.user.User;
import co.com.parkinglots.model.user.gateways.IUserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class UserService implements IUserService {
    @Override
    public Mono<User> getUser(int id) {
        Mono<User> monoUser = Mono.empty();
        if (id == 1){
            monoUser = Mono.just(User.builder().id(id)
                    .firstname("Jorge")
                    .lastname("Forero")
                    .document("8012345")
                    .email("jorge@forero.com")
                    .phone("305999999")
                    .locationX(30)
                    .locationY(12)
                    .password("12345")
                    .build());
        }
        return monoUser;
    }

    @Override
    public Mono<User> createUser(User user) {
        return  Mono.just(User.builder().id(user.getId())
                .firstname(user.getFirstname()+ "create")
                .lastname(user.getLastname())
                .document(user.getDocument())
                .email(user.getEmail())
                .phone(user.getPhone())
                .locationX(user.getLocationX())
                .locationY(user.getLocationY())
                .password(user.getPassword())
                .build());
    }

    @Override
    public Mono<User> updateUser(User user) {
        return  Mono.just(User.builder().id(user.getId())
                .firstname(user.getFirstname() + "update")
                .lastname(user.getLastname())
                .document(user.getDocument())
                .email(user.getEmail())
                .phone(user.getPhone())
                .locationX(user.getLocationX())
                .locationY(user.getLocationY())
                .build());
    }

}
