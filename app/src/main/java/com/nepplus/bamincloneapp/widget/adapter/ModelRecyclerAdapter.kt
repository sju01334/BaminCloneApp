package com.nepplus.bamincloneapp.widget.adapter

import com.nepplus.bamincloneapp.model.Model
import com.nepplus.bamincloneapp.screen.base.BaseViewModel

class ModelRecyclerAdapter<M : Model, VM : BaseViewModel >(
    private var modelList: List<Model>,
    private var viewModel: VM,
) {


}