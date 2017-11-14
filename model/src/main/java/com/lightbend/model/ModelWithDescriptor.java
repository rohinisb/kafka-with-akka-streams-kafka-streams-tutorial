package com.lightbend.model;

public class ModelWithDescriptor {

    private Model model;
    private CurrentModelDescriptor descriptor;

    public ModelWithDescriptor(Model model, CurrentModelDescriptor descriptor){
        this.model = model;
        this.descriptor = descriptor;
    }

    public Model getModel() {
        return model;
    }

    public CurrentModelDescriptor getDescriptor() {
        return descriptor;
    }
}
