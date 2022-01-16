package com.example.tugasuas;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.tugasuas.model.Anjing;
import com.example.tugasuas.model.Hewan;
import com.example.tugasuas.model.Kucing;
import com.example.tugasuas.model.KupuKupu;
public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.angora_nama), ctx.getString(R.string.angora_asal),
                ctx.getString(R.string.angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama), ctx.getString( R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi),R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama), ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama), ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.bulldog_nama), ctx.getString(R.string.bulldog_asal),
                ctx.getString(R.string.bulldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<KupuKupu> initDataKupukupu(Context ctx) {
        List<KupuKupu> kupukupus = new ArrayList<>();
        kupukupus.add(new KupuKupu("The Blue Morpho", "Brasil dan Venezuela",
                "kupu-kupu ini memiliki sayap yang terbilang cukup besar. Pada sayapnya, Anda bisa melihat gradasi warna biru dan hitam.", R.drawable.morpho_blue));
        kupukupus.add(new KupuKupu("The Glasswing Butterfly", "Meksiko, Panama, Ekuador, Kosta Rika",
                "Kupu kupu ini memiliki sayap transparan alias bening seperti kaca. Bila terkena sinar matahari, sayap itu akan berkilau merah, hijau, oranye, dan kebiruan seperti gelembung sabun yang transparan.", R.drawable.butterfly_glasswing));
        kupukupus.add(new KupuKupu("Sapho Longwings", "Meksiko dan Ekuador",
                "Memiliki corak dengan dominasi warna biru navy serta dihiasi dengan warna putih di tengah sayap membuat tampilan kupu-kupu ini terlihat sangat memesona dan juga unik.", R.drawable.butterfly_longwings));
        kupukupus.add(new KupuKupu("Monarch Butterfly", "mencakup di seluruh dunia.",
                "Corak yang unik dan warna oranye dengan bintik-bintik putih pada bagian tepi sayapnya menjadi ciri khas jenis kupu-kupu ini.", R.drawable.butterfly_monarch));
        kupukupus.add(new KupuKupu("Spicebrush Swallowtails", "Amerika Serikat dan Ontario",
                "Rentang sayap kupu-kupu ini bisa mencapai 4 inchi. Kupu-kupu ini dihiasi dengan warna hitam dan sedikit warna putih sehingga membuatnya terkesan misterius dan unik.", R.drawable.butterfly_spicebrush));
        kupukupus.add(new KupuKupu("The Sri Lankan Ceylon Rose", "hutan Papua",
                "Bentuk sayap yang memanjang di bagian atas dekat dengan kepala serta memiliki beberapa lekukan-lekukan di bagian bawah sayap membuat bentuk kupu-kupu sangat khas dan unik. ", R.drawable.butterfly_srilankan));
        return kupukupus ;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataKupukupu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
