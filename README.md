# ECommerceAPI Project

## Frameworks and Language used:
 - Spring
 - Spring boot
 - My-Sql
 - Java

 ## Data Flow
 #### Controller
 ---User----
 - getAllUsers
 - getUserById
 - addUserData
 
 ---Product----
 - getProductById
 - addProduct
 - deleteProduct

 ---Address----
 - getAllAddress
 - getAddressById
 - addAddressData

 ---Order----
 - getAllOrders
 - getOrderById
 - addOrder

 #### Service
 ---User----
 - getAllUser
 - getUserById
 - addUser

 ---Product----
 - getAllProduct
 - deleteProduct
 - addProductsData

 ---Address----
 - getAllAddress
 - getAddressById
 - addAddresses

 ---Order----
 - findAllOrders
 - findOrderById
 - addOrderData
 
 #### Repository
 ---User----

 IUserRepository

 ---Product----

 IProductRepository

---Address----

 IAddressRepository

---Order----

 IOrderRepository

 #### Model
 
 ---User----
 - Id
 - name
 - email
 - password
 - phoneNumber
 
 ---Product----
 
 - Id
 - name
 - price
 - description
 - category
 - brand
 
 ---Address----
 
 - Id
 - name
 - landmark
 - phoneNumber
 - zipcode
 - state
 - userId
 
 ---Order----
 
 - orderId
 - user_id
 - product_id
 - address_id
 - productQuantity
 
 
### Project Summary
Created a Simple University ECommerceAPI Application using java, springboot and maven.
It sotre records just like an ordinary ecommerce website. You can also performs various CRUD operations.

The main objective to create this application is to get a glimpe of how the data is stored in ECommerce websites adn how it gets fetched.

### How to use in your system?
 - Just Simply clone this reposit
 - Start your server
 - Perform operations 
