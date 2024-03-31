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
public class ProductFinal implements Serializable{
    private final String id;
    private final String nama;
    private final List<ProductItemFinal> items;

    public ProductFinal(String id, String nama, List<ProductItemFinal> items) {
        this.id = id;
        this.nama = nama;
        this.items = items;
    }


    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public List<ProductItemFinal> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder produk = new StringBuilder("Produk: \r\n");
        produk.append("Id=").append(id).append("\r\n");
        produk.append("Nama=").append(nama).append("\r\n");
        produk.append("=======================\r\n");
        produk.append("Product Item:\r\n");
        for (ProductItemFinal item : items) {
            produk.append(item.toString());
        }
        return produk.toString();
    }
}