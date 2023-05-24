package com.cxmv.lab4.database.entity

import androidx.room.*

@Entity(tableName = "users", indices = [Index(value = ["phone"], unique = true)])
data class User(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "username") var username: String,
    @ColumnInfo(name = "password") var password: String,
    @ColumnInfo(name = "phone") var phone: String,
    @ColumnInfo(name = "isAdmin") var isAdmin: Boolean
)


@Dao
interface UserDao {
    @Query(value = "SELECT * FROM users WHERE phone = :phone LIMIT 1")
    suspend fun getUserByPhone(phone: String): User?

    @Query(value = "SELECT * FROM users WHERE id = :id LIMIT 1")
    suspend fun getUserById(id: Int): User?

    @Query(value = "SELECT * FROM users WHERE id != :id")
    suspend fun getUsers(id: Int): List<User>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)
}