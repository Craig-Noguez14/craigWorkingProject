package us.com.InfinityTides.petfinder.injection.component;

import dagger.Component;
import us.com.InfinityTides.petfinder.injection.PerActivity;
import us.com.InfinityTides.petfinder.injection.module.ActivityModule;
import us.com.InfinityTides.petfinder.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
