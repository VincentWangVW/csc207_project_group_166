package use_case.mainwindow;

public class MainInteractor implements MainInputBoundary{
    public final MainOutputBoundary mainpresenter;
    public MainInteractor(MainOutputBoundary mainOutputBoundary){
        mainpresenter=mainOutputBoundary;
    }
    @Override
    public void switch_to_IngredientsView() {

    }

    @Override
    public void switch_to_GenerateRecipeView() {

    }

    @Override
    public void switch_to_UserInfoView() {

    }

    @Override
    public void switch_to_SeasonView() {
        mainpresenter.switch_to_SeasonView();
    }
}
