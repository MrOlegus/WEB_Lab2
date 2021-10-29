package DAO;

import java.util.ArrayList;

/**
 * Interface for the DAO level
 * @author Oleg Pleskach
 */
public interface DAOInterface {
    /**
     * @param name device name to search
     * @return list of devices and their descriptions
     */
    ArrayList<String> GetDevicesByName(String name);

    /**
     * @return the cheapest device and its description
     */
    String GetCheapestDevice();
}
