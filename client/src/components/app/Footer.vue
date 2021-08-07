<template>
  <v-container>
    <v-row>
      <v-col
        offset-lg="2"
        lg="8"
        cols="12"
        class="footer"
      >
        <p>flynngu21@gmail.com</p>
        <p>
          Github: 
          <a href="github.com/fksk94"> github.com/fksk94 </a> 
          / Blog: 
          <a href="txegg.tistory.com"> txegg.tistory.com </a>
        </p>
        <p>
          BOJ: 
          <a href="https://solved.ac/profile/fksk94"> fksk94 </a> 
          / Codeforces: 
          <a href="https://codeforces.com/profile/muvissum"> MuviSsum </a>
        </p>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "Footer",
}
</script>

<style scoped>
.footer {
  font-size: 12px;
  height: 100px;
}

.footer p {
  margin: 0px 0px 0px 10px;
  padding: 0px;
  line-height: 24px;
}

.footer p a {
  text-decoration: none;
  color: #eeeeee;
}
</style>