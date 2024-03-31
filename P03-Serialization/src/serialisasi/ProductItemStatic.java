/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
/**
 *
 * @author tamar
 */
public class ProductItemStatic implements Serializable{
    static String nama;
    static double harga;

    public ProductItemStatic(String name, double price) {
        ProductItemStatic.nama = name;
        ProductItemStatic.harga = price;
    }

    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}