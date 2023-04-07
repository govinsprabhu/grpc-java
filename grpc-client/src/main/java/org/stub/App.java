package org.stub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
        UserGrpc.UserBlockingStub userBlockingStub = UserGrpc.newBlockingStub(channel);
        UserOuterClass.LoginRequest loginRequest = UserOuterClass.LoginRequest.newBuilder().setUserName("Ram").setPassword("Ram1").build();
        UserOuterClass.APIResponse apiResponse = userBlockingStub.login(loginRequest);
        System.out.println(apiResponse.getResponseCode());

    }
}
