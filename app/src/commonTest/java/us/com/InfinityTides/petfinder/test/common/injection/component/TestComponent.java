package us.com.InfinityTides.petfinder.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import us.com.InfinityTides.petfinder.injection.component.ApplicationComponent;
import us.com.InfinityTides.petfinder.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
