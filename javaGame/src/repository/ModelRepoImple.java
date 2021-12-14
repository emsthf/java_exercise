package repository;

import model.ModelCharacter;

import java.util.Map;

public class ModelRepoImple implements ModelRepo{

    @Override
    public void createModel(String name, ModelCharacter model) {
        ModelData.addModel(name, model);
    }

    @Override
    public ModelCharacter getterModel(String name) {
        return ModelData.getChar(name);
    }

    @Override
    public Map<String, ModelCharacter> getAllModel() {
        return null;
    }
}
