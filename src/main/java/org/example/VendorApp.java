package org.example;

import java.util.*;
import java.util.function.Supplier;

public class VendorApp {

    public static void main(String[] args) throws Exception {
        /*
         * Code Task Will go here, Test your single lambda by calling all the below 5
         * methods to return products, no NullPointerException must be thrown in case of any issues
         * instead it can return empty map or useful message to a user in case of any null objects
         *
         */

//        if(vendor != null){
//            Client client = vendor.getClient();
//            if(client != null){
//                Product product = client.getProduct();
//                if(product != null){
//                    Map<String, String> productsMap = product.getProducts();
//                    if(productsMap != null && productsMap.size()>0){
//                        System.out.println(productsMap);
//                    }else{
//                        throw new Exception("No Data found");
//                    }
//                }else{
//                    throw new Exception("No Data found");
//                }
//            }else{
//                throw new Exception("No Data found");
//            }
//        }else{
//            throw new Exception("No Data found");
//        }

        Vendor vendor = scenarioWithNoClientForVendor();

       Map<String, String> productsMap  = Optional.ofNullable(vendor)
                .map(Vendor::getClient)
                .map(Client::getProduct)
                .map(Product::getProducts)
                .orElseThrow(() -> new Exception("No Data Found"));

        System.out.println(productsMap);

    }

    private static Vendor scenarioWithAllObjectsPresent() {
        Map<String, String> productsMap = new HashMap<>();
        productsMap.put("P-011", "Ecommerce Portal");
        productsMap.put("P-012", "Ecommerce Admin Dashboard");
        productsMap.put("P-013", "Sales Portal");
        productsMap.put("P-014", "Logistics Portal");
        Product product = new Product(productsMap);
        Client client = new Client("Canadian-Tire Corporation", product);
        //Committing...
        return new Vendor("EPAM Systems", client);

    }

    private static Vendor scenarioWithNoProductsMapForProduct() {
        Product product = new Product(null);
        Client client = new Client("Mastercard", product);
        return new Vendor("EPAM Systems", client);
    }

    private
    static Vendor scenarioWithNoProductForClient() {
        Client client = new Client("Mastercard", null);
        return new Vendor("EPAM Systems", client);
    }

    private static Vendor scenarioWithNoClientForVendor() {
        return new Vendor("EPAM Systems", null);
    }

    private static Vendor scenarioWithNoVendor() {
        return null;
    }
}
