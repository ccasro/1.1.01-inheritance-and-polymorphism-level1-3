package org.ccasro.level3.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Newsroom {
    private List<Editor> editors = new ArrayList<>();

    public void addEditor(Editor editor) {
        editors.add(editor);
    }

    public void removeEditor(String dni) {
        editors.removeIf(e -> e.getDni().equalsIgnoreCase(dni));
    }

    public Optional<Editor> findEditorByDni(String dni) {
        return editors.stream().filter(e -> e.getDni().equalsIgnoreCase(dni)).findFirst();
    }

    public List<Editor> getEditors() {
        return List.copyOf(editors);
    }


}
