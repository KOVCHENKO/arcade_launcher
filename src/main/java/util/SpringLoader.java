package util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.com.arcadelauncher.config.AppConfig;
import ru.com.arcadelauncher.controllers.Controller;

import java.io.IOException;
import java.io.InputStream;

public class SpringLoader {

    private static final ApplicationContext APPLICATION_CONTEXT =
            new AnnotationConfigApplicationContext(AppConfig.class);

    /**
     * Загрузка.
     *
     * @param url линк
     * @return Controller
     */
    public static Controller loadControllerFxml(String url) {
        InputStream fxmlStream = null;
        try {
            fxmlStream = SpringLoader.class.getResourceAsStream(url);
            FXMLLoader loader = new FXMLLoader();
            loader.setControllerFactory(aClass -> APPLICATION_CONTEXT.getBean(aClass));

            Node view = loader.load(fxmlStream);
            Controller controller = loader.getController();
            controller.setView(view);

            return controller;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fxmlStream != null) {
                try {
                    fxmlStream.close();
                } catch (IOException e) {
                    System.out.println("exception");
                }
            }
        }
    }

    public static Object getBean(String beanName) {
        return APPLICATION_CONTEXT.getBean(beanName);
    }

    public static Object getBean(Class beanName) {
        return APPLICATION_CONTEXT.getBean(beanName);
    }
}
