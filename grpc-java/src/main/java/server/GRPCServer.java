package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserServiceImpl;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090).addService(new UserServiceImpl()).build();
        server.start();
        System.out.println("server started");
        server.awaitTermination();
    }
}
