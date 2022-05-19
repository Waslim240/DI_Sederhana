package waslim.binar.andlima.dependencyinjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import waslim.binar.andlima.dependencyinjection.latihan1.KonversiNilai
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun student() : Student{
        return Student()
    }


    @Singleton
    @Provides
    @Named("")
    fun guru() : String{
        return "adinda"
    }

    @Singleton
    @Provides
    fun guruDua() : String{
        return "bayu"
    }
}