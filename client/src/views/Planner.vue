<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
        class="hiddenContents"
      >
        <v-icon
          size="60px"
          color="red"
        >
          mdi-alert
        </v-icon>
        숨겨진 컨텐츠입니다.
        <v-icon
          size="60px"
          color="red"
        >
          mdi-alert
        </v-icon>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "Planner",
}
</script>

<style scoped>
  .hiddenContents {
    color: #232323;
    height: 800px;
    text-align: center;
    line-height: 800px;
    font-size: 4rem;
    cursor: default;
  }
</style>