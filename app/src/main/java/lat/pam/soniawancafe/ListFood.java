package lat.pam.soniawancafe;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class ListFood{


    public static ArrayList<Integer> getGambar() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.black_salad);
        drawables.add(R.drawable.kopi_hitam);
        drawables.add(R.drawable.nasigoreng);
        drawables.add(R.drawable.batagor);
        drawables.add(R.drawable.cheesecake);
        drawables.add(R.drawable.cappuchino);
        drawables.add(R.drawable.cireng);
        drawables.add(R.drawable.sparkling_tea);
        drawables.add(R.drawable.donut);
        drawables.add(R.drawable.mie_goreng);

        return drawables;
    }

    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Black Salad","Kenapa black salad ? Karena ada kandungan charcoal yang memiliki fungsi yang baik untuk tubuh kita, antara lain mencegah kembung dan menurunkan kolesterol.", "Rp. 50.000", context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Kopi Hitam", "Kopi hitam tidak hanya nikmati untuk dikonsumsi, tapi juga memliliki sejumlah manfaat bagi kesehatan manusia. Salah satunya menjaga organ hati.", "Rp. 10.000", context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Nasi Goreng","Nasi goreng memiliki kandungan sulfida methylallyl serta asam amino sulfur yang dapat membantu anda di dalam penurunan pada kadar kolesterol jahat di dalam darah dan peningkatan pada kadar kolesterol baik. Selain itu, makanan ini memiliki khasiat untuk mengontrol tekanan darah tinggi dan membuka arteri yang tersumbat, sehingga mampu meningkatkan kesehatan jantung. ", "Rp. 15.000", context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Batagor","Batagor merupakan olahan makanan dari ikan tenggiri. Ikan yang termasuk dalam kelompok spanish mackerel ini mengandung asam lemak omega 3, vitamin B12, dan selenium. Kandungan nutrisi tersebut dapat membantu menjaga kesehatan jantung dan melindungi sel dari kerusakan akibat paparan radiasi bebas.", "Rp. 5.000", context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Cheese Cake", "Cheese cake adalah makanan ringan yang bertekstur lembut dan identik dengan cita rasanya yang lezat, gurih dan manis. Dijamin, Anda akan ketagihan saat memakannya. Cheese cake awalnya sangat populer di negara Jepang. Dan seiring perkembangan zaman jenis kue ini mulai merambah luas dan dinikmati oleh banyak orang di berbagai negara.", "Rp. 25.000", context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cappuccino", "Cappuccino adalah kopi yang paling banyak disukai. Menurut pakar kesehatan, secangkir kopi cappucino dapat membantu mengatasi kolesterol dan mencegah beberapa masalah yang berhubungan dengan jantung. Cappuccino juga efektif melawan penyakit kardiovaskular seperti stroke.", "Rp. 15.000", context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cireng","Cireng adalah jenis makanan ringan yang berasal dari daerah Sunda. Cireng ini dibuat dengan cara menggoreng campuran adonan yang bahan utamanya adalah tepung kanji atau tepung tapioka.", "Rp. 5.000", context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Lemon Sparkling Tea","Minuman ini dijamin bikin segaar. Perpaduan rasa asamnya lemon yang segar dicampur dengan teh dan soda. ", "Rp. 20.000", context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Donut","Donat adalah roti yang tengahnya berlubang seperti cincin atau huruf O dalam abjad latin. Donat termasuk roti tetapi diolah dengan cara digoreng. Tekstur yang seperti roti memudahkan adonan donat dibuat berbagai macam bentuk seperti bulat dengan lubang di tengah, dipelintir, atau diisi selai, coklat, atau custard seperti donat bulat yang tidak berlubang.", "Rp. 5.000", context.getDrawable(R.drawable.donut)));
        list.add(new Food("Mie Goreng","Mie goreng adalah hidangan mie goreng khas Indonesia yang populer hingga ke mancanegara, yang pastinya disukai semua orang. Mie goreng khas Indonesia sangat menggugah selera, biasanya ditambahkan denagn saus kecap manis dan gurih yang lezat.", "Rp. 10.000", context.getDrawable(R.drawable.mie_goreng)));

        return list;
    }
}
