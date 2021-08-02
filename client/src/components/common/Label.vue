<template>
  <div class="label">
    <v-icon
      color="#DF711B"
      size="16px"
    >
      mdi-label
    </v-icon>
    <p class="labelTitle"> {{title}} </p>
  </div>
</template>

<script>
export default {
 name: "Label",
 props: {
   title: [String, Object],
 }
}
</script>

<style scoped>
.label {
  display: flex;
  height: 30px;
  opacity: 0.8;
  margin-bottom: 35px;
}

.labelTitle {
  height: 20px;
  font-size: 16px;
  padding-top: 2px;
  padding-left: 8px;
}
</style>