<template>
  <NavBar/>
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue';
import "bootstrap/dist/css/bootstrap.min.css"  // bootstrap 依赖
import "bootstrap/dist/js/bootstrap"
// import $ from 'jquery'

export default {
  components: {
    NavBar
},
setup() {
  

  // $.ajax({
  //   url: "http://127.0.0.1:3000/user/account/info/",
  //   type: "GET",
  //   Headers: {
  //     Authorization: "Bearer token" + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlNGMwYWY5NTU4ZmQ0YWJkYTdmY2YxNmQ0NTI3YjM2ZSIsInN1YiI6IjMiLCJpc3MiOiJzZyIsImlhdCI6MTY4ODEzODkwMiwiZXhwIjoxNjg5MzQ4NTAyfQ.zmSep8_j1WmX-H7d2SyN3znzLVFmxNc6bRpTV9Hyelc"
  //   },
  //   success(resp) {
  //     console.log(resp);
  //   }, 
  //   error(resp) {
  //     console.log(resp);
  //   }
  // });

  // $.ajax({
  //   url: "http://127.0.0.1:3000/user/account/register/",
  //   type: "post",
  //   data: {
  //     username: "fyq3",
  //     password: "fyq3",
  //     confirmedPassword: "fyq3",
  //   },
  //   success(resp) {
  //     console.log(resp);
  //   }, 
  //   error(resp) {
  //     console.log(resp);
  //   }
  // })
}
}
</script>
<style>
  body {
    background-image: url("./assets/images/background.png");
    background-size: cover;
  }
</style>
