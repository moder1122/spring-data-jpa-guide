package com.example.jpa.example1;
public interface UserRepository{ //extends JpaRepository<User,Long> {
//    /**
//     * 根据名称进行查询用户列表
//     * @param name
//     * @return
//     */
//    List<User> findByName(String name);
//    /**
//     * 根据用户的邮箱和名称查询
//     *
//     * @param email
//     * @param name
//     * @return
//     */
//    List<User> findByEmailAndName(String email, String name);

//    /**
//     * 测试一下DTO的返回结果
//     * @param email
//     * @return
//     */
//    UserDto findByEmail(String email);

//    /**
//     * 接口的方式返回DTO
//     * @param address
//     * @return
//     */
//    UserOnlyName findByAddress(String address);

//    /**
//     * constructor expression:
//     * @param sex
//     * @return
//     */
//    @Query("select new com.example.jpa.example1.UserDto(t.name, t.email) from User t where t.sex =:sex")
//    UserDto findBySex(@Param("sex") String sex);
}
