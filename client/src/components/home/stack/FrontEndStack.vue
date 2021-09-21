<template>
  <v-row>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/vuejs.jpg" class="stackImg" alt="" />
      <h4>Vue.js</h4>
      <v-rating
        :value="3.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/vuex.jpg" class="stackImg" alt="" />
      <h4>Vuex</h4>
      <v-rating
        :value="3"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/html.jpg" class="stackImg" alt="" />
      <h4>HTML5</h4>
      <v-rating
        :value="3"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/css.jpg" class="stackImg" alt="" />
      <h4>CSS3</h4>
      <v-rating
        :value="3.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/javascript.jpg" class="stackImg" alt="" />
      <h4>JavaScript</h4>
      <v-rating
        :value="3"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/typescript.png" class="stackImg" alt="" />
      <h4>TypeScript</h4>
      <v-rating
        :value="1.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/sass.jpg" class="stackImg" alt="" />
      <h4>SASS</h4>
      <v-rating
        :value="2"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/reactjs.jpg" class="stackImg" alt="" />
      <h4>React.js</h4>
      <v-rating
        :value="2"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/redux.jpg" class="stackImg" alt="" />
      <h4>Redux</h4>
      <v-rating
        :value="1.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
      <img src="@/assets/img/stack/reactnative.jpg" class="stackImg" alt="" />
      <h4>ReacNative</h4>
      <v-rating
        :value="1.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
  </v-row>
</template>

<script>
export default {
  name: "FrontEndStack",
};
</script>

<style scoped>
.stackDetail {
  text-align: center;
}

.stackImg {
  height: 100px;
}
</style>
