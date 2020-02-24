## 2.1 产品表（面试时间降序）
## 1.2Add product

URL:Products/Add Product
Method:Post

RespomseBody:
```json
[
    {
        "product_name":123,
        "model":"华为",
        "desciption":"详情",
        "price":234,
        "quantity":"gls",
        "status":1
    }
]

```
ResponseBody:
```json
123456
```

Request Field

|字段 | 类型 | 描述 |
|:--------:|:--------:|:------:|
|prductName|String|关键字，产品名称|
|Model|String|型号|
|Price|int|价格|
|Desciption|String|详情|
|Quantity|int|数量|
|status|int|状态|

Response Field

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Integer   | 面试Id    |




## 添加页面
## 1.2Add Product

URL: /Products/Add Product
Method：Post

ResponseBody:  
```json
[
    {
        "product_name":1234,
        "model": "华为",
        "desciption": "详情",
        "price": 234,
        "quantity": "asd",
        "status": "1"
    }
]

```

ResponseBody:  
```json
123456

```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| ProductName | String   | 关键字，产品名称   |
| Model | String | 型号   |
| Price | int   | 价格    |
| Desciption | String  | 详情   |
| Quantity | int   | 数量    |
| status | int   | 状态    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Integer   | 面试Id    |


## 用户页面
## 1.3Customer

URL:/Product/Customer?CustomerName={CustomerName}&E-Mail={E-Mail}&Customer Group={Customer Group}&Status={Status}  
Method：GET  

ResponseBody:  
```json
[
    {
        "customer_name":"1234",
        "e-mail": "2314627942@qq.com",
        "customer_group": "asd",
        "status": "asd",
        "date_added": "2020/2/3",
    },
    {
        "customer_name":"1234",
        "e-mail": "2314627942@qq.com",
        "customer_group": "asd",
        "status": "asd",
        "date_added": "2020/2/3",
    }
]
```
Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| CustomerName| Stirng| 用户名称    |
| E-Mail  | String   | 电子邮箱 |
| Customer Group | String   | 地址    |
| Status   | String   | 状态    |

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| CustomerName| Stirng| 用户名称    |
| E-Mail  | String   | 电子邮箱 |
| Customer Group | String   | 地址    |
| Status   | String   | 状态    |
| Ip | int   | IP地址   |
| DateAdded | String   | 日期    |


## 添加用户
## 1.4Add Customer

URL: /Products/Add Customer
Method：Post

ResponseBody:  
```json
[
    {
        "customer_name":1234,
        "first_name": "asd",
        "last_name": "asd",
        "e-mail": "2314627942@qq.com",
        "customer_group": "asd",
        "telephone": "asd",
        "date_added": "2020/2/3",
        "company": "asd",
        "address1": "asdasdasd",
        "address2": "asda",
        "city": "asda",
        "postcode": "asda",
    }
]

```

ResponseBody:  
```json
123456

```

Request Field  

| 字段     |     类型 |   描述   | 
|---|---|---|---|
| customer_id  | int  | 主键 自增 | Id  |
| username | varchar(30)  | 非空 | 用户名  |
| real_name | varchar(20)  | 非空 | 真实姓名  |
| avatar_url  | varchar(100)  |  | 头像  |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| mobile  | varchar(20)  | 唯一索引  | 手机  |
| mobile_verified  | bit  | 默认false | 验证手机  |
| email | varchar(100)  | 唯一索引 | 邮箱  |
| email_verified  | bit  | 默认false | 验证邮箱  |
| status  | tinyint  | 非空 | 状态（0禁用、1启用、2不安全）  |
| create_time  | datetime  | 非空，索引  | 创建时间  |
| news_subscribed  | bit  | 非空，默认false | 订阅新闻  |
| reword_points | int  | 非空，默认0 | 积分  |
| default_address_id  | int  | 外键 | 默认地址  |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Integer   | 面试Id    |


## 登入账户
## 1.5ProductList

URL: /Product/Returning Customer
Method：GET  

ResponseBody:  
```json

    {
        "e-mail":"2314627942@qq.com",
        "pass_word": "华为",
    },


```

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| E-Mail | Stirng| 用户名称    |
| PassWord  | String   | 密码 |



## 添加地址
## 1.4Add Address

URL: /Products/Add Address
Method：Post

ResponseBody:  
```json

    {
        "first_name": "asd",
        "last_name": "asd",
        "company": "asd",
        "address1": "asdasdasd",
        "address2": "asda",
        "city": "asda",
        "post_code": "asda",
        "country": "asd",
        "state": "asd",
        "default_ddress": "asd",
    }


```

ResponseBody:  
```json
123456

```

Request Field  

| 字段     |     类型 |   描述   | 
|---|---|---|---|
| First Name  | String | 非空  | 主要名字   |
| Last Name| varchar(30)  | 非空 | 次要名字  |
| Company| varchar(20)  | 非空 | 标签  |
| Address1  | varchar(100)  |非空 |  地址 |
| Address2  | varchar(100)  | 非空 | 地址  |
| city | varchar(20)  | 唯一索引  | 城市  |
| PostCode | bit  | 默认false | 意见  |
| Country | varchar(100)  | 唯一索引 | 说明  |
| State  | String | String | 状态  |
|Default Address | bit  | 默认false  | 状态（0是、1否）  |


Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Integer   | 面试Id    |


## 订单列表
## 1.5 查询面试列表（面试时间降序）

URL: /interview/Order?Order ID={Order ID}&Customer={Customer}&Order Status={Order Status}  
Method：GET  

ResponseBody:  
```json
[
    {
       "order_id":"1234",
        "customer": "华为",
        "status": "234",
        "total": "cjf",
        "date_added": "2019-12-12T00:00:00.000+0000",
        "date_modified": 1575448390345,
    },
    {
       "order_id":"1234",
        "customer": "华为",
        "status": "234",
        "total": "cjf",
        "date_added": "2019-12-12T00:00:00.000+0000",
        "date_modified": 1575448390345,
    }
]

```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| Order ID   | String   | 关键字，Id    |
| Customer  | Boolean   |  用户名    |
| Order Status | Long   | 状态  |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| OrderID  | Integer   | Id    |
| Customer  | String   | 用户名    |
| Status  | String   | 状态 |
| Total  | String   | 价格   |
| Date Added | String  | 日期    |
| Date Modified|  String   | 日期   |



## 历史订单
## 1.6历史订单

URL: /interview/Order History
Method：GET  

ResponseBody:  
```json
[
    {
         "date Added":"1234",
        "comment": "发货",
        "status": "asdasd",
        "customer Notified": "no",
    },
    {
         "date Added":"1234",
        "comment": "发货",
        "status": "asdasd",
        "customer Notified": "no",
    }
]

```

Response Field  

| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_history_id  | int  | 主键 自增 | Id  |
| return_id | int  | 非空，索引，外键 | 退货Id  |
| time | datetime  | 非空 | 时间  |
| return_status  | tinyint  | 非空 | 退货状态  |
| comment  | varchar(300)  |  | 备注  |
| customer_notified  | bit  | 非空  | 是否通知客户  |



## 退货
## 1.7 退货

URL: /interview/Product Returns
Method：POST  

RequestBody:  
```json
{
    "product_name": "华为",
    "mobile": "手机",
    "quantity": 157,
    "reason":"asd",
    "opened": "是",
    "status": 0
}


```

Request Field  

| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_id  | int  | 主键 自增 | Id  |
| order_id | bigint  | 非空、索引、外键 | 订单Id  |
| order_time | datetime  |  | 订单时间  |
| customer_name  | varchar(20)  | 非空 | 退货人  |
| mobile  | varchar(20)  | 非空 | 手机  |
| email  | varchar(100)  | 非空  | 邮箱  |
| status  | tinyint  | 非空 | 状态（0等待取货、1正在处理、完成）  |
| return_action | tinyint  |  | 处理方式（0退货、1换货、2修理）  |
| product_code  | varchar(50)  | 非空 | 商品代码  |
| product_name  | varchar(100)  | 非空 | 商品名称  |
| quantity  | int  | 非空 | 商品数量  |
| reason  | tinyint  | 非空 | 退货原因  |
| opened  | bit  | 非空 | 是否开封  |
| comment  | varchar(300)  |  | 备注  |
| create_time  | datetime  | 非空，索引 | 创建时间  |
| update_time  | datetime  | 非空 | 修改时间  |


## 退货历史
## 8 退货

URL: /interview/ReturnHistory
Method：POST  

RequestBody:  
```json
{
    "time ": "2020-2-4",
    "return_status": "已退货",
    "comment": "阿斯顿撒好",
    "customer_notified ": "是"
}


```

Request Field  

| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_history_id  | int  | 主键 自增 | Id  |
| return_id | int  | 非空，索引，外键 | 退货Id  |
| time | datetime  | 非空 | 时间  |
| return_status  | tinyint  | 非空 | 退货状态  |
| comment  | varchar(300)  | 非空  | 备注  |
| customer_notified  | bit  | 非空  | 是否通知客户  |


## return show
## 退货

URL: /interview/return show
Method：POST  

RequestBody:  
```json
{
    "order_id  ": "1",
    "order_time": "2020-2-4",
    "customer_name": "阿斯顿撒好",
    "email ": "2314627942@qq.com",
    "first_name ": "2020-2-4",
    "last_name": "2020-2-4",
}


```

Request Field  

# ReturnHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_id | int  | 主键 自增 | Id  |
| order_time | int  | 非空，索引，外键 | 退货Id  |
| customer_name | datetime  | 非空 | 用户名称  |
| email   | tinyint  | 非空 | 电子邮件 |
| first_name  | varchar(300)  |非空  | 开始时间  |
| last_name  | bit  | 非空  | 最后时间 |