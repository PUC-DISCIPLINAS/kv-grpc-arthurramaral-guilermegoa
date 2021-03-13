package com.client;

import com.grpc.proto.vault.Vault;
import com.grpc.proto.vault.vaultGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;


public class GRPCClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9089).usePlaintext().build();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        String key;
        int value;

        vaultGrpc.vaultBlockingStub prodStub = vaultGrpc.newBlockingStub(channel);


        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter with a  key");
                    key = scanner.next();
                    System.out.println("Enter with a value.");
                    value = scanner.nextInt();

                    Vault.Map reqPut = Vault.Map.newBuilder().setKey(key).setValue(value).build();
                    Vault.Value resPut = prodStub.put(reqPut);
                    System.out.println(resPut);
                    break;
                case 2:
                    System.out.println("Enter with a  key");
                    key = scanner.next();

                    Vault.Key reqGet = Vault.Key.newBuilder().setKey(key).build();

                    Vault.Map resGet = prodStub.get(reqGet);

                    System.out.println(resGet);
                    break;
                case 3:
//                    Vault.Empty reqGetAll = Vault.Empty.newBuilder().build();
//
//                    Vault.Key[] resGetAll = prodStub.get(reqGetAll);
//
//                    System.out.println(resGetAll);
                    break;
                default:
                    break;
            }
        } while (option != 0);


    }

    public static void menu() {
        System.out.println("========= Menu =========");
        System.out.println("1 - Put a key and value.");
        System.out.println("2 - Get a value.");
        System.out.println("1 - Get all values.");
        System.out.println("========================");
    }
}