<template>
  <div class="stack">
    <h1>기술 스택</h1>
    <v-container>
      <v-row class="stackTitle">
        <h3>
          <v-icon color="#DF711B" class="icon">
            mdi-cog-sync
          </v-icon>
          DevOps
        </h3>
      </v-row>
      <DevOpsStack />
      <br />
      <v-row class="stackTitle">
        <h3>
          <v-icon color="#DF711B" class="icon">
            mdi-dns
          </v-icon>
          BackEnd
        </h3>
      </v-row>
      <BackEndStack />
      <br />
      <v-row class="stackTitle">
        <h3>
          <v-icon color="#DF711B" class="icon">
            mdi-monitor
          </v-icon>
          FrontEnd
        </h3>
      </v-row>
      <FrontEndStack />
    </v-container>
  </div>
</template>

<script>
import DevOpsStack from "@/components/home/stack/DevOpsStack.vue";
import BackEndStack from "@/components/home/stack/BackEndStack.vue";
import FrontEndStack from "@/components/home/stack/FrontEndStack.vue";

export default {
  name: "Stack",
  components: {
    DevOpsStack,
    BackEndStack,
    FrontEndStack,
  },
};
</script>

<style scoped>
.stack {
  margin-bottom: 40px;
}

.icon {
  padding-bottom: 7px;
}

.stackTitle {
  margin-bottom: 5px;
  margin-top: 20px;
}
</style>
