package com.example.kursovayaboletti

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init {
        galleryItemLiveData = FlickrFetchr().fetchImages()
    }
}