<template>
  <div
    :class="{contact: true, visualStatus: visualStatus}"
  >
    <v-container>
      <v-row>
        <v-col
          cols="12"
          xl="10"
          class="contactBox"
        >
          <div class="contactDetail">
            <img src="@/assets/img/taewan.jpg" class="profileImg">
            <div class="profileContent">
              <v-icon>
                mdi-email
              </v-icon>
              flynngu21@gmail.com <br>
              <v-icon>
                mdi-github
              </v-icon>
              <a href="https://github.com/Taewan-Gu"> github.com/Taewan-Gu </a> <br>
              <v-icon>
                mdi-cellphone
              </v-icon>
              010-4071-3729
            </div>
          </div>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  name: "Contact",
  props: {
    visualStatus: [Boolean, Object],
  }
}
</script>

<style scoped>
.visualStatus {
  display: none;
}

.contact {
  position: fixed;
  left: 0px;
  width: 100%;
  top: 90px;
}

.contactBox {
  display: flex;
  justify-content: flex-end;
}

.contactDetail {
  display: flex;
  text-align: start;
  width: 380px;
  height: 150px;
  border: 4px solid;
  border-radius: 10px;
  border-color: #333333;
  background-color: #f7f7f7;
  padding: 10px;
}

.profileImg {
  border: 1px solid;
  border-radius: 100px;
  margin-right: 20px;
  height: 125px;
  width: 125px;
}

.profileContent {
  margin-top: 8px;
  margin-bottom: 15px;
  line-height: 35px;
  color: #333333;
}

a {
  text-decoration: none;
  color: #333333 !important;
}

</style>