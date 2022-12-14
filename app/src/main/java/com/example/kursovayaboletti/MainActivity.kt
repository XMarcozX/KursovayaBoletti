package com.example.kursovayaboletti

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Проверяем, разместился ли фрагмент в контейнере. Если нет, то создаем экземпляр
        GalleryFragment и добавляем его в контейнер
         */
        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, GalleryFragment.newInstance())
                .commit()
        }
    }
}