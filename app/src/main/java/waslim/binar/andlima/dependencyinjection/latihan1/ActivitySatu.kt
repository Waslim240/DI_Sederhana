package waslim.binar.andlima.dependencyinjection.latihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_satu.*
import waslim.binar.andlima.dependencyinjection.R
import javax.inject.Inject

@AndroidEntryPoint
class ActivitySatu : AppCompatActivity() {

    @Inject
    lateinit var konversiNilai: KonversiNilai

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satu)

        hitung()

    }

    private fun hitung(){
        btn_hitungKonversi.setOnClickListener {
            val a = masukan_angka.text.toString().toInt()

            when (konversiNilai.hitungkonversi(a)) {
                in 85..100 -> {
                    hasil2.text = "A"
                }
                in 75..84 -> {
                    hasil2.text = "B"
                }
                in 60..74 -> {
                    hasil2.text = "C"
                }
                in 50..59 -> {
                    hasil2.text = "D"
                }
                else -> {
                    hasil2.text = "E"
                }
            }

        }
    }
}