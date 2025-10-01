package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentTemplateManager {
    private Map<String, DocumentPrototype> templates = new HashMap<>();

    public void addTemplate(String key, DocumentPrototype prototype) {
        templates.put(key, prototype);
    }

    public DocumentPrototype getTemplate(String key) {
        DocumentPrototype prototype = templates.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}
