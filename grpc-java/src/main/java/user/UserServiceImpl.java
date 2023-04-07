package user;

import io.grpc.stub.StreamObserver;
import org.stub.UserGrpc;
import org.stub.UserOuterClass;

public class UserServiceImpl extends UserGrpc.UserImplBase {
    @Override
    public void login(UserOuterClass.LoginRequest request, StreamObserver<UserOuterClass.APIResponse> responseObserver) {
        System.out.println("inside login user");
        String userName = request.getUserName();
        String password = request.getPassword();
        UserOuterClass.APIResponse.Builder response = UserOuterClass.APIResponse.newBuilder();
        response.setResponseCode(99);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(UserOuterClass.Empty request, StreamObserver<UserOuterClass.APIResponse> responseObserver) {
        super.logout(request, responseObserver);
    }
}
