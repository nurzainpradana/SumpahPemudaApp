package com.zainpradana.sumpahpemudaapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.zainpradana.sumpahpemudaapp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        deklarasiSumpahPemuda()
    }
    private fun deklarasiSumpahPemuda() {
        val teksSumpahPemuda : Map <TextView, String> = mapOf(
            bind.tvSumpahPemuda to "Sumpah Pemuda",
            bind.tvSumpahPertama to
                    """Kami Putra dan Putri Indonesia, 
                    mengaku bertumpah darah yang satu, 
                    tanah air Indonesia.""".trimMargin(),
            bind.tvSumpahKedua to
                    """Kami Putra dan Putri Indonesia, 
                   mengaku berbangsa satu, bangsa Indonesia"""
                        .trimMargin(),
            bind.tvSumpahKetiga to
                    """Kami Putra dan Putri Indonesia, 
                        menjunjung bahasa persatuan, Bahasa Indonesia"""
                        .trimMargin())
        for ((saya, bersumpah) in teksSumpahPemuda){
            saya.text = bersumpah
        }
    }
}