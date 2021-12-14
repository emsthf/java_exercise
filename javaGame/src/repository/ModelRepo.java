package repository;

import model.ModelCharacter;

import java.util.Map;

public interface ModelRepo {
    void createModel(String name, ModelCharacter model);
    ModelCharacter getterModel(String name);
    Map<String, ModelCharacter> getAllModel();
}
