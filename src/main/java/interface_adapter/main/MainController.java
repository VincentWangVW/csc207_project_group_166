package interface_adapter.main;

import use_case.mainwindow.MainInputBoundary;

public class MainController {
    private final MainInputBoundary mainInteractor;

    public MainController(MainInputBoundary mainInteractor) {
        this.mainInteractor = mainInteractor;
    }
    public void switch_to_DateView() {
        mainInteractor.switch_to_DateView();
    }

    public void switch_to_RecipeView() {
        mainInteractor.switch_to_RecipeView();
    }

    public void switch_to_IngredientsView(){mainInteractor.switch_to_IngredientsView(); }
}
