var app = new Vue({
    el: '#app',
    data: {
        productId :"",
        productName :"",
        price :"",
        discount :"",
        stockQuantity :"",
        status :"",
        mainPicUrl :"",
        rewordPoints :"",
        sortOrder :"",
        description :"",
        otherPicUrls :"",
        statuses:[
            { value: 0, label: '下架'},
            { value: 1, label: '上架'},
            { value: 2, label: '待审核'}
        ]
    },
    methods:{

        uploadMainImage(){
            
        },
        
        handleOnMainChange(){
            console.log('upload main pic click');
        },
        
        handleUpdateClick(){
            console.log('update click');
        },

        getProductById() {
            axios.get('/product/getById', {
                params: {
                    productId: this.productId
                }
            })
                .then(function (response) {
                    console.log(response);
                    var product = response.data;
                    app.productId = product.productId;
                    app.productCode = product.productCode;
                    app.productName = product.productName;
                    app.price = product.price;
                    app.discount = product.discount;
                    app.stockQuantity = product.stockQuantity;
                    app.selectedStatus = product.status;
                    app.rewordPoints = product.rewordPoints;
                    app.sortOrder = product.sortOrder;
                    app.mainPicUrl = product.mainPicUrl;
                    app.productAbstract = product.productAbstract;
                    app.description = product.description;
                    app.otherPicUrls = product.otherPicUrls;
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})