package co.com.parkinglots.usecase.user;

import co.com.parkinglots.model.user.User;
import co.com.parkinglots.model.user.gateways.IUserService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class UserUseCase {

    private final IUserService userGateway;

    public Mono<User> getUser(int id){
       return userGateway.getUser(id);
    }
    public Mono<User> createUser(User user){
        return userGateway.createUser(user);
    }
    public Mono<User> updateUser(User user){
        return userGateway.updateUser(user);
    }

}
