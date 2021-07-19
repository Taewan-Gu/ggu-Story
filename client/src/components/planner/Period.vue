<template>
  <div class="period">
    <div class="selectedPeriod">
      {{selected_period}} 계획
    </div>
    <button class="periodButton" @click="onClickChangeButton = true">
      Change
    </button>
    <div class="modalPeriod" v-if="onClickChangeButton">
      <div
        class="modalContentAdjust"
      >
        <div
          class="changePeriod"
          v-for="(period, idx) in periods"
          :key="idx"
        >
          {{period}}
        </div>
      </div>
    </div>
    <button class="periodButton" @click="onClickAddButton = true">
      Add
    </button>
    <div class="modalPeriod" v-if="onClickAddButton">
      <div class="modalContentAdjust addPeriods">
         추가 버튼
      </div>
      <br>
    </div>
  </div>
</template>

<script>
export default {
  name: "Period",
  data () {
    return {
      periods: [],
      selected_period: "하루",
      onClickChangeButton: false,
      onClickAddButton: false,
    }
  },
  updated () {
    this.periods = this.$store.state.periods
  },
  methods: {
    select_period (idx) {
      this.selected_period = this.periods[idx]
    }
  },
}
</script>

<style scoped>
.period {
  position: fixed;
  display: flex;
  justify-content: center;
  align-items: center;
  left: 400px;
  width: 350px;
  height: 100px;
  top: 0px;
  color: #eeeeee;
  z-index: 1;
}

.selectedPeriod {
  color: #111111;
  font-size: 20px;
  font-weight: 600;
  margin: 10px;
}

.periodButton {
  margin: 10px;
  background-color: #393e46;
  border: 0px solid;
  color: #eeeeee;
  padding:10px;
  border-radius: 5px;
  font-size: 14px;
  font-weight: 550;
  cursor: pointer;
}

.periodButton:hover {
  opacity: 0.8;
  transition: 0.3s;
}

.modalPeriod {
  position: fixed;
  width: 100%;
  height: 100%;
  left: 0px;
  right: 0px;
  top: 0px;
  bottom: 0px;
  background-color: #111111;
  opacity: 0.9;
}

.modalContentAdjust {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  left: 0px;
  right: 0px;
  top: 0px;
  bottom: 0px;
  z-index: 1;
}

.changePeriod {
}

.addPeriod {

}

</style>