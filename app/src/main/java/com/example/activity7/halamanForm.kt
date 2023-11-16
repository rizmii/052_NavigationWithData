package com.example.activity7

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun halamanForm(
    onSubmitButtonClick:(MutableList<String>) -> Unit
){
    var namaTxt by rememberSaveable{
        mutableStateOf("")
    }
    var alamatTxt by rememberSaveable {
        mutableStateOf("")
    }
    var teleponTxt by rememberSaveable {
        mutableStateOf("")
    }
    var listDataTxt:MutableList<String> = mutableListOf(namaTxt,alamatTxt,teleponTxt)


}