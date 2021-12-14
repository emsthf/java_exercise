package repository;

import model.ModelCharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelData {
    public static List<ModelCharacter> models = new ArrayList<ModelCharacter>();
    public static Map<String, ModelCharacter> modelList = new HashMap<String, ModelCharacter>();

    public static List<ModelCharacter> getModels() {
        return models;
    }

    public static void setModels(List<ModelCharacter> models) {
        ModelData.models = models;
    }

    public static Map<String, ModelCharacter> getModelList() {
        return modelList;
    }

    public static void setModelList(Map<String, ModelCharacter> modelList) {
        ModelData.modelList = modelList;
    }

    public static ModelCharacter getModel(String name){
        return ModelData.modelList.get(name);
    }
}
