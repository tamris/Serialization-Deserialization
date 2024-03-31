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
public class ProductTransient implements Serializable{
    private transient String id;
    private transient String nama;
    private transient List<ProductItemTransient> items;

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setItems(List<ProductItemTransient> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String produk, item = "";
        produk = "Produk: \r\n"
                + "Id=" + id + "\r\n"
                + "Nama=" + nama + "\r\n"
                + "=======================\r\n"
                + "Product Item:\r\n";
        if (items != null) {
            item = items.stream().map(Object::toString).reduce(item, String::concat);
        }
        return produk + item;
    }
}
