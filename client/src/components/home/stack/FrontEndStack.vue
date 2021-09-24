<template>
  <v-row>
    <StackDetail
      v-for="(name, idx) in names"
      :key="idx"
      :img="imgs[idx]"
      :name="name"
      :rating="ratings[idx]"
    />
  </v-row>
</template>

<script>
import StackDetail from "@/components/home/stack/StackDetail.vue";

export default {
  name: "FrontEndStack",
  data() {
    return {
      names: [
        "Vue.js",
        "Vuex",
        "HTML5",
        "CSS3",
        "JavaScript",
        "TypeScript",
        "SASS",
        "React.js",
        "Redux",
        "ReacNative",
      ],
      ratings: [3.5, 3, 3, 3.5, 3, 1.5, 2, 2, 1.5, 1.5],
      imgs: [
        "vuejs.jpg",
        "vuex.jpg",
        "html.jpg",
        "css.jpg",
        "javascript.jpg",
        "typescript.png",
        "sass.jpg",
        "reactjs.jpg",
        "redux.jpg",
        "reactnative.jpg",
      ],
    };
  },
  components: {
    StackDetail,
  },
};
</script>

<style scoped></style>
