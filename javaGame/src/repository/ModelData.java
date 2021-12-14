package repository;

import model.ModelCharacter;

import java.util.HashMap;
import java.util.Map;

public class ModelData {

    public static Map<String, ModelCharacter> modelList = new HashMap<String, ModelCharacter>();

    public static void addModel(String name, ModelCharacter model) {
        modelList.put(name, model);
    }

    public static ModelCharacter getChar(String name){
        return ModelData.modelList.get(name);
    }


    public static Map<String, ModelCharacter> getModelList() {
        return modelList;
    }


}
