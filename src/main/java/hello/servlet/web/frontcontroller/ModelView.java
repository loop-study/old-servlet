package hello.servlet.web.frontcontroller;

import java.util.Map;

public class ModelView {
    private String viewName;
    private Map<String, Object> model;

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
