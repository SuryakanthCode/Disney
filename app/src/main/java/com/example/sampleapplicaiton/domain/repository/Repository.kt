package com.example.sampleapplicaiton.domain.repository

import com.example.sampleapplicaiton.data.model.DisneyData

interface DisneyRepository{
    suspend fun getDisneyDetails(): List<DisneyData>
}