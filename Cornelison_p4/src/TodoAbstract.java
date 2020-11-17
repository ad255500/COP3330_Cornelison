import java.io.Serializable;
import java.util.UUID;

public static abstract class TodoAbstract implements Todo, Serializable {
    private static final java.util.UUID UUID = ;
    protected final int id;
    protected String title;

    public TodoAbstract(String title){
        this.id = UUID.randomUUID().hashCode();
        this.title = title;
    }

    public String toString(){
        return "{ type: " + getClass().getSimpleName() +
                ", id: " + id +
                ", title: " + title + "}";
    }
}

interface Todo {

}
}  