package com.deepanshi.cleanarchitecture.presentation.user_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.deepanshi.cleanarchitecture.domain.model.User

@Composable
fun UserListItem (user: User,
                  onItemClick: (User) -> Unit){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(user) }
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = user.name,
                style = MaterialTheme.typography.h4,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = user.email,
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis
            )
        }

        Divider(color = Color.LightGray, thickness = 1.dp)
    }

}