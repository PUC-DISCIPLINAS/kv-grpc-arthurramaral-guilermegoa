package com.server;

import com.services.vault.VaultService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting grpc server");
        Server server = ServerBuilder.forPort(9089).addService(new VaultService()).build(); // create a instance of server

        server.start();
        System.out.println("Server Started at " + server.getPort());
        server.awaitTermination();
    }

}