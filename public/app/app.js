angular
    .module
        ('architectplay',
            ['ngRoute',
             'ngResource',
             'ngSanitize',
             'ngAria',
             'ngAnimate',
             'angular-loading-bar',
             'toastr',
             'ngDialog', 
             'youtube-embed'
            ]
        )
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/home.html',
                controller: 'home.controller',
                activetab: 'home'
            })
            .when('/usuario/perfil', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/usuarios/perfil.html',
                controller: 'usuario.perfil.controller',
                activetab: 'usuarios'
            })
            .when('/livros', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/livros/list.html',
                controller: 'livro.list.controller',
                activetab: 'livros'
            })
            .when('/cursos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/cursos/list.html',
                controller: 'curso.list.controller',
                activetab: 'cursos'
            })
            .when('/artigos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/artigos/list.html',
                controller: 'artigo.list.controller',
                activetab: 'artigos'
            })
            .when('/videos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/videos/list.html',
                controller: 'video.list.controller',
                activetab: 'videos'
            })
            .when('/fotos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/fotos/list.html',
                controller: 'foto.controller',
                activetab: 'fotos'
            })
            .when('/fotos/biometano', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/fotos/biometano/list.html',
                controller: 'foto.controller',
                activetab: 'fotos'
            })
            .when('/fotos/granjahaacke', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/fotos/granjahaacke/list.html',
                controller: 'foto.controller',
                activetab: 'fotos'
            })
            .when('/fotos/laboratoriobiogas', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/fotos/laboratoriobiogas/list.html',
                controller: 'foto.controller',
                activetab: 'fotos'
            })
            .when('/fotos/unidadesdeproducao', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/fotos/unidadesdeproducao/list.html',
                controller: 'foto.controller',
                activetab: 'fotos'
            })
            .when('/direitos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/direito.html',
                controller: 'direito.controller',
                activetab: 'direitos'
            })
            //Inicio das funcoes do menu biogas
            .when('/biogas/sobre', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/biogas/sobre.html',
                controller: 'sobre.controller',
                activetab: 'sobre'
            })
            .when('/casos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/casos/list.html',
                controller: 'casos.controller',
                activetab: 'casos'
            })
            .when('/ferramentas', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/ferramentas/list.html',
                controller: 'ferramentas.controller',
                activetab: 'ferramentas'
            })
            .when('/ped', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/ped/list.html',
                controller: 'ped.controller',
                activetab: 'ped'
            })
            .when('/marcos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/marcos/list.html',
                controller: 'marcos.controller',
                activetab: 'marcos'
            })
            .when('/aspectos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/aspectos/list.html',
                controller: 'aspectos.controller',
                activetab: 'aspectos'
            })
            .when('/registros', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/registros/list.html',
                controller: 'registros.controller',
                activetab: 'registros'
            })
            .when('/eventos', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/eventos/list.html',
                controller: 'evento.list.controller',
                activetab: 'eventos'
            })
            .when('/noticias', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/noticias/list.html',
                controller: 'noticia.list.controller',
                activetab: 'noticias'
            })
            .when('/publicacoes', {
                templateUrl: '/architectplay-1.0-SNAPSHOT/assets/app/views/publicacoes/list.html',
                controller: 'publicacao.list.controller',
                activetab: 'publicacoes'
            })
            .otherwise({redirectTo:'/'});
    }).config(function($httpProvider, cfpLoadingBarProvider) {
        // carrega o loading bar
        // true e o padrao, mas pode deixar false caso nao queira o loading bar
        cfpLoadingBarProvider.includeSpinner = false;
    }).config(function(toastrConfig) {
       //configurações do toastr
        angular.extend(toastrConfig, {
            positionClass: 'toast-bottom-right',
            allowHtml: false,
            closeButton: true,
            closeHtml: '<button>&times;</button>',
            extendedTimeOut: 1000,
            iconClasses: {
                error: 'toast-error',
                info: 'toast-info',
                success: 'toast-success',
                warning: 'toast-warning'
            },
            messageClass: 'toast-message',
            onHidden: null,
            onShown: null,
            onTap: null,
            progressBar: false,
            tapToDismiss: true,
            templates: {
                toast: 'directives/toast/toast.html',
                progressbar: 'directives/progressbar/progressbar.html'
            },
            timeOut: 4000,
            titleClass: 'toast-title',
            toastClass: 'toast'
       });
   // diretiva para quando a pessoa pressionar o enter no campo busca
   }).directive('myEnter', function () {
        return function (scope, element, attrs) {
            element.bind("keydown keypress", function (event) {
                if(event.which === 13) {
                    scope.$apply(function (){
                        scope.$eval(attrs.myEnter);
                    });
                    event.preventDefault();
                }
            });
        };
   //diretiva que ao realizar um click no botao ele e desativado disabled class
   }).directive('clickOnce', function($timeout) {
        return {
            restrict: 'A',
            link: function(scope, element, attrs) {
                var replacementText = attrs.clickOnce;
                element.bind('click', function() {
                    $timeout(function() {
                        if (replacementText) {
                            element.html(replacementText);
                        }
                        element.attr('disabled', true);
                    }, 0);
                });
            }
        };
   //configuracao do dialogo quando o admin deseja excluir um usuario por exemplo
   }).config(['ngDialogProvider', function (ngDialogProvider) {
        ngDialogProvider.setDefaults({
            showClose: false,
            closeByDocument: false,
            closeByEscape: false,
            className: 'ngdialog-theme-default'
        });
   //outra diretiva que ao realizar um click no botao ele e desativado disabled class
   }]).directive('clickAndDisable', function() {
        return {
            scope: {
                clickAndDisable: '&'
            },
            link: function(scope, iElement, iAttrs) {
                iElement.bind('click', function() {
                    iElement.prop('disabled',true);
                    scope.clickAndDisable().finally(function() {
                        iElement.prop('disabled',false);
                    })
                });
            }
        };
    // se tirar esse .run as funções do material design lite
    //não carrega corretamente na página, precisa apertar f5 várias vezes
   }).run(function ($rootScope) {
    $rootScope.$on('$viewContentLoaded', function upgradeAllRegistered() {
        componentHandler.upgradeAllRegistered();
    });
    // necessario para utilizar as mensagens do internacionalization do play, isso faz com que seja reaproveitado a parte os arquivos messages
}).run(function ($rootScope) {
    //Put the jsMessage function in the root scope in order to be able to call
    //{{ Messages('my.messages') }} from the templates.
    $rootScope.Messages = window.Messages;
});