package com.clearsky77.deliveryorder_20211108.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.clearsky77.deliveryorder_20211108.datas.StoreData

class PizzaStoreAdapater(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList){
}