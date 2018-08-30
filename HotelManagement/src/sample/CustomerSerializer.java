package sample;

import java.io.*;

public class CustomerSerializer implements Serializable {

    public void serialize(Object object, String path) {
        try
        {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
        }
        catch(IOException ex)
        {
            //
        }
    }

    public Customer deserialize(String path) {

        Customer customer = null;

        try
        {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(file);
            customer = (Customer)in.readObject();
            in.close();
            file.close();
        }
        catch(IOException ex)
        {
            //
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return customer;

    }

}
