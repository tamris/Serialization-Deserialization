/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tamar
 */
public class ProductStatic implements Serializable{
    private static String id;
    private static String nama;
    private static List<ProductItemStatic> items;

    public static void setId(String id) {
        ProductStatic.id = id;
    }

    public static void setNama(String nama) {
        ProductStatic.nama = nama;
    }

    public static void setItems(List<ProductItemStatic> items) {
        ProductStatic.items = items;
    }

    @Override
    public String toString() {
        String produk, item = "";
        produk = "Produk: \r\n"
                + "Id=" + id + "\r\n"
                + "Nama=" + nama + "\r\n"
                + "=======================\r\n"
                + "Product Item:\r\n";
        item = items.stream().map(ProductItemStatic::toString).reduce(item, String::concat);
        return produk + item;
    }
}
