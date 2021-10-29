package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import DAO.DAOInterface;
import DAO.DAOImplementation;

/**
 * Class with main method
 * @author Oleg Pleskach
 * @version 1.0
 */
public class Main {

    /**
     * Search for all teapots and the cheapest device
     * @param args arguments of command line, not used
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DAOInterface store = new DAOImplementation("devices.xml");
        ArrayList<String> teapots = store.GetDevicesByName("Teapot");

        System.out.println("Чайники:");
        for(int i = 0; i < teapots.size(); i++)
        {
            System.out.println(teapots.get(i));
        }

        System.out.println("Самый дешевый товар:");
        System.out.println(store.GetCheapestDevice());

        Scanner in = new Scanner(System.in);
        in.nextLine();
    }
}
