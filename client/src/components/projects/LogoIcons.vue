<template>
  <div class="logoIcons">
    <div :class="{selectedLogoBox: selectedLogos.coderun}">
      <img
        :src="require(`@/assets/img/projects/coderunthumbnail.png`)"
        :class="{logo: true, selectedLogo: selectedLogos.coderun}"
        @click="selectLogo('coderun')"
        alt="coderunthumbnail"
      >
    </div>
    <div :class="{selectedLogoBox: selectedLogos.flanet}">
      <img
        :src="require(`@/assets/img/projects/flanetthumbnail.png`)"
        :class="{logo: true, selectedLogo: selectedLogos.flanet}"
        @click="selectLogo('flanet')"
        alt="flanetthumbnail"
      >
    </div>
    <div :class="{selectedLogoBox: selectedLogos.nuvo}">
      <img
        :src="require(`@/assets/img/projects/nuvothumbnail.png`)"
        :class="{logo: true, selectedLogo: selectedLogos.nuvo}"
        @click="selectLogo('nuvo')"
        alt="nuvothumbnail"
      >
    </div>
    <div :class="{selectedLogoBox: selectedLogos.kgbros}">
      <img
        :src="require(`@/assets/img/projects/kgbrosthumbnail.png`)"
        :class="{logo: true, selectedLogo: selectedLogos.kgbros}"
        @click="selectLogo('kgbros')"
        alt="kgbrosthumbnail"
      >
    </div>
  </div>
</template>

<script>
export default {
  name: "LogoIcons",
  props: {
    selectedLogos: [Object],
  },
  methods: {
    selectLogo(projectTitle) {
      this.$router.history.push(`/projects/${projectTitle}`)
    }
  }
}
</script>

<style scoped>
.logoIcons {
  display: flex;
}

.logo {
  width: 30px;
  height: 30px;
  border-radius: 10px;
  margin-top: 25px;
  margin-left: 60px;
  margin-right: 60px;
  cursor: pointer;
}

.logo:hover {
  transform: scale(2.5);
  transition: 0.3s;
}

.selectedLogo {
  transform: scale(2.5);
  margin-left: 80px !important;
  margin-right: 80px !important;
}

.selectedLogoBox {
  height  : 100px;   
  position: relative;
  z-index : 1;
}

.selectedLogoBox:before {
  content : "";
  position: absolute;
  left    : 20%;
  bottom  : 0;
  width   : 60%;
  border-bottom: 5px solid;
  border-color: #FFB740;
}

</style>