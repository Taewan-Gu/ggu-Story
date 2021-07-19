import { createStore } from 'vuex'

export default createStore({
  state: {
    periods: [],
  },
  mutations: {
    STORE_PERIODS: function (state, periodItems) {
      state.periods = periodItems
    },
  },
  actions: {
    storePeriods: function (context, periodItems) {
      context.commit('STORE_PERIODS', periodItems)
    },
  }
})
