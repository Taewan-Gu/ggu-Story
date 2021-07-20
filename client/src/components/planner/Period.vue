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
          <div class="periodMenuItem" @click="select_period(idx)">
            {{period}}
          </div>
        </div>
      </div>
    </div>
    <button class="periodButton" @click="onClickAddButton = true">
      Add
    </button>
    <div class="modalPeriod" v-if="onClickAddButton">
      <div class="modalContentAdjust addPeriods">
         <input class="addPeriodInput" type="text" v-model="addPeriodInput">
         <button class="addPeriodButton" @click="add_period">
           추가
         </button>
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
      addPeriodInput: "",
    }
  },
  updated () {
    this.periods = []
    this.$store.state.periods.forEach(period => {
      this.periods.push(period.period_data)
    });
  },
  methods: {
    select_period (idx) {
      this.selected_period = this.periods[idx]
      this.onClickChangeButton = false
    },
    add_period () {
      alert(this.addPeriodInput)
      this.onClickAddButton = false
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

.periodMenuItem {
  font-size: 40px;
  padding: 20px;
  cursor: pointer;
}

.addPeriodInput {
  padding: 20px;
  margin: 20px;
  font-size: 40px;
}

.addPeriodButton {
  background-color: #eeeeee;
  font-size: 24px;
  cursor: pointer;
  width: 200px;
  height: 50px;
}

</style>