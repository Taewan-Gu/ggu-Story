<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
        class="notYet"
      >
        <v-icon
          size="60px"
        >
          mdi-wrench
        </v-icon>
        공사 중 입니다.
        <v-icon
          size="60px"
        >
          mdi-wrench
        </v-icon>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "Words",
}
</script>

<style scoped>
  .notYet {
    height: 800px;
    text-align: center;
    line-height: 800px;
    font-size: 4rem;
    cursor: default;
  }
</style>