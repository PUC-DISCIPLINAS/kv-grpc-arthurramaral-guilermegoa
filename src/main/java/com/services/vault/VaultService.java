package com.services.vault;

import com.grpc.proto.vault.vaultGrpc;
import com.grpc.proto.vault.Vault.Map;
import com.grpc.proto.vault.Vault.Empty;
import com.grpc.proto.vault.Vault.Key;
import com.grpc.proto.vault.Vault.Value;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;

public class VaultService extends vaultGrpc.vaultImplBase {
    final private java.util.Map<String, Integer> vault;

    public VaultService() {
        this.vault = new HashMap<>();
    }

    @Override
    public void put(Map request, StreamObserver<Value> responseObserver) {
        System.out.println("Req chegou");
        String key = request.getKey();
        int value = request.getValue();
        
        System.out.println("key: " + key);
        System.out.println("value: " + value);
        
        this.vault.put(key, value);
        System.out.println("vault: " + vault);

        Value response = Value.newBuilder().setValue(value).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void get(Key request, StreamObserver<Map> responseObserver) {
        String key = request.getKey();
        int value = this.vault.get(key);

        Map response = Map.newBuilder().setKey(key).setValue(value).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllKeys(Empty request, StreamObserver<Key> responseObserver) {
        this.vault.forEach((key, value) -> {
            Key response = Key.newBuilder().setKey(key).build();
            responseObserver.onNext(response);
        });
        responseObserver.onCompleted();
    }
}