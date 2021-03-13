package com.services.vault;

import com.grpc.proto.vault.Vault;
import com.grpc.proto.vault.vaultGrpc;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class VaultService extends vaultGrpc.vaultImplBase {
    final private Map<String, Integer> vault;

    public VaultService() {
        this.vault = new HashMap<>();
    }

    @Override
    public void put(Vault.Map request, StreamObserver<Vault.Value> responseObserver) {
        String key = request.getKey();
        int value = request.getValue();

        this.vault.put(key, value);

        Vault.Value.Builder response = Vault.Value.newBuilder();
        response.setValue(value);
    }

    @Override
    public void get(Vault.Key request, StreamObserver<Vault.Map> responseObserver) {
        String key = request.getKey();
        int value = this.vault.get(key);

        Vault.Map.Builder response = Vault.Map.newBuilder();
        response.setKey(key).setValue(value);
    }

    @Override
    public void getAllKeys(Vault.Empty request, StreamObserver<Vault.Key> responseObserver) {
        this.vault.forEach((key, value) -> {
            Vault.Key.Builder response = Vault.Key.newBuilder();
            response.setKey(key);
        });
    }
}