var app = new Vue({
    el: '#app',
    data: {
        productCode: '',
        productName: '',
        price: '',
        discount: '',
        stockQuantity: '',
        rewordPoints: '',
        sortOrder: '',
        productAbstract: '',
        description: '',
        selectedStatus: 1,
        selectedMainPic: '',
        mainPicUrl: '',
        selectedOtherPics: [],
        otherPicUrls: [],
        statuses: [
            { value: 0, label: '下架' },
            { value: 1, label: '上架' },
            { value: 2, label: '待审核' }
        ],

    },
    methods: {
        handleCreateClick() {
            console.log('create click');
            this.description = tinyMCE.activeEditor.getContent();
            this.createProduct();
        },
        createProduct() {
            axios.get('/product/create', {
                productCode: this.productCode,
                productName: this.productName,
                price: this.price,
                discount: this.discount,
                stockQuantity: this.stockQuantity,
                status: this.selectedStatus,
                mainPicUrl: this.mainPicUrl,
                rewordPoints: this.rewordPoints,
                sortOrder: this.sortOrder,
                productAbstract: this.productAbstract,
                description: this.description,
                otherPicUrls: this.otherPicUrls
            })
                .then(function (response) {
                    console.log(response);
                    alert('创建成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})