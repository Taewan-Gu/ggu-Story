<template>
  <div class="nav">
    <div class="navBackground"></div>
    <v-container>
      <v-row>
        <v-col 
          sm="8"
          md="4"
          offset-md="0"
          offset-xl="2"
          xl="2"
          class="logo"
        >
          <span class="pointedLogo"> ggu </span>
          Story
        </v-col>
        <v-col
          sm="4"
          md="8"
          xl="6"
          class="menu"
        >
          <span class="menuItem" @click="gotoHome"> HOME </span>
          <span class="menuItem" @click="gotoProjects"> PROJECTS </span>
          <span class="menuItem" @click="gotoBlog"> BLOG </span>
          <span class="menuItem" @click="gotoWords"> WORDS </span>
          <span :class="{menuItem: true, visualStatus: !visualStatus}" @click="clickContact"> CONTACT </span>
          <span :class="{menuItem: true, visualStatus: visualStatus}" @click="clickContact"> CLOSEUP </span>
          <Contact :visualStatus="visualStatus"/>
        </v-col>
        <v-col
          cols="4"
          class="dropdownMenu"
        >
          <v-menu offset-y>
            <template v-slot:activator="{ on, attrs }">
              <v-btn
                v-bind="attrs"
                v-on="on"
                depressed
                color="white"
              >
                <v-icon>
                  mdi-menu
                </v-icon>
              </v-btn>
            </template>
            <v-list>
              <v-list-item class="dropdownMenuItem" @click="gotoHome">
                <v-list-item-title>HOME</v-list-item-title>
              </v-list-item>
              <v-list-item class="dropdownMenuItem" @click="gotoProjects">
                <v-list-item-title>PROJECTS</v-list-item-title>
              </v-list-item>
              <v-list-item class="dropdownMenuItem" @click="gotoBlog">
                <v-list-item-title>BLOG</v-list-item-title>
              </v-list-item>
              <v-list-item class="dropdownMenuItem" @click="gotoWords">
                <v-list-item-title>WORDS</v-list-item-title>
              </v-list-item>
              <v-list-item :class="{dropdownMenuItem: true, visualStatus: !visualStatus}" @click="clickContact">
                <v-list-item-title>CONTACT</v-list-item-title>
              </v-list-item>
              <v-list-item :class="{dropdownMenuItem: true, visualStatus: visualStatus}" @click="clickContact">
                <v-list-item-title>CLOSEUP</v-list-item-title>
              </v-list-item>
            </v-list>
          </v-menu>
          <Contact :visualStatus="visualStatus"/>
        </v-col>
      </v-row>
    </v-container>
    <hr>
  </div>
</template>

<script>
import Contact from "@/components/app/Contact.vue"

export default {
  name: "Nav",
  data () {
    return {
      visualStatus: true,
    }
  },
  components: {
    Contact,
  },
  methods: {
    gotoHome () {
      this.$router.history.push({name: "Home"});
    },
    gotoProjects () {
      this.$router.history.push({name: "Projects"});
    },
    gotoBlog () {
      open("https://txegg.tistory.com");
    },
    gotoWords () {
      this.$router.history.push({name: "Words"});
    },
    clickContact () {
      this.visualStatus = !this.visualStatus;
    },
  }
}
</script>

<style scoped>
@media screen and (max-width: 960px) {
  .menu {
    display: none;
  }
  .dropdownMenu {
    display: block !important;
  }
}

.visualStatus {
  display: none;
}

.nav {
  position: fixed;
  z-index: 99;
  width: 100%;
  height: 80px;
}

.navBackground {
  position: fixed;
  z-index: -2;
  width: 100%;
  height: 78px;
  background-color: white;
  opacity: 0.94;
}

.menu {
  margin-top: 1.7rem;
  text-align: end;
}

.menuItem {
  margin-left: 10px;
  cursor: pointer;
}

.dropdownMenu {
  margin-top: 1rem;
  text-align: end;
  display: none;
}

.dropdownMenuItem {
  cursor: pointer;
  font-weight: 500;
}

.logo {
  color: #232323;
  font-size: 2rem;
  cursor: default;
}

.pointedLogo {
  color: #DF711B;
  font-size: 2.2rem;
}

</style>