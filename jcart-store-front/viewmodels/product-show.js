var app = new Vue({
    el: '#app',
    data: {
        productId: '',
        productCode: '',
        productName: '',
        price: '',
        discount: '',
        description: '',
        stockQuantity: '',
        mainPicUrl: '',
        otherPicUrls: []
    },


    methods: {
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
                    app.mainPicUrl = product.mainPicUrl;
                    app.otherPicUrls = product.otherPicUrls;
                    app.description = product.description;
                    app.stockQuantity = product.stockQuantity;
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})