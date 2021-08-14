<template>
  <v-row>
    <v-col
      cols="6"
      sm="4"
      md="3"
      lg="2"
      class="stackDetail"
    >
      <img src="@/assets/img/stack/python.jpg" class="stackImg" alt="">
      <h4>Python</h4>
      <v-rating
        :value=4
        :readonly=true
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
      <img src="@/assets/img/stack/fastapi.jpg" class="stackImg" alt="">
      <h4>FastAPI</h4>
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
      <img src="@/assets/img/stack/django.jpg" class="stackImg" alt="">
      <h4>Django</h4>
      <v-rating
        :value="3"
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
      <img src="@/assets/img/stack/sqlalchemy.jpg" class="stackImg" alt="">
      <h4>SQLAlchemy</h4>
      <v-rating
        :value="3"
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
      <img src="@/assets/img/stack/java.jpg" class="stackImg" alt="">
      <h4>Java</h4>
      <v-rating
        :value="3"
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
      <img src="@/assets/img/stack/springmvc.jpg" class="stackImg" alt="">
      <h4>Spring MVC</h4>
      <v-rating
        :value="3"
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
      <img src="@/assets/img/stack/springboot.jpg" class="stackImg" alt="">
      <h4>Spring Boot</h4>
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
      <img src="@/assets/img/stack/springjdbc.jpg" class="stackImg" alt="">
      <h4>Spring JDBC</h4>
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
      <img src="@/assets/img/stack/jpa.jpg" class="stackImg" alt="">
      <h4>Spring JPA</h4>
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
      <img src="@/assets/img/stack/nodejs.jpg" class="stackImg" alt="">
      <h4>Node JS</h4>
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
      <img src="@/assets/img/stack/mysql.jpg" class="stackImg" alt="">
      <h4>MySQL</h4>
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
      <img src="@/assets/img/stack/firebaserdbms.jpg" class="stackImg" alt="">
      <h4>Firebase RDBMS</h4>
      <v-rating
        :value="2.5"
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
  name: "BackEndStack",
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