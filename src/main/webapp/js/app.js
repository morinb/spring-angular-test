(function() {
    var app = angular.module('gemStore', []);

    app.controller('StoreController', function() {
        this.product = gem;
    });

    var gem = {
        name: 'Dodecahedron',
        price: 110.50,
        description: 'Some gems have hidden qualitites beyound their luster, beyond their shine... Dodeca is one of those gems.',
        canPurchase: true,
        soldOut: true
    }

})();

