package com.fusion_nex_gen.yasuorecyclerviewadapter.model

import androidx.lifecycle.MutableLiveData
import com.fusion_nex_gen.yasuorvadapter.bean.YasuoFoldItem

data class TextBeanInnerThree(
    val text: MutableLiveData<String>
): YasuoFoldItem()
