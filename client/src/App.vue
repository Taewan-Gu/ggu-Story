<template>
  <v-app class="app no-drag">
    <Nav />
    <div class="navPosition"></div>
    <v-main>
      <router-view/>
    </v-main>
    <br>
    <div class="footer">
      <Footer />
    </div>
  </v-app>
</template>

<script>
import Nav from "@/components/app/Nav.vue"
import Footer from "@/components/app/Footer.vue"

export default {
  name: 'App',
  components: {
    Nav,
    Footer,
  }
};
</script>

<style scoped>
/* 색: 64C9CF, FDE49C, FFB740, DF711B, 232323, eeeeee */ 

@import url(//fonts.googleapis.com/earlyaccess/notosanskr.css);

.app * { 
 font-family: 'Noto Sans KR', sans-serif;
}

.no-drag {
  -ms-user-select: none;
  -moz-user-select: -moz-none;
  -webkit-user-select: none;
  -khtml-user-select: none;
  user-select:none;
}

.navPosition {
  height: 70px;
}

.footer {
  background-color: #232323;
  color: #eeeeee;
}
</style>