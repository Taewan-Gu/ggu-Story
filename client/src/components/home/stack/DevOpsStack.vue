<template>
  <v-row>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/docker.jpg" class="stackImg" alt="">
      <h4>Docker</h4>
      <v-rating
        :value="3.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/kubernetes.svg" class="stackImg" alt="">
      <h4>Kubernetes</h4>
      <v-rating
        :value="1.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/jenkins.jpg" class="stackImg" alt="">
      <h4>Jenkins</h4>
      <v-rating
        :value="2"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/nginx.svg" class="stackImg" alt="">
      <h4>Nginx</h4>
      <v-rating
        :value="2"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/ssl.jpg" class="stackImg" alt="">
      <h4>Letsencypt SSL</h4>
      <v-rating
        :value="2"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/ec2.svg" class="stackImg" alt="">
      <h4>AWS EC2</h4>
      <v-rating
        :value="2.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/gke.jpg" class="stackImg" alt="">
      <h4>GCP GKE</h4>
      <v-rating
        :value="1.5"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/vultr.jpg" class="stackImg" alt="">
      <h4>VULTR</h4>
      <v-rating
        :value="1"
        :readonly="true"
        color="yellow darken-3"
        background-color="white"
        half-increments
        small
      ></v-rating>
    </v-col>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/linux.svg" class="stackImg" alt="">
      <h4>Linux</h4>
      <v-rating
        :value="3"
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
  name: "DevOpsStack"
}
</script>

<style scoped>
.stackDetail {
  text-align: center;
}

.stackImg {
  height: 100px;
}
</style>