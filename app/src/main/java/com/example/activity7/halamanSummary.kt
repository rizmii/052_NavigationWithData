package com.example.activity7

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.activity7.data.OrderUIState

@Composable
fun halamanSummary(
    OrderUIState: OrderUIState,
    onClickedButton: ()-> Unit
){
    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
    )
    {
        Text(text = "Nama")
        Text(text = OrderUIState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Alamat")
        Text(text = OrderUIState.alamat)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "No Telepon")
        Text(text = OrderUIState.noTelp)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = onClickedButton){
            Text(text = stringResource(id = R.string.back_button))
        }
    }
}