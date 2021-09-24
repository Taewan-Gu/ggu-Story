<template>
  <v-col cols="6" sm="4" md="3" lg="2" class="stackDetail">
    <img :src="imgUrl" class="stackImg" alt="" />
    <h4>{{ name }}</h4>
    <v-rating
      :value="rating"
      :readonly="true"
      color="yellow darken-3"
      background-color="white"
      half-increments
      small
    ></v-rating>
  </v-col>
</template>

<script>
export default {
  name: "StackDetail",
  props: {
    img: String,
    name: String,
    rating: Number,
  },
  computed: {
    imgUrl () {
      return require(`../../../assets/img/stack/${this.img}`)
    }
  }
};
</script>

<style>
.stackDetail {
  text-align: center;
}

.stackImg {
  height: 100px;
}
</style>
