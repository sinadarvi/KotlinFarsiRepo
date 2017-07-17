package com.kotlinfarsi.introduction.inheritance

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented")
    }

    override fun getAll(): List<T> {
        TODO("not implemented")
    }
}

interface Repo{
    fun <T> getById(id : Int) : T
    fun <T> getAll() : List<T>
}

class MyRepo : Repo {
    override fun <T> getById(id: Int): T {
        TODO("not implemented")
    }

    override fun <T> getAll(): List<T> {
        TODO("not implemented")
    }
}