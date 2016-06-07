package us.com.InfinityTides.petfinder.ui.main;

import java.util.List;

import us.com.InfinityTides.petfinder.data.model.Ribot;
import us.com.InfinityTides.petfinder.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
