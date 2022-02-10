package com.example.grantappforitacademy.main.ui.write_us

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.WriteUs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WriteUsPresenter(private val interactor: Interactor) :
    BasePresenter<WriteUsContract.View>(),
    WriteUsContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(writeUs: WriteUs) {
        presenterScope.launch {
            try {
                interactor.postWriteUs(writeUs)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
