<template>
  <v-app class="app">
    <Nav/>
    <div class="navPosition"></div>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>
import Nav from "@/components/app/Nav.vue"


export default {
  name: 'App',
  components: {
    Nav,
  }
};
</script>

<style scoped>
/* 색: 64C9CF, FDE49C, FFB740, DF711B, 232323 */ 

@import url(//fonts.googleapis.com/earlyaccess/notosanskr.css);

.app * { 
 font-family: 'Noto Sans KR', sans-serif;
}

.navPosition {
  height: 70px;
}


</style>