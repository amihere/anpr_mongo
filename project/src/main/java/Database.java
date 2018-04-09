import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Database {

    private String databaseName;
    private MongoClient client;
    private MongoDatabase db;

    public Database(String databaseName) {
        this.databaseName = databaseName;
        client = new MongoClient();
        db = client.getDatabase(databaseName);
    }

    public MongoCollection<Document> getCollection(String collectionName){
        return db.getCollection(collectionName);
    }
}
