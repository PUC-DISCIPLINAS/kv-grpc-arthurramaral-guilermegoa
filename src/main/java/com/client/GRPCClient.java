package com.client;

import com.grpc.proto.vault.vaultGrpc;
import com.grpc.proto.vault.Vault.Empty;
import com.grpc.proto.vault.Vault.Map;
import com.grpc.proto.vault.Vault.Key;
import com.grpc.proto.vault.Vault.Value;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;
import java.util.Scanner;


public class GRPCClient {
    static final private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9089).usePlaintext().build();
        int option = 0;
        String key;
        int value;

        vaultGrpc.vaultBlockingStub prodStub = vaultGrpc.newBlockingStub(channel);


        do {
            menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter with a  key");
                    key = scanner.next();
                    System.out.println("Enter with a value.");
                    value = scanner.nextInt();

                    Map reqPut = Map.newBuilder().setKey(key).setValue(value).build();
                    Value resPut = prodStub.put(reqPut);
                    System.out.println(resPut);
                    break;
                case 2:
                    System.out.println("Enter with a  key");
                    key = scanner.next();

                    Key reqGet = Key.newBuilder().setKey(key).build();

                    Map resGet = prodStub.get(reqGet);

                    System.out.println(resGet);
                    break;
                case 3:
                    System.out.println("Todos as chaves:");
                    Empty reqGetAll = Empty.newBuilder().build();

                    Iterator<Key> resGetAll = prodStub.getAllKeys(reqGetAll);

                    do {
                        System.out.println(resGetAll.next());
                    } while(resGetAll.hasNext());
                    
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
        System.out.println("3 - Get all values.");
        System.out.println("========================");
    }
}