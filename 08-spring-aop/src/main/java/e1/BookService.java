package e1;

import org.springframework.stereotype.Component;

@Component
public class BookService implements Service {
    @Override
    public void show() {
        System.out.println("图书展示");
    }
}
