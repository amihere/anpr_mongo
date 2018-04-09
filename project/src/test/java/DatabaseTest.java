import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.Before;
import org.junit.Test;
import user.Applicant;
import user.User;

import java.util.UUID;

import static com.mongodb.client.model.Filters.eq;
import static org.junit.Assert.*;

public class DatabaseTest {
    Database database;
    MongoCollection<Document> collection;
    Gson son;

    @Before
    public void setup(){
        database = new Database("anpr_test");
        collection = database.getCollection("uniapp_users");
        son = new Gson();
    }

    @Test
    public void testInsertOne(){
        User user = new Applicant(UUID.randomUUID(), "newapplicant", null);
        collection.insertOne(Document.parse(son.toJson(user)));
        System.out.println(collection.count());
    }

    @Test
    public void testFindQuery(){
        FindIterable<Document> result = collection.find(eq("username", "newapplicant"));
        for(Document doc : result){
            User user = Applicant.fromDocument(doc);
            System.out.println(user);
        }
    }

    @Test
    public void testGetCollection() {
        //just assert collection is not null
        assertNotNull(collection);
    }
}