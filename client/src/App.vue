<template>
  <div class="mainMenu">
    <div class="mainMenuItemBox">
      <router-link :class="{ 'mainMenuItem': !select[0], 'selectMainMenuItem': select[0] }" to="/" @click="selectMenu(0)">Show <br> Myself</router-link>
    </div>
    <div class="mainMenuItemBox">
      <router-link :class="{ 'mainMenuItem': !select[1], 'selectMainMenuItem': select[1] }" to="/portpolio" @click="selectMenu(1)">Taewan's <br> Portpolio</router-link>
    </div>
    <br>
    <div calss="mainMenuItemBox">
      <router-link :class="{ 'mainMenuItem': !select[2], 'selectMainMenuItem': select[2] }" to="/plan" @click="selectMenu(2)">Taewan's <br> Plan</router-link>
    </div>
  </div>
  <router-view/>
</template>

<script>
export default{
  name: 'Home',
  data() {
    return {
      select: [true, false, false],
    }
  },
  created() {
    if (localStorage.getItem("select")) {
      const select = [false, false, false]
      select[localStorage.getItem("select")] = true
      this.select = select
    } else {
      localStorage.setItem("select", 0)
    }
    if (this.$router.currentRoute.value.fullPath === "/") {
      localStorage.setItem("select", 0)
      const select = [false, false, false]
      select[localStorage.getItem("select")] = true
      this.select = select
    }
  },
  methods: {
    selectMenu: function (idx) {
      const select = [false, false, false]
      select[idx] = true
      this.select = select
      localStorage.setItem("select", idx)
    }
  }
}
</script>


<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.mainMenu {
  position: fixed;
  width: 200px;
  height: 100%;
  left:0px;
  top:0px;
  background-color:#222831;
  color:#eeeeee;
}

.mainMenuItemBox {
  margin-top: 20px;
  margin-bottom: 20px;
  padding-bottom: 30px;
  padding-top: 30px;
}

.mainMenuItem {
  color:#eeeeee;
  line-height: 22px;
  text-decoration-line: none;
}

.selectMainMenuItem {
  color:#FF96AD;
  line-height: 22px;
  text-decoration-line: none;
}
</style>
