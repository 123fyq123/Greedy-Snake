<template>
  <div id="nav">
    <div>bot: {{a}}</div>
  </div>
  <router-view/>
</template>

<script>
  import $ from 'jquery';
  import { ref } from 'vue'

  export default {
    name: "APP",
    setup: () => {
      let a = ref("");
      // let b = ref("");

      $.ajax({
        url: "http://127.0.0.1:3000/pk/getinfo/",
        type: "get",
        success: resp => {
          a = resp;
        }
      });

      return {
        a
      }
    }

  }
</script>
<style>
  body {
    background-image: url("./assets/background.png");
    background-size: cover;
  }
</style>
