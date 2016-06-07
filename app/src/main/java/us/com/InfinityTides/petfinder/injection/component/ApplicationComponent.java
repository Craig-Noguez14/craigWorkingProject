package us.com.InfinityTides.petfinder.injection.component;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import us.com.InfinityTides.petfinder.data.DataManager;
import us.com.InfinityTides.petfinder.data.SyncService;
import us.com.InfinityTides.petfinder.data.local.DatabaseHelper;
import us.com.InfinityTides.petfinder.data.local.PreferencesHelper;
import us.com.InfinityTides.petfinder.data.remote.RibotsService;
import us.com.InfinityTides.petfinder.injection.ApplicationContext;
import us.com.InfinityTides.petfinder.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    Bus eventBus();

}
