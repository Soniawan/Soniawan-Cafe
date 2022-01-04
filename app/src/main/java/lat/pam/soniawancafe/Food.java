package lat.pam.soniawancafe;

import android.graphics.drawable.Drawable;


public class Food {
    String title;
    String description;
    String price;
    Drawable image;

    Food(String judul, String deskripsi, String harga, Drawable gambar) {
        title = judul;
        description = deskripsi;
        price = harga;
        image = gambar;
    }
}
