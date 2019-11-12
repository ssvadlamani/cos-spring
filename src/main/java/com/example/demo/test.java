package com.example.demo;

import com.microsoft.azure.documentdb.ConnectionPolicy;
import com.microsoft.azure.documentdb.ConsistencyLevel;
import com.microsoft.azure.documentdb.Database;
import com.microsoft.azure.documentdb.DocumentClient;
import com.microsoft.azure.documentdb.DocumentClientException;

public class test {
	 // Replace with your DocumentDB end point and master key.
    private static final String END_POINT = "https://localhost:8081/";
    private static final String MASTER_KEY = "C2y6yDjf5/R+ob0N8A7Cgv30VRDJIWEHLM+4QDU5DE2nQ9nDuVTqobD4b8mGGyPMbIZnqyMsEcaGQy67XIw/Jw==";

    public static void main(String[] args) throws DocumentClientException {
        // Connect to the Azure Cosmos DB Emulator running locally
        DocumentClient client = new DocumentClient(END_POINT, MASTER_KEY, ConnectionPolicy.GetDefault(),
                ConsistencyLevel.Session);

        Database database = new Database();
        database.setId("test");
        database = client.createDatabase(database, null).getResource();

        System.out.println(database.toJson());
    }

}
