package com.example.kursovayaboletti.api

import com.example.kursovayaboletti.GalleryItem
import com.google.gson.annotations.SerializedName

class ImageResponse {
    @SerializedName("image")
    lateinit var galleryItems: List<GalleryItem>
}