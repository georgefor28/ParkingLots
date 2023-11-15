package co.com.parkinglots.model.user.gateways;

import co.com.parkinglots.model.location.Location;
import co.com.parkinglots.model.user.User;
import reactor.core.publisher.Mono;

public interface IUserService {
    Mono<User> getUser(int id);
    Mono<User> createUser(User user);
    Mono<User> updateUser(User user);

    //Mono<User> updateLocation(Location location);

}
