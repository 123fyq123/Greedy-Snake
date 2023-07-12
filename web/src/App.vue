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

}
}
</script>
<style>
  body {
    background-image: url("./assets/images/background.png");
    background-size: cover;
    user-select:none;
  }
</style>
