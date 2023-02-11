package BehavioralDesignPatterns.Mediator.mediator;

public interface Mediator {
    void addNewNote(Note note);

    void deleteNote();

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel listModel);

    void setElementsList(ListModel list);

    void registerComponent(Component component);

    void hideElements(boolean flag);

    void createGUI();
}
