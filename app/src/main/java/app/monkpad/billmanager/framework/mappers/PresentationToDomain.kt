package app.monkpad.billmanager.framework.mappers

import app.monkpad.billmanager.domain.models.Bill
import app.monkpad.billmanager.domain.models.Category
import app.monkpad.billmanager.framework.models.BillDTO
import app.monkpad.billmanager.framework.models.CategoryDTO

fun BillDTO.asDomainModel(): Bill =
    Bill(
        description = description,
        amount = amount,
        dueDate = dueDate,
        repeat = repeat,
        settled = paid,
        categoryName = categoryName
    )

fun CategoryDTO.asDomainModel(): Category =
    Category(
        name = name,
        logo = logo
    )