package waslim.binar.andlima.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var student : Student

    @Inject
    lateinit var namaGuru : String

    @Inject
    lateinit var namaGuruDua : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = student.nameStudent()
        tvStudent.text = " $nama\n $namaGuru\n $namaGuruDua"

        hitung()
    }

    private fun hitung(){
        jumlah.setOnClickListener {
            val a = angka1.text.toString().toInt()
            val b = angka2.text.toString().toInt()
            val di = student.hitungJumlah(a, b)
            hasil.text = "Hasil $a + $b = ${di.toString()}"
        }
    }


}