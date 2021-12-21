package contact;

import com.google.gson.Gson;
import dto.ContactDTO;
import dto.GetAllContactsDTO;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OkHttpGetAllContacts {
    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImFsaXNpYWFncmFub3YrMUBnbWFpbC5jb20ifQ.1DPn-HqYgzWbZkVJOqEiX2DO5l2UkgwX8HYWaBvdrsM";
    OkHttpClient client = new OkHttpClient();
    Gson gson = new Gson();


    @Test
    public void getAllContact() throws IOException {
        Request request = new Request.Builder()
                .url("http://contacts-telran.herokuapp.com/api/contact")
                .addHeader("Authorization",token)
                .build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        GetAllContactsDTO contacts = gson.fromJson(response.body().string(),GetAllContactsDTO.class);

        for(ContactDTO contactDTO:contacts.getContacts())
        {
            System.out.println(contactDTO.getId());
            System.out.println(contactDTO.getEmail());
            System.out.println("*****************************");
        }
    }
}
