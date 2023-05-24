package com.cxmv.lab4.database.repo


import com.cxmv.lab4.database.entity.User
import com.cxmv.lab4.database.entity.UserDao

class UserRepository(private val userDao: UserDao) {
    suspend fun getUserByPhone(phone: String): User? {
        return userDao.getUserByPhone(phone)
    }

    suspend fun getUserById(id: Int): User? {
        return userDao.getUserById(id)
    }

    suspend fun insert(user: User) {
        userDao.insertUser(user)
    }

    suspend fun update(user: User) {
        userDao.updateUser(user)
    }

    suspend fun getUsers(id: Int): List<User> {
        return userDao.getUsers(id)
    }
}